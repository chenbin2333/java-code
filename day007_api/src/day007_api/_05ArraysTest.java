package day007_api;

import java.util.Arrays;

/**
 * 4. API使用(重点)减少程序员工作量，提高开发效率的。
	Arrays工具类【所有方法都是static方法】，是用来操作数组的
		如果，你们的eclipse工具不能自动引入Arrays类，则：ctrl + shift + o【字母】
	
 *		1. public static String toString(int[] arr)拼接数组中元素，格式：[值1,值2...]
 *
		2. public static void sort(int[] arr)将数组中的元素排序，默认升序。从小到大
			public static void sort(int[] arr, int start, int end)将数组中的元素排序，默认升序。从小到大
			将数组arr中从下标start开始到 end结束指定范围内的元素升序排序
			
		3. public static int binarySearch(int[] arr,int a)查询变量a在数组arr中第一次出现的下标。
			如果没有找到返回 负数。注意：必须要求数组是排好顺序的（升序和降序都可以）
			
		4. public static int[] copyOf (int[] arr,int newLength)数组的扩容和缩容方法
			扩容：如果newLength大于arr数组中用来的长度，就是扩容，扩容后，arr数组所有的元素都已经复制到新数组中
		 	缩容：如果newLength小于arr数组中用来的长度，就是缩容，缩容后，arr数组从后向前缩
			
		5. static int[] copyOfRange(int[] arr, int from, int to) 
				将指定数组arr的指定下标范围从from到to之间的元素，复制到新数组中。  【含头不含尾】  
			
		6. public static void fill(int[] arr,int a)将数组arr中的元素批量初始化为a
 */
public class _05ArraysTest {

	public static void main(String[] args) {
		int[] arr = {1, 9, 96, 19, 6, 66};
		
		/*
		 * 需求：请设计一个方法toString，传入一个int[]，将该数组进行字符串拼接，
		 *  	格式如下：[元素1, 元素2, 元素3....]，返回拼接后的字符串
		 */
		System.out.println(arr);// [I@15db9742地址，没有意义。
		
		// 1. public static String toString(int[] arr)拼接数组中元素，格式：[值1,值2...]
		// 调用Arrays类中的 toString方法，因为有static修饰，且返回值是String类型，所以，用Arrays类名调用，用String变量接收
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		// 2. public static void sort(int[] arr)将数组arr中的元素排序，默认升序。从小到大
		Arrays.sort(arr);// 没有返回值
		// 排好序后，需要重新看效果。必须重新将arr转换为字符串，打印字符串
		String str2 = Arrays.toString(arr);
		System.out.println(str2);
		
		/*
		 * 3. public static int binarySearch(int[] arr, int a)查询变量a在数组arr中 出现的下标。
			如果没有找到返回 负数。注意：1. 必须要求数组是排好顺序的（升序和降序都可以）2. 尽可能数组是不重复的元素 
		 */
		// 拍好顺序的数组：[1, 6, 9, 19, 66, 96]，一次从前向后查询的过程叫做 ：线性查找
		int binarySearch = Arrays.binarySearch(arr, 19);// 二分查询数组arr中元素 19 出现的下标
		// [1, 19, 19, 19, 19, 19] // 19
		System.out.println(binarySearch);// 3
		
		// 4. public static void fill(int[] arr, int a)将数组arr中的元素批量初始化为a
		Arrays.fill(arr, 69);
		// 必须重新将arr转换为字符串，打印字符串
		String str3 = Arrays.toString(arr);
		System.out.println(str3);
		
	}

}
