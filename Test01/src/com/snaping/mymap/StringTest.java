package com.snaping.mymap;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> objectObjectHashMap = new HashMap<>();

        ArrayList<String> c1 = new ArrayList<>();
        Collections.addAll(c1, "南京", "扬州", "苏州", "无锡", "常州");

        ArrayList<String> c2 = new ArrayList<>();
        Collections.addAll(c2, "武汉", "孝感", "十堰", "宜昌", "禹州");

        ArrayList<String> c3 = new ArrayList<>();
        Collections.addAll(c3, "邢台", "保定", "常山", "张家口", "唐山");

        objectObjectHashMap.put("江苏", c1);
        objectObjectHashMap.put("湖北", c2);
        objectObjectHashMap.put("河北", c3);

        Set<Map.Entry<String, ArrayList<String>>> entries = objectObjectHashMap.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringJoiner stringJoiner = new StringJoiner(",", "", "");

            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            stringJoiner.add(key);
            for (String city : value) {
                stringJoiner.add(city);
            }

            System.out.println(key + "=" + stringJoiner);
        }
    }
}
