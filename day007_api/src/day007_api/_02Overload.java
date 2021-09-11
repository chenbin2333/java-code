package day007_api;

/**
 *	方法重载overload：【掌握】
	1.1 概念：在同一个类中，方法名相同，形参列表不同，就是方法重载
	1.2 作用：
		1. 可以减少命名冲突
		2. 可以减少程序员记忆成本，方便解决了一类问题
			
	1.3 使用：
		声明方法的时候，写不同的形参即可。
		调用方法的时候，程序会根据参数数量、类型、顺序自动匹配调用的
 *	
 */
public class _02Overload {

	public static void main(String[] args) {
		// 1.求2个int变量的和，设计一个方法实现
		int sum = getSum(1, 2);// 程序会根据调用方法的实参，自动匹配调用重载的哪一个方法
		System.out.println(sum);
		
		// 2.求3个int变量的和，设计一个方法实现
		int sum2 = getSum(1, 2, 3);// 程序会根据调用方法的实参，自动匹配调用重载的哪一个方法
		System.out.println(sum2);
		
		// 3.求4个int变量的和，设计一个方法实现
		int sum3 = getSum(1, 2, 3, 4);// 程序会根据调用方法的实参，自动匹配调用重载的哪一个方法
		
	}
	
	/**
	 * 1.求2个int变量的和，设计一个方法实现
	 * @param 这是一个注解，表示参数 a
	 * @param 参数 b
	 * @return 表示有返回值，返回的是a和b的和
	 */
	public static int getSum(int a, int b) {
		System.out.println("求2个int变量。。。。");
		return a + b;
	}
	
	/**
	 * 重载方法
	 * 2.求3个int变量的和，设计一个方法实现
	 * @param a 
	 * @param b
	 * @param c
	 * @return 返回的是a、b、c的和
	 */
	public static int getSum(int a, int b, int c) {
		System.out.println("====求3个int变量。。。。");
		return a + b + c;
	}
	
	/**
	 * 重载方法
	 * 3.求4个int变量的和，设计一个方法实现
	 * @param a 
	 * @param b
	 * @param c
	 * @param d
	 * @return 返回的是a、b、c、d的和
	 */
	public static int getSum(int a, int b, int c, int d) {
		System.out.println("---------------求4个int变量。。。。");
		return a + b + c + d;
	}
	
}
