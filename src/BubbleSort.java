/**
 *sorts an array of integers in ascending order using the Bubble Sort algorithm and prints the sorted array to the console.
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}