package bean_demo;

public class Son extends Father {
    public String name = "son";
    public String test="test";
    public Son() {
        // TODO Auto-generated constructor stub
    }

    public void test() {
        System.out.println("Son's test");
    }

    public static void name() {
        System.out.println("son's static");
    }

    public void sing() {
        System.out.println("son's sing");
    }

    public static void main(String[] args) {
        Father father=new Son();//获得上转型

        Son s=(Son)father;//获得下转型
        System.out.println(s.test);
        System.out.println(s.name);
    }
}