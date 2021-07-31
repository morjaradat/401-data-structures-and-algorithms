package data;

import java.util.ArrayList;
import java.util.List;

public class KAryNode<T> {
    private T key;
    private final int K;
    private final List<KAryNode<T>> children = new ArrayList<>();

    public KAryNode(T key, int k) {
        this.key = key;
        this.K = k;
//    children = new ArrayList<>(K);
    }

    public KAryNode<T> addChild(T key) {
        KAryNode<T> newNode = new KAryNode<T>(key, K);
        if (children.size() < K) {
            children.add(newNode);
            return newNode;
        }

        return null;
    }

    public List<KAryNode<T>> getChildren() {
        return children;
    }

    public KAryNode<T> getChild(int index) {
        if (children.size() > index && index >= 0) {
            return children.get(index);
        }

        return null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

}
