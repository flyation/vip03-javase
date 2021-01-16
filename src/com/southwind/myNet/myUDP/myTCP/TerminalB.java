package com.southwind.myNet.myUDP.myTCP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TerminalB {
    public static void main(String[] args) {
        try {
            System.out.println("--- TerminalB ---");
            String message = "你好，我是TerminalB";
            // 自己
            DatagramSocket datagramSocket1 = new DatagramSocket(8080); // 自己的端口

            // 对方的地址
            InetAddress inetAddress = InetAddress.getByName("localhost");
            DatagramPacket datagramPacket1 = new DatagramPacket(message.getBytes(), message.getBytes().length, // 这里的长度是数组长度而不是字符串长度（1个中文字符UTF-8编码后是3个字节）
                    inetAddress, 8181); //接收方的地址、端口

            // 发送数据包
            datagramSocket1.send(datagramPacket1);

            // 接收消息
            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket2 = new DatagramPacket(buffer, 1024);
            datagramSocket1.receive(datagramPacket2);
            String response = new String(datagramPacket2.getData(), 0, datagramPacket2.getLength());
            System.out.println("接收到数据包：[" + datagramPacket2.getSocketAddress() +  "] > " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
