package day005_while_array;

/**
 * 循环练习题
 */
public class _02While {

	public static void main(String[] args) {
		// 1.输出 1-10的所有的数 用while和do while分别实现
//		int num = 1;// 1.初始化条件语句
//		while (num <= 10) {// 2. 条件判断
//			System.out.println(num);// 3.循环体
//			num++;// 4.循环控制
//		}
		
//		int num2 = 1;// 1.初始化条件语句
//		do {
//			System.out.println(num2);// 3.循环体
//			num2++;// 4.循环控制
//		} while (num2 <= 10);// 2. 条件判断
		
		// 2.输出 1-10的所有偶数，用while和do while分别实现
//		int num3 = 1;// 1.初始化条件语句
//		while (num3 <= 10) {// 2. 条件判断
//			// 判断当前数字num3是否为偶数
//			if (num3 % 2 == 0) {
//				// 满足条件就打印
//				System.out.println(num3);// 3.循环体
//			}
//			num3++;// 4.循环控制
//		}
		
//		int num4 = 1;// 1.初始化条件语句
//		do {
//			// 判断当前数字num3是否为偶数
//			if (num4 % 2 == 0) {
//				// 满足条件就打印
//				System.out.println(num4);// 3.循环体
//			}
//			num4++;// 4.循环控制
//		} while (num4 <= 10);// 2. 条件判断
		
		// 3.求出 1-10的所有数之和
//		int num5 = 1;// 1.初始化条件语句
//		int sum = 0;// 声明一个int类型变量sum赋值0。保持所有数字的和。
//		while (num5 <= 10) {// 2. 条件判断
//			// sum += num5;相当于 sum = (int)(sum + num5);
//			sum += num5;// 3.循环体
//			num5++;// 4.循环控制
//		}
//		System.out.println("和 : " + sum);
		
//		int num6 = 1;// 1.初始化条件语句
//		int sum = 0;// 声明一个int类型变量sum赋值0。保持所有数字的和。
//		do {// 2. 条件判断
//			// sum += num6;相当于 sum = (int)(sum + num6);
//			sum += num6;// 3.循环体
//			num6++;// 4.循环控制
//		} while (num6 <= 10);
//		System.out.println("和 : " + sum);
		
		// 4.求出 1-10的所有奇数之和
//		int num7 = 1;// 1.初始化条件语句
//		int sum = 0;// 声明一个int类型变量sum赋值0。保持所有数字的和。
//		while (num7 <= 10) {// 2. 条件判断
//			// 判断当前数字num7是否是奇数，!= 0
//			if (num7 % 2 != 0) {
//				// sum += num7;相当于 sum = (int)(sum + num7);
//				sum += num7;// 3.循环体
//			}
//			num7++;// 4.循环控制
//		}
//		System.out.println("奇数和 : " + sum);
		
		int num8 = 1;// 1.初始化条件语句
		int sum = 0;// 声明一个int类型变量sum赋值0。保持所有数字的和。
		do {// 2. 条件判断
			// 判断当前数字num8是否是奇数，!= 0
			if (num8 % 2 != 0) {
				// sum += num8;相当于 sum = (int)(sum + num8);
				sum += num8;// 3.循环体
			}
			num8++;// 4.循环控制
		} while (num8 <= 10);
		System.out.println("奇数和 : " + sum);
		
		// 加强1：循环计算1-10的 积
		// 加强2：求1-10的 的阶乘和(1!+2!+3!+4!+5!+...)
	}

}
