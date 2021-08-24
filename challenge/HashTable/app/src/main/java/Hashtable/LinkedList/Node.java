package Hashtable.LinkedList;

public class Node<T> {
    private  Node<T> next;
    private Node<T> prev;
    private  T data;

    public Node(T data) {
        this.data = data;
    }
    public Node(Node<T> next, Node<T> prev, T data) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
