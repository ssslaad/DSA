package dsa.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sort.Sorting;

public class SortingTest {

    @Test
    void testInsertionSortAscending(){
        System.out.println("Classic Insertion Sort Testcase");
        int[] arr = { 5, 1, 6, 2, 3, 4, 7 };
        Sorting.classicInsertionSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, arr);
    }

}
