package cn.itsource.override3;

/**
 *	鸟类
 *	通过extends关键字继承父类Animal
 */
public class Bird extends Animal {
	/**
	 * 吃eat方法
	 */
	@Override // @Override是注解，用来帮助程序员校验代码。这里表示eat方法是从父类继承过来重写的。
	public void eat() {
		System.out.println("吃毛毛虫...");
	}
	
}
