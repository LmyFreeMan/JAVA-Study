package thread_demo;

class MusicRunableImpl implements Runnable{
    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println("MusicThread"+i);
        }
    }
}

public class ImplementsRunnableDemo {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            System.out.println("打游戏"+i);
            if(i==10){
                Runnable target=new MusicRunableImpl();
                Thread t=new Thread(target);
                t.start();
            }
        }
    }
}
