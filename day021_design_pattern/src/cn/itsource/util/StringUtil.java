package cn.itsource.util;

/**
 *	2. 工具类：（掌握）
	1. 概念：就是类中只有（类方法、实例方法）方法，就是为了调用方法。
	2. 作用：就是一个轮子
	3. 分类：
		1. 静态的	
			方法全部都是static修饰的，调用方式：类名.方法名(...);
		
		2. 非静态的	
			通过单例模式获取到对象后。就是只有一个对象的类
			方法全部都是非static修饰的，调用方式：对象名.方法名(...);
			
	4. 工具类命名：
		XxxUtil、XxxUtils、XxxTool、XxxTools
 */
public class StringUtil {
	/**
	 * 判断当前字符串是否为null
	 * @param str
	 * @return
	 */
	public static boolean isNull(String str) {
		return str == null;
	}
}
