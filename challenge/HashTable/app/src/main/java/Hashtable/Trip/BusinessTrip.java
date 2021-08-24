package Hashtable.Trip;

import Hashtable.Graph.Graphv;
import Hashtable.Graph.Vertex;
import Hashtable.LinkedList.LinkedList;

public  class BusinessTrip {

    public static String businessTrip(Graphv<String,Integer> graph, String[] contant){
        boolean exist = true;
        String result="" ;
        int cost = 0;
        if (graph.getSize()>0){

            for (int i = 0 ; i <contant.length-1 && exist; i++){
                LinkedList<Vertex<String,Integer>> links = graph.getNeighbors(contant[i]);
                exist=false;
                for (int index =0 ; index< links.getSize()-1;index++){
                   Vertex<String,Integer> vertex = links.get(index);
                   if (vertex.getValue().equals(contant[i+1])){
                       exist= true;
                       cost+=vertex.getWeight();
                   }
                }
            }
        }
        if (exist){
            result = "true ,$"+cost;
        }else {
            result= "false ,$"+ cost;
        }
        return result;
    }
}
