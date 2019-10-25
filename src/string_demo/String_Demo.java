package string_demo;
public class String_Demo {
    public static void main(String[] args) {
        String a="abc";
        String b="e";
        int c=0;
        String greeting="greeting";
        System.out.println(greeting.substring(0,3)+"p!");
        System.out.println(greeting.codePointAt(5));
        System.out.println("这是一条华丽的分割线");
        a.concat(b);
        System.out.println(a);
        //测试断言
       // assert c > 1:"a的值大于1了";
       //System.out.println(a);
        //测试String.valueof
       System.out.println(String.valueOf('2'));
    }
}

