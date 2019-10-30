package thread_demo;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            System.out.println("打游戏"+i);
            if(i==10){
                new Thread(new Runnable() {
                    public void run() {
                        for (int i = 0; i < 50; i++) {
                            System.out.println("播放电影"+i);
                        }
                    }
                }).start();
            }
        }

    }
}
