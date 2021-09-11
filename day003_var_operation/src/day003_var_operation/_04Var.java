package day003_var_operation;

/**
	3. 就近原则：（理解）
	局部变量和成员变量名字可以相同，因为存放内存区域不同。
	
	局部变量	在内存的栈中
	static修饰的成员变量在 静态区
	非static修饰的成员变量在 堆
	
	当使用一个变量的时候，优先从局部变量中查找，如果找不到，才从类中找成员变量。这就是就近原则	
 */
public class _04Var {
	/** 声明一个int类型 static的成员变量a,赋值2 */
	static int a = 2;
	
	public static void main(String[] args) {// args是局部变量
		// 1. 声明一个int类型局部变量a，赋值1
		int a = 1;// 作用域范围：声明位置下方，到 } 结束
		// 2. 变量取值，这里直接打印输出a
		System.out.println("a = " + a);// a = 1，使用变量的时候，因为就近原则，会优先从局部范围找，如果找不到才从成员变量找。
		
	}

}
