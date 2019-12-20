package io_handle;

import java.io.PrintStream;

//字节打印流
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream("E:/Java/JAVA-Study/src/file_demo/test.txt");
        ps.write("ABC".getBytes());
        ps.println(11);
        ps.print(true);
        ps.print('c');
    }
}