package com.southwind.myNet.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientRunnable implements Runnable {

    private Socket socket;
    private Integer index;

    public ClientRunnable(Integer index) {
        this.index = index;
    }

    @Override
    public void run() {
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            socket = new Socket(localHost, 8080);
            String message = "我是客户端" + index;
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(message);
            System.out.println("发送了消息：" + message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
