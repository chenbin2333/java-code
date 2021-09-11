package cn.itsource.interface3;

/**
 *	接口实现类测试类
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		// 调用接口IMyInterface中的全局常量：MAX_VALUE ，语法： 接口名.常量名
		System.out.println(IMyInterface.MAX_VALUE);// 2
		System.out.println(IMyInterface.MIN_VALUE);// 1

		// 调用接口中的static方法：testStatic1，语法：接口名.方法名(...);
		IMyInterface.testStatic1();
		IMyInterface.testStatic2();
		
		// 调用接口中的default方法：testDefault1，语法：实现类对象名.方法名(...);
		// 先创建实现类MyInterfaceImpl对象：
		MyInterfaceImpl my = new MyInterfaceImpl();
		my.testDefault1();// 实现类对象my调用default方法
		my.testDefault2();
		
		// 调用接口中的抽象方法testAbstract()：语法：实现类对象名.方法名(...);
		my.testAbstract();
		
		// 3. 接口不能new对象
//		new IMyInterface();
		
	}

}
