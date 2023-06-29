package com.snaping.threadtest04;

public class Test {

    public static void main(String[] args) {

        int count = 100;
        MyThread myThread1 = new MyThread(count);
        MyThread myThread2 = new MyThread(count);
        myThread1.setName("线程1");
        myThread2.setName("线程2");


        myThread1.start();
        myThread2.start();

    }
}
