package code401challenges.stacksandqueues;

public class Queue {
    Node front;
    Node back;


    public void Queue(){
        front = null;
        back = null;
    }


    public void enqueue(int value){
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
            back = newNode;
        }
        else {
            back.next = newNode;
            back = back.next;
        }
    }

    public int dequeue(){
        if (front == null) {
            throw new NullPointerException("Failed to pop due to null value for top");
        }

        int nextInLine = front.value;

        if (front==back){
            back = null;
            front = null;
        } else {
            front = front.next;
        }
        return nextInLine;
    }

    public Integer peek () {
        if (front == null) {
            return null;
        } else {
            return front.value;
        }
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }


}
