package com.snaping.threadtest03;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

        MyThread myThread1 = new MyThread(list);
        MyThread myThread2 = new MyThread(list);

        myThread1.setName("抽奖箱1");
        myThread2.setName("抽奖箱2");

        myThread1.start();
        myThread2.start();
    }
}
