package wrapper_demo;
public class Integer_Demo {
	public Integer_Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 装箱操作:把一个基本类型的值：转化为对应的包装类对象
		 * */
		 //方式一:
		Integer integer=Integer.valueOf(17);
		/*
		 * 拆箱操作：把一个包装类对象转化为基本数据类型
		 *
		 * */
		int n=integer.intValue();
		 System.out.println(n);//17
        /*
         *  自动装箱:直接把一个基本类型的值：转化为对应的包装类对象
         * */
		 Integer integer2=12;
		 //转化为二进制数
		 System.out.println(integer.toBinaryString(9999));
		 //转化为八进制数
		 System.out.println(integer.toOctalString(555));
		 /*
		  * 自从拆箱:把一个包装类对象直接转化为基本数据类型
		  * Cmccedu110&a
		  * */
		 int n2=integer2;
		 //测试包装类的缓存操作
		 System.out.println(n2);//12
		 Integer i1=new Integer(123);
		 Integer i2=new Integer(123);
		 System.out.println(i1==i2);//false
		 Integer i3=Integer.valueOf(123);
		 Integer i4=Integer.valueOf(123);
		 System.out.println(i3==i4);//true
		 Integer i5=Integer.valueOf(256);
		 Integer i6=Integer.valueOf(256);
		 System.out.println(i5==i6);//false
		 //测试parseInt
		 Integer.parseInt("222");
	}
}