package code401challenges.tree;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void testAddingNewNodeToTree(){
        Node<Integer> testTreeNode = new Node<>(48);
        Integer nodeValue = testTreeNode.getData();
        System.out.println("nodeValue = " + nodeValue);
        assertTrue(nodeValue == 48);
        System.out.println("Right value is = " + testTreeNode.getRight());
        System.out.println("Left value is = " + testTreeNode.getLeft());
    }
}
