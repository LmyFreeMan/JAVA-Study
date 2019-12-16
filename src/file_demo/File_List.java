package file_demo;

import java.io.File;

//递归列出指定目录中的所有文件
public class File_List {
    public static void main(String[] args) {
        File dir = new File("E:/Java/JAVA-Study");
        listAllFile(dir);
    }

    private static void listAllFile(File f) {
        System.out.println(f);
        //第一级子文件
        File[] fs = f.listFiles();
        for (File file : fs) {
            //如果子文件是目录，则继续递归
            if (file.isDirectory()) {
                listAllFile(file);
            } else {
                //如果子文件是文件则打印
                System.out.println(file);
            }
        }
    }
}