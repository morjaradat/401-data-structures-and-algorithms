/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import data.Node;
import structure.BinarySearchTree;
import structure.BinaryTree;

public class App {

    public static void main(String[] args) {
        System.out.println("test");

        BinaryTree binaryTree = new BinaryTree();


        // adds nodes to the tree
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(4));

        binaryTree.getRoot().getRight().setLeft(new Node(15));
        binaryTree.getRoot().getRight().setRight(new Node(44));
        binaryTree.getRoot().getRight().getRight().setRight(new Node(65));


        binaryTree.getRoot().getLeft().getLeft().setLeft(new Node(5));
        binaryTree.getRoot().getLeft().getLeft().setRight(new Node(10));
        System.out.println(binaryTree.getMax());
//        System.out.println("");
//        System.out.println("-------------------");
//        System.out.println("");
//        System.out.println("inorder");
//        binaryTree.inOrderTraverse(binaryTree.getRoot());
//        System.out.println("");
//        System.out.println("-------------------");
//        System.out.println();
//        System.out.println("postorder");
//        binaryTree.postOrderTraverse(binaryTree.getRoot());
//        System.out.println("");
//        System.out.println("-------------------");
//        System.out.println();
//        System.out.println("preorder");
//        binaryTree.preOrderTraverse(binaryTree.getRoot());
//        System.out.println("");
//
//        System.out.println("-------------------");
//
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        System.out.println(binarySearchTree.isEmpty());
//        binarySearchTree.add(5);
//        binarySearchTree.add(7);
//        binarySearchTree.add(3);
//        binarySearchTree.add(10);
//        System.out.println(binarySearchTree.Contains(5));
//        System.out.println(binarySearchTree.getRoot());

    }
}
