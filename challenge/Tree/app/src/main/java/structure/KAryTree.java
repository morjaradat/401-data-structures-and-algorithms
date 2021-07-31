package structure;

import data.KAryNode;

import java.util.ArrayList;
import java.util.List;

public class KAryTree<T> {

 private KAryNode<T> root;
 private int height;
 private int index = 0;
 private final List<KAryNode<T>> KArayTreeNodes = new ArrayList<>();

 public KAryTree(List<T> values, int K){
  height = (int)Math.ceil((Math.log((double)values.size() * (K - 1)) / Math.log(K)) - 1) + 1;
  System.out.println(height);
  int arrayLength = values.size();

  if (arrayLength <= 0) {
   return;
  }
  root = new KAryNode<>(values.get(0),K);
  KArayTreeNodes.add(root);
  createKAryTree(values, K, root);
 }

 private void createKAryTree(List<T> values, int K, KAryNode<T> node){
  for (int j = 0; j < K; j++) {
   if ((K * index + (j + 1)) > (values.size() - 1)){
    return;
   }else {
    KArayTreeNodes.add(node.addChild(values.get(K * index + (j + 1))));
   }
  }
  if (index < values.size()) {
   index++;
   createKAryTree(values, K, KArayTreeNodes.get(index));
  }
 }
 // Function to print postorder traversal of the tree
 public void postorder(KAryNode<T> root) {
  if (root == null) {
   return;
  }
  for (int i = 0; i < root.getChildren().size(); i++) {
   postorder(root.getChildren().get(i));
  }
  System.out.print(root.getKey() + " ");
 }

 public KAryTree<String> treeFizzBuzz(KAryTree<T> tree){
  List<KAryNode<T>> list = new ArrayList<>();
  KAryTree<String> kAryTree = new KAryTree(list, 3);

  for (KAryNode<T> kAryNode: KArayTreeNodes){
   if ((((Integer) kAryNode.getKey()) % 3 == 0) && (((Integer) kAryNode.getKey()) % 5 == 0)){
    kAryTree.getKArayTreeNodes().add(new KAryNode<>("FizzBuzz",3));
   }else if(((Integer) kAryNode.getKey()) % 3 == 0){
    kAryTree.getKArayTreeNodes().add(new KAryNode<>("Fizz",3));
   }else if(((Integer) kAryNode.getKey()) % 5 == 0){
    kAryTree.getKArayTreeNodes().add(new KAryNode<>("Buzz",3));
   }else {
    kAryTree.getKArayTreeNodes().add(new KAryNode<>(kAryNode.getKey().toString(),3));
   }
  }
  return kAryTree;
 }



 public StringBuilder noOrder(KAryTree<T> tree){
  List<KAryNode<T>> list =tree.getKArayTreeNodes();
  StringBuilder stringBuilder = new StringBuilder();
  stringBuilder.append("{ ");
  for (KAryNode<T> node : list){
   stringBuilder.append(" "+node.getKey()+" ");
  }
  stringBuilder.append(" }");
  return stringBuilder;
 }
 private List<KAryNode<T>> getKArayTreeNodes() {
  return KArayTreeNodes;
 }

 public KAryNode<T> getRoot() {
  return root;
 }
}
