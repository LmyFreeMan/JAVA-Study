package date_demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        Date date=new Date();
        String d=date.toString();//Wed Oct 23 10:43:59 CST 2019
        System.out.println(date.getDate());
        System.out.println(d);
        //获取当前日期 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);//2019-10-23
        LocalDate special=LocalDate.of(1999, 12, 31);
        int year = special.getYear(); // 1999
        int month = special.getMonthValue(); // 12
        int day = special.getDayOfMonth(); // 31
        LocalTime time = LocalTime.now();
        System.out.println("当前时间"+time);//当前时间10:54:54.421
        LocalTime specificTime = LocalTime.of(12,20,25,40);
        System.out.println("特定时间"+specificTime);//特定时间12:20:25.000000040

        //拿到其他时区时间
        LocalTime time2 = LocalTime.now(ZoneId.of("UTC+2"));
        System.out.println("东二区现在"+time2);//东二区现在04:55:32.537

        LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
        System.out.println("零点后一万秒"+specificSecondTime);//零点后一万秒02:46:40

        //Current Date
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current DateTime="+localDateTime);

    }
}
