package treeset_demo;

import bean_demo.Person;

import java.util.Comparator;
import java.util.TreeSet;

class NameLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() > o2.getAge())
            return -1;
        else if (o1.getAge() < o2.getAge())
            return 1;
        else
            return 0;
    }
}

public class TreeSet_Demo {
    public static void main(String[] args) {
        //根据person对象的年龄做自然排序
        TreeSet<Person> set = new TreeSet<>(new NameLengthComparator());
        set.add(new Person("李", 98));
        set.add(new Person("王", 99));
        set.add(new Person("钱", 100));
        System.out.println(set);
    }
}