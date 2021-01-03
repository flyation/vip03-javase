package com.southwind.myException;

public class Test {
    public static void main(String[] args) {
        System.out.println(add(1));
    }

    public static int add(Object obj) {
        if (obj instanceof Integer) {
            int i = (Integer) obj;
            Integer integer = 3;
            System.out.println(integer.parseUnsignedInt("3"));
            return ++i;
        } else {
            try {
                throw new MyNumberException("操作数类型不是整型！");
            } catch (MyNumberException e) {
                e.printStackTrace();
            }
        }
        return 99;
    }
}
