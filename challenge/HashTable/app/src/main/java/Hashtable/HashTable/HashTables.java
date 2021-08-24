package Hashtable.HashTable;

import Hashtable.LinkedList.LinkedList;

import java.util.Objects;

public class HashTables<K,V> {

    private LinkedList<HashNode<K,V>> bucketArray;
    private int numBucket;
    private int size;

    /**
     * Constructor
     */
    public HashTables() {

        bucketArray = new LinkedList<HashNode<K, V>>();
        numBucket = 10;
        size=0;

        for (int index = 0; index < numBucket; index++) {
            bucketArray.append(null);
        }

    }

    private int hashCode(K key){
        return Objects.hashCode(key);
    }

    public boolean contain(K key){
        return get(key) != null ;
    }

    private int getBucketIndex(K key){
        int hashCode = hashCode(key);

        int index = hashCode %  numBucket;

        index = index <0 ? index* -1 : index;

        return index;
    }

    public  int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }


    public void add(K key ,V value ){
    int bucketIndex = getBucketIndex(key);
    int hashCode =  hashCode(key);
    HashNode<K,V> head = bucketArray.get(bucketIndex);

    while (head!= null){
        if (head.key.equals(key) && head.hashCode == hashCode ){
            head.value = value;
            return;
        }
        head = head.next;
      }
    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K,V>  newNode = new HashNode<>(key, value,hashCode);
    newNode.next = head;
    bucketArray.set(bucketIndex,newNode);
        resize();
    }

    private void  resize(){
        if ((1.0*size)/ numBucket >=0.7){
            LinkedList<HashNode<K,V>> temp = bucketArray;
            bucketArray = new LinkedList<HashNode<K, V>>();
            numBucket = 2 * numBucket;
            size=0;
            for (int index = 0; index < numBucket; index++) {
                bucketArray.append(null);
            }

            for (int i = 0; i <= temp.getSize(); i++) {
                HashNode<K,V> headNode = temp.get(i);
                    while (headNode!= null){
                        add(headNode.key, headNode.value);
                        headNode=headNode.next;
                    }
            }

        }
    }

    public V remove(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);

        HashNode<K,V> prev = null;

        while (head!= null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                break;
            }
            prev=head;
            head= head.next;
        }

        if (head == null){
            return null;
        }

        size--;

        // Remove key
        if (prev != null){
            prev.next = head.next;
        }else{
            bucketArray.set(bucketIndex, head.next);
        }


        return head.value;
    }


    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K,V> head = bucketArray.get(bucketIndex);

        while (head!= null){
            if (head.key.equals(key) && head.hashCode == hashCode){
                return head.value;
            }
            head= head.next;
        }

        return null;
    }
}
