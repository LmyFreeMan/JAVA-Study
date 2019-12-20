package io_handle;

import java.io.*;
import java.io.DataInputStream;

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("E:/Java/JAVA-Study/src/file_demo/test.txt");
        // write(f);
        read(f);
    }

    private static void read(File f) throws Exception {
        DataInputStream in = new DataInputStream(new FileInputStream(f));
        System.out.println(in.readByte());
        System.out.println(in.readChar());
        System.out.println(in.readUTF());
    }


    private static void write(File f) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
        out.writeByte(65);
        out.writeChar('哥');
        out.writeUTF("小马哥教育");
        out.close();
    }
}