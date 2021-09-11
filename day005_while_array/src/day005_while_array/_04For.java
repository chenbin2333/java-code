package day005_while_array;

/**
 *	1.3 for循环，可以简单的认为就是while循环的简写	（重点）
			for(1.初始化条件语句; 2.条件判断语句;	4. 循环控制语句){
				3. 循环体
			}
			
			执行流程：（重点）
				第1次：1. 初始化条件语句 => 2.条件判断语句 => 3. 循环体 => 4. 循环控制语句
		 		第2次：2. 条件判断语句 => 3. 循环体 => 4. 循环控制语句
		  		第3次：2. 条件判断语句 => 3. 循环体 => 4. 循环控制语句
		  		...
 */
public class _04For {

	public static void main(String[] args) {
		// 1.输出 1-10的所有偶数，用for实现
//		for (int i = 1; i < 11; i++) {
//			// 判断i是否是偶数，如果是，则输出
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		// 2.求出 1-10的所有奇数之和
//		int sum = 0;// 声明int变量sum赋值0
//		for (int i = 1; i < 11; i++) {
//			// 判断i是否是奇数，如果是，则求和
//			if (i % 2 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println("奇数和 ：" + sum);
		
		// 基础题考查
//		int i = 0;
//		for( ; i++ < 10; i += 2){
//			System.out.println(++i);
//		}
//		System.out.println("i = " + i);
		// 上面的代码打印的值？
		// 循环了几次？
		// 判断了几次？
		// 最后i的值是多少？
		
		// 3.用for循环计算1-10的 积
//		int product = 1;// 声明一个变量product保存积，赋值1
//		for (int j = 1; j < 11; j++) {
//			product *= j;
//		}
//		System.out.println("积  ：" + product);
		
		// 4.求1-10的 的阶乘和(1!+2!+3!+4!+5!+...)
//		int product = 1;// 声明一个变量product保存积，赋值1
//		int sum = 0;// 声明变量sum保存阶乘和赋值0
//		for (int j = 1; j < 11; j++) {
//			product *= j;// 每次循环，product都是当前j的阶乘
//			sum += product;
//		}
//		System.out.println("阶乘和  ：" + sum);
		
		// 5.输出20以内3的倍数的数字和求出倍数的个数。
		int count = 0;// 声明一个int类型计数器count，赋值0
		for (int i = 1; i < 21; i++) {
			// 判断当前的i是否是3的倍数
			if (i % 3 == 0) {
				System.out.println(i);
				// 计数器+1
				count++;
			}
		}
		System.out.println("个数： " + count);
		
	}

}
