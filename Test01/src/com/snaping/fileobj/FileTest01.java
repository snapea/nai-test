package com.snaping.fileobj;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        // 在当前模块下创建一个a.txt的文件

        File file = new File("myFile\\aaa");

        file.mkdirs();

        File src = new File(file, "a.txt");
        boolean newFile = src.createNewFile();

        if (newFile) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
    }
}
