package com.snaping.genericity;

public abstract class Animal {
    private int Age;
    private String name;

    public Animal(int age, String name) {
        Age = age;
        this.name = name;
    }

    public Animal() {
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
