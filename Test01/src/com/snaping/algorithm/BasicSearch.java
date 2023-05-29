package com.snaping.algorithm;

import java.util.ArrayList;

public class BasicSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(basicSearch(arr, 1));
    }

//    public static boolean basicSearch(int[] arr, int number) {
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == number) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                integers.add(i);
            }
        }
        return integers;
    }
}
