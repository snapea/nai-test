package com.snaping.TestPhone;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {

        int priceAvg;

        Phone[] arr = new Phone[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            System.out.println("请输入品牌");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            p.setPrice(price);
            System.out.println("请输入颜色");
            String color = sc.next();
            p.setColor(color);

            arr[i] = p;
        }
        int sum = 0;
        for (Phone phone : arr) {
            sum = phone.getPrice() + sum;
        }
        priceAvg = sum / arr.length;

        System.out.println(priceAvg);

    }
}
