package structure;

import data.Node;


import java.util.ArrayList;
import java.util.List;
import queue.Queue;

public class BinaryTree<T extends  Comparable<T>> {
    Node<T> root;
    StringBuilder dataOfBinaryTree = new StringBuilder();
    private T max = null;

    public boolean isEmpty() {
        return root == null;
    }

    public String postOrderTraverse(Node<T> node) {
        if (node != null) {
            postOrderTraverse(node.getLeft());
            postOrderTraverse(node.getRight());
            dataOfBinaryTree.append(node.getKey()).append(" ");
        }
        return dataOfBinaryTree.toString();
    }

    public String inOrderTraverse(Node<T> node) {
        if (node != null) {
            inOrderTraverse(node.getLeft());
//            System.out.print(" " + node.getKey());
            dataOfBinaryTree.append(node.getKey()).append(" ");
            inOrderTraverse(node.getRight());
        }
        return dataOfBinaryTree.toString();
    }

    public String preOrderTraverse(Node<T> node) {
        if (node != null) {
//            System.out.print(" " + node.getKey());
            dataOfBinaryTree.append(node.getKey()).append(" ");
            preOrderTraverse(node.getLeft());
            preOrderTraverse(node.getRight());
        }
        return dataOfBinaryTree.toString();
    }

    public T getMax() {
        if (root != null) {
            max =  root.getKey();
            max = travel(root);
        }
        return max;
    }

    private T travel(Node<T> node) {

        if (max.compareTo(node.getKey()) < 0) {
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

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public List<T> breadthFirst(BinaryTree<T> tree) {
        Queue<Node<T>> tempTree = new Queue<>();
        Node<T> current = tree.getRoot();
        List<T> list = new ArrayList<>();

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


    public BinaryTree<String> fizzBzzTree(BinaryTree<Integer> tree){
        BinaryTree<String> newTree = new BinaryTree<>();
        if (tree.getRoot()!=null){
            fizzBzzTravel(tree.getRoot(),newTree.getRoot());
        }
        return  newTree;
    }

    private void fizzBzzTravel(Node<Integer> node , Node<String> newTree) {

        if ((int)node.getKey()% 3==0 && (int)node.getKey()%5==0){
            newTree.setKey("FizzBuzz");
        }else if ((int)node.getKey()%5==0){
            newTree.setKey("Buzz");
        }else if ((int)node.getKey()%3==0){
            newTree.setKey("Fizz");
        }else {
            newTree.setKey(node.getKey().toString());
        }

        if (node.getRight() != null) {
            Node<String> newNode = newTree.getLeft();
            fizzBzzTravel(node.getRight(),newNode);
        }
        if (node.getLeft() != null) {
            Node<String> newNode = newTree.getRight();
            fizzBzzTravel(node.getLeft(),newNode);
        }

    }
}
