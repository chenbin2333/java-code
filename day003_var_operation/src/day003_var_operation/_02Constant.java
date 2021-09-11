package day003_var_operation;

/**
 *	常量：constant（掌握）字面量
	就是固定不变的值
		整数类型：
		小数类型：
		布尔类型：boolean
		字符类型：char	用 ''表示，只能写一个字符
		字符串类型：String	字符串常量 用""表示，在""中随便写几个字符串	java中\有转义功能，一个是表示转义，两个\\才能显示\
				  
 */
public class _02Constant {

	public static void main(String[] args) {
		System.out.println(1);// 1是整数常量
		System.out.println(3.14);// 3.14是小数常量
		System.out.println(true);// true是布尔常量
		System.out.println('a');// 'a'是字符常量
		System.out.println('干');// '干'是字符常量
		System.out.println("abc");// "abc"字符串常量
		// 字符中特殊符号: \r 换行  \n 回车 \t 一般是指4个空格
		System.out.println("abc\r12\n3456\t7\r\n8");// "abc"字符串常量
	}

}
