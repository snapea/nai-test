package com.snaping.demo2;

public class GoodTest {
    public static void main(String[] args) {
        Good[] arr = new Good[3];

        Good g1 = new Good("1000", "华为手机", 5999, 100);
        Good g2 = new Good("1002", "保温杯", 289, 300);
        Good g3 = new Good("1003", "枸杞", 29, 1000);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Good good = arr[i];
            System.out.println("ID：" + good.getId());
            System.out.println("数量：" + good.getCount());
            System.out.println("价格：" + good.getPrice());
            System.out.println("名字：" + good.getName());
            System.out.println();
        }
    }
}
