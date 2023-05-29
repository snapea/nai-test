package com.snaping.extendTest;

public class Employee {
    private String name;
    private String ID;

    public Employee() {
    }

    public Employee(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    public void work() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
