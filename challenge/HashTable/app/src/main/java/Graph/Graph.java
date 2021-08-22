package Graph;

import HashMap.HashMap;
import HashMap.ImplementHashMap;
import LinkedList.LinkedList;
import queue.Queue;

import java.util.ArrayList;
import java.util.List;

public class Graph<V> {

    private HashMap<V, LinkedList<GraphNode<V>>> nodes;
    private int size;

    public Graph() {
        nodes = new HashMap<V, LinkedList<GraphNode<V>>>();
    }

    public V addNode(V data){
//        GraphNode<V> vertex = new GraphNode<V>(data);
        nodes.put(data,new LinkedList<GraphNode<V>>());
        size++;
        return data;

    }

    public void addEdge(V data1 , V data2){
        if (!nodes.contain(data1) || !nodes.contain(data2)) {
            return;
        }
//        GraphNode<V> vertex1 = new GraphNode<V>(data1);
//        GraphNode<V> vertex2 = new GraphNode<V>(data2);
        nodes.get(data1).append(new GraphNode<V>(data2));
        nodes.get(data2).append(new GraphNode<V>(data1));
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
    public LinkedList<GraphNode<V>> getNeighbors(V data){
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
            LinkedList<GraphNode<V>> nodeChild =nodes.get(front);
            for (int i = 0; i < nodeChild.getSize(); i++) {
                GraphNode<V> edge = nodeChild.get(i);
                if (!visited.contains(edge.getValue())) {
                    breadth.enqueue(edge.getValue());
                    visited.add(edge.getValue());
                }
            }
        }
        return result;
    }

}
