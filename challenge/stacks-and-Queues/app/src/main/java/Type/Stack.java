package Type;

import data.Node;

import java.util.List;

public class Stack<T> {
    private Node<T> top;


    public Stack() {
        this.top = null;
    }

    public void push(T data) {
        Node<T> node = new Node<T>(data);
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

    public T getTop() {
        return (T) top.getData();
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

    public int getMax(){
        int max =0 ;
        Node<T> temp = top;
        while (temp!=null){
            if ((int)temp.getData()>max){
                max = (int)temp.getData();
            }

            temp=temp.getNext();
        }

        return max;

    }
}
