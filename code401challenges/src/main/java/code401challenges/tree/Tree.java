package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringJoiner;

public class Tree<Generic extends Comparable<Generic>> {
//    public TreeNode<Integer> root;
//
//
//    public Tree(){
//        this.root = null;
//    }
//
//    public Tree(Generic data){
//        this.root = new Node<>(data);
//    }
//    public Tree(Node<Generic> root){
//        this.root = root;
//    }
//
//    public void setRoot(Generic data) {
//        this.root = new Node<Generic>(data);
//    }
//
//
////    Pre-Order
//    public ArrayList<Generic> preOrder(){
//        ArrayList<Generic> preOrderBST = new ArrayList<>();
//        return sortForPreOrder(root, preOrderBST);
//    }
//
//    public ArrayList<Generic> sortForPreOrder(Node<Generic> current, ArrayList<Generic> preOrderBST){
//        if(current==null){
//            return null;
//        }
//        preOrderBST.add(current.data);
//        sortForPreOrder(current.left, preOrderBST);
//        sortForPreOrder(current.right, preOrderBST);
//
//        return preOrderBST;
//    }
////    In-Order
//    public ArrayList<Generic> inOrder(){
//        ArrayList<Generic> inOrderBST = new ArrayList<>();
//        return sortForInOrder(root, inOrderBST);
//    }
//
//
//    public ArrayList<Generic> sortForInOrder(Node<Generic> current, ArrayList<Generic> inOrderBST){
//        if(current==null){
//            return null;
//        }
//        sortForInOrder(current.left, inOrderBST);
//        inOrderBST.add(current.data);
//        sortForInOrder(current.right, inOrderBST);
//
//        return inOrderBST;
//    }
//
////    Post-Order
//    public ArrayList<Generic> postOrder(){
//        ArrayList<Generic> postOrderBST = new ArrayList<>();
//        return sortForPostOrder(root, postOrderBST);
//    }
//
//    public ArrayList<Generic> sortForPostOrder(Node<Generic> current, ArrayList<Generic> postOrderBST){
//        if(current==null){
//            return null;
//        }
//
//        sortForPostOrder(current.left, postOrderBST);
//        sortForPostOrder(current.right, postOrderBST);
//        postOrderBST.add(current.data);
//
//        return postOrderBST;
//    }
//
//
//// breadth-first code challenge
//
//    public void breadthFirst(TreeNode root) {
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        if (root == null)
//            return;
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            TreeNode n = (TreeNode) queue.remove();
//            System.out.println(n.data);
//            if (n.left != null)
//                queue.add(n.left);
//            if (n.right != null)
//                queue.add(n.right);
//        }
//    }
//
//// Max Value
//    public static int findMaximumValue(Tree<Integer> tree){
//        if(tree.root == null)
//            throw new NullPointerException("Empty Tree");
//
//        int maxValue = Integer.MIN_VALUE;
//        TreeQueue<TreeNode<Integer>> queue = new TreeQueue<>();
//
//
//        TreeNode<Integer> current = tree.root;
//        queue.enqueue(current);
//
//        while (queue.front != null){
//            current = queue.dequeue();
//            maxValue = Math.max(current.data, maxValue);
//
//            if (current.left !=null)
//                queue.enqueue(current.left);
//
//            if (current.right !=null)
//            queue.enqueue(current.right);
//        }
//        return maxValue;
//
//    }

}
