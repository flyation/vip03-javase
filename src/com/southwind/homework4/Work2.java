package com.southwind.homework4;

import java.io.FileInputStream;
import java.io.IOException;

public class Work2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\text.txt");
            int temp = 0;
            System.out.println("可读取的字节数：" + fis.available());
            while ((temp = fis.read()) != -1) {
                System.out.println((char)temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
