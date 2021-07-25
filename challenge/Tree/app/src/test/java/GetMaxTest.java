import data.Node;
import org.junit.Test;
import structure.BinaryTree;

import static org.junit.Assert.*;

public class GetMaxTest {

    @Test
    public void getMaxEmptyTree(){
        BinaryTree binaryTree = new BinaryTree();

        assertEquals(0,binaryTree.getMax());
    }


    @Test
    public void onlyRoot(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        assertEquals(1,binaryTree.getMax());
    }
    @Test
    public void onlyRootWithRight(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getRight().setLeft(new Node(15));
        binaryTree.getRoot().getRight().setRight(new Node(44));
        binaryTree.getRoot().getRight().getRight().setRight(new Node(65));
        assertEquals(65,binaryTree.getMax());
    }


    @Test
    public void onlyRootWithLeft(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().getLeft().setLeft(new Node(5));
        binaryTree.getRoot().getLeft().getLeft().setLeft(new Node(10));
        binaryTree.getRoot().getLeft().getLeft().getLeft().setLeft(new Node(15));
        assertEquals(15,binaryTree.getMax());
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
        assertEquals(65,binaryTree.getMax());
    }
    @Test
    public void sameNumbers(){
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(1));
        binaryTree.getRoot().setRight(new Node(1));
        binaryTree.getRoot().getLeft().setLeft(new Node(1));

        assertEquals(1,binaryTree.getMax());
    }
}
