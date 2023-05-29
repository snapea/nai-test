package com.snaping.extendTest;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String name, String ID) {
        super(name, ID);
    }
    @Override
    public void work(){
        System.out.println("维修人员在工作");
    }
}
