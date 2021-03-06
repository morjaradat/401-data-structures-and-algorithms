/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import data.Node;
import org.junit.Test;
import structure.BinarySearchTree;
import structure.BinaryTree;

import static org.junit.Assert.*;

public class AppTest {

    /* binary Tree */

    /*
    Can successfully instantiate an empty tree
     */
    @Test
    public void emptyTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        assertTrue(binaryTree.isEmpty());
    }

    /*
  Can successfully instantiate a tree with a single root node
    */

    @Test
    public void insertOne() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        assertEquals(5, (int)binaryTree.getRoot().getKey());
    }

      /*
  Can successfully add a left child and right child to a single root node
    */

@Test
    public void AddLeftAndRight(){
    BinaryTree<Integer> binaryTree = new BinaryTree<>();
    binaryTree.setRoot(new Node<>(5));
    binaryTree.getRoot().setLeft(new Node<>(2));
    binaryTree.getRoot().setRight(new Node<>(3));
    assertEquals(2, (int)binaryTree.getRoot().getLeft().getKey());
    assertEquals(3,(int) binaryTree.getRoot().getRight().getKey());

}

    /*
  Can successfully return a collection from a preorder traversal
    */

    @Test
    public void PreOrder(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        binaryTree.getRoot().setLeft(new Node<>(2));
        binaryTree.getRoot().setRight(new Node<>(3));
       assertEquals("5 2 3 ",binaryTree.preOrderTraverse(binaryTree.getRoot()));
    }

    /*
  Can successfully return a collection from a inOrder traversal
    */

    @Test
    public void inOrder(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        binaryTree.getRoot().setLeft(new Node<>(2));
        binaryTree.getRoot().setRight(new Node<>(3));
        assertEquals("2 5 3 ",binaryTree.inOrderTraverse(binaryTree.getRoot()));

        /*
  Can successfully return a collection from a postOrder traversal
    */

    }@Test
    public void postOrder (){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        binaryTree.getRoot().setLeft(new Node<>(2));
        binaryTree.getRoot().setRight(new Node<>(3));
        assertEquals("2 3 5 ",binaryTree.postOrderTraverse(binaryTree.getRoot()));
    }


    /* binarySearchTree */

    /*
   Can successfully instantiate an empty tree
    */
    @Test
    public void emptySearchTree() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        assertTrue(binarySearchTree.isEmpty());
    }

     /*
  Can successfully instantiate a tree with a single root node
    */

    @Test
    public void insertOneBinarySearchTree() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(5);
        assertEquals(5, (int)binarySearchTree.getRoot().getKey());
    }

       /*
  Can successfully return a collection from a preorder traversal
    */

    @Test
    public void PreOrderBinarySearchTree(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(5);
        binarySearchTree.add(10);
        binarySearchTree.add(2);
        assertEquals("5 2 10 ",binarySearchTree.preOrderTraverse(binarySearchTree.getRoot()));
    }

    /*
  Can successfully return a collection from a inOrder traversal
    */

    @Test
    public void inOrderBinarySearchTree(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(5);
        binarySearchTree.add(10);
        binarySearchTree.add(2);
        assertEquals("2 5 10 ",binarySearchTree.inOrderTraverse(binarySearchTree.getRoot()));
        /*
  Can successfully return a collection from a postOrder traversal
    */

    }@Test
    public void postOrderBinarySearchTree(){
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(5);
        binarySearchTree.add(10);
        binarySearchTree.add(2);
        assertEquals("2 10 5 ",binarySearchTree.postOrderTraverse(binarySearchTree.getRoot()));
    }


}
