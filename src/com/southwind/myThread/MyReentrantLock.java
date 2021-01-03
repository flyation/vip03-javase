package com.southwind.myThread;

import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock implements Runnable {
    private static int num;
    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        // 上锁
        reentrantLock.lock();
        num++;
        System.out.println(Thread.currentThread().getName() + "是第" + num + "位访客");
        // 解锁
        reentrantLock.unlock();
    }

    public static void main(String[] args) {
        MyReentrantLock run = new MyReentrantLock();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();
    }
}
