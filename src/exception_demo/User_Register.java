package exception_demo;

public class User_Register {
	/*
	 * 模拟数据库出现的账号
	 * */
	private static String[] names= {"lucy","will"};
	public User_Register() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkUserName("will");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	private static void checkUserName(String username) {
		for (String name : names) {
			if(name.equals(username))
				throw new Exception_Register("亲，你已经被注册过了");
		}
		System.out.println("验证成功");
		
	}

}
