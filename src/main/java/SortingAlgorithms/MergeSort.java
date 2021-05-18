package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public MergeSort() {
    }

    public int[] mergeSort(int[] intArray) {
        if (intArray.length <= 1) { return intArray; }
        int middle = Math.floorDiv(intArray.length, 2);
        int[] left = mergeSort(Arrays.copyOfRange(intArray, 0, middle));
        int [] right = mergeSort(Arrays.copyOfRange(intArray, middle, intArray.length));
        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] results = new int[arr1.length + arr2.length];
        int resultsIndex = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr2[j] > arr1[i]) {
                results[resultsIndex] = arr1[i];
                i += 1;
            } else {
                results[resultsIndex] = arr2[j];
                j += 1;
            }
            resultsIndex += 1;
        }

        while ( i < arr1.length) {
            results[resultsIndex] = arr1[i];
            i += 1;
            resultsIndex += 1;
        }

        while (j < arr2.length) {
            results[resultsIndex] = arr2[j];
            j += 1;
            resultsIndex += 1;
        }

        return results;
    }
}
