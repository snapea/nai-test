package com.snaping.fileobj;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {

        // 找到电脑种所有avi结尾的电影
        File file = new File("/");
        find(file);

    }

    public static void find(File src) {
        File[] files = src.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().endsWith(".avi")) {
                        System.out.println(file);
                    }
                } else {
                    find(file);
                }
            }
        }

    }
}
