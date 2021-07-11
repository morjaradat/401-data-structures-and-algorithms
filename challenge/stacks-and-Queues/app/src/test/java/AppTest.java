import Type.PseudoQueue;
import Type.Queue;
import Type.Stack;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void addOnePushStack() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void addMultiplePushStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void popOneStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
    }

    @Test
    public void popMultipleStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void peekStack() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    public void instantiateOnEmptyStack() {
        Stack stack = new Stack();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void peekOnEmptyStack() {
        Stack stack = new Stack();
        assertEquals(null, stack.peek());
    }

    @Test
    public void enqueueOneQueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void enqueueMultipleQueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        queue.enqueue(1);
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void dequeueQueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(1, queue.dequeue());
    }

    @Test
    public void peekQueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        assertEquals(1, queue.peek());
    }

    @Test
    public void multipleDequeuesQueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals(true, queue.isEmpty());
    }

    @Test
    public void emptyAnQueue() {
        Queue queue = new Queue();
        assertEquals(true, queue.isEmpty());
    }

    @Test
    public void callPeekOrDequeueQueue() {
        Queue queue = new Queue();
        assertEquals(null, queue.peek());
        assertEquals(true, queue.isEmpty());
    }





    @Test
    public void instantiateOnEmptyPseudoQueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        assertEquals(true, pseudoQueue.isEmpty());
    }

    @Test
    public void enqueueOnePseudoQueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(1);
        assertEquals(false, pseudoQueue.isEmpty());
        assertEquals(1, pseudoQueue.getSize());
    }

    @Test
    public void enqueueMultiplePseudoQueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(1);
        assertEquals(false, pseudoQueue.isEmpty());
        assertEquals(4, pseudoQueue.getSize());
    }

    @Test
    public void callPeekOrDequeuePseudoQueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
//        assertEquals(null, pseudoQueue.peek());
        assertEquals(true, pseudoQueue.isEmpty());
    }

//    @Test
//    public void peekPseudoQueue() {
//        PseudoQueue pseudoQueue = new PseudoQueue();
//        pseudoQueue.enqueue(1);
//        pseudoQueue.enqueue(2);
//        pseudoQueue.enqueue(3);
//        pseudoQueue.enqueue(4);
//        assertEquals(1, pseudoQueue.peek());
//    }

    @Test
    public void singleDequeuesPseudoQueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();
        assertEquals(false, pseudoQueue.isEmpty());
//        assertEquals(4, pseudoQueue.peek());
        assertEquals(3, pseudoQueue.getSize());
    }

    @Test
    public void multipleDequeuesPseudoQueue() {
        PseudoQueue pseudoQueue = new PseudoQueue();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(4);
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        assertEquals(true, pseudoQueue.isEmpty());
        assertEquals(0, pseudoQueue.getSize());
    }
}
