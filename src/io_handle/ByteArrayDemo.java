package io_handle;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//字节的数组流/内存流
public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        //字节数组输出流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write("ABCED".getBytes());
        //要使用存储的临时数据
        byte[] buffer = bos.toByteArray();
        for (int i = 0; i < buffer.length; i++) {
            System.out.print((char) buffer[i]);
        }
        //字节数组输入流:内存->程序
        ByteArrayInputStream bis = new ByteArrayInputStream(buffer);
        byte[] bys = new byte[5];
        int len = -1;
        while ((len = bis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        bis.close();
        bos.close();
    }
}