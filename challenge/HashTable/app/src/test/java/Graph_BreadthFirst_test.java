import Graph.Graph;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Graph_BreadthFirst_test {
    Graph<Integer> empty;
    Graph<String> airports;
    Graph<Integer> busStops;

    @Before
    public void init(){

        empty = new Graph<Integer>();
        airports = new Graph<String>();
        airports.addNode("Amman - Queen Alia International Airport");
        airports.addNode("Amman - Amman Civil Airport");
        airports.addNode("Aqaba - King Hussein International Airport");
        airports.addNode("Assab - H-4 Air Base");
        airports.addNode("Azraq - Muwaffaq Salti Air Base");
        airports.addNode("Dafyanah - Prince Hassan Air Base");
        airports.addNode("Mafraq - King Hussein Air Base");

        airports.addEdge(
                "Amman - Queen Alia International Airport",
                "Amman - Amman Civil Airport");
        airports.addEdge(
                "Amman - Queen Alia International Airport",
                "Amman - Amman Civil Airport"
        );
        airports.addEdge(
                "Amman - Queen Alia International Airport",
                "Aqaba - King Hussein International Airport"
        );
        airports.addEdge(
                "Amman - Amman Civil Airport",
                "Amman - Queen Alia International Airport"
        );
        airports.addEdge(
                "Amman - Amman Civil Airport",
                "Aqaba - King Hussein International Airport"
        );
        airports.addEdge(
                "Assab - H-4 Air Base",
                "Amman - Queen Alia International Airport"
        );
        airports.addEdge(
                "Assab - H-4 Air Base",
                "Azraq - Muwaffaq Salti Air Base"
        );
        airports.addEdge(
                "Azraq - Muwaffaq Salti Air Base",
                "Amman - Queen Alia International Airport"
        );
        airports.addEdge(
                "Azraq - Muwaffaq Salti Air Base",
                "Aqaba - King Hussein International Airport"
        );
        airports.addEdge(
                "Dafyanah - Prince Hassan Air Base",
                "Assab - H-4 Air Base"
        );
        airports.addEdge(
                "Mafraq - King Hussein Air Base",
                "Assab - H-4 Air Base"
        );
        airports.addEdge(
                "Mafraq - King Hussein Air Base",
                "Dafyanah - Prince Hassan Air Base"
        );
        airports.addEdge(
                "Aqaba - King Hussein International Airport",
                "Amman - Queen Alia International Airport"
        );
        airports.addEdge(
                "Aqaba - King Hussein International Airport",
                "Mafraq - King Hussein Air Base"
        );
        airports.addEdge(
                "Aqaba - King Hussein International Airport",
                "Amman - Amman Civil Airport"
        );

        busStops = new Graph<Integer>();
        busStops.addNode(1);
        busStops.addNode(2);
        busStops.addNode(3);
        busStops.addNode(4);
        busStops.addNode(5);
        busStops.addEdge(1, 2);
        busStops.addEdge(2, 3);
        busStops.addEdge(3, 4);
        busStops.addEdge(4, 5);
        busStops.addEdge(5, 1);
    }

    @Test
    public void breadthFirstTest() {
        assertEquals("[1, 2, 5, 3, 4]", busStops.breadthFirst(1).toString());
        assertEquals(
"[Amman - Queen Alia International Airport, Amman - Amman Civil Airport, Aqaba - King Hussein International Airport, Assab - H-4 Air Base, Azraq - Muwaffaq Salti Air Base, Mafraq - King Hussein Air Base, Dafyanah - Prince Hassan Air Base]",
                airports.breadthFirst("Amman - Queen Alia International Airport").toString()
        );
    }
    @Test
    public void testNonExistValueGraph(){
        assertNull(busStops.breadthFirst(20));
    }

//
}
