package com.snaping.threadDemo;

public class MyThreadTest extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "hello world" + i);
        }
    }
}