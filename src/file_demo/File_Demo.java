package file_demo;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * unix 使用'/',来分割目录路径
 * windows使用'\',来分割目录路径,但是在java一个"\"表示转义,所以得使用'\\',同时windows支持'/'
 **/
public class File_Demo {
    //测试常量
    @Test
    public void testConst() {
        //属性分隔符‘;’
        System.out.println(File.pathSeparator);
        //属性分隔符‘;’
        System.out.println(File.pathSeparatorChar);
        //路径分隔符‘\’
        System.out.println(File.separator);
    }

    //获取File的路径和检测状态
    @Test
    public void getFileInfo() {
        File file = new File("src/file_demo/test.txt");
        System.out.println(file);
        //获得绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件名字
        System.out.println(file.getName());
        //获取文件路径
        System.out.println(file.getPath());
        System.out.println("这是一条华丽的分割线");
        //获取目录
        System.out.println(file.getParent());
        //是否可写
        System.out.println(file.canWrite());
        //是否可写
        System.out.println(file.canRead());
        //是否可执行
        System.out.println(file.canExecute());
        //获取文件的最后修改时间
        System.out.println(file.lastModified());
        //获取文件的字节
        System.out.println(file.length());
    }

    @Test
    //对文件的一些操作
    public void logicFile() throws IOException {
        File file = new File("src/file_demo/test1.txt");
        //判断是不是文件
        System.out.println(file.isFile());
        //创建一个文件
        file.createNewFile();
        //删除文件
        file.delete();
        //创建临时文件
        File.createTempFile("lmy-", "test", new File("D:/"));
    }

    @Test
    //对目录的一些操作
    public void loginDir() throws IOException {
        File dir = new File("E:/Java/JAVA-Study/src/file_demo");
        File file = new File(dir, "123.txt");
        //判断是不是文件夹
        System.out.println(dir.isDirectory());//true
        System.out.println(file.isDirectory());//false
        System.out.println("这是一条华丽的分割线");
        //列出文件夹下的文件
        String[] names = dir.list();
        for (String name : names)
            System.out.println(name);
        System.out.println("这是一条华丽的分割线");
        File[] fs = dir.listFiles();
        for (File file1 : fs)
            System.out.println(file1);
        //访问系统的根
        File[] roots = File.listRoots();
        for (File root : roots)
            System.out.println(root);
    }
}

