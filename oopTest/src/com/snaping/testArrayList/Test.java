package com.snaping.testArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("华为", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfo = getPhoneInfo(list);

        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone phone = phoneInfo.get(i);
            System.out.println("------");
            System.out.println(phone.getBrand() + ',' + phone.getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {

                Phone p = list.get(i);

                resultList.add(p);
            }
        }

        return resultList;
    }
}
