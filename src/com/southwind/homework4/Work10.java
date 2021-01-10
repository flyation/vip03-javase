package com.southwind.homework4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Work10 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("E:\\pet.template");
            writer = new FileWriter("E:\\pet.txt");
            char[] chars = new char[1024];
            String str = new String(chars);
            str = str.replace("{name}", "欧欧");
            str = str.replace("{type}", "狗狗");
            str = str.replace("{master}", "李伟");
            System.out.println(str);
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
