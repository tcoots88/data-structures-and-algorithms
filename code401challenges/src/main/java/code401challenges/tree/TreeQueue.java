package code401challenges.tree;


public class TreeQueue<Generic extends Comparable<Generic>> {
    TreeNode<Generic> front;
    TreeNode<Generic> back;

    public TreeQueue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(Generic val) {
        TreeNode<Generic> newNode = new TreeNode((Comparable) val);
        if(front == null) {
            front = newNode;
            back = newNode;
        } else {
            back.next = newNode;
            back = back.next;
        }

    }

    public Generic dequeue() {
        if(front == null) {
            throw new NullPointerException("empty list");
        }

        Generic result = front.data;


        if(front == back) {
            back = null;
            front = null;
        } else {
            front = front.next;
        }

        return result;
    }

    public Generic peek() {
        if(front == null) {
            //throw exception instead
            return null;
        } else {
            return front.data;
        }
    }
}
