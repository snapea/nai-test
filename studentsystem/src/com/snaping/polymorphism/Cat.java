package com.snaping.polymorphism;

public class Cat extends Animal{


    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
}
