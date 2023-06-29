package com.snaping.waitandnotify02;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        Cook cook = new Cook(arrayBlockingQueue);
        cook.setName("厨师");

        Foodie foodie = new Foodie(arrayBlockingQueue);
        foodie.setName("吃货");

        cook.start();
        foodie.start();

    }
}
