package Graph;

import HashMap.HashMap;
import LinkedList.LinkedList;

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

}
