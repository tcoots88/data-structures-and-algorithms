package code401challenges.tree;

public class BinarySearchTree<Generic extends Comparable<Generic>> extends Tree<Generic> {
    public Node<Generic> root;


    public BinarySearchTree(){
        super();
    }

    public BinarySearchTree(Generic data){
        this.root = new Node<>(data);
    }

    public void setRoot(Generic data){
        this.root = new Node<>(data);
    }

    public void add(Generic data){
        if(root==null){
            setRoot(data);
        } else {
            addHelperMethod(data,root);
        }
    }


    public void addHelperMethod (Generic data, Node current){
        if(current==null){
            return ;
        } else if(current.data.compareTo(data) > 0 || current.data.equals(data)){
            if(current.left == null){
                current.setLeft(new Node(data));
                current = current.left;
            }
            addHelperMethod(data, current.left);
        } else {
            if(current.right == null){
                current.setRight(new Node(data));
                current = current.right;
            }
            addHelperMethod(data, current.right);
        }
    }
//    Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

    public Boolean contains(Generic data){
        if(this.root.data == null){
            return false;
        }

        return containsHelperMethod(data,root);
    }

    public Boolean containsHelperMethod(Generic data, Node<Generic> current){
        if(current == null){
            return null;
        } else if(current.data.equals(data)){
            return true;
        } else if(current.data.compareTo(data) < 0){
            return containsHelperMethod(data, current.left);
        } else {
            return containsHelperMethod(data, current.right);
        }
    }
}
