package file_demo;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("E:/Java/JAVA-Study/src/file_demo/test.txt");
        //write(f);
        read(f);
    }

    private static void read(File f) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(f, "r");
        System.out.println("文件指针的位置" + raf.getFilePointer());
        System.out.println(raf.readByte());
        System.out.println("文件指针的位置" + raf.getFilePointer());
        //设置指针0字节
        raf.seek(0);
        //设置指针跳过12字节
        raf.skipBytes(12);
        System.out.println(raf.readByte());
    }

    private static void write(File f) throws Exception {
        RandomAccessFile raf = new RandomAccessFile(f, "rw");
        raf.write(65);
        raf.writeUTF("龙哥");
        raf.writeInt(24);
        raf.close();
    }
}