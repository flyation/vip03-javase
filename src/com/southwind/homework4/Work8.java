package com.southwind.homework4;

import java.io.*;

public class Work8 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("E:\\简介.txt");
            bw = new BufferedWriter(fw);
            String str = "大家好！我正在学习BufferedWriter。\n请多多指教！";
            bw.write(str);
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
