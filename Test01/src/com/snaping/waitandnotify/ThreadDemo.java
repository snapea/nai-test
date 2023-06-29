package com.snaping.waitandnotify;

public class ThreadDemo {
    public static void main(String[] args) {

        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        cook.setName("厨师");
        foodie.setName("吃货");

        cook.start();
        foodie.start();
    }
}
