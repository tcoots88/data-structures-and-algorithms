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


        assertTrue("Linked List did include target value", newLinkedList.includes(15));
    }


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
        testList.insertBefore(1);
        testList.insertBefore(2);
        testList.insertBefore(3);
        testList.insertBefore(4);
        testList.insertBefore(0);
        testList.insertAfter(4, 0);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 0 } -> { NULL }", testList.toString());
        testList.delete(1);
        assertEquals("{ 2 } -> { 3 } -> { 4 } -> { 0 } -> { NULL }", testList.toString());
    }


    @Test
    public void testLinkedList_0thFromTheLastMethod() {
        LinkedList testList = new LinkedList();
        testList.insertBefore(5);
        testList.insertBefore(3);
        testList.insertBefore(9);
        testList.insertBefore(5);

        assertEquals("{ 5 } -> { 3 } -> { 9 } -> { 5 } -> { NULL }", testList.toString());
        assertEquals("The 0 value did not return 5", 5, testList.kthFromEnd(0));

    }


    @Test
    public void testMerge2EmptyLists() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        assertNull("Should return empty list", LinkedList.mergeLists(list1, list2).head);
    }

    @Test
    public void testMergeList1Empty() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list2.head = new Node();
        assertEquals("Should return list2", list2, LinkedList.mergeLists(list1, list2));
    }

    @Test
    public void testMergeList2Empty() {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.head = new Node();
        assertEquals("Should return list1", list1, LinkedList.mergeLists(list1, list2));
    }


}

