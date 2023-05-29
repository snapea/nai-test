package com.snaping.polymorphism;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Dog dog, String something) {
        System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + dog.getColor() + "颜色的狗");
        System.out.println("" + dog.getAge() + "岁的" + dog.getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

//    public void keepPet(Cat cat, String something) {
//        System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + cat.getColor() + "颜色的狗");
//        System.out.println("" + cat.getAge() + "岁的" + cat.getColor() + "颜色的猫两只前腿死死的抱住" + something + "猛吃");
//    }
//}

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + dog.getColor() + "颜色的狗");
            System.out.println("" + dog.getAge() + "岁的" + dog.getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
        } else if (a instanceof Cat) {
            Cat cat = (Cat) a;
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + cat.getColor() + "颜色的狗");
            System.out.println("" + cat.getAge() + "岁的" + cat.getColor() + "颜色的猫两只前腿死死的抱住" + something + "猛吃");
        }
    }
}
