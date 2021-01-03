package com.southwind.mySingleton;

/**
 * 饿汉式单例
 *
 */
public class MyEagerSingleton {

    private static MyEagerSingleton instance = new MyEagerSingleton();

    private MyEagerSingleton() {
    }

    public static MyEagerSingleton getInstance() {
        return instance;
    }
}
