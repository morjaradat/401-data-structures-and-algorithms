/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import Type.PseudoQueue;
import Type.Queue;
import Type.Stack;
import stack_queue_brackets.validateBrackets;

public class App {

    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        validateBrackets validateBrackets = new validateBrackets();
        stack.push(1);
        stack.push(88);
        stack.push(3);
        stack.push(4);
        stack.push(15);
        stack.push(8);
        stack.push(4);
        stack.push(20);
        System.out.println(stack.getMax());
        System.out.println(stack);
//        System.out.println(validateBrackets.validateBracket("]{(})["));
//        System.out.println(validateBrackets.validateBracket("({}]["));
//        System.out.println(validateBrackets.validateBracket("[({}]"));
//        System.out.println(validateBrackets.validateBracket("(]("));
//        System.out.println(validateBrackets.validateBracket("{(}[)"));
//
//        System.out.println("---------------------------");
//        System.out.println(validateBrackets.validateBracket("{}"));
//        System.out.println(validateBrackets.validateBracket("{}(){}"));
//        System.out.println(validateBrackets.validateBracket("()[[Extra Characters]]"));
//        System.out.println(validateBrackets.validateBracket("(){}[[]]"));
//        System.out.println(validateBrackets.validateBracket("{}{Code}[Fellows](())"));


    //        pseudoQueue.enqueue(10);
//        pseudoQueue.enqueue(11);
//        pseudoQueue.enqueue(12);
//        pseudoQueue.enqueue(13);
//        pseudoQueue.enqueue(14);
//        pseudoQueue.enqueue(15);
//
//        System.out.println(pseudoQueue.getSize());
//        System.out.println(pseudoQueue.toSting());
//        System.out.println(pseudoQueue.dequeue());
//        System.out.println(pseudoQueue.toSting());
//        System.out.println(pseudoQueue.peek());
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.peek());
//        System.out.println(stack);


//        Queue<Integer> queue= new Queue<>();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        System.out.println(queue);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue);
//        queue.enqueue(4);
//        queue.enqueue(3);
//        queue.enqueue(2);
//        System.out.println(queue);

//        System.out.println(queue.isEmpty());
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        System.out.println(queue);

//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println("peek"+queue.peek());

//        System.out.println(queue);




    }
}
