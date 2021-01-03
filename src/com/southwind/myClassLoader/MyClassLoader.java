package com.southwind.myClassLoader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 自定义的类加载器
 * 核心方法：findClass找到目标文件，defineClass加载目标文件
 */
public class MyClassLoader extends ClassLoader {
    //保存目标文件所在的目录
    private String path;

    // 在构造器中传入目标文件的目录
    public MyClassLoader(String path) {
        this.path = path;
    }

    // 定义我们加载字节码的逻辑
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 拼接目标class文件的完整地址
        String classPath = path + name + ".class";
        // 定义一个字节数组用来存储读入的文件数据
        byte[] bytes = null;
        // 通过IO流读入文件到字节数组中
        try(FileInputStream fis = new FileInputStream(classPath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            // 字节数组输出流输出到字节数组中
            bytes = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 返回
        return defineClass(name, bytes, 0, bytes.length);
    }
}
