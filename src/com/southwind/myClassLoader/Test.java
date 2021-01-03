package com.southwind.myClassLoader;

public class Test {
    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader("E:\\");
        try {
            Class clazz = myClassLoader.findClass("HelloWorld");
            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
