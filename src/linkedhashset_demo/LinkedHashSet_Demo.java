package linkedhashset_demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Demo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("1");
        set.add("C");
        set.add("D");
        System.out.println(set);//[ 1, C, D,]
        System.out.println();
    }
}