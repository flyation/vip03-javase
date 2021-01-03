package com.southwind.homework3;

import java.util.HashMap;
import java.util.Iterator;

public class Dog {
    private String name;
    private String type;

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public static void main(String[] args) {
//        List<Dog> list = new ArrayList<>();
//        list.add(new Dog("欧欧", "雪纳瑞"));
//        list.add(new Dog("亚亚", "拉布拉多"));
//        list.add(new Dog("菲菲", "拉布拉多"));
//        Dog meimei = new Dog("美美", "雪纳瑞");
//        list.add(meimei);
//
//        int size = list.size();
//        System.out.print("共计有：" + size + "条狗狗。\n分别是：\n");
//        for (Dog dog : list) {
//            System.out.println(dog.getName() + "\t" + dog.getType());
//        }
//
//        System.out.println("\n删除之前共计有" + size + "条狗狗。");
//        list.remove(0);
//        list.remove(1);
//        size = list.size();
//        System.out.print("\n删除之后还有" + size + "条狗狗。\n分别是：\n");
//        for (Dog dog : list) {
//            System.out.println(dog.getName() + "\t" + dog.getType());
//        }
//
//        boolean b = list.contains(meimei);
//        System.out.println(b ? "\n集合中包含美美的信息" : "\n集合中不包含美美的信息");
//    }

//    public static void main(String[] args) {
//        LinkedList<Dog> list = new LinkedList<>();
//        list.add(new Dog("菲菲", "拉布拉多"));
//        list.add(new Dog("欧欧", "雪纳瑞"));
//        list.add(new Dog("亚亚", "拉布拉多"));
//        list.add(new Dog("美美", "雪纳瑞"));
//
//        System.out.println("第一条狗狗的昵称是" + list.getFirst().getName());
//        System.out.println("最后一条狗狗的昵称是" + list.getLast().getName());
//
//        list.removeFirst();
//        list.removeLast();
//        System.out.println("\n删除部分狗狗后还有" + list.size() + "条狗狗。\n分别是：");
//        for (Dog dog : list) {
//            System.out.println(dog.getName() + "\t" + dog.getType());
//        }
//    }

//    public static void main(String[] args) {
//        Set<Dog> set = new HashSet<>();
//        set.add(new Dog("菲菲", "拉布拉多"));
//        set.add(new Dog("欧欧", "雪纳瑞"));
//        set.add(new Dog("亚亚", "拉布拉多"));
//        set.add(new Dog("美美", "雪纳瑞"));
//
//        int size = set.size();
//        System.out.print("共计有：" + size + "条狗狗。\n分别是：\n");
//        Iterator<Dog> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Dog dog = iterator.next();
//            System.out.println(dog.getName() + "\t" + dog.getType());
//        }
//    }

    public static void main(String[] args) {
        HashMap<Integer, Dog> map = new HashMap<>();
        map.put(1, new Dog("菲菲", "拉布拉多"));
        map.put(2, new Dog("欧欧", "雪纳瑞"));
        map.put(3, new Dog("亚亚", "拉布拉多"));
        map.put(4, new Dog("美美", "雪纳瑞"));

        System.out.println("使用Iterator和增强for循环遍历所有狗狗的昵称和品种分别是：");
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            Dog dog = map.get(key);
            System.out.println(dog.getName() + "\t" + dog.getType());
        }

        System.out.println();
        for (Integer key : map.keySet()) {
            Dog dog = map.get(key);
            System.out.println(dog.getName() + "\t" + dog.getType());
        }

    }
}
