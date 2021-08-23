package Graph;

public class Vertex<V,W> {

    V value ;
    W weight;

    public Vertex(V value) {
        this.value = value;
    }

    public Vertex(V value,W weight) {
        this.value = value;
        this.weight= weight;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public W getWeight() {
        return weight;
    }

    public void setWeight(W weight) {
        this.weight = weight;
    }
}
