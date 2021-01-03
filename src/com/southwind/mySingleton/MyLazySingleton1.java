package com.southwind.mySingleton;

/**
 * 懒汉式单例1
 *
 * 同步方法
 */
public class MyLazySingleton1 {

    private static MyLazySingleton1 instance;

    private MyLazySingleton1() {
    }

    public synchronized static MyLazySingleton1 getInstance() {
        if (instance == null) {
            instance = new MyLazySingleton1();
        }
         return instance;
    }
}
