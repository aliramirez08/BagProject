import java.util.HashMap;
import java.util.Map;

/**
 * A generic Bag (Multiset) class that allows duplicates and keeps count of elements.
 * @param <T> the type of elements stored in the bag
 */
public class Bag<T> {

    private final Map<T, Integer> itemMap;

    // Constructor
    public Bag() {
        itemMap = new HashMap<>();
    }

    /**
     * Adds an item to the bag. Allows duplicates.
     * @param item the item to be added
     */
    public void add(T item) {
        itemMap.put(item, itemMap.getOrDefault(item, 0) + 1);
    }

    /**
     * Removes a single occurrence of the item from the bag.
     * If the item does not exist, nothing happens.
     * @param item the item to remove
     */
    public void remove(T item) {
        if (itemMap.containsKey(item)) {
            int count = itemMap.get(item);
            if (count > 1) {
                itemMap.put(item, count - 1);
            } else {
                itemMap.remove(item);
            }
        }
    }

    /**
     * Checks if the item exists in the bag.
     * @param item the item to check
     * @return true if the item exists, false otherwise
     */
    public boolean contains(T item) {
        return itemMap.containsKey(item);
    }

    /**
     * Returns the number of occurrences of the item in the bag.
     * @param item the item to count
     * @return the count of the item
     */
    public int count(T item) {
        return itemMap.getOrDefault(item, 0);
    }

    /**
     * Prints all elements in the bag along with their frequencies.
     */
    public void printContents() {
        if (itemMap.isEmpty()) {
            System.out.println("Bag is empty.");
            return;
        }
        System.out.println("Bag contents (Item x Count):");
        for (Map.Entry<T, Integer> entry : itemMap.entrySet()) {
            System.out.printf("- %s x %d%n", entry.getKey(), entry.getValue());
        }
    }

    /**
     * Returns the total number of elements in the bag (including duplicates).
     * @return total size
     */
    public int size() {
        int total = 0;
        for (int count : itemMap.values()) {
            total += count;
        }
        return total;
    }

    /**
     * Merges another bag into this bag.
     * @param otherBag the bag to merge from
     */
    public void merge(Bag<T> otherBag) {
        for (Map.Entry<T, Integer> entry : otherBag.itemMap.entrySet()) {
            T item = entry.getKey();
            int count = entry.getValue();
            itemMap.put(item, itemMap.getOrDefault(item, 0) + count);
        }
    }

    /**
     * Returns a new bag that contains only the distinct elements from the current bag.
     * @return a new Bag with one of each element
     */
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (T item : itemMap.keySet()) {
            distinctBag.add(item);
        }
        return distinctBag;
    }
}
