package structure;

import data.Node;


import java.util.ArrayList;
import java.util.List;
import queue.Queue;

public class BinaryTree {
    Node root;
    StringBuilder dataOfBinaryTree = new StringBuilder();
    private int max = 0;


    public boolean isEmpty() {
        return root == null;
    }

    public String postOrderTraverse(Node node) {
        if (node != null) {
            postOrderTraverse(node.getLeft());
            postOrderTraverse(node.getRight());
            dataOfBinaryTree.append(node.getKey()).append(" ");
        }
        return dataOfBinaryTree.toString();
    }

    public String inOrderTraverse(Node node) {
        if (node != null) {
            inOrderTraverse(node.getLeft());
//            System.out.print(" " + node.getKey());
            dataOfBinaryTree.append(node.getKey()).append(" ");
            inOrderTraverse(node.getRight());
        }
        return dataOfBinaryTree.toString();
    }

    public String preOrderTraverse(Node node) {
        if (node != null) {
//            System.out.print(" " + node.getKey());
            dataOfBinaryTree.append(node.getKey()).append(" ");
            preOrderTraverse(node.getLeft());
            preOrderTraverse(node.getRight());
        }
        return dataOfBinaryTree.toString();
    }

    public Number getMax() {
        if (root != null) {
            max = root.getKey();
            max = (int) travel(root);
        }
        return max;
    }

    private Number travel(Node node) {
        if (node.getKey() > max) {
            max = node.getKey();
        }

        if (node.getRight() != null) {
            travel(node.getRight());
        }
        if (node.getLeft() != null) {
            travel(node.getLeft());
        }

        return max;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public List<Integer> breadthFirst(BinaryTree tree) {
        Queue<Node> tempTree = new Queue<>();
        Node current = tree.getRoot();
        List<Integer> list = new ArrayList<>();

        if (current != null) {
            tempTree.enqueue(tree.getRoot());
        }
        while (!tempTree.isEmpty()) {
            current = tempTree.dequeue();
            list.add(current.getKey());

            if (current.getLeft() != null) {
                tempTree.enqueue(current.getLeft());
            }
            if (current.getRight() != null) {
                tempTree.enqueue(current.getRight());
            }
        }
        return list;
    }

}
