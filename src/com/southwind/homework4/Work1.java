package com.southwind.homework4;

import java.io.File;
import java.io.IOException;

public class Work1 {
    public static void main(String[] args) {
        File file = new File("E:\\text.txt");
        System.out.println("exists(): " + file.exists());
        System.out.println("isFile(): " + file.isFile());
        System.out.println("getPath(): " + file.getPath());
        System.out.println("getAbsolutePath(): " + file.getAbsolutePath());
        System.out.println("getName(): " + file.getName());
        System.out.println("length(): " + file.length());

        System.out.println("delete(): " + file.delete());
        try {
            System.out.println("createNewFile(): " + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
