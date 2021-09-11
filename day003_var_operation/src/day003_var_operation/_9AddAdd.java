package day003_var_operation;

/**
 *	++: 自增（重重点）一般用在循环结构中
		练习题
 */
public class _9AddAdd {

	public static void main(String[] args) {
		// 声明一个int类型变量a，赋值1
		int a = 1;
		int b = 2;
		
		// a++: 先赋值再自增	++a:先自增再赋值
//		int c = a++ + ++a + b--;
//		int d = c++ + c-- + a++ + ++b;
		// a = ? b = ? c = ? d = ?
//		System.out.println("a = " + a);// a = 4
//		System.out.println("b = " + b);// b = 2
//		System.out.println("c = " + c);// c = 6
//		System.out.println("d = " + d);// d = 18
		
		a = a + b;
		b = a - b;// a + b - b => b = a;
		a = a - b;// a + b - a => a = b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}

}
