package thread_demo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Schedule {
    public static void main(String[] args) {
        System.out.println("begin");
        //三秒之后打印,Hello,World
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date().toString());
            }
        }, 3000,1000);
        System.out.println("end");
    }
}
