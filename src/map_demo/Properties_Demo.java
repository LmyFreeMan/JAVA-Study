package map_demo;

import java.util.Properties;

public class Properties_Demo {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("username", "admin");
        p.setProperty("password", "admin");
        //根据key获取value
        System.out.println(p.getProperty("username"));
    }

}