package com.snaping.waitandnotify;

public class Foodie extends Thread {
    public void run() {

        /*
         * 1、循环
         * 2、同步代码块
         * 3、判断共享数据是否到了末尾
         * 4、没到末尾，执行核心逻辑
         *
         * */

        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 判断桌子上有没有面条
                    if (!Desk.foodFlag) {
                        // 如果没有，就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Desk.count--;
                        // 如果有，就开吃
                        System.out.println(getName() + "正在吃饭，还能吃" + Desk.count + "碗");
                        Desk.lock.notifyAll();
                        // 吃完之后，唤醒厨师、并且 -1 修改桌子的状态
                        Desk.foodFlag = true;
                    }
                }
            }
        }

    }
}
