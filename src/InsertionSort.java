/**
 *sorts an array of integers in ascending order using the Bubble Sort algorithm and prints the sorted array to the console.
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}