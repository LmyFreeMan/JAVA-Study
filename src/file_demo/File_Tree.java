package file_demo;

import java.io.File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class File_Tree {
    public static void main(String[] args) {
        String file = "E:/Java/JAVA-Study/src/file_demo/File_Demo.java";
        File f = new File(file);
        List<String> parentNames = new ArrayList<>();
        listAllParent(parentNames, f);
        System.out.println(parentNames);
        Collections.reverse(parentNames);
        StringBuilder sb = new StringBuilder(100);
        for (String name : parentNames) {
            sb.append(name).append('>');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }

    private static void listAllParent(List<String> parentNames, File f) {
        parentNames.add(f.getParentFile().getName());
        if (f.getParentFile().getParentFile() != null) {
            listAllParent(parentNames, f.getParentFile());
        }
    }
}