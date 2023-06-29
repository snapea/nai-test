package com.snaping.fileobj;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        // 统计一个文件夹的总大小

        File file = new File("/Users/daye99/Downloads");
        long size = getSize(file);

        System.out.println(size / 1024 / 1024);
    }

    public static long getSize(File src) {
        long size = 0;

        for (File file : src.listFiles()) {
            if(file.isFile()){
                size = size + file.length();
            }else{
                size = size + getSize(file);
            }
        }
        return size;
    }
}
