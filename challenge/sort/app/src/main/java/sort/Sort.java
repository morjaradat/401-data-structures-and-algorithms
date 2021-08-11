package sort;

import java.util.Arrays;

public class Sort {

    public int[] insertionSort(int[] arr) {
        if(arr.length > 0){
            for (int i = 1; i < arr.length; i++) {
                int j = i - 1;
                int temp = arr[i];
                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public int[] mergeSort(int[] arr) {

        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, arr);
        }

        return arr;
    }

    private void merge(int[] left, int[] right, int[] original) {
        int leftIndex = 0;
        int rightIndex = 0;
        int originalIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {

            if (left[leftIndex]<=right[rightIndex]) {
                original[originalIndex] = left[leftIndex];
                leftIndex++;
            } else {
                original[originalIndex] = right[rightIndex];
                rightIndex++;
            }

            originalIndex++;
        }

        if (leftIndex == left.length) {

            while (rightIndex < right.length) {
                original[originalIndex] = right[rightIndex];
                originalIndex++;
                rightIndex++;
            }

        } else {
            while (leftIndex < left.length) {
                original[originalIndex] = left[leftIndex];
                originalIndex++;
                leftIndex++;
            }
        }
    }

    public int[] quicksort(int[] arr, int left, int right) {
        if(left < right) {
            // Partition the array by setting the position of the pivot value
            int partitionIndex = partition(arr, left, right);
            // Sort the left
            quicksort(arr, left, partitionIndex - 1);
            // Sort the right
            quicksort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        int pivot = arr[right];

        // create a variable to track the largest index of numbers lower than the defined pivot
        int low = left - 1;

        for(int i = left; i < right; i++) {
            if(arr[i]<=pivot) {
                low++;
                swap(arr, i, low);
            }
        }

        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right.
        swap(arr, right, low + 1);

        // return the pivot index point
        return low + 1;
    }

    private void swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
