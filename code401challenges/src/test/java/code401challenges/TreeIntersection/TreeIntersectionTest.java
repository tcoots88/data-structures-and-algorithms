package code401challenges.TreeIntersection;

import org.junit.Test;


import static code401challenges.TreeIntersection.TreeIntersection.*;

public class TreeIntersectionTest {

    @Test
    public void testForTreeIntersection() {
        Node root1 = null;
        root1 = insert(root1, 1);
        root1 = insert(root1, 2);
        root1 = insert(root1, 3);
        root1 = insert(root1, 4);
        root1 = insert(root1, 5);
        root1 = insert(root1, 6);
        root1 = insert(root1, 7);


        Node root2 = null;
        root2 = insert(root2, 5);
        root2 = insert(root2, 6);
        root2 = insert(root2, 7);
        root2 = insert(root2, 8);
        root2 = insert(root2, 9);
        root2 = insert(root2, 10);
        root2 = insert(root2, 11);


        System.out.print("Tree 1 : " + "\n");
        inorder(root1);
        System.out.println();
        System.out.print("Tree 2 : " + "\n");
        inorder(root2);
        System.out.println();
        System.out.println("Common Nodes: ");
        tree_intersection(root1, root2);



    }


}