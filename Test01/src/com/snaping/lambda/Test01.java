package com.snaping.lambda;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {

//        System.out.println(curlPeach(1));

        Collection<String> coll = new ArrayList<>();
        coll.add("123");
        coll.add("vvv");
        coll.add("ccc");
        coll.add("eee");
        coll.add("aaa");

//        Iterator<String> iterator = coll.iterator();
//        while (iterator.hasNext()){
//            String str = iterator.next();
//
//            System.out.println(str);
//        }
        for (String s : coll) {
            System.out.println(s);
        }
    }

//    public static int curlPeach(int day) {
//
//        if (day < 1 || day > 10) {
//            System.out.println("请输入正确的天数");
//            return -1;
//        }
//        if (day == 10) {
//            return 1;
//        }
//
//
//
//        return (curlPeach(day + 1) + 1) * 2;
//    }
}
