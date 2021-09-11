package day004_operation_if;

/**
 *	3. 三目(三元)运算(Binocular Operation)：表示如果x为true，执行y，否则，执行z
		语法： x ? y : z;
		x:是boolean类型值或者boolean表达式。
		y、z:可以是表达式，也可以是值或者变量
		
		如果要接收三目运算的结果，必须要求y和z的类型完全一致
		三目运算可以嵌套使用
		
		例如：
			求两个数中的最大值或者最小值
			int a = 1;
			int b = 2;
			int max = a > b ? a : b;
			
			嵌套使用：(看不懂就用单层的)
			int a = 1;
			int b = 2;
			int c = 3;
			int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
 */
public class _03BinocularOperation {

	public static void main(String[] args) {
		// 声明2个int变量a/b
		int a = 1;
		int b = 2;
		// 需求：如果a > b，则输出值："我请你们吃大餐！" ,否则，"你们请我吃帝王蟹！"
		/*
		 * 语法： x ? y : z;
			x:是boolean类型值或者boolean表达式。
			y、z:可以是表达式，也可以是值或者变量
		 */
		System.out.println(a > b ? "我请你们吃大餐！" : "你们请我吃帝王蟹！");
		
		// 需求2：找出a和b中最大的变量
		int max = a > b ? a : b;
		System.out.println("最大值： " + max);
		
		// 声明3个int变量赋值
		int i = 1;
		int j = 2;
		int k = 3;
		// 需求3：找出i/j/k中最大值
		/*
		 * 1. 先比较i和j，找出最大的
		 * 2. 再比较最大值和k谁大
		 */
		int max2 = i > j ? i : j;// 1. 先比较i和j，找出最大的
		max2 = max2 > k ? max2 : k;
		System.out.println("3个的最大值：" + max2);
		
		// 三目运算还可以嵌套使用【听不懂就算了】
		int max3 = i > j ? (i > k ? i : k) : (j > k ? j : k);
		System.out.println("3个的最大值：" + max3);
	}

}
