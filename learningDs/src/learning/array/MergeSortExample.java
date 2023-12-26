package learning.array;

import java.util.Arrays;

public class MergeSortExample {

    private static void mergeSort(int[] array, int left, int right) {
        if(left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            System.out.println("in between");
            printIntArray(array);
            // Merge the sorted array
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int size1 = middle - left + 1;
        int size2 = right - middle;

        int[] leftArray = new int[size1];

        int[] rightArray = new int[size2];

        System.arraycopy(array, left, leftArray, 0, size1);
        System.arraycopy(array, middle  + 1, rightArray, 0, size2);

        System.out.println("left array:");
        printIntArray(leftArray);
        System.out.println("right array:");
        printIntArray(rightArray);
        int leftIndex =0;
        int rightIndex = 0;
        int mainIndex = left;

        while (leftIndex < size1 && rightIndex < size2) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mainIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[mainIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }

        while (leftIndex < size1) {
            array[mainIndex] = leftArray[leftIndex];
            leftIndex++;
            mainIndex++;
        }

        while ((rightIndex < size2)) {
            array[mainIndex] = rightArray[rightIndex];
            rightIndex++;
            mainIndex++;
        }
    }

    private static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {-1, 344, 11, 4, 7, 9};

        printIntArray(array);
        mergeSort(array, 0, array.length - 1);
        System.out.println("sorted");
        printIntArray(array);
    }
}
