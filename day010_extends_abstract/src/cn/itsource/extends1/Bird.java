package cn.itsource.extends1;

/**
 *	鸟类
 *	子类，只保存特性
 *	通过extends关键字继承父类Animal
 */
public class Bird extends Animal {
	// 将共同的代码抽取到父类Animal中
	
	/**
	 * 鸟类起飞fly方法
	 */
	public void fly() {
		System.out.println("起飞....");
	}
}
