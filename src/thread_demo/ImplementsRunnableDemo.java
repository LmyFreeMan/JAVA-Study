package thread_demo;

class Person_1 implements Runnable{
    private int num=50;

    @Override
    public void run() {

        for (int i = 0; i <50 ; i++) {
            synchronized (this){
            if(num>0)
                System.out.println(Thread.currentThread().getName()+"吃了编号为"+num-- +"的苹果");
        }
        }
    }
}


public class ImplementsRunnableDemo {
    public static void main(String[] args) {
        Person_1 person_1=new Person_1();
        //创建三个线程吃苹果
        new Thread(person_1,"小A").start();
        new Thread(person_1,"小B").start();
        new Thread(person_1,"小C").start();
    }
}
