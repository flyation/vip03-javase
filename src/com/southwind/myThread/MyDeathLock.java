package com.southwind.myThread;

public class MyDeathLock implements Runnable {
    private String data1 = new String("1");
    private String data2 = new String("2");

    @Override
    public void run() {
        if ("t1".equals(Thread.currentThread().getName())) {
            synchronized (data1) {
                System.out.println("t1 get data1, try data2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (data2) {
                    System.out.println("t1 success!");
                }
            }
        }
        if ("t2".equals(Thread.currentThread().getName())) {
            synchronized (data2) {
                System.out.println("t2 get data2, try data1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (data1) {
                    System.out.println("t2 success!");
                }
            }
        }
    }

    public static void main(String[] args) {
        MyDeathLock run = new MyDeathLock();
        new Thread(run, "t1").start();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        new Thread(run, "t2").start();
    }
}
