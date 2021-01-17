package com.southwind.myNet.thread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {

    public static void main(String[] args) {
        ServerSocket serverSocket =  null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("客户端启动...");
            while (true) {
                Socket socket = serverSocket.accept();
                // 开启子线程完成操作
                ServerRunnable serverRunnable = new ServerRunnable(socket);
                new Thread(serverRunnable).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
