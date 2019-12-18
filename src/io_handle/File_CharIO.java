package io_handle;

import org.junit.Test;

import java.io.*;

//操作字符文件
public class File_CharIO {
    //文件的字符输入流
    @Test
    public void fileReadDemo() throws IOException {
        //1.创建源
        File srcFile = new File("E:/Java/JAVA-Study/src/file_demo/test.txt");
        //2.创建流对象
        Reader in = new FileReader(srcFile);
        //3.读取操作
        // int ch=in.read();
        char[] buffer = new char[5];
        int len = -1;
        len = in.read(buffer);
        while (len != -1) {
            System.out.println(buffer);
            len = in.read(buffer);
        }
        //4.关闭流
        in.close();
    }

    @Test
    public void fileWriteDemo() throws IOException {

        //1.创建目标
        File desFile = new File("E:/Java/JAVA-Study/src/file_demo/test.txt");
        //2.创建字符输出流对象
        Writer out = new FileWriter(desFile, true);
        //3.写出操作
        out.write("匹配");
        out.write(65);
        //4.关闭流
        out.close();
    }
}