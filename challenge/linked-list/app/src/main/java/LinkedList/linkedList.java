package LinkedList;

import java.io.Serializable;
import java.util.List;

public class linkedList<T> {
    Node head;
    int size = 0;

    public void insertAtEnd(java.io.Serializable data) {
        Node<java.io.Serializable> node = new Node<>(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node<T> current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext((Node<T>) node);
        }
        size++;
    }

    public int getSize() {
//        int arraySize=0;
//        Node<T> current = this.head;
//        while (current.getNext() != null) {
//            current=current.getNext();
//            arraySize
//        }
        return size;
    }

    public boolean includes(T value) {
        if (this.head == null) {
            return false;
        }
        Node<T> current = this.head;
        while (current.getNext() != null) {
            if (current.getData() == value) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public String toString() {
        Node<T> current = head;
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


    public Object getValue(int i){
       int length = 0;
       Object data;

        Node current = this.head;
        while (current != null) {
            if (length == i) {
                data = current.getData();
//                System.out.println(data);
                return  data;

            }
            length++;
            current = current.getNext();
        }
        return null;
    }



    public linkedList<T> reverse(linkedList<T> list) {
        int length = size;
        Node<T> current = this.head;
        T lastNode = (T) list.getValue(length-1);
        int addedNodes =0;
        for (int i = 0; i < length-1; i++) {
            T value = (T) list.getValue(length-2-i);
            list.insertAtEnd((Serializable) value);
            addedNodes++;
        }
        int removeIndex=0;
        while (current.getNext() != null){
            if (current.getData().equals(lastNode)&&removeIndex==length-1){
                 this.head=current;
                 size =size-addedNodes;
                 break;
            }
            removeIndex++;
            current=current.getNext();
        }
        return list;
    }

    public boolean palindrome(linkedList<T> array){
//        linkedList<T> reversedArray= array.reverse(array);
        for (int i = 0; i < size; i++) {
            if (array.getValue(i)==array.getValue(size-1-i)){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }


}
