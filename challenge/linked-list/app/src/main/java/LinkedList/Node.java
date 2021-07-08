package LinkedList;

public class Node<T> {
    private  Node<T> next;
    private final T data;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }


}
