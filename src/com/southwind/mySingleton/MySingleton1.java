package com.southwind.mySingleton;

/**
 * 最简单的单例
 *
 * 1.提供一个类型为自身的静态私有变量
 * 2.私有化构造器
 * 3.提供一个公开的静态工厂方法
 */
public class MySingleton1 {

    private static MySingleton1 instance;

    private MySingleton1() {
    }

    public static MySingleton1 getInstance() {
        if (instance == null) {
            instance = new MySingleton1();
        }
        return instance;
    }
}
