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
        newLinkedList.insertBefore(15);

        assertTrue("Linked List did include target value", newLinkedList.includes(15));    }

    @Test
    public void testIncludesMethodFalse() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insertBefore(13);

        assertFalse("Linked List did not include target value", newLinkedList.includes(15));
    }

    @Test
    public void testStringMethod() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insertBefore(1);
        newLinkedList.insertBefore(2);
        newLinkedList.insertBefore(3);
        newLinkedList.toString();

        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { NULL }", newLinkedList.toString());


    }

    @Test
    public void testAddToEndOfLinkedList() {
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.insert(3);
        newLinkedList.insert(4);
        newLinkedList.insert(5);
        newLinkedList.append(0);
        Node currentNode = newLinkedList.head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }
        assertEquals("Can successfully add a node to the end of the linked list", 0, currentNode.data);
    }

    @Test public void testLinkedList_DeleteAfterIntoList() {
        LinkedList testList = new LinkedList();
        testList.insert(4);
        testList.insert(5);
        testList.insert(9);
        testList.insert(8);
        testList.insert(22);
        testList.insertAfter(8, 29);
        assertEquals("{ 22 } -> { 8 } -> { 29 } -> { 9 } -> { 5 } -> { 4 } -> { NULL }", testList.toString());
        testList.delete(4);
        assertEquals("{ 22 } -> { 8 } -> { 29 } -> { 9 } -> { 5 } -> { NULL }", testList.toString());
    }


}