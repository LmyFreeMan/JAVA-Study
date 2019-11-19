package collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Demo {
    //得到list的空集
    //List list= Collections.EMPTY_LIST;
    //得到线程安全的list
    List list = Collections.synchronizedList(new ArrayList<>());
}