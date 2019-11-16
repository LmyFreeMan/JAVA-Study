package arraylist_demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayList_Demo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        //for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //foreach
        for (Object ele : list)
            System.out.println(ele);
        //迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        for (Iterator it2 = list.iterator(); it2.hasNext(); )
            System.out.println(it2.next());
        //删除元素
        list.remove("B");
        list.set(1, "D");
        System.out.println(list);
    }
}