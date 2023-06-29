package com.snaping.tcpdemo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    // 接受数据

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);



        int b;
        while ((b= inputStreamReader.read()) != -1){
            System.out.println((char) b);
        }

        accept.close();
        serverSocket.close();
    }
}
