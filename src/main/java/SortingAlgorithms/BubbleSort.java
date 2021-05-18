package SortingAlgorithms;

public class BubbleSort {
    public BubbleSort() {
    }

    public int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
        return array;
    }

    public static void swap(int[] unorderedArray, int i, int j) {
        int tmp = unorderedArray[i];
        unorderedArray[i] = unorderedArray[j];
        unorderedArray[j] = tmp;
    }

}
