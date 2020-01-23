package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;


public class QueueTest {

    @Test
    public void testNewEmptyQueue() {
        Queue testQueue = new Queue();
        assertNull("Queue should be empty",testQueue.front);
    }

    @Test
    public void testEnqueueIntoQueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(13);
        assertEquals("Stack should have front value of 13",13, testQueue.front.value);
        assertEquals("Stack should have back value of 13",13, testQueue.back.value);

        System.out.println("Front value is " + testQueue.front.value);
        System.out.println("Back value is " + testQueue.back.value);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testEnqueueIntoThreeValueQueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        assertEquals("Stack should have front value of 1",1, testQueue.front.value);
        assertEquals("Stack should have back value of 3",3, testQueue.back.value);

        System.out.println("Front value is " + testQueue.front.value);
        System.out.println("Back value is " + testQueue.back.value);
        System.out.println("Party on, Garth");
    }

    @Test (expected = NullPointerException.class)
    public void testDequeueOnEmptyQueue(){
        Queue testQueue = new Queue();
        testQueue.dequeue();
    }

    @Test
    public void testDequeueOnFruitfulQueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.dequeue();
        assertEquals("Stack should have front value of 2",2, testQueue.front.value);
        assertEquals("Stack should have back value of 3",3, testQueue.back.value);
        System.out.println("Front value is " + testQueue.front.value);
        System.out.println("Back value is " + testQueue.back.value);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testPeekOnNullStack(){
        Queue testQueue = new Queue();
        testQueue.peek();
        assertNull("Front value is Null",testQueue.peek());
        System.out.println("Party on, Garth");
    }

    @Test
    public void testPeekOnQueueOfOneValue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(13);
        testQueue.peek();
        assertTrue("peek should return a value of 13", testQueue.peek() == 13);
        System.out.println("Front value is " + testQueue.front.value);
        System.out.println("Party on, Garth");
    }
    @Test
    public void testPeekOnAReallyLongQueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        testQueue.enqueue(8);
        testQueue.enqueue(9);
        testQueue.enqueue(10);
        testQueue.enqueue(11);
        testQueue.enqueue(12);
        testQueue.enqueue(13);
        testQueue.enqueue(14);
        testQueue.enqueue(15);
        assertTrue("peek should return a value of 1", testQueue.peek() == 1);
        System.out.println("Front value is " + testQueue.front.value);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testIsEmptyOnEmptyQueue(){
        Queue testQueue = new Queue();
        assertEquals("isEmpty should return true for this empty queue",true, testQueue.isEmpty());
        System.out.println("Front value is " + testQueue.front);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testIsEmptyOnFruitfulQueue(){
        Queue testQueue = new Queue();
        testQueue.enqueue(15);
        assertEquals("isEmpty should return false for this queue with values",false, testQueue.isEmpty());
        System.out.println("Front value is " + testQueue.front.value);
        System.out.println("Party on, Garth");
    }

}
