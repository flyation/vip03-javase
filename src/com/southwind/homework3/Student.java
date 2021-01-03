package com.southwind.homework3;

import java.util.HashMap;

public class Student {
    private String name;
    private String gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        map.put("Jack", new Student("李明", "男"));

        boolean b = map.containsKey("Jack");
        if (b) {
            Student student = map.get("Jack");
            System.out.println("Jack对应的学员姓名是：" + student.getName() + "；性别是：" + student.getGender());
        }


    }
}
