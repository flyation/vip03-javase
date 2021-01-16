package com.southwind.myNet.myTCP;

import java.io.*;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        // 客户端
        Socket socket = null;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            socket = new Socket("localhost", 8080);
            System.out.println("--- 客户端 ---");

            // 发送请求
            String request = "你好，我是客户端" + new Random().nextInt(10);
            os =  socket.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeUTF(request);

            // 接收响应
            is = socket.getInputStream();
            dis = new DataInputStream(is);
            String response = dis.readUTF();
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME)
                    + " > 接收到服务端响应：" + response);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dos.close();
                os.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
