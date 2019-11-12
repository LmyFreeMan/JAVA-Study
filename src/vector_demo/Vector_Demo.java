package vector_demo;
import java.util.Enumeration;
import java.util.Vector;
public class Vector_Demo {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
        //增加元素
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println(vector);
        //修改元素
        vector.set(2, "H");
        System.out.println(vector);
        //遍历元素
        Enumeration en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}