package HashTable;

public class HashNode<K,V> {
     K key;
     V value;

     final int hashCode;

     HashNode<K,V> next;

    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

/*
 private String key;
     private V value;
    private final int hashCode;

    HashNode<V> next;

    public HashNode(String key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public HashNode<V> getNext() {
        return next;
    }

    public void setNext(HashNode<V> next) {
        this.next = next;
    }
 */