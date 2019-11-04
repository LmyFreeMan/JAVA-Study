package thread_demo;

//每一个人表示一个进程
class Person extends java.lang.Thread{
    private int num=50;//苹果总数
    public Person(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            if(num>0)
            System.out.println(super.getName()+"吃了编号为"+num-- +"的苹果");
        }
    }
}
public class ExtendsThreadDemo  {
    public static void main(String[] args) {
        //创建三个人(线程)吃苹果
        new Person("小A").start();
        new Person("小B").start();
        new Person("小C").start();

    }
}
