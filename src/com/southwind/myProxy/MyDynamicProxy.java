package com.southwind.myProxy;

import java.lang.reflect.Proxy;

public class MyDynamicProxy {

    public static void main(String[] args) {
        Phone phone = (Phone) Proxy.newProxyInstance(Apple.class.getClassLoader(),
                Apple.class.getInterfaces(),
                (proxy, method, args1) -> {
                    Object rtValue = null;
                    System.out.println("dynamic：宣传...");
                    rtValue = method.invoke(new Apple(), args1);
                    System.out.println("dynamic：售后...");
                    return rtValue;
                });
        phone.sellPhone();
    }
}
