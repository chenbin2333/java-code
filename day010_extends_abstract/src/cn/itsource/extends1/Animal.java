package cn.itsource.extends1;

/**
 *	父类，动物类Animal
 *	只保存共性
 */
public class Animal {
	/** 姓名 */
	String name;
	
	/** 年龄 */
	int age;
	
	/**
	 * 吃eat方法
	 */
	public void eat() {
		System.out.println("吃....");
	}
}
