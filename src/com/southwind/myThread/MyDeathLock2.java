package com.southwind.myThread;

import java.util.concurrent.locks.ReentrantLock;

public class MyDeathLock2 implements Runnable {

    private ReentrantLock lock1 = new ReentrantLock();
    private ReentrantLock lock2 = new ReentrantLock();

    @Override
    public void run() {
        if ("t1".equals(Thread.currentThread().getName())) {
            // 第一把锁
            lock1.lock();
            System.out.println("t1 get lock1, try lock2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 第二把锁
            lock2.lock();
            System.out.println("t1 success!");
            lock2.unlock();
            lock1.unlock();
        }
        if ("t2".equals(Thread.currentThread().getName())) {
            // 第一把锁
            lock2.lock();
            System.out.println("t2 get lock2, try lock1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 第二把锁
            lock1.lock();
            System.out.println("t2 success!");
            lock1.unlock();
            lock2.unlock();
        }
    }

    public static void main(String[] args) {
        MyDeathLock2 run = new MyDeathLock2();
        new Thread(run, "t1").start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        new Thread(run, "t2").start();
    }
}
