package com.southwind.myNet.myTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Server {
    public static void main(String[] args) {
        // 服务端
        ServerSocket serverSocket = null;
        // 客户端
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("--- 服务端 ---");
            System.out.println("已启动，等待接收客户端请求...");

            while (true) {
                // 接收响应
                socket = serverSocket.accept();
                is = socket.getInputStream();
                dis = new DataInputStream(is);
                String request = dis.readUTF();
                System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                        + " > 接收到客户端请求：" + request);

                // 发送请求
                String response = "hi，我是服务端";
                os =  socket.getOutputStream();
                dos = new DataOutputStream(os);
                dos.writeUTF(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
                is.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
