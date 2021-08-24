import Hashtable.Graph.Graphv;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Graphv_Test {

    Graphv<Integer,Integer> empty;
    Graphv<String, Integer> airports;
    Graphv<Integer,Integer> busStops;

    @Before
    public void init(){

        empty = new Graphv<Integer,Integer>();
        airports = new Graphv<String,Integer>();
        airports.addNode("Amman");
        airports.addNode("Aqaba");
        airports.addNode("Assab");
        airports.addNode("Azraq");
        airports.addNode("Dafyanah");
        airports.addNode("Mafraq");
        airports.addEdge("Amman", "Queen Alia International Airport");
        airports.addEdge("Amman", "Amman Civil Airport");
        airports.addEdge("Aqaba", "King Hussein International Airport");
        airports.addEdge("Assab", "H-4 Air Base");
        airports.addEdge("Azraq", "Muwaffaq Salti Air Base");
        airports.addEdge("Dafyanah", "Prince Hassan Air Base");
        airports.addEdge("Mafraq", "King Hussein Air Base");

        busStops = new Graphv<Integer,Integer>();
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
    public void TestGetSize() {
        assertEquals(6, airports.getSize());
        assertNotEquals(8, airports.getSize());
        assertEquals(5, busStops.getSize());
        assertNotEquals(8, busStops.getSize());
        assertEquals(0, empty.getSize());
    }

    @Test
    public void TestGetNodes() {
        assertTrue(busStops.getNode().contains(1));
        assertFalse(busStops.getNode().contains(44));
        assertTrue(busStops.getNode().contains(2));
        assertFalse(busStops.getNode().contains(-100));
        assertFalse(empty.getNode().contains(0));
    }

    @Test
    public void getNeighborsTest() {
        assertEquals((Integer) 2, busStops.getNeighbors(1).get(0).getValue());
        assertEquals(2, busStops.getNeighbors(5).getSize());
        assertNull(empty.getNeighbors(0));
    }
}
