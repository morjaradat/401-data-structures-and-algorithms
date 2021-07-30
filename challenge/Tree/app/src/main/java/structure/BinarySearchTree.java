package structure;

import data.Node;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
    Node<T> root;
    private int sumOfOddNumber;

    @Override
    public Node<T> getRoot() {
        return root;
    }

    public void add(T key) {
        if (root == null) {
            root = new Node<T>(key);
        } else {
            Node<T> current = root;
            traverse(current, key);
        }
    }

    public boolean isEmpty(){
    return root==null;
    }

    private void traverse(Node<T> current, T key) {
        if (key.compareTo(current.getKey())>0) {
            if (current.getRight() == null) {
                current.setRight(new Node<T>(key));
                return;
            }

            current = current.getRight();
        } else {
            if (current.getLeft() == null) {
                current.setLeft(new Node<T>(key));
                return;
            }

            current = current.getLeft();
        }
        traverse(current, key);
    }

    public boolean Contains(T key) {

        if (root == null) {
            return false;
        } else {
            Node<T> current = root;
            return traverseContain(current, key);
        }

    }

    @Override
    public Object getSumOfOddNumber() {
        if (isEmpty()){
            return ("The Tree are empty");
        }else {
//            sumOfOddNumber=(int)root.getKey();
            getSumTravel(root);
        }
        return sumOfOddNumber;
    }

    private void getSumTravel(Node node) {

        if ((int)(node.getKey())%2 != 0) {
            sumOfOddNumber+= (int)node.getKey();
        }
        if (node.getRight() != null) {
            getSumTravel(node.getRight());
        }
        if (node.getLeft() != null) {
            getSumTravel(node.getLeft());
        }
    }

    public boolean traverseContain(Node<T> currentNode, T key) {
        if (currentNode == null) {
            return false;
        } else {
            if (key.compareTo(currentNode.getKey()) >0 ) {
                if (currentNode.getKey() == key) {
                    return true;

                } else {
                    currentNode = currentNode.getRight();
                    return traverseContain(currentNode, key);
                }
            } else {
                if (currentNode.getKey() == key) {
                    return true;
                } else {
                    currentNode = currentNode.getLeft();
                    return traverseContain(currentNode, key);
                }
            }
        }
    }
}
