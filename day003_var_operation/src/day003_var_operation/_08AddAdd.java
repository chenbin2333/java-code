package day003_var_operation;

/**
 *		++: 自增（重重点）
			1. 只能作用于一个变量，不能是常量
			2. 变量在前
				a++: 先赋值，再自增
					运算步骤：
						step1：先将a的值赋值给  a++ 这个整体
						step2：再将a的值+1
				
			3. 变量在后
				++a:先自增，再赋值
					运算步骤：
						step1：先将a的值+1
						step2：再将a的值赋值给  a++ 这个整体
				
		--: 自减（规律同自增完全相同）（重重点）
 */
public class _08AddAdd {

	public static void main(String[] args) {
		// 1. 只能作用于一个变量，不能是常量
//		System.out.println(1++);// 报错
//		System.out.println(++1);// 报错
		
		/*
		 * 2. 变量在前
			a++: 先赋值，再自增
				运算步骤：
					step1：先将a的值赋值给  a++ 这个整体
					step2：再将a的值+1
		 */
		int a = 1;// 声明一个int类型变量a赋值1
		int b = a++;// 声明一个int类型变量，保存a++的值【++在后值不变】
		// 打印b
		System.out.println("b = " + b);// b = 1
		System.out.println("a = " + a);// a = 2
		
		/*
		 * 3. 变量在后
			++j:先自增，再赋值
				运算步骤：
					step1：先将j的值+1
					step2：再将j的值赋值给  j++ 这个整体
		 */
		int i = 1;
		int j = ++i;// ++在前值+1
		// 打印b
		System.out.println("i = " + i);// i = 2
		System.out.println("j = " + j);// j = 2
		
	}

}
