package com.southwind.homework4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Work7 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("E:\\简介.txt");
            String str = "我热爱我的团队！";
            fw.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
