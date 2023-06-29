package com.snaping.inetaddress01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendMessageDemo {

    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        byte[] bytes = new byte[1034];

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(datagramPacket);

        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        InetAddress address = datagramPacket.getAddress();

        int port = datagramPacket.getPort();

        System.out.println("接收到数据" + new String(data));
        System.out.println("该数据是从" + address + "这台电脑中的"+ port);
    }
}
