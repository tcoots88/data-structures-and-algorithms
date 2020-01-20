package code401challenges.stacksandqueues;

public class Stack {
    Node top;

    public Stack (){
        top = null;
    }

    public void push (int value){
        Node newNode = new Node(value);
        if (top == null) {
        }
         else {
            newNode.next = top;
        }
        top = newNode;
    }

    public int pop () {
        if (top == null) {
            throw new NullPointerException("Failed to pop due to null value for top");
        }


        Node temp = top;
        top = top.next;
        return temp.value;
    }

    public Integer peek () {
        if (top == null) {
            return null;
        } else {
            return top.value;
        }
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }


}
