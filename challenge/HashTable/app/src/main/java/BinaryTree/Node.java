package BinaryTree;

public class Node<T> {
    private T key ;
    private Node<T> left;
    private Node<T> right;


    public Node() {
    }

    public Node(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
//    public Node(int key) {
//        this.key = key;
//    }
//
//    public int getKey() {
//        return key;
//    }
//
//    public void setKey(int key) {
//        this.key = key;
//    }
//
//    public Node getLeft() {
//        return left;
//    }
//
//    public void setLeft(Node left) {
//        this.left = left;
//    }
//
//    public Node getRight() {
//        return right;
//    }
//
//    public void setRight(Node right) {
//        this.right = right;
//    }
}
