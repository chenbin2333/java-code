package cn.itsource.extends1;

/**
 *	人类
 *	子类，只保存特性
 *	通过extends关键字继承父类Animal
 */
public class Person extends Animal {
	// 将共同的代码抽取到父类Animal中
	
	/**
	 * 人类撸代码coding方法
	 */
	public void coding() {
		System.out.println("撸代码....");
	}
}
