package cn.itsource.reference;

/**
 *	函数式接口，该接口中只有一个抽象方法
 */
@FunctionalInterface // 函数式接口注解
public interface IMyInterface {
	/**
	 * 4.1. 静态方法引用  测试方法
	 * 将String对象转换为int类型,Integer.parseInt(String str)
	 * @param str
	 * @return
	 */
//	int parse(String str);
	
	/**
	 * 4.2. 构造方法引用  测试方法
	 * 将String对象转换为Integer类型，调用方法：new Integer("")
	 * @param str
	 * @return
	 */
	Integer getInteger(String str);
}
