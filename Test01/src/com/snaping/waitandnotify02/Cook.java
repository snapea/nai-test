package com.snaping.waitandnotify02;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("面条");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
