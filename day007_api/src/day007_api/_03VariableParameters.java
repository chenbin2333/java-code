package day007_api;

/**
 *	
 *	
 */
public class _03VariableParameters {

	public static void main(String[] args) {
		// 1.求2个int变量的和，设计一个方法实现
//		int sum = getSum(1, 2);// 程序会根据调用方法的实参，自动匹配调用重载的哪一个方法
//		System.out.println(sum);
//		// 2.求3个int变量的和，设计一个方法实现
//		int sum2 = getSum(1, 2, 3);// 程序会根据调用方法的实参，自动匹配调用重载的哪一个方法
//		System.out.println(sum2);
//		// 3.求4个int变量的和，设计一个方法实现
//		int sum3 = getSum(1, 2, 3, 4);// 程序会根据调用方法的实参，自动匹配调用重载的哪一个方法
		
		// 以上情况，都是参数的个数不确定，这样每种参数不同都要写一个方法的方式，非常麻烦，开发效率低下。
		// 求1、2的和，必须得先创建一个int数组，将1、2装进去
		/*int[] arr = {1, 2};
		int sum = getSum(arr);
		System.out.println(sum);
		
		// 求1、2、3的和，必须得先创建一个int数组，将1、2装进去
		int[] arr2 = {1, 2, 3};
		int sum2 = getSum(1, 2, 3);
		System.out.println(sum2);
		这样每次传入不同个数的参数的时候，都要程序员自己创建数组，非常麻烦，所以我们用可变参数优化代码
		*/
		// 调用下面可变参数方法getSum(int... arr)，求1、2的和
		int sum = getSum(1, 2);// 多个参数用逗号隔开
		System.out.println(sum);
		
		int[] arr2 = {1, 2, 3};
		int sum2 = getSum(arr2);// 可变参数也可以直接传入一个数组
		System.out.println(sum2);
	}
	
	/*public static int getSum(int a, int b) {
		return a + b;
	}
	public static int getSum(int a, int b, int c) {
		return a + b + c;
	}
	public static int getSum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	优化参数个数不确定的情况，
	*/
	/*public static int getSum(int[] arr) {
		// 用数组可以解决，因为数组可以装任意多个数据
		int sum = 0;
		// 遍历数组，求和
		for (int e : arr) {
			sum += e;
		}
		return sum;
	}
	用可变参数优化
	*/
	/**
	 * @param arr 是一个可变参数，调用方法getSum的时候，可以传入任意个数的int实参
	 * @return
	 */
	public static int getSum(int... arr) {
		System.out.println("arr = " + arr);
		System.out.println("长度： " + arr.length);
		// 用数组可以解决，因为数组可以装任意多个数据
		int sum = 0;
		// 遍历数组，求和
		for (int e : arr) {
			System.out.println("元素：" + e);
			sum += e;
		}
		return sum;
	}
	
}
