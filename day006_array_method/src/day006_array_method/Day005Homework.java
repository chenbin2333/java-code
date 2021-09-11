package day006_array_method;

public class Day005Homework {

	public static void main(String[] args) {
		// 8.用for循环吧1-20中的数反向打印20 19 18 ..... 1
		/*
		 * for(1.初始化条件; 2.条件判断; 3.循环控制) {
		 * 		4. 循环体
		 * }
		 * 第1次：1 => 2 => 4 => 3
		 * 第2次：2 => 4 => 3
		 * 第3次：2 => 4 => 3
		 * ...
		 * 最后一次：2
		 */
//		for (int i = 20; i > 0; i--) {
//			System.out.println(i);
//		}
		
		
		// 9. 用continue和循环，输出1~50中所有不是4倍数的数字
//		for (int i = 1; i < 51; i++) {
//			if (i % 4 != 0) {
//				System.out.println(i);
//			}
//		}
		
		for (int i = 1; i < 51; i++) {
			if (i % 4 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
