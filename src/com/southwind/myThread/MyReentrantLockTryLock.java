package com.southwind.myThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLockTryLock implements Runnable {
    private static int num;
    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        try {
            // 等待拿到锁的时间为3秒
            if (reentrantLock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + " 拿到了锁");
                // 睡眠4秒
                Thread.sleep(4000);
            } else {
                System.out.println(Thread.currentThread().getName() + " 没有拿到锁");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 判断锁是否属于当前线程
            if (reentrantLock.isHeldByCurrentThread()) {
                reentrantLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        MyReentrantLockTryLock run = new MyReentrantLockTryLock();
        new Thread(run).start();
        new Thread(run).start();
    }
}
