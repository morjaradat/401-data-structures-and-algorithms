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
}
