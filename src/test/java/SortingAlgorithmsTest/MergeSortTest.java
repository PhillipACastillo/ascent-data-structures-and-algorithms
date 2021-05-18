package SortingAlgorithmsTest;

import SortingAlgorithms.MergeSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortTest {
    MergeSort sort;

    @BeforeEach
    void setUpSort() {
        sort = new MergeSort();
    }

    @Test
    void mergeSort_withEmptyArray_returnsEmptyArray() {
        int[] expected = new int[1];
        int[] actual = sort.mergeSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    void mergeSort_withSingleItemParam_returnsSameArray() {
        int[] expected = new int[]{5};
        int[] actual = sort.mergeSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    void mergeSort_withSortedTwoItemArray_returnsSameArray() {
        int[] expected = new int[]{5, 6};
        int[] actual = sort.mergeSort(expected);
        assertEquals(expected, actual);
    }

    @Test
    void merge_withTwoSortedArrays_returnsConcatenatedArrays() {
        int[] arr1 = new int[] {1, 2, 3};
        int[] arr2= new int[] {4, 5, 6};
        int[] expected = new int[] {1, 2, 3, 4, 5, 6};
        int[] actual = MergeSort.merge(arr1, arr2);
        assertArrayEquals(expected, actual);
    }


    @Test
    void mergeSort_withTwoUnsortedArrays_returnsSortedArray() {
        int[] unorderedArray = {5, 3, 6, 4, 2, 1};
        int[] expected = new int[] {1, 2, 3, 4, 5, 6};
        int[] actual = sort.mergeSort(unorderedArray);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}
