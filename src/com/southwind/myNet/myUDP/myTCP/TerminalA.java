package com.southwind.myNet.myUDP.myTCP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TerminalA {
    public static void main(String[] args) {
        try {
            System.out.println("--- TerminalA ---");
            byte[] buffer = new byte[1024];
            // 自己
            DatagramSocket datagramSocket1 = new DatagramSocket(8181);
            DatagramPacket datagramPacket1 = new DatagramPacket(buffer, buffer.length);

            while (true) {
                // 接收数据包
                datagramSocket1.receive(datagramPacket1);
                String message = new String(datagramPacket1.getData(), 0, datagramPacket1.getLength());
                System.out.println("接收到数据包：[" + datagramPacket1.getSocketAddress() +  "] > " + message);

                // 发送消息
                String reply = "了解，是我TerminalA";
                DatagramPacket datagramPacket2 = new DatagramPacket(reply.getBytes(), 0 , reply.getBytes().length,
                        datagramPacket1.getAddress(), datagramPacket1.getPort()); // 对方的地址、端口
                datagramSocket1.send(datagramPacket2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
