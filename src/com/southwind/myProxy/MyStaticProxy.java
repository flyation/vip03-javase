package com.southwind.myProxy;

public class MyStaticProxy implements Phone {

    private Phone phone;

    public MyStaticProxy(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void sellPhone() {
        System.out.println("static：宣传...");
        phone.sellPhone();
        System.out.println("static：售后...");
    }

    public static void main(String[] args) {
        MyStaticProxy proxy = new MyStaticProxy(new Apple());
        proxy.sellPhone();
    }
}
