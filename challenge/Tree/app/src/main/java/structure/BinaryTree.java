package structure;

import data.Node;
import queue.Queue;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;
    StringBuilder dataOfBinaryTree = new StringBuilder();
    private T max = null;
    private int sumOfOddNumber;

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
            System.out.print(" " + node.getKey());
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
            max = root.getKey();
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
        if (root == null) {
            return null;
        }
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


    public BinaryTree<String> fizzBzzTree(BinaryTree<Integer> tree) {

        BinaryTree<String> newTree = new BinaryTree<>();
        newTree.setRoot(new Node<>());

        if (tree.getRoot() != null) {
            fizzBzzTravel(tree.getRoot(), newTree.getRoot());
        }
        return newTree;
    }

    private void fizzBzzTravel(Node<Integer> node, Node<String> newTreeRoot) {

        if (node.getKey() % 3 == 0 && node.getKey() % 5 == 0) {
            newTreeRoot.setKey("FizzBuzz");
        } else if (node.getKey() % 5 == 0) {
            newTreeRoot.setKey("Buzz");
        } else if (node.getKey() % 3 == 0) {
            newTreeRoot.setKey("Fizz");
        } else {
            String data = String.valueOf(node.getKey());
            newTreeRoot.setKey(data);
        }

        if (node.getRight() != null) {
            newTreeRoot.setRight(new Node<>());
            fizzBzzTravel(node.getRight(), newTreeRoot.getRight());
        }
        if (node.getLeft() != null) {
            newTreeRoot.setLeft(new Node<>());
            fizzBzzTravel(node.getLeft(), newTreeRoot.getLeft());
        }

    }

    public Object getSumOfOddNumber(){
        if (isEmpty()) {
            return ("The Tree are empty");
        } else {
//            sumOfOddNumber=(int)root.getKey();
            getSumTravel(root);
        }
        return sumOfOddNumber;
    }

    private void getSumTravel(Node node) {

        if ((int) (node.getKey()) % 2 != 0) {
            sumOfOddNumber += (int) node.getKey();
        }
//        if (((int)node.getKey())%2 != 0) {
//            sumOfOddNumber+= (int)node.getKey();
//        }

        if (node.getRight() != null) {
            getSumTravel(node.getRight());
        }
        if (node.getLeft() != null) {
            getSumTravel(node.getLeft());
        }
    }


}
