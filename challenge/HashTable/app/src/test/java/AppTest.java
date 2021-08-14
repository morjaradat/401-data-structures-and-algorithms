/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import HashTable.HashTables;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {
    HashTables<String,Integer> emptyHashtable;
    HashTables<String,Integer> ages;
    HashTables<String,String> foods;

    @Before
    public void init() {

        emptyHashtable = new HashTables<>();

        ages = new HashTables<>();
        ages.add("Mohammad", 26);
        ages.add("Ali", 40);
        ages.add("Ahmad", 5);
        ages.add("Rana", 23);
        ages.add("Raghad", 21);

        foods = new HashTables<>();
        foods.add("Jordanian", "Mansaf");
        foods.add("KSA", "Kabsa");
        foods.add("Palestine", "Muskhan");
        foods.add("Syria", "Kibbeh");

    }

    @Test
    public void testEmptyHashTableSize() {
        assertEquals(0, emptyHashtable.getSize());
    }

    @Test
    public void TestHashTableIntegerSize() {
        assertEquals(5, ages.getSize());
    }

    @Test
    public void TestHashTableStringSize() {
        assertEquals(4, foods.getSize());
    }

    @Test
    public void testEmptyHashTableIsEmpty() {
        Assert.assertTrue(emptyHashtable.isEmpty());
    }

    @Test
    public void TestHashTableIntegerIsEmpty() {
        assertFalse(ages.isEmpty());
    }

    @Test
    public void TestHashTableStringIsEmpty() {
        assertFalse(foods.isEmpty());
    }

    @Test
    public void testEmptyHashTableGet() {
        assertNull(emptyHashtable.get("key"));
    }

    @Test
    public void TestHashTableIntegerGet() {
        assertEquals(Integer.valueOf(40), ages.get("Ali"));
        assertEquals(Integer.valueOf(5), ages.get("Ahmad"));
    }

    @Test
    public void TestHashTableStringGet() {
        assertEquals("Kibbeh", foods.get("Syria"));
    }

    @Test
    public void TestHashTableIntegerRemove() {
        assertEquals(Integer.valueOf(40), ages.get("Ali"));
        ages.remove("Ali");
        assertNull(ages.get("Ali"));
    }

    @Test
    public void TestHashTableStringRemove() {
        assertEquals("Kibbeh", foods.get("Syria"));
        foods.remove("Syria");
        assertNull(ages.get("Syria"));
    }
}
