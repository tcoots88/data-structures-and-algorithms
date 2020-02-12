//package code401challenges.Utilities;
//
//
//import code401challenges.tree.*;
//
//
//
//public class FizzBuzzTree<String extends Comparable<String>> {
//    public FizzBuzzTree(){
//    }
//
//
//    public Tree fizzBuzz(Tree<String> tree) {
//    if (tree.root != null)
//        fizzBuzzMethodHelper(tree.root);
//    return tree;
//}
//
//    public void fizzBuzzMethodHelper(Node<String> current) {
//        if (current == null) {
//            return;
//        }
//        try {
//            Integer number = Integer.parseInt((java.lang.String) current.data);
//            if (number % 15 == 0) {
//                current.setData((String) "FizzBuzz");
//            } else if (number % 5 == 0) {
//                current.setData((String) "Buzz");
//            } else if (number % 3 == 0) {
//                current.setData((String) "Fizz");
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("Unable to be converted into an integer");
//        }
//        fizzBuzzMethodHelper(current.left);
//        fizzBuzzMethodHelper(current.right);
//
//    }
//}
