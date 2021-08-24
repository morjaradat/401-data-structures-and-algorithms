package Hashtable.Graph;

import Hashtable.HashMap.HashMap;
import Hashtable.HashMap.ImplementHashMap;
import Hashtable.LinkedList.LinkedList;
import Hashtable.Stack.Stack;
import Hashtable.queue.Queue;

import java.util.ArrayList;
import java.util.List;


public class Graphv<V,W> {

    private HashMap<V, LinkedList<Vertex<V,W>>> nodes;
    private int size;

    public Graphv() {
        nodes = new HashMap<V, LinkedList<Vertex<V,W>>>();
    }

    public V addNode(V data){
//        Vertex<V> vertex = new Vertex<V>(data);
        nodes.put(data,new LinkedList<Vertex<V,W>>());
        size++;
        return data;

    }

    public void addEdge(V data1 , V data2){
        if (!nodes.contain(data1) || !nodes.contain(data2)) {
            return;
        }
//        Vertex<V> vertex1 = new Vertex<V>(data1);
//        Vertex<V> vertex2 = new Vertex<V>(data2);
        nodes.get(data1).append(new Vertex<V,W>(data2));
        nodes.get(data2).append(new Vertex<V,W>(data1));
    }

    public void addEdge(V data1 , V data2,W weight){
        if (!nodes.contain(data1) || !nodes.contain(data2)) {
            return;
        }
//        Vertex<V> vertex1 = new Vertex<V>(data1);
//        Vertex<V> vertex2 = new Vertex<V>(data2);
        nodes.get(data1).append(new Vertex<V,W>(data2,weight));
        nodes.get(data2).append(new Vertex<V,W>(data1,weight));
    }

    public  String print(){
        StringBuilder stringBuilder = new StringBuilder();
        for (V vertex : nodes.keySet()){
            stringBuilder.append(vertex);
            stringBuilder.append(nodes.get(vertex));
            stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }

    public int getSize(){
        return size;
    }
    public List<V> getNode(){
        return nodes.keySet();
    }
    public LinkedList<Vertex<V,W>> getNeighbors(V data){
       return nodes.get(data);
    }

    public List<V> breadthFirst(V node){
        if (!nodes.contain(node)) {
            return null;
        }
        List<V> result = new ArrayList<>();
        Queue<V> breadth = new Queue<>();
        ImplementHashMap<V> visited = new ImplementHashMap<V>();

        breadth.enqueue(node);
        visited.add(node);

        while (!breadth.isEmpty()){
            V front = breadth.dequeue();
            result.add(front);
            LinkedList<Vertex<V,W>> nodeChild =nodes.get(front);
            for (int i = 0; i < nodeChild.getSize(); i++) {
                Vertex<V,W> edge = nodeChild.get(i);
                if (!visited.contains(edge.getValue())) {
                    breadth.enqueue(edge.getValue());
                    visited.add(edge.getValue());
                }
            }
        }
        return result;
    }

    public LinkedList<V> dft( V root) {
        LinkedList<V> visited = new LinkedList<>();
        Stack<V> stack = new Stack<>();
        stack.push(root);

        if (this.getNode().contains(root)){
            while (!stack.isEmpty()) {
                V vertex = stack.pop();
                if (!visited.includes(vertex)) {
                    visited.append(vertex);
                    LinkedList<Vertex<V,W>> nodeChild =nodes.get(vertex);
                    for (int i = 0; i < nodeChild.getSize(); i++) {

                        stack.push(nodeChild.get(i).getValue());
                    }
                }
            }
        }else {
            return null;
        }

        return visited;
    }
}
