package cn.itsource.final6;

/**
 * 2. final修饰符（掌握）
	1  final概念
			关键字，修饰符，表示最终的。就是一旦修饰一个成员，该成员就不能再被修改了。 
	2  final作用：
			不想被其他程序员修改代码，用final
	3. 使用：		
			可以修饰：
				外部类：太监类，不能被继承
	 			实例变量：必须在声明的时候赋值或者在构造方法中赋值
				类变量： 必须在声明的时候赋值 
				实例方法：不能被子类重写				
	 			类方法：不能被子类重写
	 			内部类：
				局部变量：
			不能修饰：
 				构造方法
		
	4. 使用场景：（掌握）
		1. 不想被他人修改代码就用final
		2. final修饰的成员变量都是常量，在常量池中。【后面讲】
 */
public class FinalDemo {
	/** private修饰的int类型成员变量a */
//	private final int a = 2;// 类变量a，在声明的同时必须赋值
	private final int a;// 类变量a，在声明的同时必须赋值
	
	/** public static修饰的String类型成员变量str */
	public static final String STR = "测试";// 类变量STR，在声明的同时必须赋值
	
	/**
	 * public修饰的FinalDemo类无参构造
	 */
	public FinalDemo() {
		// 实例变量，被final修饰，必须 ： 1.在声明的同时赋值 或者 2.在构造方法中赋值
		a = 1;
	}

	/**
	 *  private修饰的FinalDemo类int参构造
	 * @param a
	 */
	private FinalDemo(int b) {
		// 实例变量，被final修饰，必须 ： 1.在声明的同时赋值 或者 2.在构造方法中赋值
		a = 3;
	}
	
	/**
	 * public修饰的test1方法
	 */
	public static final void test1() {
		final int a;// 局部变量，只有final才能修饰局部变量,可以声明的时候不赋值。但是使用前必须有值
		a = 1;// final修饰的局部变量一旦赋值，就不能修改了
		System.out.println(a);
//		a = 2;// final修饰的局部变量一旦赋值，就不能修改了
		
	}
	
	/**
	 * public修饰的testPrivate方法
	 */
	public final void testPrivate() {
		System.out.println("testPrivate");
	}
	
	/**
	 *	静态内部类InnerClass，将一个类设计在另外一个类的类体中
	 *	内部类还可以用访问权限修饰符修饰
	 *	在类前面加上static，这个类就是静态内部类
	 */
	static final class InnerClass {
		
	}
	
	/**
	 *	内部类InnerClass2，将一个类设计在另外一个类的类体中
	 *	内部类还可以用访问权限修饰符修饰
	 *	在类前面加上static，这个类就是静态内部类
	 */
	final class InnerClass2 {
		
	}
	
}
