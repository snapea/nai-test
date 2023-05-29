package com.snaping.integer;

public class Test {
    public static void main(String[] args) {
        String str = "12345689";

        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据格式有误");
        }else {
            System.out.println("数据格式正确");

            int num = 0;

            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';

                num = num * 10 + c;

            }
            System.out.println(num);
            System.out.println(num + 1);
        }

    }
}
