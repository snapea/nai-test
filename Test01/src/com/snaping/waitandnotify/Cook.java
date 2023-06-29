package com.snaping.waitandnotify;


public class Cook extends Thread {
    @Override
    public void run() {
        /*
         * 1、循环
         * 2、同步代码块
         * 3、判断数据是否到了末尾
         * 4、没到末尾，执行核心逻辑
         *
         * */

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 桌子上是否有食物
                    // 没有 制作食物，有 等待
                    if (Desk.foodFlag) {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println(getName() + "制作了一碗饭");
                        Desk.foodFlag = true;
                        Desk.count++;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
