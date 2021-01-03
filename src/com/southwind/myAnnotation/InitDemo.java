package com.southwind.myAnnotation;

/**
 * 使用自定义的注解
 */
public class InitDemo {

    @InitMethod
    public void init() {
        System.out.println("init...");
    }

    public void destroy() {
        System.out.println("destroy...");
    }
}
