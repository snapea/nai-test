package com.snaping.prize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        /*
         * 班级里有N个学生，学生属性：姓名，年龄，性别
         * 实现随机点名
         * */
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张三","李四","王五","赵六","蔡八","李九","安十");
//        Random r = new Random();
//        int i = r.nextInt(list.size());
//
//        String name = list.get(i);

        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name);
    }
}
