package day005_while_array;

/**
 *	1.4 循环注意事项测试：（了解）
			1. while(false){}语法错误
			2. 死循环后面不能紧跟任何代码
				while(true){}
				for(){}
			
			3. while(条件判断);可以不写循环体
			4. for循环
				4.1 for(){}中的条件都可以拿到外部，且可以不写{}
				4.2 for(){}死循环是第二个条件判断不写，就是死循环
				4.3 for(); 可以不写循环体
 */
public class _05WhileFor {

	public static void main(String[] args) {
		// 1. while(false){}语法错误
//		while (false) {}
		
		// 2. 死循环后面不能紧跟任何代码
//		while (true) { }// 死循环
//		for ( ; ; ) { }// 死循环
//		System.out.println();
		
		// 3. while(条件判断);可以不写循环体
//		while (true);
		
		/*
		 * 4. for循环
				4.1 for(){}中的条件都可以拿到外部，且可以不写{}
				4.2 for(){}死循环是第二个条件判断不写，就是死循环
				4.3 for(); 可以不写循环体
		 */
//		int i = 1;
//		for ( ; i < 11; ) {
//			System.out.println(i);
//			i++;
//		}
		for ( ; ; );
		
	}

}
