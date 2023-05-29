package com.snaping.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("wangwu", 25);


        hm.put(s1, "北京");
        hm.put(s2, "深圳");
        hm.put(s3, "上海");
        hm.put(s4, "重庆");



        Set<Student> keys = hm.keySet();

        for (Student key : keys) {
            String val = hm.get(key);
            System.out.println(key  + "----" + val);
        }

        System.out.println("---------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();

        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String val = entry.getValue();

            System.out.println(key + "----" + val);
        }

        System.out.println("---------------------");

        hm.forEach((key, val) -> System.out.println(key + "----" + val));


    }
}
