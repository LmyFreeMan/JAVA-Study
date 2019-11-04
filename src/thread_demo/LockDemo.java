package thread_demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Person_2 implements Runnable{
    private int num=50;
    //创建一个锁对象
    private final Lock lock=new ReentrantLock();
    public void run() {
        for (int i = 0; i <50 ; i++) {
                eat();
        }
    }

    private void eat() {
        lock.lock();//获取锁
        if(num>0)
        try {
            System.out.println(Thread.currentThread().getName()+"吃了编号为"+num-- +"的苹果");
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            lock.unlock();//释放锁
        }
    }
}
public class LockDemo {
    public static void main(String[] args) {
        Person_2 person_2=new Person_2();
        //创建三个线程吃苹果
        new Thread(person_2,"小A").start();
        new Thread(person_2,"小B").start();
        new Thread(person_2,"小C").start();
    }
}
