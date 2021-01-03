package com.southwind.myAnnotation;

import java.lang.reflect.Method;

/**
 * 利用反射测试自定义的注解
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取使用了注解的目标类
        Class clazz = Class.forName("com.southwind.myAnnotation.InitDemo");
        // 获取使用了注解的方法
//        Method[] methods = clazz.getDeclaredMethods();
        Method[] methods = clazz.getMethods();
        if (methods != null) {
            for (Method method : methods) {
                // 判断当前方法是否使用了目标注解
                boolean b = method.isAnnotationPresent(InitMethod.class);
                if (b) {
                    System.out.println(method.getName());
                }
            }
        }
    }
}
