package io_handle;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//字节缓冲流
public class BufferedStreamDemo {
    @Test
    //字节缓冲输出流
    public void BufferedOutDemo() throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        bos.write("hello world".getBytes());
        bos.close();
    }

    @Test
    public void BufferedInputDemo() throws Exception {
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        byte[] buffer = new byte[1024];
        int len = -1;
        System.out.println(bin.read(buffer));
        for (int i = 0; i < buffer.length; i++) {
            System.out.println(buffer[i]);
        }
        while ((len = bin.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        bin.close();
    }
}