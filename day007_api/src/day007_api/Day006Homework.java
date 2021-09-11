package day007_api;

/**
 * 方法练习题
 	1 方法的声明（定义）：（最重要）
		1.1. 复制main方法到当前类中，跟main方法平级的地方
		1.2. 根据需求分析方法的四要素：
				1. 返回值类型：
				2. 方法名：
				3. 形参列表：
				4. 方法体：
		1.3. 根据实际需求，修改方法的四要素
		
	2 方法的调用：（最重要）
			看要调用方法是否有static修饰：
				2.1 有static修饰，用：当前类名.方法名(实参(变量/值)); 
				2.2 没有static修饰，用：当前类的对象名.方法名(实参(变量/值)); // 面向对象才用，这几天都不用
				
				特殊情况：
					如果调用方（目前就是指main方法）和被调用方都在同一个类中，且都有或者都没有static修饰，可以简写为：
					方法名(实参(变量/值));		
					
				注意：调用方法的时候，传入的参数数量、数据类型、顺序必须和 声明方法的一致
 */
public class Day006Homework {

	public static void main(String[] args) {
		// 1. 定义一个方法getMax，接收两个int参数，返回较大的一个数。
		/*
		 * 2 方法的调用：（最重要）
			看要调用方法是否有static修饰：
				2.1 有static修饰，用：当前类名.方法名(实参(变量/值)); 
		 */
		int max = Day006Homework.getMax(1, 2);// 因为getMax有static修饰，所以用类名调用。因为有int类型返回值，所以用int变量接收结果。
		System.out.println(max);
		
		int a = 3;
		int b = 5;
		int c = 69;
		// 当方法getMax和main方法都在同一个类中，且都有static修饰，可以直接简写为：getMax(实参);
		int max2 = getMax(a, b);
		System.out.println(max2);
		
		// 请获取a/b/c中最大的值
		// getMax方法可以求出2个int值的最大值，我们现在只需要将这个最大值跟c再求最大值
		int max3 = getMax(max2, c);
		System.out.println("最大值：" + max3);
		
		// 2. 定义一个方法getMin，接受三个int参数，返回最小的一个数。
		// 3. 设计一个求3个int类型积的方法,并返回这个积。
		// 4. 设计一个方法，传入一个int的数组，返回该数组中最大的值(高级-选做)
		int[] arr = {11, 2, 13, 64, 69, 9};// 
		int maxOfArray = getMaxOfArray(arr);
		System.out.println("数组中最大值：" + maxOfArray);
		
		// 5. 求出数组arr中的最大和最小值【数组自己定义一个】
		// 定义一个临时变量max4，赋值数组第一个元素arr[0]
		int max4 = arr[0];
		// 定义一个临时变量min，赋值数组第一个元素arr[0]
		int min = arr[0];
		// 增强for遍历
		for (int e : arr) {
			// 如果e > max4，重新给max赋值为e
			if (e > max4) {
				max4 = e;
			}
			// 如果e < min，重新给min赋值为e
			if (e < min) {
				min = e;
			}
		}
		System.out.println("最大值： " + max4 + "   最小值： " + min);
		
		// 6. 请打印出int[] arr = {1, 9, 96, 9, 6, 66}; 数组中最小的一个数。
		
		// 7. 请将int[] arr = {1, 9, 96, 9, 6, 66}; 数组中所有的元素乘积打印出来。
		// 8. 统计一个字符'a'在字符数组char[] c = {'a', 'f', 'j', 'j', 'a', 'e', 'g'};中出现的次数。
		char[] ch = {'a', 'f', 'j', 'j', 'a', 'e', 'g'};
		// 声明一个int类型count，计数器赋值0
		int count = 0;
		// foreach遍历
		for (char e : ch) {
			// 判断当前元素e跟'a'字符是否相等，如果是，则计算器+1
			if (e == 'a') {
				count++;
			}
		}
		// 打印计算器
		System.out.println(count);
		
	}
	
	/**
	 * 4. 设计一个方法，传入一个int的数组，返回该数组中最大的值(高级-选做)
	 * 
	 * 	1.1. 复制main方法到当前类中，跟main方法平级的地方
		1.2. 根据需求分析方法的四要素：
				1. 返回值类型：int
				2. 方法名：getMaxOfArray
				3. 形参列表：int[] arr
				4. 方法体：
		 			思路：循环遍历数组arr，将每一个元素取出来，比较大小，将大的装到临时变量max中。
						最后，循环结束后，最大值就找到了，并且返回即可
		1.3. 根据实际需求，修改方法的四要素
	 * @return
	 */
	public static int getMaxOfArray(int[] arr) {
		// 定义一个临时变量max，赋值数组第一个元素arr[0]
		int max = arr[0];
		// 增强for遍历
		for (int e : arr) {
			// 如果e > max，重新给max赋值为e
			if (e > max) {
				max = e;
			}
		}
		// 将最大值max返回
		return max;
	}
	
	
	/**
	 * 生成方法快捷键：public alt + / 选择第三个
	 * 1. 定义一个方法getMax，接收两个int参数，返回较大的一个数。
	 * 
	 * 	1. 复制main方法到当前类中，跟main方法平级的地方
		2. 根据需求分析方法的四要素：
				1. 返回值类型：int
				2. 方法名：getMax
				3. 形参列表：int a, int b
				4. 方法体：比较a和b大小，返回大的那个
		3. 根据实际需求，修改方法的四要素
	 */
	public static int getMax(int a, int b) {
		// 比较a和b大小，返回大的那个
//		if (a > b) {// 如果a>b则返回a
//			return a;
//		} else {// else表示b > a 则返回b
//			return b;
//		}
		// 用三目运算
		return a > b ? a : b;
	}
	
}
