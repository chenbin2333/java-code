package cn.itsource.static5;

/**
 * static修饰符（掌握使用场景）
	1. 概念：修饰符，表示静态的。用来修饰类和类中的成员的
	2. 作用：被其修饰的成员，都会在类加载的时候，加载到静态区中（预加载），只有一份。
		会被以该类创建的对象所共享。
		
	3. 使用：（将类中所有成员写出来，然后分别用static修饰看看，会不会报错，如果不报错，再看看修饰后的效果即可）
		能修饰：
			成员变量，被其修饰的成员变量叫 ： 类变量（字段：类变量、成员变量）
			成员方法：可以类方法
			成员内部类
			
		不能修饰：
			外部类
			构造方法
			局部变量
	
	4. 使用场景：（掌握）
		1. 需要几个对象共享成员变量或者成员方法的时候
		2. 需要预加载的时候，例如单例模式
		3. 不需要频繁创建对象的时候,可以用static修饰
		4. 一般配合public static final一起使用，表示全局常量
			要求，全大写，用_隔开，声明的同时必须赋值。
			例如：Math.PI、int最大值、最小值
		5. 修饰方法：为了简化调用过程。 
 */
public class StaticDemo {
	/** public修饰的int类型成员变量a */
	public static int a;
	
	/**
	 * public修饰的Demo类无参构造
	 */
	public StaticDemo() {}
	
	/**
	 * public修饰的test1方法
	 */
	public static void test1() {
		int a = 1;// 局部变量，只有final才能修饰局部变量
		
		class InnerClass {
			
		}
	}
	
	/**
	 * 抽象方法
	 */
//	public abstract void testAbstract();
	
	/**
	 *	成员内部类InnerClass，将一个类设计在另外一个类的类体中
	 *	内部类还可以用访问权限修饰符修饰
	 *	在类前面加上，这个类就是静态内部类
	 *	
	 */
	static class InnerClass {
		
	}
	
}
