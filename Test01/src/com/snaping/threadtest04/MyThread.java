package com.snaping.threadtest04;

public class MyThread extends Thread {
    int count;
    public MyThread(int count) {
        this.count = count;
    }
    static int i = 0;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                i++;
                if (i > count) {
                    break;
                } else {
                    System.out.println(getName() + "------" + i);
                }
            }
        }
    }
}
