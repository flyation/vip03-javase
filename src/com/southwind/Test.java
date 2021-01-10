package com.southwind;

public class Test {
    public static void main(String[] args) {
        try {
            Class<?> aClass1 = Class.forName("java.lang.String");
            System.out.println(aClass1);
            Class<?> aClass2 = String.class;
            System.out.println(aClass2);
            Class<?> aClass3 = "str".getClass();
            System.out.println(aClass3);
            System.out.println(aClass1 == aClass2);
            System.out.println(aClass3 == aClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
