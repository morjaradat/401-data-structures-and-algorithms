package Graph;

import java.util.List;

public class GraphNode<V> {

    V value ;

    public GraphNode(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "value=" + value +
                '}';
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
