package com.snaping.algorithm;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 9));
    }

    public static int binarySearch(int arr[], int number) {
        int min = 0;
        int max = arr.length;

        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }

    }
}
