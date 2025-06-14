import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bag<T> {
    private Map<T, Integer> bagMap;

    public Bag() {
        bagMap = new HashMap<>();
    }

    public void add(T item) {
        bagMap.put(item, bagMap.getOrDefault(item, 0) + 1);
    }

    public boolean remove(T item) {
        if (bagMap.containsKey(item)) {
            int count = bagMap.get(item);
            if (count == 1) {
                bagMap.remove(item);
            } else {
                bagMap.put(item, count - 1);
            }
            return true;
        }
        return false;
    }

    public boolean contains(T item) {
        return bagMap.containsKey(item);
    }

    public int count(T item) {
        return bagMap.getOrDefault(item, 0);
    }

    public int size() {
        int size = 0;
        for (int count : bagMap.values()) {
            size += count;
        }
        return size;
    }

    public Set<T> distinct() {
        return bagMap.keySet();
    }

    public void merge(Bag<T> other) {
        for (T item : other.distinct()) {
            int count = other.count(item);
            for (int i = 0; i < count; i++) {
                this.add(item);
            }
        }
    }

    @Override
    public String toString() {
        if (bagMap.isEmpty()) {
            return "The bag is empty.";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<T, Integer> entry : bagMap.entrySet()) {
            sb.append(entry.getKey())
              .append(": ")
              .append(entry.getValue())
              .append("\n");
        }
        return sb.toString();
    }
}
