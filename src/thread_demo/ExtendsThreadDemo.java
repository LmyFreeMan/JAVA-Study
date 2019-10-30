package thread_demo;

class MusicThread extends java.lang.Thread{

    public void run() {
        for (int i = 0; i <50 ; i++) {
            System.out.println("MusicThread"+i);
        }

    }
}

public class ExtendsThreadDemo  {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            System.out.println("打游戏"+i);
            if(i==10){
                MusicThread musicThread=new MusicThread();
                musicThread.start();
            }
        }

    }
}
