package structure;

import data.Node;

public class BinarySearchTree extends BinaryTree{
    Node root;

    @Override
    public Node getRoot() {
        return root;
    }

    public void add(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            Node current = root;
            traverse(current, key);
        }
    }

    public boolean isEmpty(){
    return root==null;
    }

    private void traverse(Node current, int key) {
        if (key > current.getKey()) {
            if (current.getRight() == null) {
                current.setRight(new Node(key));
                return;
            }

            current = current.getRight();
        } else {
            if (current.getLeft() == null) {
                current.setLeft(new Node(key));
                return;
            }

            current = current.getLeft();
        }
        traverse(current, key);
    }

    public boolean Contains(int key) {

        if (root == null) {
            return false;
        } else {
            Node current = root;
            return traverseContain(current, key);
        }

    }


    public boolean traverseContain(Node currentNode, int key) {
        if (currentNode == null) {
            return false;
        } else {
            if (key > currentNode.getKey()) {
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
