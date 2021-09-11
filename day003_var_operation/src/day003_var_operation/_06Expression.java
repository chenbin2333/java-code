package day003_var_operation;

/**
 *	5. 表达式：（掌握）		
	1. 概念：就是一个算术式。 例如： 1 + 1 + 2 * 3
	2. 规律：
			1.当表达式中所有的变量类型小于 int的时候，运算后的结果都会自动提升为int类型
			2.当表达式中有变量类型大于 int的时候，运算后的结果以表达式中精度最高的为主
 */
public class _06Expression {

	public static void main(String[] args) {
		byte b = 1;// 声明一个byte类型变量b赋值1
		short s = 2;// 声明一个short类型变量s赋值2
		int i = 3;// 声明一个int类型变量i赋值3
		long lon = 6;// 声明一个long类型变量lon赋值6
		float f = 9.0f;// 声明一个float类型变量f赋值9.0f
		double doub = 69.0;// 声明一个double类型变量doub赋值69.0
		
		// 需求1：求上面所有变量的和
		// 2.当表达式中有变量类型大于 int的时候，运算后的结果以表达式中精度最高的为主
		double sum = b + s + i + lon + f + doub;
		
		// 需求2：求b 和 s的和
		// 1.当表达式中所有的变量类型小于 int的时候，运算后的结果都会自动提升为int类型
		int sum2 = b + s;
		
		// 练习
		byte b2 = 2;
		int sum3 = b2 + 1;// 结果是int类型，因为参与运算的类型最大是int。
	}

}
