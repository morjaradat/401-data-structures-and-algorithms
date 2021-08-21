package HashMap;


import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
    private MapNode<K, V>[] array;
    private int size;

    public HashMap() {
        array = new MapNode[10];
    }

//public MapNode<K,V>[] getAllNodes(){
//        return array;
//}

    public List<K> keySet(){
        List<K> keyList = new ArrayList<>();
        for (MapNode<K,V> node : array){
            if (node!=null){
                if (node.getKey()!=null){
                    keyList.add(node.getKey());
                }
            }
        }
        return keyList;
    }

    public V put(K key, V value) {
        int index = getIndex(key);
        while (true) {
            if (array[index] == null) {
                MapNode<K, V> newMapNode = new MapNode<>(key, value);
                array[index] = newMapNode;
                ++size;
                resize();
                return null;
            } else if (array[index].getKey().equals(key)) {
                V old = array[index].getValue();
                array[index] = new MapNode<>(key, value);
                return old;
            } else {
                index = includeIndex(index);
            }
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        while (true) {
            if (array[index] == null) {
                return null;
            } else if (array[index].getKey().equals(key)) {
                return array[index].getValue();
            } else {
                index = includeIndex(index);
            }
        }
    }

    private int includeIndex(int index) {
        ++index;
        if (index >= array.length) {
            index = 0;
        }
        return index;
    }

    public int getSize() {
        return size;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % array.length;
    }

    private void resize() {
        if ((size * 10) / array.length > 2) {
            MapNode<K, V>[] old = array;
            array = new MapNode[array.length * 2];
            size = 0;
            for (MapNode<K, V> newMapNode : old) {
                if (newMapNode != null) {
                    put(newMapNode.getKey(), newMapNode.getValue());
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder printArray = new StringBuilder();

        printArray.append("[");

        int b = 0;

        for (MapNode<K, V> kvMapNode : array) {
            if (kvMapNode != null) {
                if (b != 0) {
                    printArray.append(",");
                }
                b++;
                printArray.append(kvMapNode);
            }
        }

        printArray.append("]");
        return printArray.toString();
    }
    public boolean contain(K key){
        return get(key)!= null;
    }
}
