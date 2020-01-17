package code401challenges.linkedList;

import java.util.*;


public class LinkedList {
    Node head;



    public void insert(int value) {
        Node newNode = new Node();
        newNode.next = head;
        head = newNode;
    }

    public void insertBefore(int value) {
        Node node = new Node();
        node.data = value;
        node.next = null;

        if (head == null) {
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show() {
        Node node = head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public boolean includes(int target) {
        Node nextNode = head;
        while(nextNode != null) {
            if(nextNode.data == target)
                return  true;
            else
                nextNode = nextNode.next;
        }
        return false;
    }

    public String toString() throws NullPointerException {
        Node currentNode = this.head;
        StringJoiner result = new StringJoiner(" } -> { ", "{ ", " }");
        while(currentNode != null){
            result.add(String.valueOf(currentNode.data));
            currentNode = currentNode.next;

        }
        result.add("NULL");
        return result.toString();
    }

    public void delete(int value ){
        Node currentNode = this.head;
        if(head.data == value){
            head = currentNode.next;
        }
        while (currentNode.next != null){
            if (currentNode.next.data == value){
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void append(int val) {
        if (head == null) {
            insert(val);
        } else {
            Node nodeToAppend = new Node();
            nodeToAppend.next = null;
            Node next = head;

            while (next.next != null){
                next = next.next;
            }

            next.next = nodeToAppend;
        }
    }

    public void insertAfter(int previousVal,int newValue) {

        Node currentNode = head;
        while(currentNode.next != null) {
            if(currentNode.data == previousVal) {
                currentNode.next = new Node();
            }
            currentNode = currentNode.next;
        }
    }

    public int kthFromEnd(int k) {
        int counter = 0;
        Node current = this.head;
        while (current != null){
            counter++;
            current = current.next;
        }
        if(k > counter){
            throw new NullPointerException("Inputted value is too large");
        }
        for(int i = 1; i < (counter - k); i++){
            this.head = this.head.next;
        }
        return this.head.data;
    }

    public static LinkedList mergeLists(LinkedList list1, LinkedList list2) {
        if (list1.head == null)
            return list2;
        else if (list2.head == null)
            return list1;


        Node next1 = list1.head;
        Node next2 = list2.head;
        Node temp = next1.next;

        while (next1 != null) {
            next1.next = next2;
            next1 = temp;
            next2 = next2.next;
        }
        next1 = next2.next;

        return list1;

    }

}
