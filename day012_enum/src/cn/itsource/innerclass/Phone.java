package cn.itsource.innerclass;

/**
 *	手机类Phone【外部类】
 *	3. 内部类（理解） 组合关系
	1. 概念：内部类，把一个类定义在另一个类的内部，把里面的类称之为内部类，把外面的类称之为外部 
		类。（能认识内部类即可） 		
	2. 作用：更好的体现封装。不允许，其他的类使用内部类
	3. 使用：
		1. 实例内部类【没有static修饰的内部类】
		2. 静态内部类（比较常用）【static修饰的内部类】
		3. 内部枚举
		3. 内部接口
		
 */
public class Phone {
	/** 手机卡 */
	private PhoneCard card;
	
	/** 下面这个成员变量跟上面没有区别，只是类型是jdk定义的，而上面是我们自己设计的类型而已 */
//	private String card2;
	
	public Phone(String number) {
		// 在外部类Phone的构造方法中，调用内部类PhoneCard的构造方法
		PhoneCard phoneCard = new PhoneCard(number);
		card = phoneCard;// 将新创建的PhoneCard对象赋值给成员变量card
	}
	
	/**
	 *	手机卡PhoneCard类
	 *	成员内部类PhoneCard，可以使用访问权限修饰符和static
	 *	static修饰PhoneCard类，会在加载外部类Phone的时候，一起将PhoneCard加载了
	 */
	private static class PhoneCard {
		/** 手机电话号码number */
		String number;

		public PhoneCard(String number) {
			this.number = number;
		}
	}
	
	/**
	 * showNumber方法，显示当前卡号方法
	 */
	public void showNumber() {
		// 直接打印当前成员变量card的number值
		System.out.println("亲，您的靓号为：" + card.number);
	}

}
