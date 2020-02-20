package code401challenges.TreeIntersection;



//assistance from https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/
// and from https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
import java.util.Stack;

public class TreeIntersection {

    public static class Node
    {
        int key;
        Node left, right;
    }

    public static Node newNode(int ele)
    {
        Node temp = new Node();
        temp.key = ele;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static void tree_intersection(Node root1, Node root2)
    {
        Stack<Node> stackOne = new Stack<>();
        Stack<Node> stackTwo = new Stack<>();

        while (true)
        {
            if (root1 != null)
            {
                stackOne.push(root1);
                root1 = root1.left;
            }
            else if (root2 != null)
            {
                stackTwo.push(root2);
                root2 = root2.left;
            }
            else if (!stackOne.isEmpty() && !stackTwo.isEmpty())
            {
                root1 = stackOne.peek();
                root2 = stackTwo.peek();

                if (root1.key == root2.key)
                {
                    System.out.print(root1.key + " ");
                    stackOne.pop();
                    stackTwo.pop();

                    root1 = root1.right;
                    root2 = root2.right;
                }
                else if (root1.key < root2.key)
                {
                    stackOne.pop();
                    root1 = root1.right;

                    root2 = null;
                }
                else if (root1.key > root2.key)
                {
                    stackTwo.pop();
                    root2 = root2.right;
                    root1 = null;
                }
            }
            else break;
        }
    }
    public static void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    static Node insert(Node node, int key) {
        if (node == null)
            return newNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }


}