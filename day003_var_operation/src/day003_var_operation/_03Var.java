package day003_var_operation;

/**
 * 变量的分类：(掌握)
	1. 局部变量：
		1. 概念：就是声明位置在方法（()内参数，{}中）中，代码块{}   都是局部变量
		2. 作用：为了辅助完成一个方法的功能（后面讲，先不管）
		3. 特点：
			1. 作用域范围： 声明位置下方，到}结束，都可以使用局部变量
			2. 局部变量，使用之前，必须有值
		
	2. 成员变量：
		1. 概念：直接声明在类中   都是成员变量
		2. 作用：用来解释这个类中的属性（面向对象重点讲，先不管）
		3. 特点：
			1. 作用域范围： 在整个类中都可以使用
			2. 成员变量，使用之前，如果没有值，则系统会分配一个默认值。
				不同的数据类型默认值不同。
					整数类型默认值：0
					小数类型默认值：0.0
					布尔类型默认值：false
					字符类型默认值：空字符
					
					引用类型默认值：null	
 */
public class _03Var {
	/** 声明一个int类型的 非static成员变量b，不赋值 */
	int b;
	
	/** 声明一个int类型 非static的成员变量c，赋值2 */
	int c = 2;
	
	/** 声明一个int类型 static的成员变量f,不赋值 */
	static int f;
	
	/** 声明一个char类型 static的成员变量ch,不赋值 */
	static char ch;
	
	/** 声明一个String类型 static的成员变量str,不赋值 */
	static String str;
	
	/**
	 * main方法有static修饰，表示静态的。在Java中static修饰的区域是静态区。【面向对象重点讲】
	 * 静态区，只能使用静态成员变量【有static修饰的成员变量】，不能使用非静态成员变量。【没有static修饰的成员变量】
	 */
	public static void main(String[] args) {// args是局部变量
		// 1. 声明一个int类型局部变量a，赋值1
		int a = 1;// 作用域范围：声明位置下方，到 } 结束
		// 2. 变量取值，这里直接打印输出a
		System.out.println(a);
	
		// 1. 声明一个int类型局部变量d，不赋值
		int d;
//		System.out.println(d);// 局部变量使用前必须有值，否则语法报错。
		
		// 在main方法中，使用成员变量 b
//		System.out.println(b);// 报错 不能在静态区域使用非静态成员变量b
		
		// 在main方法中，使用 静态成员变量 f
		System.out.println(f);// 0
		
		// 在main方法中，使用 char类型 静态成员变量 ch
		System.out.println(ch);// 空字符
		
		// 在main方法中，使用 String类型 静态成员变量 str
		System.out.println(str);// null
		
	}

}
