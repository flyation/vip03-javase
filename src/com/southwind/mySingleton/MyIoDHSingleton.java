package com.southwind.mySingleton;

/**
 * 静态内部类式单例
 *
 * Initialization on Demand Holder
 */
public class MyIoDHSingleton {

    private MyIoDHSingleton() {
    }

    // 静态内部类
    private static class HolderClass {
        private static MyIoDHSingleton instance = new MyIoDHSingleton();
    }

    public static MyIoDHSingleton getInstance() {
        return HolderClass.instance;
    }
}
