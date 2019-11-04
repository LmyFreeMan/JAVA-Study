package thread_demo;
class PriorityThread extends Thread{
    public PriorityThread(String name) {
        super(name);
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(super.getName()+"-"+i);
        }
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        PriorityThread max=new PriorityThread("高优先级");
        max.setPriority(Thread.MAX_PRIORITY);
        PriorityThread min=new PriorityThread("低优先级");
        min.setPriority(Thread.MIN_PRIORITY);
        min.start();
        max.start();
    }
}