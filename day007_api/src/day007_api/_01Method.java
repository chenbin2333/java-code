package day007_api;

/**
 *	方法加强练习
 */
public class _01Method {

	public static void main(String[] args) {
		// 1. 设计一个方法，返回一个字符在字符数组中出现的次数(中级)
		char[] c = {'a','f','j','j','a','e','g'};
		// 调用下面方法getCountOfArray(char c, char[] arr);
		int countOfArray = getCountOfArray('a', c);
		System.out.println("个数：" + countOfArray);
		
		// 2.设计一个方法，查询并返回一个字符在字符数组中第一次出现的位置
		int indexOfArray = getIndexOfArray('z', c);
		System.out.println("第一次下标：" + indexOfArray);
		
		// 3.设计一个方法，传入一个int数组，翻转该数组中的元素，并且返回反转后的数组(牛皮做)
		int[] arr = {1, 9, 96, 9, 6, 66};
		int[] reverse = reverse(arr);
		for (int i : reverse) {
			System.out.println(i);
		}
		
		/*
		 * 4.需求：请设计一个方法toString，传入一个int[]，将该数组进行字符串拼接，
		 *  	格式如下：[元素1, 元素2, 元素3....]，返回拼接后的字符串
		 */
		System.out.println(arr);// [I@15db9742地址，没有意义。
		// 为了查看数组中元素，所以遍历数组。冗余
		
	}
	
	/**
	 * 3.设计一个方法，传入一个int数组，翻转该数组中的元素，并且返回反转后的数组(牛皮做)
	 * 思路：
	 * 	画图，找交换元素的下标和循环次数的关系
	 * @return
	 */
	public static int[] reverse(int[] arr) {
		// 必须用普通for循环进行遍历，因为需要根据下标交换元素
		for (int i = 0; i < arr.length / 2; i++) {
			// 通过画图得知，交换的元素下标关系：i <=> arr.length - 1 - i
			int temp = arr[i];// 将当前元素赋值给临时变量temp
			arr[i] = arr[arr.length - 1 - i];// 将交换的后面元素赋值给当前元素arr[i]
			arr[arr.length - 1 - i] = temp;// 将临时变量赋值给后面的元素
		}
		return arr;
	}
	
	/**
	 * 2.设计一个方法，查询并返回一个字符在字符数组中第一次出现的位置
	 * 
	 * 根据需求分析方法的四要素：
			1. 返回值类型：int
			2. 方法名：getIndexOfArray
			3. 形参列表：char c, char[] arr
			4. 方法体：普通for循环遍历arr数组，判断当前元素跟参数c是否相等，如果是则返回下标i
				但是有可能存在一种情况，当前数组arr中没有这个字符c，返回负数。
				因为数组下标是：>= 0 
	 * @return
	 */
	public static int getIndexOfArray(char c, char[] arr) {
		// 普通for循环遍历arr数组
		for (int i = 0; i < arr.length; i++) {
			// 判断当前元素跟参数c是否相等
			if (arr[i] == c) {
				return i;// 如果是则返回下标i
			}
		}
		// 循环结束后，才能确定没找到参数c，返回负数
		return -1;// 【只要是负数都可以】
	}
	
	
	/**
	 * 1. 设计一个方法，返回一个字符在字符数组中出现的次数(中级)
	 *  根据需求分析方法的四要素：
			1. 返回值类型：int
			2. 方法名：getCountOfArray
			3. 形参列表：char c, char[] arr
			4. 方法体：
			
	 * @return
	 */
	public static int getCountOfArray(char c, char[] arr) {
		// 声明一个int类型count，计数器赋值0
		int count = 0;
		// foreach遍历arr
		for (char e : arr) {
			// 判断当前元素e跟参数c字符是否相等，如果是，则计算器+1
			if (e == c) {
				count++;
			}
		}
//		System.out.println(count);
		return count;
	}
}
