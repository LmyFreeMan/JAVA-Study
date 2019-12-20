package io_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Properties_Demo {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties p = new Properties();
        //输入流
        InputStream inputStream = new FileInputStream("E:/Java/JAVA-Study/src/io_handle/db.properties");
        //加载输入流的数据
        p.load(inputStream);
        System.out.println(p.getProperty("username"));
    }
}