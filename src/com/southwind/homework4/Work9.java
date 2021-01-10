package com.southwind.homework4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Work9 {
    public static void main(String[] args) {
        InputStream is = null;
        InputStreamReader reader = null;
        try {
            // 不指定编码方式
            char[] chars = new char[1024];
            is = new FileInputStream("E:\\乱码.txt");
            reader = new InputStreamReader(is);
            reader.read(chars);
            System.out.println(chars);
            // 指定编码方式
            chars = new char[1024];
            is = new FileInputStream("E:\\乱码.txt");
            reader = new InputStreamReader(is, "GBK");
            reader.read(chars);
            System.out.println(chars);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
