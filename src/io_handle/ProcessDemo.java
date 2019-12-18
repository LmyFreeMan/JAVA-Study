package io_handle;

import java.io.*;

public class ProcessDemo {
    public static void main(String[] args) throws IOException {
        String str = "System.out.println(\"你是天边的云彩\")";
        eval(str);
    }

    private static void eval(String str) throws IOException {
        //1.使用StringBuilder拼接一个完整的HelloWorld程序
        StringBuilder sb = new StringBuilder(80);
        sb.append("public class Hello{");
        sb.append("public static void main(String[] args) {");
        sb.append(str);
        sb.append(";");
        sb.append("}");
        sb.append("}");
        //2.保存一个名叫Hello.java的文件
        OutputStream out = new FileOutputStream("Hello.java");
        out.write(sb.toString().getBytes());
        out.close();
        //3.调用javac进程来编译hello.java
        Process javacProcess = Runtime.getRuntime().exec("javac Hello.java");
//        4.读取javac进程中的错误流信息
        InputStream error = javacProcess.getErrorStream();
        //5.获取流中的数据
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = error.read(buffer)) != -1) {
            String msg = new String(buffer, 0, len);
            System.out.println(msg);
        }
        error.close();
//        5.调用java进程来运行hello字节码
        Process javaProcess = Runtime.getRuntime().exec("java Hello");
        InputStream info = javaProcess.getInputStream();
        while (info.read(buffer) != -1) {
            String msg = new String(buffer);
            System.out.println(msg);
        }
        // InputStream errors=javacProcess.getErrorStream();
//        while (errors.read(buffer) !=-1){
//            String msg = new String(buffer);
//            System.out.println(msg);
//        }
        info.close();
        //errors.close();
//        6.删除java和class文件
//          new File("Hello.java").delete();
//          new File("Hello.class").delete();

    }
}