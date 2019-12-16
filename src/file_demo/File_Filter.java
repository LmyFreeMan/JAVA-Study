package file_demo;

import java.io.File;
import java.io.FilenameFilter;

public class File_Filter {
    public static void main(String[] args) {
        File dir = new File("D:/java");
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return !new File(dir, name).isFile() || !name.endsWith(".avi");
            }
        });
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}