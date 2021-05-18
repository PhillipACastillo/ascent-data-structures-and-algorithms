package SortingAlgorithms;

public class QuickSort {
    public QuickSort() { }

    public static int pivot(int[] unorderedArray, int left, int right) {
        int pivot = unorderedArray[left];
        int swapIndex = left;
        for (int i = left + 1; i <= right; i++) {
            if (pivot > unorderedArray[i]) {
                swapIndex += 1;
                QuickSort.swap(unorderedArray, swapIndex, i);
            }
        }
        swap(unorderedArray, left, swapIndex);
        return swapIndex;
    }

    public int[] quickSort(int[] intArray, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(intArray, left, right);
            quickSort(intArray, left, pivotIndex-1);
            quickSort(intArray, pivotIndex + 1, right);
        }
        return intArray;
    }

    public static void swap(int[] intArray, int i, int j) {
        int tmp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = tmp;
    }
}
