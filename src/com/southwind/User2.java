package com.southwind;

public class User2 extends User {

    public int age = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void fun(Object o) {
        System.out.println("Object");
    }

    public void fun(Integer o) {
        System.out.println("Integer");
    }

    public void fun(int o) {
        System.out.println("int");
    }

    public void fun(Short o) {
        System.out.println("Short");
    }
}
