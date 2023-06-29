package com.snaping.IOTest;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("/Users/daye99/Documents/aa.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/daye99/Documents/bb.txt"));

        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
