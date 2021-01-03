package com.southwind.homework3;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("CN", "中华人民共和国");
        map.put("US", "美利坚合众国");
        map.put("RU", "俄罗斯联邦");
        map.put("FR", "法兰西共和国");

        System.out.println("CN对应的国家是：" + map.get("CN"));

        System.out.println("Map中共有" + map.size() + "组数据");

        System.out.println("Map中包含FR的key吗？" + map.containsKey("FR"));
        map.remove("FR");
        System.out.println("Map中包含FR的key吗？" + map.containsKey("FR"));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);

        map.clear();
        System.out.println(map.isEmpty() ? "已清空Map中数据！" : "未清空Map中数据！");
    }
}
