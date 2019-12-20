package io_handle;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        writer.write("B");
        char[] data = writer.toCharArray();
        //字符数组输入流
        CharArrayReader reader = new CharArrayReader(data);
        System.out.println((char) reader.read());
    }
}