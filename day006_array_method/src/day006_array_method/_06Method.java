package day006_array_method;

/**
 *	方法的引入
 */
public class _06Method {

	public static void main(String[] args) {
		// 需求1：求1-10的和
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 需求2：求1-100的和
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 需求3：求1-10000的和
//		int sum = 0;
//		for (int i = 1; i <= 10000; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 需求4：求1 - n的和
//		int sum = 0;
//		for (int i = 1; i <= 10000; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 在main方法中调用下面的getSum(int n)方法
		// 需求1：求1 - 10的和
		_06Method.getSum(10);// 调用方法传入具体的值10
		
		// 需求2：求1 - 100的和
		_06Method.getSum(100);// 调用方法传入具体的值100
		
		// 需求3：求1 - 1000的和
		_06Method.getSum(1000);// 调用方法传入具体的值1000
		
		// 需求4：求1 - 10000的和
		_06Method.getSum(10000);// 调用方法传入具体的值10000
		
	}
	
	/**
	 * 方法的定义【方法声明】
	 * @param n
	 */
	public static void getSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
