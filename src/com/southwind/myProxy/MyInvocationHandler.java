package com.southwind.myProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private Object object = null;

    public Object bind(Object object) {
        this.object = object;
        Object proxy = Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start proxy model...");
        Object result = method.invoke(object, args);
        return result;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        HuaWei huaWei = new HuaWei();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Phone appleProxy = (Phone) myInvocationHandler.bind(apple);
        appleProxy.sellPhone();

        myInvocationHandler = new MyInvocationHandler();
        Phone huaWeiProxy = (Phone) myInvocationHandler.bind(huaWei);
        huaWeiProxy.sellPhone();

        System.out.println();
        System.out.println(appleProxy);
        System.out.println(huaWeiProxy);
    }
}
