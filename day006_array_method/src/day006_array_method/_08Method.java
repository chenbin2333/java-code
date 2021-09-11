package day006_array_method;

/**
 *	1 方法的声明（定义）：（最重要）
			1.1. 复制main方法到当前类中，跟main方法平级的地方
			1.2. 根据需求分析方法的四要素：
					1. 返回值类型：
					2. 方法名：
					3. 形参列表：
					4. 方法体：
			1.3. 根据实际需求，修改方法的四要素
		
	2 方法的调用：（最重要）
			看要调用方法是否有static修饰：
				2.1 有static修饰，用：当前类名.方法名(实参(变量/值)); 
				2.2 没有static修饰，用：当前类的对象名.方法名(实参(变量/值)); // 面向对象才用，这几天都不用
				
				特殊情况：
					如果调用方（目前就是指main方法）和被调用方都在同一个类中，且都有或者都没有static修饰，可以简写为：
					方法名(实参(变量/值));		
					
				注意：调用方法的时候，传入的参数数量、数据类型、顺序必须和 声明方法的一致
 */
public class _08Method {
	
	
	public static void main(String[] args) {
		// 需求： 求3个int类型变量的和，并且将和返回。
		/*
		 * 2 方法的调用：（最重要）
			看要调用方法是否有static修饰：
				2.1 有static修饰，用：当前类名.方法名(实参(变量/值)); 
		 */
		/*
		 *  这里getSum 方法有static修饰。所以，用类名.方法名(..)调用
		 *  因为getSum方法有3个int类型形参，所以，调用的时候，传入了3个int类型的 值
		 *  并且getSum方法返回值是int类型的，所以用int类型变量sum接收的方法结果
		 */
		int sum = _08Method.getSum(1, 2, 3);
		System.out.println(sum);
		System.out.println(_08Method.getSum(2, 2, 3));
	}
	
	/**
	 * 
	 */
	public static int getSum(int a, int b, int c) {
		// 将a、b、c加起来，用一个和变量保存。
//		int sum = a + b + c;
//		return sum;// 然后将和通过return 返回sum。
		return a + b + c;
	}
	
}
