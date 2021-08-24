import Hashtable.Graph.Graphv;
import Hashtable.Trip.BusinessTrip;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class Graph_businessTrip {

    Graphv<String,Integer> airports;

    @Before
    public void init(){
        airports= new Graphv<>();
        airports.addNode("Amman - Queen Alia International Airport");
        airports.addNode("Amman - Amman Civil Airport");
        airports.addNode("Aqaba - King Hussein International Airport");
        airports.addNode("Assab - H-4 Air Base");
        airports.addNode("Azraq - Muwaffaq Salti Air Base");
        airports.addNode("Dafyanah - Prince Hassan Air Base");
        airports.addNode("Mafraq - King Hussein Air Base");

        airports.addEdge(
                "Amman - Queen Alia International Airport",
                "Amman - Amman Civil Airport",
                730
        );
        airports.addEdge(
                "Amman - Queen Alia International Airport",
                "Amman - Amman Civil Airport",
                779
        );
        airports.addEdge(
                "Amman - Queen Alia International Airport",
                "Aqaba - King Hussein International Airport",
                53
        );
        airports.addEdge(
                "Amman - Amman Civil Airport",
                "Amman - Queen Alia International Airport",
                681
        );
        airports.addEdge(
                "Amman - Amman Civil Airport",
                "Aqaba - King Hussein International Airport",
                681
        );
        airports.addEdge(
                "Assab - H-4 Air Base",
                "Amman - Queen Alia International Airport",
                681
        );
        airports.addEdge(
                "Assab - H-4 Air Base",
                "Azraq - Muwaffaq Salti Air Base",
                681
        );
        airports.addEdge(
                "Azraq - Muwaffaq Salti Air Base",
                "Amman - Queen Alia International Airport",
                519
        );
        airports.addEdge(
                "Azraq - Muwaffaq Salti Air Base",
                "Aqaba - King Hussein International Airport",
                519
        );
        airports.addEdge(
                "Dafyanah - Prince Hassan Air Base",
                "Assab - H-4 Air Base",
                676
        );
        airports.addEdge(
                "Mafraq - King Hussein Air Base",
                "Assab - H-4 Air Base", 683
        );
        airports.addEdge(
                "Mafraq - King Hussein Air Base",
                "Dafyanah - Prince Hassan Air Base",
                683
        );
        airports.addEdge(
                "Aqaba - King Hussein International Airport",
                "Amman - Queen Alia International Airport",
                683
        );
        airports.addEdge(
                "Aqaba - King Hussein International Airport",
                "Mafraq - King Hussein Air Base",
                683
        );
        airports.addEdge(
                "Aqaba - King Hussein International Airport",
                "Amman - Amman Civil Airport",
                683
        );
    }

    @Test
    public void businessTripTrueTest() {
        assertEquals("true ,$53",
                BusinessTrip.businessTrip(
                        airports,
                        new String[]{
                                "Amman - Queen Alia International Airport",
                                "Aqaba - King Hussein International Airport"
                        }
                )
        );
        assertEquals("true ,$683",
                BusinessTrip.businessTrip(
                        airports,
                        new String[]{
                                "Aqaba - King Hussein International Airport",
                                "Mafraq - King Hussein Air Base"
                        }
                )
        );
    }

    @Test
    public void businessTripFalseTest() {
        assertEquals("false ,$0",
                BusinessTrip.businessTrip(
                        airports,
                        new String[]{
                                "Amman - Queen Alia International Airport",
                                ""
                        }
                )
        );
        assertEquals("false ,$0",
                BusinessTrip.businessTrip(
                        airports,
                        new String[]{
                                "Aqaba - King Hussein International Airport",
                                "Dafyanah - Prince Hassan Air Base"
                        }
                )
        );
    }
}
