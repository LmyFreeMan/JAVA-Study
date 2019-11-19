package map_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        //添加元素
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        System.out.println(map);//{key1=value1, key2=value1, key3=value1}
        //判断某一个map是否有一个key
        System.out.println(map.containsKey("key1"));//true
        System.out.println(map.containsKey("key5"));//false
        //得到某一个值
        Object val = map.get("key1");
        System.out.println(val);//value1
        //获取map中所有的key
        Set<String> keys = map.keySet();
        System.out.println(keys);//[key1, key2, key3]
        //根据key获取value
        System.out.println(map.get(keys));//value1,value2,value3
        //获取map中所有的values
        Collection<Object> values = map.values();
        for (Object vale : values) {
            System.out.println(vale);//value1.value2,value3
        }
        //获取map中的entry(Key-value)
        Set<Map.Entry<String, Object>> entrs = map.entrySet();
        System.out.println(entrs);//[key1=value1, key2=value2, key3=value3]
        for (Map.Entry<String, Object> entry : entrs) {
            //获取key
            System.out.println(entry.getKey());//key1,key2,key3
            //获取value
            System.out.println(entry.getValue());//value1,value2,value3
        }

    }
}