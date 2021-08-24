package Hashtable.HashMap;

public class ImplementHashMap<V> {
    private final HashMap<V, Object> map = new HashMap<V, Object>();
    private static final Object PRESENT = new Object();


    public boolean add(V value) {
        return map.put(value, PRESENT) == null;
    }

    public boolean contains(Object obj) {
        return map.get((V) obj) != null;
    }

    public int getSize() {
        return map.getSize();
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
