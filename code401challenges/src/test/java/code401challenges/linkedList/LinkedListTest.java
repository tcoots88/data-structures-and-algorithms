package code401challenges.linkedList;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testEmptyList() {
        LinkedList newLinkedList = new LinkedList();
        assertNull("Empty List was not made successfully, RIP", newLinkedList.head);
    }

    @Test
    public void testIncludesMethodTrue() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insert(15);

        assertTrue("Linked List did include target value", newLinkedList.includes(15));
    }

    @Test
    public void testIncludesMethodFalse() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insert(13);

        assertFalse("Linked List did not include target value", newLinkedList.includes(15));
    }

    @Test
    public void testStringMethod() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insert(1);
        newLinkedList.insert(2);
        newLinkedList.insert(3);
        newLinkedList.toString();

        assertEquals("123", newLinkedList.toString());


    }

}
