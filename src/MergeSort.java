/**
 *sorts an array of integers in ascending order using the Bubble Sort algorithm and prints the sorted array to the console.
 */

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, midIndex);
            mergeSort(array, midIndex + 1, rightIndex);
            merge(array, leftIndex, midIndex, rightIndex);
        }
    }

    public static void merge(int[] array, int leftIndex, int midIndex, int rightIndex) {
        int[] tempArray = new int[array.length];
        int i = leftIndex;
        int j = midIndex + 1;
        int k = leftIndex;

        while (i <= midIndex && j <= rightIndex) {
            if (array[i] <= array[j]) {
                tempArray[k] = array[i];
                i++;
            } else {
                tempArray[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= midIndex) {
            tempArray[k] = array[i];
            i++;
            k++;
        }

        while (j <= rightIndex) {
            tempArray[k] = array[j];
            j++;
            k++;
        }

        for (int index = leftIndex; index <= rightIndex; index++) {
            array[index] = tempArray[index];
        }
    }
}