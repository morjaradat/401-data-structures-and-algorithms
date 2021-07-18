package structure;

import data.Node;

public class BinaryTree  {
    Node root;
    StringBuilder dataOfBinaryTree = new StringBuilder();


    public boolean isEmpty(){
     return root==null;
 }

    public String postOrderTraverse(Node node) {
        if (node!=null){
            postOrderTraverse(node.getLeft());
            postOrderTraverse(node.getRight());
            dataOfBinaryTree.append(node.getKey()).append(" ");
        }
        return dataOfBinaryTree.toString();
    }

    public String inOrderTraverse(Node node) {
        if (node!=null){
            inOrderTraverse(node.getLeft());
//            System.out.print(" " + node.getKey());
            dataOfBinaryTree.append(node.getKey()).append(" ");
            inOrderTraverse(node.getRight());
        }
        return dataOfBinaryTree.toString();
    }

    public String preOrderTraverse(Node node) {
        if (node!=null){
//            System.out.print(" " + node.getKey());
            dataOfBinaryTree.append(node.getKey()).append(" ");
            preOrderTraverse(node.getLeft());
            preOrderTraverse(node.getRight());
        }
        return dataOfBinaryTree.toString();
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
