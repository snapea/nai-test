package com.snaping.mymap;

import java.util.*;

public class HashMapDemo2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String arr[] = {"A", "B", "C", "D"};
        Random r = new Random();

        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }


        HashMap<String, Integer> stringHashMap = new HashMap<>();

        for (String name : list) {
            if (stringHashMap.containsKey(name)) {
                int count = stringHashMap.get(name) + 1;
                stringHashMap.put(name, count);
            } else {
                stringHashMap.put(name, 1);
            }
        }

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = stringHashMap.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            int value = entry.getValue();
            if (value > max) {
                max = value;
            }

        }

        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max) {

                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }

    }


}
