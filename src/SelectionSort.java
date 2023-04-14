/**
 *sorts an array of integers in ascending order using the Bubble Sort algorithm and prints the sorted array to the console.
 */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}