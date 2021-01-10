package com.southwind.homework4;

import java.io.*;

public class Work11 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("E:\\star.jpg");
            os = new FileOutputStream("D:\\myDoc\\myPicture.jpg");
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0 ,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
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
