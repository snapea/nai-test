package com.snaping.threadtest02;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        // 循环
        while (true) {
            // 同步代码块
            synchronized (MyThread.class){
                if(list.size() == 0){
                    // 抽奖抽完了
                    System.out.println("抽奖抽完了");
                    break;
                }else{
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    System.out.println(getName() + "又产生了一个" + prize + "大奖");

                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // 判断


    }
}
