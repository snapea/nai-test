package com.snaping.threadDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThreadTest myThreadTest1 = new MyThreadTest();
        MyThreadTest myThreadTest2 = new MyThreadTest();
        myThreadTest1.setName("线程1");
        myThreadTest2.setName("线程2");
        myThreadTest1.start();
        myThreadTest2.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
