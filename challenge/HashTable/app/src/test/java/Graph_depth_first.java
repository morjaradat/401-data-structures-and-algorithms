
import Hashtable.Graph.Graphv;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Graph_depth_first {

    @Test
    public void dft(){
        Graphv<String, Integer> graphv = new Graphv<>();

        graphv.addNode("a");
        graphv.addNode("b");
        graphv.addNode("c");
        graphv.addNode("d");
        graphv.addNode("e");
        graphv.addNode("f");
        graphv.addNode("g");
        graphv.addNode("h");


        graphv.addEdge("a", "d");
        graphv.addEdge("a", "b");
        graphv.addEdge("b", "d");
        graphv.addEdge("b", "c");
        graphv.addEdge("c", "g");
        graphv.addEdge("d", "f");
        graphv.addEdge("d", "h");
        graphv.addEdge("d", "e");
        graphv.addEdge("h", "f");

        assertEquals("{a}-> {b}-> {c}-> {g}-> {d}-> {e}-> {h}-> {f}-> NULL",graphv.dft("a").toString());
    }

    @Test
    public void  emptyGraph(){
        Graphv<String, Integer> empty = new Graphv<>();
        assertNull(empty.dft(""));
    }
    @Test
    public void wrongRootInput(){
        Graphv<String, Integer> empty = new Graphv<>();
        assertNull(empty.dft("12345"));
    }
}
