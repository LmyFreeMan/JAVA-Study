package io_handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class File_Copy {
    public static void main(String[] args) throws Exception {
        //1.创建源
        File srcFile = new File("E:/Java/JAVA-Study/src/file_demo/test.txt");
        //2.创建输入流
        InputStream in = new FileInputStream(srcFile);
        //3.读取操作
        byte[] buffer = new byte[1024];
        //4.关闭资源
        in.close();
    }
}