package com.snaping.polymorphism;

public class Animal {
    private int Age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        Age = age;
        this.color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(String something) {
        System.out.println("吃东西");
    }
}
