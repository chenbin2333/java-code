package day005_while_array;

/**
 *	1.7 双层for循环，其实，本质外层循环的循环体  是另外一个循环而已	(了解)
			for(1.初始化条件;	2.条件判断;	3. 循环控制语句){
				4. for(5.初始化条件;	6.条件判断;	7. 循环控制语句){
					8. 循环体
				}
			}
			
			执行流程：
				自己画图去研究
			
			总结的规律：（当成是轮子，可以直接使用）
				外层循环执行一次，内层循环执行所有次
				外层循环负责行数，内层负责每一行中列数
				尽量减少嵌套层级
					
			双层for练习
				1.打印九九乘法表	
		
	最核心的是掌握循环的流程（看笔记+画图）
 */
public class _07ForFor {

	public static void main(String[] args) {
		/*
		 * 需求：请打印如下图案：5 * 5 的星星
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 * 	*****
		 */
//		for (int i = 1; i < 6; i++) {
//			System.out.println("*****");
//		}
		
		// 需求2：每次只能打印一颗星星
		/*// 打印第一行，循环次数 控制的是每一行中列数。
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		// 直接写打印语句就是换行
		System.out.println();
		
		// 打印第二行，循环次数 控制的是每一行中列数。
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		// 直接写打印语句就是换行
		System.out.println();
		
		// 打印第三行，循环次数 控制的是每一行中列数。
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		// 直接写打印语句就是换行
		System.out.println();
		
		// 打印第四行，循环次数 控制的是每一行中列数。
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		// 直接写打印语句就是换行
		System.out.println();
		
		// 打印第五行，循环次数 控制的是每一行中列数。
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		// 直接写打印语句就是换行
		System.out.println();
		优化代码，用双层for循环
		*/
		// 外层循环控制总行数
		for (int j = 1; j <= 5; j++) {
			// 打印一行*****，循环次数 控制的是每一行中列数。
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			// 直接写打印语句就是换行
			System.out.println();
		}
		
	}

}
