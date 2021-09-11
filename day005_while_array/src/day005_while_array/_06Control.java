package day005_while_array;

/**
 *	1.6 循环控制语句：（掌握）
		1. break 破坏，表示结束当前层循环	（锚点的自己扩展，几乎不用）
		2. continue 继续，表示跳过当前次循环，继续下一次循环
		3. return 返回，表示结束的当前方法
	在以上三个控制语句后，不能紧跟任何代码，因为永远执行不到
 */
public class _06Control {

	public static void main(String[] args) {
		// 需求1：请打印前7个1-200中6的倍数
//		int count = 0;// 声明一个int类型变量count赋值0。计数个数
//		for (int i = 1; i < 201; i++) {
//			// 判断当前i是否是6的倍数，如果是则计数器count+1
//			if (i % 6 == 0) {
//				// 打印6的倍数
//				System.out.println(i);
//				count++;// 计数器+1
//				// 然后判断当前计数器count是否 == 7，如果是则结束循环
//				if (count == 7) {
//					break;// break结束循环
//				}
//			}
//		}
		
		// 需求2：求1—100之间不是3的倍数 数字之和大于(或等于)100的第一个数字 continue|
		// 先不用continue实现【实现方式一】
//		int sum = 0;// 声明变量sum赋值0
//		for (int i = 1; i < 101; i++) {
//			// 判断当前i是否是3的倍数，如果不是则累加到sum中
//			if (i % 3 != 0) {
//				sum += i;
//			}
//			// 判断当前sum是否已经>=100了
//			if (sum >= 100) {
//				// 打印>=100的时候的i
//				System.out.println("第一个数字：" + i);
//				// 打印>=100的时候和sum
//				System.out.println("和： " + sum);
//				break;// 结束循环
//			}
//		}
		
		// 【实现方式二】使用continue关键字
//		int sum2 = 0;// 声明变量sum赋值0
//		for (int i = 1; i < 101; i++) {
//			// 判断当前i是否是3的倍数，如果是 则跳过这次循环
//			if (i % 3 == 0) {
//				continue;// 跳过这一次循环
//			}
//			// 只要是执行到sum2 += i,就表示 i不是3的倍数了
//			sum2 += i;
//			// 判断当前sum是否已经>=100了
//			if (sum2 >= 100) {
//				// 打印>=100的时候的i
//				System.out.println("第一个数字：" + i);
//				// 打印>=100的时候和sum
//				System.out.println("和： " + sum2);
//				break;// 结束循环
//			}
//		}
		
		// return，表示结束当前main方法，后面代码不会执行
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			if (i == 5) {
//				return;// 表示在i是5的时候，结束main方法
//				break;// 表示在i是5的时候，结束循环。
				continue;// 表示在i是5的时候，
//				System.out.println();// 在3个关键字后不能紧跟任何代码
			}
			System.out.println("continue、break/return如果满足条件，这句话不会输出");
		}
		System.out.println("循环后代码");
		
	}

}
