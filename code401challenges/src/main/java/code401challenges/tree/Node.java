package code401challenges.tree;

public class Node <Generic extends Comparable<Generic>> {

    public Generic data;
    public Node<Generic> left;
    public Node<Generic> right;
    public Node<Generic> next;

    public Node (Generic data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node<Generic> getLeft() {
        return left;
    }

    public void setLeft(Node<Generic> left) {
        this.left = left;
    }

    public Node<Generic> getRight() {
        return right;
    }

    public void setRight(Node<Generic> right) {
        this.right = right;
    }

    public Generic getData() {
        return data;
    }

    public void setData(Generic data) {
        this.data = data;
    }
}
