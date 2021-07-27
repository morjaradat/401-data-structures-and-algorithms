package structure;

import data.Node;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
    Node<T> root;

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
