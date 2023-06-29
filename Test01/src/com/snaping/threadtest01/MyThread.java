package com.snaping.threadtest01;

import java.util.Random;

public class MyThread extends Thread {

    // 共享数据
    // 100块 3个红包
    static double money = 100;
    static int count = 3;

    // 最小的中奖金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        // 循环
        // 同步代码块
        // 判断是否到了末尾
        synchronized (MyThread.class) {

            // 中奖的金额
            double prize = 0;
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包");
            } else {
                if (count == 1) {
                    // 最后一个红包 无需随机 直接给最后的钱
                    prize = money;
                }
                Random random = new Random();

                // 100元 三个包
                // 第一个红包99.8
                // 100 - (3 - 1) * 0.01
                double bounds = money - (count - 1) * MIN;
//                prize = random.nextDouble(bounds);
                if (prize < MIN) {
                    prize = MIN;
                }

            }
            // 从money中去掉中奖的金额
            money = money - prize;

            count--;
            System.out.println(getName() + "抢到了" + prize + "元");
        }

    }
}
