package day006_array_method;

/**
 *	4. 数组注意事项：
		4.1 数组的下标范围是[0, arr.length-1],超过下标范围会报错
			ArrayIndexOutOfBoundsException 数组下标越界异常
		
		4.2 数组动态创建可以分为两步：
			1. int[] arr;//只是声明一个int类型的数组，还没有创建（即，还没有分配内存空间）
			2. arr = new int[长度];//分配内存空间，动态创建数组
			
		4.3 数组静态创建可以分为两步：
			1. int[] arr;//只是声明一个int类型的数组，还没有创建（即，还没有分配内存空间）
			2. arr = new int[]{1,2,43};//分配内存空间，动态创建数组
			不能直接这样写：
				arr = {1,2,43};//语法错误
		
		4.4 数组一旦创建，长度就固定不变了。
			如果长度不够或者长度多了，就需要创建新数组，将原来数组中元素复制到新数组中。	
			 int[] arr = {1,2,43};
			 arr = new int[]{1,43};//开辟新的内存区域，重新创建新的数组
			
		4.5 数组是引用数据类型,直接打印数组名是打印的地址
		4.6 动态创建，没有给数组元素赋值，则系统会分配默认值
			（byte/short/int/long）整数类型默认值：0
			(float、double)小数类型默认值：0.0
			boolean类型:false
			char类型默认值：空字符
		
		4.7 空指针异常：NullPointerException
			产生原因：当试图去堆中找数据的时候，而这时候堆中又没有数据，则会发生该错误
			
		4.8 数组声明可以这样，但是不建议
			int arr[] = new int[2];// []在数组名后，不建议
 */
public class _05Array {
	/** 声明静态成员变量arr5，不赋值 */
	static int[] arr5;// 默认值：null
	static String str;// 默认值：null
	
	public static void main(String[] args) {
		// 4.2 数组动态创建可以分为两步：
		int[] arr;// 声明数组，在栈中创建，堆中没有创建
		arr = new int[2];// 在堆中创建2个长度的数组，赋值给arr保存
		
		// 4.3 数组静态创建可以分为两步：
		int[] arr2;
//		arr2 = {1, 2};语法报错
		arr2 = new int[]{1, 2};// 语法报错
		
		/*
		 * 4.4 数组一旦创建，长度就固定不变了。
			如果长度不够或者长度多了，就需要创建新数组，将原来数组中元素复制到新数组中。	
		 */
		
		String[] strs = new String[2];
		System.out.println(strs[0]);// null
		System.out.println(strs[1]);// null
		
		// 4.8 数组声明可以这样，但是不建议
		int arr3[] = new int[2];
		
		System.out.println("成员变量arr5：" + arr5);
		// 	NullPointerException空指针异常
		System.out.println(arr5[0]);// 去堆中找数组arr5的第一个元素，堆中没有，因为没有创建数组。
		
		int[] arr6 = arr3;// 可以将另外一个数组arr3地址赋值给新创建的数组arr6
		
	}

}
