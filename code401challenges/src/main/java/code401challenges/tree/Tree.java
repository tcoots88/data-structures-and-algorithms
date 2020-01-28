package code401challenges.tree;

import java.util.ArrayList;

public class Tree<Generic extends Comparable<Generic>> {
    Node<Generic> root;


    public Tree(){
        this.root = null;
    }

    public Tree(Generic data){
        this.root = new Node<>(data);
    }
    public Tree(Node<Generic> root){
        this.root = root;
    }

    protected void setRoot(Generic data) {
        this.root = new Node<>(data);
    }


//    Pre-Order
    public ArrayList<Generic> preOrder(){
        ArrayList<Generic> preOrderBST = new ArrayList<>();
        return sortForPreOrder(root, preOrderBST);
    }

    public ArrayList<Generic> sortForPreOrder(Node<Generic> current, ArrayList<Generic> preOrderBST){
        if(current==null){
            return null;
        }
        preOrderBST.add(current.data);
        sortForPreOrder(current.left, preOrderBST);
        sortForPreOrder(current.right, preOrderBST);

        return preOrderBST;
    }
//    In-Order
    public ArrayList<Generic> inOrder(){
        ArrayList<Generic> inOrderBST = new ArrayList<>();
        return sortForInOrder(root, inOrderBST);
    }


    public ArrayList<Generic> sortForInOrder(Node<Generic> current, ArrayList<Generic> inOrderBST){
        if(current==null){
            return null;
        }
        sortForInOrder(current.left, inOrderBST);
        inOrderBST.add(current.data);
        sortForInOrder(current.right, inOrderBST);

        return inOrderBST;
    }

//    Post-Order
    public ArrayList<Generic> postOrder(){
        ArrayList<Generic> postOrderBST = new ArrayList<>();
        return sortForPostOrder(root, postOrderBST);
    }

    public ArrayList<Generic> sortForPostOrder(Node<Generic> current, ArrayList<Generic> postOrderBST){
        if(current==null){
            return null;
        }

        sortForPostOrder(current.left, postOrderBST);
        sortForPostOrder(current.right, postOrderBST);
        postOrderBST.add(current.data);

        return postOrderBST;
    }
}
