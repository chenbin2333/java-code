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
public class _07Method {
	
	/**
	 * 需求： 求两个int类型变量的和，并且将和返回。
	 * 
	 * 方法的声明（定义）：（最重要）
	 * 	1. 复制main方法到当前类中，跟main方法平级的地方
		2. 根据需求分析方法的四要素：
			1. 返回值类型：int 
			2. 方法名：getSum
			3. 形参列表：int a, int b
			4. 方法体：将两个变量相加，然后通过return关键字返回
		3. 根据实际需求，修改方法的四要素
	 * @param args
	 */
	public static int getSum(int a, int b) {
		// 将两个变量相加，然后通过return关键字返回
//		int sum = a + b;
//		return sum;// 通过return关键字将sum返回
		// 将上面两步合二为一
		return a + b;// return是优先级很低的一种运算，会在右边所有运算执行结束后，才将结果返回。
	}
	
	public static void main(String[] args) {
		// 需求1： 求两个int类型变量的和，并且将和返回。
		/*
		 * 2 方法的调用：（最重要）
			看要调用方法是否有static修饰：
				2.1 有static修饰，用：当前类名.方法名(实参(变量/值)); 
		 */
		// 求1和2的和。 调用方法传入实参:1和2。因为getSum方法第一个参数和第二个参数都是int类型。
		int sum = _07Method.getSum(1, 2);// 因为getSum方法，有返回值类型int，所以，必须用int变量保存返回值，打印才能看到效果
		// 打印变量sum
		System.out.println(sum);
		
		// 求3和6的和
		int sum2 = _07Method.getSum(3, 6);// 因为getSum方法，有返回值类型int，所以，必须用int变量保存返回值，打印才能看到效果
		// 打印变量sum2
		System.out.println(sum2);
		
		/*
		 * 特殊情况：
			如果调用方（目前就是指main方法）和被调用方都在同一个类中，且都有或者都没有static修饰，可以简写为：
			方法名(实参(变量/值));
		 */
		// 现在main方法中调用getSum方法，则main是调用方，getSum是被调用方，在同一个类_07Method中，所以，可以简写
		int sum3 = getSum(3, 6);
		// 打印变量sum3
		System.out.println(sum3);
		
	}
	
}
