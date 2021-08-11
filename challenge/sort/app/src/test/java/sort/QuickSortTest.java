package sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testInsertionSortEmpty() {
        Sort sort = new Sort();
        int[] testArray= {};
        assertArrayEquals(testArray, sort.quicksort(testArray,0,testArray.length-1));
    }

    @Test
    public void testInsertionSortMultipleNum() {
        Sort sort = new Sort();
        int[] testArray= {15,16,25,30,4,2,1};
        assertArrayEquals(new int[]{1, 2, 4, 15, 16, 25, 30}, sort.quicksort(testArray,0,testArray.length-1));
    }

    @Test
    public void testInsertionSortNegativeNum() {
        Sort sort = new Sort();
        int[] testArray= {15,-16,25,-30,4,2,1};
        assertArrayEquals(new int[]{-30,-16,1,2,4,15,25}, sort.quicksort(testArray,0,testArray.length-1));
    }

    @Test
    public void testInsertionSortDuplicateNegativeNum() {
        Sort sort = new Sort();
        int[] testArray= {15,-16,-16,-30,4,2,1};
        assertArrayEquals(new int[]{-30,-16,-16,1,2,4,15}, sort.quicksort(testArray,0,testArray.length-1));
    }

    @Test
    public void testInsertionSortDuplicatePositiveNum() {
        Sort sort = new Sort();
        int[] testArray= {15,16,16,-30,4,2,1};
        assertArrayEquals(new int[]{-30,1,2,4,15,16,16}, sort.quicksort(testArray,0,testArray.length-1));
    }
}
