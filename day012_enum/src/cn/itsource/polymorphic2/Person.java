package cn.itsource.polymorphic2;

/**
 *	子类人类：Person
 */
public class Person extends Animal {
	int age = 2;
	
	@Override
	public void eat() {
		System.out.println("吃大肠刺身...");
	}
	
	/**
	 * 撸代码方法coding
	 */
	public void coding() {
		System.out.println("撸...");
	}
}
