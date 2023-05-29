package com.snaping.polymorphism;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog(5, "黑");

        Cat cat = new Cat(4, "红");

        Person li = new Person("老李", 24);
        li.keepPet(dog, "屎");

        Person wang = new Person("老王", 30);
        wang.keepPet(cat, "鱼");
    }
}
