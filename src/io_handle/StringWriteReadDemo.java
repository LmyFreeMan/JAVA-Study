package io_handle;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriteReadDemo {
    //字符串的输出流
    public static void main(String[] args) throws IOException {
        StringWriter sWriter = new StringWriter();
        sWriter.write("龙哥好");
        //字符串的输入流
        StringReader sReader = new StringReader(sWriter.toString());
        char[] buffer = new char[102];
        int len = -1;
        while ((len = sReader.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        sWriter.close();
    }
}