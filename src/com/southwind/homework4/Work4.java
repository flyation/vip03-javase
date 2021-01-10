package com.southwind.homework4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\我的青春谁做主.txt");
            fos = new FileOutputStream("C:\\myFile\\my Prime.txt");
            byte[] words = new byte[10];
            int len = 0;
            while ((len = fis.read(words)) != -1) {
                fos.write(words, 0, len);
            }
            System.out.println("复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
