import Hashtable.BinaryTree.BinarySearchTree;
import Hashtable.HashMapTree.TreeHashMap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMap_Tree_InterSection_Test {
    BinarySearchTree<Integer> int_Empty_FirstTree;
    BinarySearchTree<Integer> int_Empty_SecondTree;

    BinarySearchTree<Integer> intFirstTree;
    BinarySearchTree<Integer> intSecondTree;

    BinarySearchTree<Integer> intFirstTreeWithNegative;
    BinarySearchTree<Integer> intSecondTreeWithNegative;

    BinarySearchTree<Integer> int_No_Duplicate_FirstTree;
    BinarySearchTree<Integer> int_No_Duplicate_SecondTree;

    TreeHashMap treeHashMap;

    @Before
    public void setup() {
        int_Empty_FirstTree = new BinarySearchTree<Integer>();
        int_Empty_SecondTree = new BinarySearchTree<Integer>();

        intFirstTreeWithNegative = new BinarySearchTree<Integer>();
        intSecondTreeWithNegative = new BinarySearchTree<Integer>();

        intFirstTree = new BinarySearchTree<Integer>();
        intSecondTree = new BinarySearchTree<Integer>();

        int_No_Duplicate_FirstTree = new BinarySearchTree<Integer>();
        int_No_Duplicate_SecondTree = new BinarySearchTree<Integer>();

        treeHashMap = new TreeHashMap();

        intFirstTree.add(100);
        intFirstTree.add(200);
        intFirstTree.add(375);
        intFirstTree.add(400);
        intFirstTree.add(545);

        intSecondTree.add(5);
        intSecondTree.add(200);
        intSecondTree.add(56);
        intSecondTree.add(375);

        int_No_Duplicate_FirstTree.add(1);
        int_No_Duplicate_FirstTree.add(20);
        int_No_Duplicate_FirstTree.add(3);
        int_No_Duplicate_FirstTree.add(4);
        int_No_Duplicate_FirstTree.add(5);
        int_No_Duplicate_SecondTree.add(10);
        int_No_Duplicate_SecondTree.add(9);
        int_No_Duplicate_SecondTree.add(30);
        int_No_Duplicate_SecondTree.add(10);
        int_No_Duplicate_SecondTree.add(12);

        intFirstTreeWithNegative.add(5);
        intFirstTreeWithNegative.add(-1);
        intFirstTreeWithNegative.add(-56);
        intFirstTreeWithNegative.add(44);
        intFirstTreeWithNegative.add(-3);
        intFirstTreeWithNegative.add(-87);

        intSecondTreeWithNegative.add(10);
        intSecondTreeWithNegative.add(-56);
        intSecondTreeWithNegative.add(10);
        intSecondTreeWithNegative.add(44);
        intSecondTreeWithNegative.add(1);
        intSecondTreeWithNegative.add(-3);
    }


    @Test
    public void testEmptyHashMapTreeIntersectionTest() {
        assertEquals("[]",
                treeHashMap
                        .treeIntersection(int_Empty_FirstTree, int_Empty_SecondTree)
                        .toString()
        );
    }

    @Test
    public void testNotEmptyHashMapTreeIntersectionTest() {
        assertEquals("[200,375]",
                treeHashMap
                        .treeIntersection(intFirstTree, intSecondTree)
                        .toString()
        );
    }

    @Test
    public void testHashMapTreeIntersectionWithNegativeTest() {
        assertEquals("[-3,44,-56]",
                treeHashMap
                        .treeIntersection(intFirstTreeWithNegative, intSecondTreeWithNegative)
                        .toString()
        );
    }

    @Test
    public void testNoDuplicateHashMapTreeIntersectionTest() {
        assertEquals("[]",
                treeHashMap
                        .treeIntersection(int_No_Duplicate_FirstTree, int_No_Duplicate_SecondTree)
                        .toString()
        );
    }
}
