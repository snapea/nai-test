package com.snaping.TestCar;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Cars[] arr = new Cars[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            Cars c = new Cars();
            System.out.println("请输入品牌");
            String brand =  sc.next();
            c.setBrand(brand);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("品牌：" + arr[i].getBrand());
            System.out.println("价格：" + arr[i].getPrice());
            System.out.println("颜色：" + arr[i].getColor());

            System.out.println();
        }
    }
}
