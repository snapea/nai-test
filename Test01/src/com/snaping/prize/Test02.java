package com.snaping.prize;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
    public static void main(String[] args) {
        /*
         * 班级里有N个学生，学生属性：姓名，年龄，性别
         * 实现随机点名
         *
         * 70%的概率是男生
         * 30%的概率是女生
         * */

        String name;
        ArrayList<Integer> probability = new ArrayList<>();
        Collections.addAll(probability, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(probability);

        Integer range = probability.get(0);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "张三", "李四", "王五", "赵六", "蔡八", "李九", "安十");
        Collections.addAll(girlList, "小红", "小花", "小桃", "小紫", "小雨", "小绿");


        Collections.shuffle(boyList);
        Collections.shuffle(girlList);
        if (range == 1) {
            name = boyList.get(0);
        } else {
            name = girlList.get(0);
        }
        System.out.println(name);
    }
}
