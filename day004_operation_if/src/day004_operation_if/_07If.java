package day004_operation_if;

/**
 * 1.6. 选择结构注意事项：（了解）
		1. 选择结构是从上到下开始匹配，一旦匹配上一个条件后，整个条件语句就结束了，
			哪怕后面也能匹配上条件也不会执行了
			
		2. if 和 if else 语句，后面可以不写{},但是不建议
			因为不写{} ,只能控制一行代码
			
		3. if(){} else if(){}后可以不写 else，一般根据业务需求决定
 */
public class _07If {

	public static void main(String[] args) {
		/*
		 * 1. 选择结构是从上到下开始匹配，一旦匹配上一个条件后，整个条件语句就结束了，
			哪怕后面也能匹配上条件也不会执行了 
		 */
//		if (true) {
//			System.out.println("if");
//		} else if(true) {
//			System.out.println("第1个 else if");
//		} else if(true) {
//			System.out.println("第2个 else if");
//		} else if(true) {
//			System.out.println("第3个 else if");
//		}
		
		/*
		 * 2. if 和 if else 语句，后面可以不写{},但是不建议
			因为不写{} ,只能控制一行代码
		 */
		int a = 3;
		int b = 2;
		if (a < b) 
			System.out.println("if");
//		System.out.println("中间代码");// 如果不写{}则，只能控制一句代码，且中间不能加其他代码
		else 
			System.out.println(" else ");
		
		if (a < b) 
			System.out.println("if");
		
		System.out.println("if后代码....");
		
	}

}
