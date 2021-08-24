package Hashtable.HashMapTree;

import Hashtable.BinaryTree.BinarySearchTree;
import Hashtable.HashMap.ImplementHashMap;
import Hashtable.queue.Queue;

public class TreeHashMap {

    public ImplementHashMap<Object> treeIntersection(BinarySearchTree<Integer> tree1,BinarySearchTree<Integer> tree2){
        Queue<Integer> firstTree =  tree1.breadthFirst(tree1);
        Queue<Integer> firstTreeTemp =  tree1.breadthFirst(tree1);
        Queue<Integer> SecondTree = tree2.breadthFirst(tree2);

        ImplementHashMap<Object> first_Tree_HashMap = new ImplementHashMap<>();
        ImplementHashMap<Object> second_Tree_HashMap = new ImplementHashMap<>();
        ImplementHashMap<Object> interSection_HashMap = new ImplementHashMap<>();


        while(!firstTree.isEmpty()) {
            first_Tree_HashMap.add(firstTree.dequeue());
        }
        while(!SecondTree.isEmpty()) {
            second_Tree_HashMap.add(SecondTree.dequeue());
        }
        for(int i = 0; i <= first_Tree_HashMap.getSize()-1; i++) {
            int temp = 0;
            if (firstTreeTemp.peek() !=null){
                temp = firstTreeTemp.dequeue();
            }
            if(second_Tree_HashMap.contains(temp)){
                interSection_HashMap.add(temp);
            }
        }

        return interSection_HashMap;

    }
}
