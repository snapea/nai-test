package com.snaping.extendTest;

public class AdminStaff extends Employee {
    public AdminStaff() {
    }

    public AdminStaff(String name, String ID) {
        super(name, ID);
    }
    @Override
    public void work() {
        System.out.println("行政部门在工作");
    }
}
