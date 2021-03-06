package queue;

public class QNode<T> {
    private  T data;
    private QNode<T> next;

    public QNode() {

    }

    public QNode(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public QNode<T> getNext() {
        return next;
    }

    public void setNext(QNode<T> next) {
        this.next = next;
    }
}
