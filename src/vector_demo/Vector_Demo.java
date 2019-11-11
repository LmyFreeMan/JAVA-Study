package vector_demo;

import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println(vector);
        vector.set(2, "H");
        System.out.println(vector);
    }
}