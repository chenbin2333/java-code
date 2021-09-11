package cn.itsource.super4;

/**
 * 父类，动物类
 * 
 * 测试可以从父类可以通过super访问 哪些成员：
 * 	测试方式是，将父类中所有的成员写出来【private、public、static修饰的成员变量、方法，构造方法】，
 * 	然后，在测试类中创建子类对象，用子类对象去调用继承的成员打印或者执行，看效果。
 * 
	父类中可以写成员：
		1. 成员变量：
 *			1. private
 *			2. public
 *			3. static
 *
 *		2. 普通方法：
 *			1. private
 *			2. public
 *			3. static
 *
 *		3. 构造方法 ：
 *			public	
 */
public class Animal {
	/** private 成员变量 name */
	private String name;
	
	/** static 成员变量 age */
	static int age;
	
	/** public 成员变量 sex */
	public boolean sex;
	
	/**
	 * public无参构造
	 */
	public Animal() {
		System.out.println("Animal无参构造");
	}
	
	/**
	 *  public有参构造
	 * @param name
	 */
	public Animal(String name) {
		System.out.println("Animal String 参构造");
		this.name = name;
	}
	
	/**
	 * private 修饰的有参构造
	 * @param sex
	 */
	private Animal(boolean sex) {
		this.sex = sex;
	}

	/**
	 * 默认public 普通方法getName：
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 默认public 普通方法getName：
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * private普通方法testPrivate
	 */
	private void testPrivate() {
		System.out.println("testPrivate方法");
	}
	
	/**
	 * static普通方法testStatic
	 */
	static void testStatic(){
		System.out.println("testStatic方法。。。。。");
	}
	
}
