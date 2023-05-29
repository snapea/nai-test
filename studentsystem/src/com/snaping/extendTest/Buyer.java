package com.snaping.extendTest;

public class Buyer extends AdminStaff{

    public Buyer() {
    }

    public Buyer(String name, String ID) {
        super(name, ID);
    }
    @Override
    public void work(){
        System.out.println("采购人员在工作");
    }
}
