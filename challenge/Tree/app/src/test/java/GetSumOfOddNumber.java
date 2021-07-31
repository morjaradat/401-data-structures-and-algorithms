
import data.Node;
import org.junit.Test;
import structure.BinarySearchTree;
import structure.BinaryTree;

import static org.junit.Assert.*;

public class GetSumOfOddNumber {

  private final BinaryTree<Integer> binaryTree = new BinaryTree<>();
  private final BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();


    @Test
    public void testEmptyTree() {
        assertEquals("The Tree are empty",binaryTree.getSumOfOddNumber());
    }
    @Test
  public void treeOnlyHaveRoot()  {
      binaryTree.setRoot(new Node<>(13));
      binarySearchTree.add(11);
      assertEquals(13,binaryTree.getSumOfOddNumber());
      assertEquals(11,binarySearchTree.getSumOfOddNumber());
    }
    @Test
    public void TreeHaveEvenNumber()  {
        binaryTree.setRoot(new Node<>(10));
        binaryTree.getRoot().setLeft(new Node<>(2));
        binaryTree.getRoot().setRight(new Node<>(4));
        binarySearchTree.add(8);
        binarySearchTree.add(18);
        binarySearchTree.add(20);
        assertEquals(0,binaryTree.getSumOfOddNumber());
        assertEquals(0,binarySearchTree.getSumOfOddNumber());
    }
    @Test
    public void treeHaveOddNumber()  {
        binaryTree.setRoot(new Node<>(11));
        binaryTree.getRoot().setLeft(new Node<>(1));
        binaryTree.getRoot().setRight(new Node<>(3));
        binarySearchTree.add(5);
        binarySearchTree.add(7);
        binarySearchTree.add(9);
        assertEquals(15,binaryTree.getSumOfOddNumber());
        assertEquals(21,binarySearchTree.getSumOfOddNumber());
    }
    @Test
    public void treeHaveNegativeNumber()  {
        binaryTree.setRoot(new Node<>(-11));
        binaryTree.getRoot().setLeft(new Node<>(-1));
        binaryTree.getRoot().setRight(new Node<>(-3));
        binarySearchTree.add(-5);
        binarySearchTree.add(-7);
        binarySearchTree.add(-9);
        assertEquals(-15,binaryTree.getSumOfOddNumber());
        assertEquals(-21,binarySearchTree.getSumOfOddNumber());
    }

    @Test
    public void treeHaveOddAndEvenNumber()  {
        binaryTree.setRoot(new Node<>(11));
        binaryTree.getRoot().setLeft(new Node<>(6));
        binaryTree.getRoot().getLeft().setRight(new Node<>(8));
        binaryTree.getRoot().setRight(new Node<>(-3));
        binaryTree.getRoot().getRight().setRight(new Node<>(7));
        binarySearchTree.add(5);
        binarySearchTree.add(-7);
        binarySearchTree.add(10);
        binarySearchTree.add(17);
        binarySearchTree.add(22);
        binarySearchTree.add(-9);
        assertEquals(15,binaryTree.getSumOfOddNumber());
        assertEquals(6,binarySearchTree.getSumOfOddNumber());
    }

}
