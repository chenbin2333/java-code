package day007_api;

/**
 *	1.4 方法注意事项：【了解】  
		1 方法调用的时候，实参(变量/值) 必须和 形参完全一致
		2 一个类中，只能有一个方法签名
		3 返回值类型是void，不能用变量接受，不能放在打印语句中
		4 返回值不是void，必须return一个数据，并且数据类型和返回值类型完全一致
		5 return的数据，如果在if或者循环语句中，必须保证在条件语句和循环语句不成立的情况下，也有数据的返回
		
 */
public class _04Method {

	public static void main(String[] args) {
		// 3 返回值类型是void，不能用变量接受，不能放在打印语句中
//		String str = test();// 返回值类型是void
//		System.out.println(test());
	}
	
	/**
	 * 5 return的数据，如果在if或者循环语句中，必须保证在条件语句和循环语句不成立的情况下，也有数据的返回
	 */
	public static int getIndexOfArray(int[] arr, int a) {
		if (a > 1) {
			return a;
		} 
		return 1;
	}
	
	public static void test() {
		System.out.println("测试");
		return;
	}
	
	public static int test2() {
		return 1;
//		return 1L;// 返回的值数据类型和返回值类型完全一致
	}
	
}
