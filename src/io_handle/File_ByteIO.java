package io_handle;

import org.junit.Test;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//文件的输入输出流
public class File_ByteIO {
    @Test
    //文件字节输出流

    /**
     * @name:fileOutputStreamDemo
     * @param desFile 写入的目标文件
     @param str     写入的字符串
     @param path    写入的文件路径
     @describe: 将字符串内容写入文件
      * @return:java.io.File 返回生成的文件
     * @exception: IOException
     * @date:2019/12/17 16:19
     */
    public static File fileOutputStreamDemo(String str, String path) throws IOException {
        //创建目标对象(表示把数据存放到哪一个文件)
        //  String target="E:/Java/JAVA-Study/src/file_demo/test.txt";
        File desFile = new File(path);

        //创建文件字节输出对象,参数true表示在文件的末尾追加
        OutputStream out = new FileOutputStream(path, true);
        byte[] b = new byte[100];
//        //把"A"写入文件
//        out.write(65);
        //  byte[] b = new byte[]{1,5,7,9};
        //把b数组所有的字节都写到文件里面
        //out.write(b);
        //把b数组的从off索引开始的len个字节写入到文件中
        b = str.getBytes();
        //  out.write(b,1,2);
        out.write(b);
        //关闭资源
        return desFile;
    }

    @Test
    public static void copy() throws IOException {
        StringBuilder sb = new StringBuilder();
        File f = fileOutputStreamDemo("ABCDEF", "E:/Java/JAVA-Study/src/file_demo/test.txt");
        sb = fileInputStreamDemo(f);
        System.out.println(sb);
        fileOutputStreamDemo(new String(sb), "E:/Java/JAVA-Study/src/file_demo/new.txt");
    }

    public static void main(String[] args) throws IOException {
        copy();
    }

    //文件字节输入流
    public static StringBuilder fileInputStreamDemo(File file) throws IOException {
        //1.创建源文件
        // String target="E:/Java/JAVA-Study/src/file_demo/test.txt";
        //2.创建文件字节输入流对象,并接在源上
        FileInputStream in = new FileInputStream(file.getAbsolutePath());
        //3.具体的读取操作
        StringBuilder sb = new StringBuilder();
        //获取文件中的第一个字符
        int data = in.read();
        while (data != -1) {
//             System.out.print((char)data);
            sb.append((char) data);
            data = in.read();
        }
        //读取多个字节，并存储到数组b中，从数组b的索引为0的位置开始存,返回读取几个字节
//        byte[] buffer=new byte[5];
//        in.read(buffer);
        // System.out.println(Arrays.toString(buffer));
        //4.关闭资源
        in.close();
        return sb;
    }

    @Test
    public void getSysInfo() {
        Properties pro = System.getProperties();
        Set<Map.Entry<Object, Object>> entrySet = pro.entrySet();
        for (Map.Entry<Object, Object> entry : entrySet)
            System.out.println(entry.getKey() + " = " + entry.getValue());
        System.out.println("这是一条华丽的分割线");
    }
}