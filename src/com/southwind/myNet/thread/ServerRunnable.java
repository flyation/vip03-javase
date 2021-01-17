package com.southwind.myNet.thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerRunnable implements Runnable {

    private Socket socket;

    public ServerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        try {
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            String message = dataInputStream.readUTF();
            System.out.println("收到了消息：" + message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataInputStream.close();
                inputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
