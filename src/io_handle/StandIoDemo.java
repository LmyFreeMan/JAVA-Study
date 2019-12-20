package io_handle;

import java.io.File;
import java.util.Scanner;

public class StandIoDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("begin");
        //从键盘读取一个数据
        int data = System.in.read();
        System.out.println(data);
        System.out.println("end");
        Scanner sc = new Scanner(new File("E:/Java/JAVA-Study/src/file_demo/test.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }


    }
}