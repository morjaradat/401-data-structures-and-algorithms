package Type;

public class PseudoQueue<T> {
    private  Stack<T> main;
    private  Stack<T> temp;
    private  int size =0;

    public PseudoQueue() {
        this.main= new Stack<>();
        this.temp= new Stack<>();
    }

    public void enqueue(T data){
        this.main.push(data);
        size++;
    }

    public T dequeue(){
        T theRemoveData;
        if (isEmpty()){
            return (T) "the list is empty";
        }
        else {
          int  referenceSize=size;
          int tempSize=0;
           while (referenceSize!=1){
               this.temp.push(this.main.pop());
               referenceSize--;
               tempSize++;
           }

           theRemoveData = this.main.pop();
            while (tempSize!=0){
            this.main.push(this.temp.pop());
           tempSize--;
        }
            size--;
//           main=temp;
//           size=referenceSize;
        }

      return theRemoveData;
    }

//    public T peek() {
//        this.main.getTop();
//        T peeking;
//        if (isEmpty()) {
//            return (T) "the list is empty";
//        } else {
//
//            int referenceSize = size;
//            int tempSize = 0;
//            while (referenceSize != 1) {
//                this.temp.push(this.main.pop());
//                referenceSize--;
//                tempSize++;
//            }
//
//            theRemoveData = this.main.pop();
//            while (tempSize != 0) {
//                this.main.push(this.temp.pop());
//                tempSize--;
//            }
//            return (T) this.main.peek();
//        }
//    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
       return this.main.isEmpty();
    }
    public String toSting(){
       return this.main.toString();
    }

}
