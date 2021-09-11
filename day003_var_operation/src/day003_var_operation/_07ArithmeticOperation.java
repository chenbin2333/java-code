package day003_var_operation;

/**
 * 6.1 算数运算（Arithmetic Operation）（掌握）
		+ ：
			只有String字符串参与的加法运算，才有拼接功能，在String之前，表示加法运算，之后，才表示连接
		-
		*
		/ ： 不能除0
		 	特殊情况：
				1) 10/3 =3； 
				2) 10.0/3=3.33333…
				3) 0/0
				4) 0.0/0.0  
				  	结果是NaN ,任何的NaN都不等于自己（面试题）
				5) 1.0/0.0   结果：Infinity,表示无穷大
		
		%模（取余）：相当于求余数	10%3 表示求余数1
			作用：1. 求余数 	2. 找一个数的倍数
				3. 可以拆分一个多位的数字
 */
public class _07ArithmeticOperation {

	public static void main(String[] args) {
		System.out.println("==================== 除法 / 会舍弃小数位 =====================");
		System.out.println(10 / 1);// 10
		System.out.println(10 / 2);// 5
		System.out.println(10 / 3);// 3
		System.out.println(10 / 4);// 2
		System.out.println(10 / 5);// 2
		System.out.println(10 / 6);// 1
		System.out.println(10 / 7);// 1
		System.out.println(10 / 8);// 1
		System.out.println(10 / 9);// 1
		System.out.println(10 / 10);// 1
		System.out.println(10 / 11);// 0
//		System.out.println(10 / 0);// 分母不能为0，否则会报异常  ArithmeticException 算数异常
		
		System.out.println("==================== 特殊情况 =====================");
		
		/*
		 * 特殊情况：【了解】
				1) 10/3 =3； 
				2) 10.0/3=3.33333…
				3) 0/0
				4) 0.0/0.0  
				  	结果是NaN ,任何的NaN都不等于自己（面试题）not a number不是一个数字
				5) 1.0/0.0   结果：Infinity,表示无穷大
		 */
		System.out.println(10.0 / 3);// 3.33333...
		System.out.println(0.0 / 0.0);// NaN 
		
		System.out.println(1.0 / 0.0);// Infinity表示无穷大
		System.out.println(-1.0 / 0.0);// Infinity表示无穷大
		
		System.out.println("==================== % 模（取余） =====================");
		System.out.println(10 % 1);// 表示求10/1的余数 0
		System.out.println(10 % 2);// 0
		System.out.println(10 % 3);// 1
		System.out.println(10 % 4);// 2
		System.out.println(10 % 5);// 0
		System.out.println(10 % 6);// 4
		System.out.println(10 % 7);// 3
		System.out.println(10 % 8);// 2
		System.out.println(10 % 9);// 1
		System.out.println(10 % 10);// 0
		System.out.println(10 % 11);// 10
//		System.out.println(10 % 0);// 不能模0
		
		// 请求出个十百位的值  / % 
		int a = 127;
		// 求个位 
		System.out.println(a % 10);
		
		// 求十位 ，1. 舍弃个位数  2.再求十位数的值 
		System.out.println(a / 10 % 10);// 
		
		// 求百位 ，直接舍弃十位和个位
		System.out.println(a / 100);
	}

}
