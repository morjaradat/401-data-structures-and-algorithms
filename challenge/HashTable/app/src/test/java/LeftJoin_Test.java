
import HashMap.HashMap;
import LeftJoin.LeftJoin;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
public class LeftJoin_Test {

    HashMap<String, String> map1;
    HashMap<String, String> map2;

    HashMap<String, String> emptyMap1;
    HashMap<String, String> emptyMap2;

    List<String[]> results;
    LeftJoin leftJoin;

    @Before
    public void init() {

        map1 = new HashMap<String,String>();
        map2 = new HashMap<String,String>();

        emptyMap1 = new HashMap<String,String>();
        emptyMap2 = new HashMap<String,String>();

        leftJoin = new LeftJoin();

        map1.put("fond","enamored");
        map1.put("wrath","anger");
        map1.put("diligent","employed");
        map1.put("outift","grab");
        map1.put("guide","usher");

        map2.put("fond","averse");
        map2.put("wrath","delight");
        map2.put("diligent","idle");
        map2.put("guide","follow");
        map2.put("flow","jam");
    }

    @Test
    public void Test_LeftJoin_NotEmpty(){
        results = leftJoin.leftJoin(map1, map2);
        assertTrue(!(results.isEmpty()));
        assertFalse(results.isEmpty());
    }

    @Test
    public void Test_LeftJoin() {
        results = leftJoin.leftJoin(map1, map2);
        assertEquals("[fond, enamored, averse]", Arrays.toString(results.get(0)));
        assertEquals("[wrath, anger, delight]", Arrays.toString(results.get(1)));
        assertEquals("[diligent, employed, idle]", Arrays.toString(results.get(2)));
    }

    @Test
    public void Test_LeftJoin_Null(){
        results = leftJoin.leftJoin(map1, map2);
        assertEquals("[outift, grab, NULL]", Arrays.toString(results.get(4)));
    }

    @Test
    public void Test_LeftJoin_Empty_MapRight(){
        results = leftJoin.leftJoin(map1, emptyMap2);
        assertEquals("[fond, enamored, NULL]", Arrays.toString(results.get(0)));
        assertEquals("[wrath, anger, NULL]", Arrays.toString(results.get(1)));
        assertEquals("[diligent, employed, NULL]", Arrays.toString(results.get(2)));
    }

    @Test
    public void Test_LeftJoin_Empty_MapLeft(){
        results = leftJoin.leftJoin(emptyMap1, map2);
        List<String> list = new ArrayList<>();
        assertEquals(list, results);
    }
}
