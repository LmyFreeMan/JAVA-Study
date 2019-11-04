package thread_demo;
class DaemonThread extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
          System.out.println("这是一条华丽的分割线");
        }
    }
}


public class DaemonDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        for (int i = 0; i < 500; i++) {
            System.out.println("main:"+i);
            if(i==10){
                DaemonThread t=new DaemonThread();
                t.setDaemon(true);//设置子线程为后台线程
                t.start();
            }
        }
    }

}