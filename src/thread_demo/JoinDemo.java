package thread_demo;
 class Join extends Thread {
    public void run(){
        for (int i = 0; i <50; i++) {
                System.out.println("join"+i);
        }
    }
}
public class JoinDemo{
    public static void main(String[] args) {
        System.out.println("begin");
        Join joinThread=new Join();
        for (int i = 0; i <50; i++) {
            System.out.println("main"+i);
            if(i==10){
                joinThread.start();
            }
            if(i==20){
                try {
                    joinThread.join();//强行运行该线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("end...");
    }
}