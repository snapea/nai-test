package com.snaping.waitandnotify02;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            String food = queue.take();
            System.out.println(food);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
