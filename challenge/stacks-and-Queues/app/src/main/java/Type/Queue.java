package Type;

import data.Node;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public Queue() {
        this.front =  this.back = new Node<>();
        front.setNext(back);
    }



    public void enqueue(T data){
        if (isEmpty()){
            front.setData(data);

        }else if (back.getData()==null){
            back.setData(data);
        }else {
            Node<T> node = new Node<>(data);
            back.setNext(node);
            back =node;
        }
    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        }else if (front.getNext()==back){
            Node<T> node = new Node<>();
           node.setData(front.getData());
           front=front.getNext();
//           back=new Node<>();
//           front.setNext(back);
           node.setNext(null);
           return node.getData();
        }else {
            Node<T> temp = new Node<>();
            temp.setData(front.getData());
            if (front.getNext()==null && back.getNext()==null){
                this.front =  this.back = new Node<>();
            }else {
                front=front.getNext();

            }
            temp.setNext(null);
            return  temp.getData();
        }
   }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return front.getData();
        }
    }


    public boolean isEmpty() {

        return front.getData()== null;
    }


    public String toString() {
        Node<T> current = front;
        if (current.getData() == null) {
            return "Queue list is empty";
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
