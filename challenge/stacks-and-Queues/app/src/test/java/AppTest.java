import Type.PseudoQueue;
import Type.Queue;
import Type.Stack;
import animalShelter.Animal_Shelter;
import animalShelter.Cats;
import animalShelter.Dogs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    public Animal_Shelter emptyAnimalShelter;
    public Animal_Shelter singleAnimalShelter;
    public Animal_Shelter multipleAnimalShelter;

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

    @Before
    public void setUp() throws Exception {
        emptyAnimalShelter = new Animal_Shelter();

        singleAnimalShelter = new Animal_Shelter();
        singleAnimalShelter.enqueue(new Dogs( "momo", 5));

        multipleAnimalShelter = new Animal_Shelter();
        multipleAnimalShelter.enqueue(new Dogs("momo1", 13));
        multipleAnimalShelter.enqueue(new Dogs("semsem", 15));
        multipleAnimalShelter.enqueue(new Cats("MishMish", 7));
        multipleAnimalShelter.enqueue(new Cats("Zatar", 14));
    }

    @Test
    public void testAnimalShelterConstructor() {
        assertNotNull(emptyAnimalShelter);
    }

    @Test
    public void testEmptyAnimalShelterDequeue() {
        assertNull(emptyAnimalShelter.dequeue("dog"));
        assertNull(emptyAnimalShelter.dequeue("cat"));
        assertNull(emptyAnimalShelter.dequeue("hhh"));
    }

    @Test
    public void testSingleAnimalShelterDequeue() {
        assertEquals("momo", singleAnimalShelter.dequeue("dog").getName());
        assertNotNull(singleAnimalShelter);
    }

    @Test
    public void testMultipleAnimalShelterDequeueNotSpecified() {
        assertNotNull(multipleAnimalShelter);
        assertEquals("MishMish", multipleAnimalShelter.dequeue("cat").getName());
        assertEquals("momo1", multipleAnimalShelter.dequeue("dog").getName());
    }

    @Test
    public void testMultipleAnimalShelterDequeueSpecified() {
        assertNotNull(multipleAnimalShelter);
        assertEquals("momo1", multipleAnimalShelter.dequeue("dog").getName());
        assertEquals("MishMish", multipleAnimalShelter.dequeue("cat").getName());
        assertEquals("Zatar", multipleAnimalShelter.dequeue("cat").getName());
        assertEquals("semsem", multipleAnimalShelter.dequeue("dog").getName());
        assertNull(multipleAnimalShelter.dequeue("dog"));
        assertNull(multipleAnimalShelter.dequeue("cat"));
    }
}
