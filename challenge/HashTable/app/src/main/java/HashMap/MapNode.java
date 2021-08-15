package HashMap;

public class MapNode<K, V> {
    private final K key;
    private final V value;
    MapNode<K, V> next;

    public MapNode(K key, V value, MapNode<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key.toString();
    }
}

