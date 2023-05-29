package com.snaping.genericity;

public class HuskyDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的泰迪，正在吃骨头，边吃边拆家");
    }
}
