package code401challenges.linkedList;

import java.util.*;


public class LinkedList {
    Node head;

    public void insert(int value) {
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
        while(node.next != null) {
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

    public String toString() {
        String values = "";

        for(Node curr = head; curr != null; curr = curr.next) {
            values = values + curr.data;
        }

        return values;
    }





}
