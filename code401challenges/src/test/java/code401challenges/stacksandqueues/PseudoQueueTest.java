package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testNewEmptyPseudoQueueing(){
        PseudoQueue testPseudoQueue = new PseudoQueue();
        assertNull("StackOne should be empty",testPseudoQueue.stackOne.top);
        assertNull("StackTwo should be empty",testPseudoQueue.stackTwo.top);
        System.out.println("Both stacks instantiate empty");
    }


    @Test
    public void testPseudoQueueEnqueue(){
        PseudoQueue testPseudoQueue = new PseudoQueue();
        testPseudoQueue.enqueue(15);
        assertEquals("Stack One should have a top value of 15",15,testPseudoQueue.stackOne.top.value);
        System.out.println("enqueue successfully inserted single value to top of stackOne");
    }

    @Test
    public void testPseudoQueueEnqueueMultiValue() {
        PseudoQueue testPseudoQueue = new PseudoQueue();
        testPseudoQueue.enqueue(1);
        testPseudoQueue.enqueue(2);
        testPseudoQueue.enqueue(3);
        testPseudoQueue.enqueue(4);
        testPseudoQueue.enqueue(5);
        assertEquals("Stack One should have a top value of 1", 1, testPseudoQueue.stackOne.top.value);
        System.out.println("enqueue successfully inserted multiple values to stackOne");
        System.out.println("StackOne is comprised of " + testPseudoQueue.stackOne.top.value + " " + testPseudoQueue.stackOne.top.next.value + " " +
                testPseudoQueue.stackOne.top.next.next.value + " " + testPseudoQueue.stackOne.top.next.next.next.value + " " +
                testPseudoQueue.stackOne.top.next.next.next.next.value);
        System.out.println("StackTwo is " + testPseudoQueue.stackTwo.top);
    }

    @Test (expected = NullPointerException.class)
    public void testDequeueOnEmptyPseudoQueue(){
        PseudoQueue testPseudoQueue = new PseudoQueue();
        testPseudoQueue.dequeue();
    }

    @Test
    public void testDequeueOnFruitfulQueue(){
        PseudoQueue testPseudoQueue = new PseudoQueue();
        testPseudoQueue.enqueue(1);
        testPseudoQueue.enqueue(2);
        testPseudoQueue.enqueue(3);
        testPseudoQueue.enqueue(4);
        testPseudoQueue.dequeue();
        assertEquals("Stack should have top value of 2",2, testPseudoQueue.stackOne.top.value);
        System.out.println(testPseudoQueue.stackOne.top.value + " is at the top of the stack");
    }

}
