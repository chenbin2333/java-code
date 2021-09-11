package cn.itsource.polymorphic2;

/**
 *	子类猪类：Pig
 */
public class Pig extends Animal {
	int age = 3;
	
	@Override
	public void eat() {
		System.out.println("吃白菜...");
	}
	
	/**
	 * 拱白菜方法：gongBaiCai
	 */
	public void gongBaiCai() {
		System.out.println("拱白菜...");
	}
}
