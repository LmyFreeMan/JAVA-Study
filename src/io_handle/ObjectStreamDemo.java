package io_handle;

import bean_demo.User;

import java.io.*;

//使用对象流来实现序列化和反序列化
public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("E:/Java/JAVA-Study/src/file_demo/test.txt");
        writeObject(f);
        readObject(f);
    }

    //反序列化操作
    private static void readObject(File f) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        User user = (User) in.readObject();
        System.out.println(user);
        in.close();
    }

    //序列化操作
    private static void writeObject(File f) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(new User("Will", "123", 25));
        out.close();
    }

}