package code401challenges.tree;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void testForAnEmptyBST(){
        Tree<Integer> testTree = new Tree();
        assertNull(testTree.root);
        System.out.println("Value of tree is " + testTree.root);
    }

    @Test
    public void testForPreOrderMultiNode(){
        Node<Integer> testNode = new Node(2);
        testNode.setLeft(new Node<>(3));
        testNode.setRight(new Node<>(4));
        Tree<Integer> testTree = new Tree<>(testNode);
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        assertEquals(testArray, testTree.preOrder());
        System.out.println("testArray = " + testArray);
    }
    @Test
    public void testForInOrderMultiNode(){
        Node<Integer> testNode = new Node(2);
        testNode.setLeft(new Node<>(3));
        testNode.getLeft().setLeft(new Node<>(6));
        testNode.getLeft().setRight(new Node<>(7));
        testNode.setRight(new Node<>(4));
        testNode.getRight().setLeft(new Node<>(8));
        testNode.getRight().setLeft(new Node<>(9));
        Tree<Integer> testTree = new Tree<>(testNode);
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(6);
        testArray.add(3);
        testArray.add(7);
        testArray.add(2);
        testArray.add(9);
        testArray.add(4);
        assertEquals(testArray, testTree.inOrder());
        System.out.println("testArray = " + testArray);
    }

    @Test
    public void testForPostOrderMultiNode(){
        Node<Integer> testNode = new Node(2);
        testNode.setLeft(new Node<>(3));
        testNode.getLeft().setLeft(new Node<>(6));
        testNode.getLeft().setRight(new Node<>(7));
        testNode.setRight(new Node<>(4));
        testNode.getRight().setLeft(new Node<>(8));
        testNode.getRight().setLeft(new Node<>(9));
        Tree<Integer> testTree = new Tree<>(testNode);
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(6);
        testArray.add(7);
        testArray.add(3);
        testArray.add(9);
        testArray.add(4);
        testArray.add(2);
        assertEquals(testArray, testTree.postOrder());
        System.out.println("testArray = " + testArray);
    }
}
