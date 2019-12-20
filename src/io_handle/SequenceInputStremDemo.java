package io_handle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStremDemo {
    public static void main(String[] args) throws IOException {
        SequenceInputStream in = new SequenceInputStream(new FileInputStream("E:/Java/JAVA-Study/src/file_demo/test.txt"), new FileInputStream("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        in.close();
    }
}