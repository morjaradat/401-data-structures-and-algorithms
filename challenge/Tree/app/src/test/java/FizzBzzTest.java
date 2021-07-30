import data.Node;
import org.junit.Before;
import org.junit.Test;
import structure.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBzzTest {


    @Test
    public void emptyTree(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        assertNull(binaryTree.fizzBzzTree(binaryTree).getRoot().getKey());
    }

    @Test
    public void TreeDontHaveAny_3_5_Divide(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(1));
        binaryTree.getRoot().setLeft(new Node<>(2));
        binaryTree.getRoot().setRight(new Node<>(7));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(4));
        BinaryTree<String> newTree =binaryTree.fizzBzzTree(binaryTree);
        assertEquals("4 2 1 7 ",newTree.inOrderTraverse(newTree.getRoot()));
    }

    @Test
    public void TreeHaveOnly_3_Divide(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(3));
        binaryTree.getRoot().setLeft(new Node<>(6));
        binaryTree.getRoot().setRight(new Node<>(9));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(12));
        BinaryTree<String> newTree =binaryTree.fizzBzzTree(binaryTree);
        assertEquals("Fizz Fizz Fizz Fizz ",newTree.inOrderTraverse(newTree.getRoot()));
    }

    @Test
    public void TreeHaveOnly_5_Divide(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        binaryTree.getRoot().setLeft(new Node<>(10));
        binaryTree.getRoot().setRight(new Node<>(25));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(20));
        BinaryTree<String> newTree =binaryTree.fizzBzzTree(binaryTree);
        assertEquals("Buzz Buzz Buzz Buzz ",newTree.inOrderTraverse(newTree.getRoot()));
    }

    @Test
    public void TreeHave_3_5_Divide(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        binaryTree.getRoot().setLeft(new Node<>(15));
        binaryTree.getRoot().setRight(new Node<>(30));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(60));
        BinaryTree<String> newTree =binaryTree.fizzBzzTree(binaryTree);
        assertEquals("FizzBuzz FizzBuzz Buzz FizzBuzz ",newTree.inOrderTraverse(newTree.getRoot()));
    }

    @Test
    public void testANormalTree(){
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new Node<>(5));
        binaryTree.getRoot().setLeft(new Node<>(15));
        binaryTree.getRoot().setRight(new Node<>(30));
        binaryTree.getRoot().getRight().setRight(new Node<>(28));
        binaryTree.getRoot().getRight().getRight().setRight(new Node<>(30));
        binaryTree.getRoot().getLeft().setRight(new Node<>(1));
        binaryTree.getRoot().getLeft().setLeft(new Node<>(2));
        BinaryTree<String> newTree =binaryTree.fizzBzzTree(binaryTree);
        assertEquals("2 FizzBuzz 1 Buzz FizzBuzz 28 FizzBuzz ",newTree.inOrderTraverse(newTree.getRoot()));
    }

}
