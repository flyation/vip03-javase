package com.southwind;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test2 {
    public static void main(String[] args) {
        OutputStream fos = null;
        try {
            fos = new FileOutputStream("d:/copy.txt");
            byte[] bytes = {72, 101, 108, 108, 111};
            fos.write(bytes, 2, 3);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
