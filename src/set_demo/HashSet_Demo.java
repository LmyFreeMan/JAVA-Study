package set_demo;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加元素
        set.add("1");
        set.add("C");
        set.add("D");

        System.out.println(set);//[0, 1, C, D, x]
        //删除元素
        set.remove("C");
        System.out.println(set);//[0, 1, D, x]

    }
}