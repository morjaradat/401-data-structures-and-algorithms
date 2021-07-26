import data.Node;
import org.junit.Test;
import structure.BinaryTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class breadthFirstTest {
    @Test
    public void getBreadthFirst(){
        BinaryTree binaryTree = new BinaryTree();
        List<Integer> list = new ArrayList<>();
        assertEquals(list,binaryTree.breadthFirst(binaryTree));
    }
    @Test
    public void onlyRootWithRight(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getRight().setLeft(new Node(15));
        binaryTree.getRoot().getRight().setRight(new Node(44));
        binaryTree.getRoot().getRight().getRight().setRight(new Node(65));
        assertEquals("[1, 3, 15, 44, 65]",binaryTree.breadthFirst(binaryTree));
    }

    @Test
    public void getMax(){
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(4));

        binaryTree.getRoot().getRight().setLeft(new Node(15));
        binaryTree.getRoot().getRight().setRight(new Node(44));
        binaryTree.getRoot().getRight().getRight().setRight(new Node(65));


        binaryTree.getRoot().getLeft().getLeft().setLeft(new Node(5));
        binaryTree.getRoot().getLeft().getLeft().setRight(new Node(10));
        assertEquals("[1, 2, 3, 4, 15, 44, 5, 10, 65]",binaryTree.breadthFirst(binaryTree));
    }
}
