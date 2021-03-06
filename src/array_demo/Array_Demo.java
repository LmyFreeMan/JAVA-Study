package array_demo;

import org.apache.commons.lang.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Demo {
	public Array_Demo() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) {
    	//arraycopy将指定源数组中的数组从指定位置复制到目标数组的指定位置
		int[] name= new int[] {1,3,5,7};

        System.out.println(Arrays.toString(name));
		int[] src= {1,2,3,4};
		int[] dest= {4,5,6,7};
        //数组转化为List对象,定长,不可修改，不能删除，不可添加，只可以修改。
        List list = new ArrayList();
        list = Arrays.asList("A", "B", "C", "D");
        System.out.println(list);
		System.arraycopy(src, 0, dest, 0, 4);
		System.out.println("这是一条华丽的分割线");
		System.out.println("这是一条华丽的分割线");
		System.out.println("这是一条华丽的分割线");
		for (int i : dest) {
			System.out.println(i);//
		}
		System.out.println(Arrays.toString(dest));
		//arraycopy复制指定的数组
		int[] copy=Arrays.copyOf(src, 4);
		System.out.println(ArrayUtils.toString(copy));
		//将一个数组转换成String,用于打印
		System.out.println(ArrayUtils.toString(dest));
		//判断两个数组是否相等
      	System.out.println(ArrayUtils.isEquals(src, dest));
		System.out.println(ArrayUtils.isSameLength(src, dest));
		//判断两个数组是否相等 
		System.out.println(Arrays.equals(src, dest));
		System.out.println(dest.toString());
		
	}
	
}
