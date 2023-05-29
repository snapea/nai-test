package com.snaping.polymorphism;

public class Dog extends Animal{


    public void lookHome () {
        System.out.println("狗在看家");
    }

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }
}
