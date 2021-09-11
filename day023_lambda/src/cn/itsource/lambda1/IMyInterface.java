package cn.itsource.lambda1;

/**
 *	接口IMyInterface
 *	只有一个抽象方法的接口就是函数式接口@FunctionalInterface修饰
 */
@FunctionalInterface
public interface IMyInterface {
	/** 全局常量 */
	int MAX_VALUE = 2;// 调用方式：接口名.常量名
	
	/**
	 * 抽象方法
	 * 调用方式：实现类对象名.default方法名(...);
	 */
	void testAbstract();
	
	public default void testDefault() {// 调用方式：实现类对象名.default方法名(...);
		System.out.println("testDefault方法");
	}
	
	public static void testStatic() {// 调用方式：接口名.static方法名(...);
		System.out.println("testStatic方法");
	}
	
}
