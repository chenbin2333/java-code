package cn.itsource.lambda2;

/**
 *	函数式接口，该接口中只有一个抽象方法
 */
@FunctionalInterface // 函数式接口注解
public interface IMyInterface {
	/**
	 * 抽象方法： 无参无返回值
	 */
//	void test1();
	
	/**
	 * 抽象方法： 无参有返回值
	 */
//	int test2();
	
	/**
	 * 抽象方法： 有参无返回值
	 */
//	void test3(int a);
	
	/**
	 * 抽象方法： 有多个参有返回值
	 */
	int test4(int a, int b);
	
}
