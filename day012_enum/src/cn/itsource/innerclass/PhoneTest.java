package cn.itsource.innerclass;

/**
 *	测试内部类
 */
public class PhoneTest {

	public static void main(String[] args) {
		// 创建Phone对象，调用有参构造
		Phone phone = new Phone("153 1110 5089");
		// Phone对象调用showNumber方法
		phone.showNumber();
		
	}

}
