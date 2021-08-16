package queue;


public class Queue<T> {
    private QNode<T> front;
    private QNode<T> back;
    private  int size =0;

    public Queue() {
        this.front =  this.back = new QNode<>();
        front.setNext(back);
    }



    public void enqueue(T data){
        if (isEmpty()){
            front.setData(data);

        }else if (back.getData()==null){
            back.setData(data);
        }else {
            QNode<T> QNode = new QNode<>(data);
            back.setNext(QNode);
            back = QNode;
        }
        size++;
    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        }else if (front.getNext()==back){
            QNode<T> QNode = new QNode<>();
           QNode.setData(front.getData());
           front=front.getNext();
//           back=new Node<>();
//           front.setNext(back);
           QNode.setNext(null);
           size--;
           return QNode.getData();
        }else {
            QNode<T> temp = new QNode<>();
            temp.setData(front.getData());
            if (front.getNext()==null && back.getNext()==null){
                this.front =  this.back = new QNode<>();
            }else {
                front=front.getNext();

            }
            temp.setNext(null);
            size--;
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

        return size==0;
    }


    public String toString() {
        QNode<T> current = front;
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
