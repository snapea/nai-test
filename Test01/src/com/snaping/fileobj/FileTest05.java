package com.snaping.fileobj;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class FileTest05 {
    public static void main(String[] args) {
        // 统计文件夹下有后缀文件夹的个数
        File file = new File("/Users/daye99/Downloads");
        HashMap<String, Integer> count = getCount(file);
        System.out.println(count);
    }

    public static HashMap<String, Integer> getCount(File src) {
        int[] s = {1,2,4,5,6,7,7};
        for (int i : s) {
            
        }

        return new HashMap<>();
//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        File[] files = src.listFiles();
//        for (File file : files) {
//            if (file.isFile()) {
//                String name = file.getName();
//                String[] split = name.split("\\.");
//                String last = split[split.length - 1];
//                if (hashMap.containsKey(last)) {
//                    int count = hashMap.get(last);
//                    count++;
//                    hashMap.put(last, count);
//                } else {
//                    hashMap.put(last, 1);
//                }
//            } else {
//                HashMap<String, Integer> map = getCount(file);
//                Set<Map.Entry<String, Integer>> entries = map.entrySet();
//                for (Map.Entry<String, Integer> entry : entries) {
//                    String key = entry.getKey();
//                    int value = entry.getValue();
//                    if (hashMap.containsKey(key)) {
//                        int count = hashMap.get(key);
//                        count++;
//                        hashMap.put(key, count);
//                    } else {
//                        hashMap.put(key, value);
//                    }
//                }
//            }
//        }
//        return hashMap;
    }
}
