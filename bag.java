import java.util.HashMap;
import java.util.Map;

/**
 * Generic Bag (Multiset) class that allows duplicates and supports common bag operations.
 * @param <T> the type of elements stored in the bag
 */
public class Bag<T> {

    // Internal map to store item counts
    private Map<T, Integer> map;

    // Constructor initializes the internal map
    public Bag() {
        map = new HashMap<>();
    }

    /**
     * Adds an item to the bag. Duplicates are allowed.
     * @param item the item to be added
     */
    public void add(T item) {
        map.put(item, map.getOrDefault(item, 0) + 1);
    }

    /**
     * Removes one occurrence of the specified item from the bag, if it exists.
     * @param item the item to remove
     */
    public void remove(T item) {
        if (map.containsKey(item)) {
            int count = map.get(item);
            if (count > 1) {
                map.put(item, count - 1);
            } else {
                map.remove(item);
            }
        }
    }

    /**
     * Checks if the item exists in the bag.
     * @param item the item to check
     * @return true if the item exists, false otherwise
     */
    public boolean contains(T item) {
        return map.containsKey(item);
    }

    /**
     * Returns the number of times the item appears in the bag.
     * @param item the item to count
     * @return the count of the item
     */
    public int count(T item) {
        return map.getOrDefault(item, 0);
    }

    /**
     * Prints the contents of the bag along with their frequencies.
     */
    public void printContents() {
        System.out.println("Bag contents:");
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }
    }
}