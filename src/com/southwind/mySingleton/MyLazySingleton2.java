package com.southwind.mySingleton;

/**
 * 懒汉式单例2
 *
 * volatile + double check
 */
public class MyLazySingleton2 {

    private volatile static MyLazySingleton2 instance;

    private MyLazySingleton2() {
    }

    public static MyLazySingleton2 getInstance() {
        // 双重检查锁
        if (instance == null) {
            synchronized(MyLazySingleton2.class) {
                if (instance == null) {
                    instance = new MyLazySingleton2();
                }
            }
        }
         return instance;
    }
}
