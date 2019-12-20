package io_handle;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

//字符打印流
public class printWrite {
    public static void main(String[] args) throws IOException {
        PrintWriter ps = new PrintWriter(new File("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        ps.println(17);
        ps.print(true);
        ps.close();
    }
}