package cn.itsource.reference;

/**
 *	函数式接口，该接口中只有一个抽象方法
 */
@FunctionalInterface // 函数式接口注解
public interface IMyInterface2<T, R> {
	/**
	 * 4.4. 特定方法引用  测试方法
	 */
	R test(T t);
}
