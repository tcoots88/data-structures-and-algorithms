package code401challenges.stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testNewStackWithTopNull(){
        Stack testNewStack = new Stack();
        assertNull(testNewStack.top);
        System.out.println("top = " + testNewStack.top);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testPushValueIntoStack(){
        Stack testNewStack = new Stack();
        testNewStack.push(13);
        assertEquals("Stack should have one value of 13",13, testNewStack.top.value);
        System.out.println(testNewStack.top.value);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testThreePushValuesIntoStack(){
        Stack testNewStack = new Stack();
        testNewStack.push(2);
        testNewStack.push(4);
        testNewStack.push(6);
        assertEquals("Top of Stack should be a value of 6",6, testNewStack.top.value);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testSomePopStuff() {
        Stack testNewStack = new Stack();
        testNewStack.push(2);
        testNewStack.push(4);
        testNewStack.push(6);
        testNewStack.pop();
        assertEquals("Top of Stack should be a value of 4",4, testNewStack.top.value);
        System.out.println("Party on, Garth");
    }

    @Test (expected = NullPointerException.class)
    public void testPopOnNullTop(){
        Stack testNewStack = new Stack();
        testNewStack.pop();
    }


    @Test
    public void testPeekOnNullStack(){
        Stack testNewStack = new Stack();
        testNewStack.peek();
        assertNull("Top value is Null",testNewStack.peek());
        System.out.println("Party on, Garth");
    }

    @Test
    public void testPeekOnStackOfOneValue(){
        Stack testNewStack = new Stack();
        testNewStack.push(13);
        testNewStack.peek();
        assertTrue("peek should return a value of 13", testNewStack.peek() == 13);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testPeekOnAReallyBigStack(){
        Stack testNewStack = new Stack();
        testNewStack.push(1);
        testNewStack.push(2);
        testNewStack.push(3);
        testNewStack.push(4);
        testNewStack.push(5);
        testNewStack.push(6);
        testNewStack.push(7);
        testNewStack.push(8);
        testNewStack.push(9);
        testNewStack.push(10);
        testNewStack.push(11);
        testNewStack.push(12);
        testNewStack.push(13);
        testNewStack.push(14);
        testNewStack.push(15);
        assertTrue("peek should return a value of 15", testNewStack.peek() == 15);
        System.out.println("Party on, Garth");
    }

    @Test
    public void testIsEmptyOnEmptyStack(){
        Stack testNewStack = new Stack();
        assertEquals("isEmpty should return true for this empty stack",true, testNewStack.isEmpty());
    }

    @Test
    public void testIsEmptyOnFruitfulStack(){
        Stack testNewStack = new Stack();
        testNewStack.push(15);
        assertEquals("isEmpty should return false for this stack with values",false, testNewStack.isEmpty());
    }
}
