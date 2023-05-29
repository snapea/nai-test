package com.snaping.extendTest;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String name, String ID) {
        super(name, ID);
    }



    @Override
    public void work() {
        System.out.println("教研人员在上课");
    }
}
