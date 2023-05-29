package com.snaping.prize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        /*
         * 班级里有N个学生，学生属性：姓名，年龄，性别
         * 实现随机点名
         *
         * 被点到的学生不会再被点击
         * 如果全部名字点完，需要重新开启第二轮报名
         * */
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张三", "李四", "王五", "赵六", "蔡八", "李九", "安十");

        Random random = new Random();
        int i = random.nextInt(list.size());

        String name = list.get(i);
        System.out.println(name);
    }
}
