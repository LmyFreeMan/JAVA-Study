package datastructure_demo;

import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        //进栈
        s1.push("C");
        s1.push("B");
        s1.push("A");
        System.out.println(s1);
        System.out.println(s1.peek());

    }
}