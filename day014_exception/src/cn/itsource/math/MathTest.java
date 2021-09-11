package cn.itsource.math;

/**
 *	. 数学相关类Math/BigInteger/BigDecimal	（掌握BigDecimal）	
	4.1 Math:数学工具类，有很多数学相关运算的方法。【以后用到直接查百度，现在不要浪费太多时间】
		如基本指数，对数，平方根和三角函数。 
		直接调用该类中的常量和方法即可
		
 		类名.常量名：
 				static double E 
				static double PI  
 		//调用常量：类名.常量名
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//调用方法：
		//调用方法（都是static修饰的）
		//static double abs(double a)返回值为 double绝对值。  
		//static double ceil(double a)  天花板，向上取整
		System.out.println(Math.ceil(3.14));//4.0
		
		//static double floor(double a)  地板，向下取整
		System.out.println(Math.floor(3.14));//3.0
		
		//static long/int round(double a)  四舍五入
		System.out.println(Math.round(3.45));//4
		
		//static double max(double a, double b)返回两个 double值中的较大值。  
		//static double min(double a, double b)返回两个 double值中的较小值。  	
 */
public class MathTest {

	public static void main(String[] args) {
		/*
		 * Math中常量：	调用常量：类名.常量名
		 * 类名.常量名：
 				static double E 
				static double PI  
		 */
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		// 调用方法：调用方法（都是static修饰的）
		// 1. static double abs(double a) 返回值为 double绝对值。  
		// 2. static double ceil(double a)  天花板，向上取整
		double ceil = Math.ceil(3.1);// 4.0
		System.out.println(ceil);
		
		// 3. static double floor(double a)  地板，向下取整
		double floor = Math.floor(3.9);// 3.0
		System.out.println(floor);
		
		// 4. static long/int round(double a)  四舍五入
		long round = Math.round(3.59);// 4.0
		System.out.println(round);
		
		// 5. static double max(double a, double b)返回两个 double值中的较大值。  
		// 6. static double min(double a, double b)返回两个 double值中的较小值。

	}

}
