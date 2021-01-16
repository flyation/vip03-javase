package com.southwind.myIO;

import java.io.*;

/**
 * 利用字符输入、输出流完成文件复制
 */
public class MyCopy2 {
    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        try {
            // 源头（若文件不存在，抛出异常FileNotFoundException）
            reader = new FileReader("C:\\Users\\FLY\\Pictures\\1.txt");
            // 目的地（即使文件不存在也可以自动创建）
            writer = new FileWriter("e:/copy.txt");
            // 使用缓冲数组，提升效率
            char[] chars = new char[2014];
            int len = 0;
            // 边读边写
            while ((len = reader.read(chars)) != -1) {
                System.out.println(chars);
                writer.write(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
