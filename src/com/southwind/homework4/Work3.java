package com.southwind.homework4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Work3 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:\\text.txt");
            String str ="好好学习Java";
            byte[] words  = str.getBytes();
            fos.write(words, 0, words.length);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
