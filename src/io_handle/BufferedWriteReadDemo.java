package io_handle;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//字符缓冲流
public class BufferedWriteReadDemo {
    @Test
    public void BufferedWrite() throws Exception {
        BufferedWriter out = new BufferedWriter(new FileWriter("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        out.write("君不见黄河之水天上来");
        out.newLine();
        out.write("奔流到海不复还");
        out.close();
    }

    @Test
    public void BufferedReaderDemo() throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        char[] buffer = new char[1024];
        int len = -1;
//     while ((len=in.read(buffer))!=-1){
//         System.out.println(new String(buffer,0,len));
//     }
        //表示读取的行
        String line = null;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}