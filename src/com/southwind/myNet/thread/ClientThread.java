package com.southwind.myNet.thread;

public class ClientThread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ClientRunnable clientRunnable = new ClientRunnable(i);
            new Thread(clientRunnable).start();
        }
    }
}
