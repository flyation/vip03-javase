package com.southwind.myIO;

import java.io.*;

/**
 * 利用字节输入、输出流完成文件复制
 */
public class MyCopy {
    public static void main(String[] args) {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            // 源头（若文件不存在，抛出异常FileNotFoundException）
            fis = new FileInputStream("C:\\Users\\FLY\\Pictures\\1.png");
            // 目的地（即使文件不存在也可以自动创建）
            fos = new FileOutputStream("e:/copy.png");
            // 使用缓冲数组，提升效率
            byte[] bytes = new byte[1024];
            int len = 0;
            // 边读边写
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
