package com.snaping.TestString;

public class MainTest {
    public static void main(String[] args) {
        // 输入一串数字，转换成罗马字符串
        String str = "123456";
        boolean flag = CheckStr(str);

        if(flag){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String s = ChangeRoma(c);
                result = result + s;
            }
            System.out.println(result);
        }else{

        }
    }
    public static boolean CheckStr(String str) {
        if (str.length() > 9){
            return  false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c > '9' || c < '0'){
                return false;
            }
        }
        return true;
    }
    public static String ChangeRoma(char c) {
        String[] lib = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅰ", "Ⅷ", "Ⅸ", };
        return  lib[c - 48];
    }
}
