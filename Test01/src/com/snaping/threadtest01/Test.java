package com.snaping.threadtest01;

public class Test {
    public static void main(String[] args) {
        // 创建线程对象
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        MyThread myThread5 = new MyThread();

        myThread1.setName("张一");
        myThread2.setName("李二");
        myThread3.setName("王三");
        myThread4.setName("赵四");
        myThread5.setName("黎五");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
