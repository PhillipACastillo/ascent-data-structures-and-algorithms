package SortingAlgorithmsTest;

import SortingAlgorithms.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTest {
    QuickSort sort;

    @BeforeEach
    void setUpSort() {
        sort = new QuickSort();
    }

    @Test
    void quickSort_withEmptyArray_returnsEmptyArray() {
        int[] expected = new int[1];
        int[] actual = sort.quickSort(expected, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    void quickSort_withSingleItemParam_returnsSameArray() {
        int[] expected = new int[]{5};
        int[] actual = sort.quickSort(expected, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    void quickSort_withSortedTwoItemArray_returnsSameArray() {
        int[] expected = new int[]{5, 6};
        int[] actual = sort.quickSort(expected, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    void swap_withUnsortedTwoItemArrayAndTheirIndexes_createsAReversedArray() {
        int[] unorderedArray = new int[]{6, 5};
        int[] expected = new int[]{5, 6};
        QuickSort.swap(unorderedArray, 0, 1);
        assertArrayEquals(expected, unorderedArray);
    }

    @Test
    void pivot_withUnsortedThreeItemArray_returnsPivot() {
        int expected = 1;
        int[] unorderedArray = new int[]{3, 2, 1};
        int actual = QuickSort.pivot(unorderedArray, 0, 1);
        assertEquals(expected, actual);
    }

    @Test
    void quickSort_withUnsortedThreeItemArray_returnsOrderedArray() {
        int[] unorderedArray = new int[]{8, 5, 7, 3, 4};
        int[] expected = new int[]{3, 4, 5, 7, 8};
        int[] actual = sort.quickSort(unorderedArray, 0, unorderedArray.length - 1);
        assertArrayEquals(expected, actual);
    }
}
