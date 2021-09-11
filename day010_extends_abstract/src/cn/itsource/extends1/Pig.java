package cn.itsource.extends1;

/**
 *	猪类
 *	子类，只保存特性
 *	通过extends关键字继承父类Animal
 */
public class Pig extends Animal {
	// 将共同的代码抽取到父类Animal中
	
	/**
	 * 猪类拱白菜gongBaiCai方法
	 */
	public void gongBaiCai() {
		System.out.println("拱白菜....");
	}
}
