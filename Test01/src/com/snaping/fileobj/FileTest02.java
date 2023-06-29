package com.snaping.fileobj;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {

        // 定义一个方法，判断该文件夹是否有xls结尾的文件

        File file = new File("/Users/daye99/Downloads");
        boolean have = have(file);
        System.out.println(have);
    }

    public static boolean have(File file) {

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".xls")) {
                return true;
            }
        }
        return false;

    }
}
