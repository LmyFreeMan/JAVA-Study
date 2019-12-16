package file_demo;

import java.io.File;

//批量修改文件名
public class File_Rename {
    public static void main(String[] args) {
        File dir = new File("D:/java");
        //获取当前目录下所有的文件
        File[] files = dir.listFiles();
        //需要被替换/删除的文字
        String deleteText = "lmyrecode-";
        for (File file : files) {
            System.out.println(file);
            if (file.getName().contains(deleteText)) {
                String newFileName = file.getName().replace(deleteText, "");
                file.renameTo(new File(dir, newFileName));
            }
        }
    }
}