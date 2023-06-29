package com.snaping.inetaddress01;

import java.io.IOException;
import java.net.*;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();

        String str = "你好啊，zwp";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,address,port);

        datagramSocket.send(datagramPacket);
        datagramSocket.close();

    }
}
