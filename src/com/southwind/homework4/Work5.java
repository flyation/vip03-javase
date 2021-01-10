package com.southwind.homework4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Work5 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\简介.txt");
            char[] chars = new char[10];
            int len = 0;
            while ((len = fr.read(chars)) != -1) {
                System.out.println(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
