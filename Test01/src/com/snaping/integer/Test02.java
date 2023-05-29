package com.snaping.integer;

public class Test02 {
    public static void main(String[] args) {

        String s = toBinary(123);
        System.out.println(s);
        System.out.println(Integer.toBinaryString(123));
    }

    public static String toBinary(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            if (number == 0) {
                break;
            }
            int i = number % 2;
            number = number / 2;
            stringBuilder.insert(0, i);
        }

        return stringBuilder.toString();
    }

}


