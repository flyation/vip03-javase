package com.southwind.mySingleton;

public class Test {
    public static void main(String[] args) {
        MySingleton1 is1 = MySingleton1.getInstance();
        MySingleton1 is2 = MySingleton1.getInstance();
        System.out.println(is1 == is2);
    }
}
