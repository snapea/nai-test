package com.snaping.tcpdemo01;

import com.snaping.inetaddress01.SendMessageDemo;
import com.snaping.mymap.Student;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    // 发送数据

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(10000);
       /* OutputStream outputStream = socket.getOutputStream();

        outputStream.write("你好".getBytes());
        outputStream.close();
        socket.close();*/

        Socket accept = serverSocket.accept();

        InputStreamReader inputStreamReader = new InputStreamReader(accept.getInputStream());

        int b;
        while ((b = inputStreamReader.read()) != -1){
            System.out.print((char) b);
        }

        serverSocket.close();

        Class aClass = Class.forName("com.snaping.inetaddress01.Student");

        Class bClass = Student.class;

        Student s = new Student();
        Class cClass = s.getClass();

    }
}
