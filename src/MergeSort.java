import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        int[] tempArray = new int[array.length];
        mergeSort(array, 0, array.length - 1, tempArray);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int leftIndex, int rightIndex, int[] tempArray) {
        if (leftIndex < rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, midIndex, tempArray);
            mergeSort(array, midIndex + 1, rightIndex, tempArray);
            merge(array, leftIndex, midIndex, rightIndex, tempArray);
        }
    }

    public static void merge(int[] array, int leftIndex, int midIndex, int rightIndex, int[] tempArray) {
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

        System.arraycopy(tempArray, leftIndex, array, leftIndex, rightIndex - leftIndex + 1);
    }
}