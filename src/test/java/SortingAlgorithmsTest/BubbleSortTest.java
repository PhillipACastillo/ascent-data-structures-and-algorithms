package SortingAlgorithmsTest;

import SortingAlgorithms.Sort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    Sort sort;

    @BeforeEach
    void setUpSort() {
        sort = new Sort();
    }

    @Test
    void bubbleSort_withEmptyArray_returnsEmptyArray() {
        int[] expected = new int[1];
        int[] actual = sort.bubbleSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    void bubbleSort_withSingleItemParam_returnsSameArray() {
        int[] expected = new int[]{5};
        int[] actual = sort.bubbleSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    void bubbleSort_withSortedTwoItemArray_returnsSameArray() {
        int[] expected = new int[]{5,6};
        int[] actual = sort.bubbleSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    void swap_withUnsortedTwoItemArrayAndTheirIndexes_createsAReversedArray() {
        int[] unorderedArray = new int[]{6,5};
        int[] expected = new int[]{5,6};
        Sort.swap(unorderedArray, 0, 1);
        assertArrayEquals(expected, unorderedArray);
    }

    @Test
    void bubbleSort_withAnUnsortedThreeItemArray_returnsASortedArray() {
        int[] unorderedArray = new int[] {2, 3, 1};
        int[] expected = new int[] {1, 2, 3};
        int[] actual = sort.bubbleSort(unorderedArray);
        assertArrayEquals(expected, actual);
    }
}
