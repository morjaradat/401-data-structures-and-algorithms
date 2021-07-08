package Type;

import data.Node;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> node = new Node<>(data);
        Node<T> temp = top;
        top = node;
        top.setNext(temp);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        Node<T> temp = top;
        if (temp.getNext() == null) {
            top = null;
        } else {
            top = top.getNext();
            temp.setNext(null);
        }

        return temp.getData();
    }


    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getData();
        }
    }




    public boolean isEmpty() {
        return top == null;
    }


    public String toString() {
        Node<T> current = top;
        if (current == null) {
            return "Linked list is empty";
        }
        StringBuilder showList = new StringBuilder();
        while (current != null) {
            showList.append("{").append(current.getData()).append("}-> ");
            current = current.getNext();
        }
        showList.append("NULL");
        return showList.toString();
    }
}
