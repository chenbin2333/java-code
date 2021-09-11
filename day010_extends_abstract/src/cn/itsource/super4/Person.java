package cn.itsource.super4;

/**
 *	人类，通过extends关键字继承父类Animal
 *
 *	3. 	super(超级)(理解)
	1. 回顾this，指代当前对象。只要解决了成员变量和局部变量的二义性。构造方法相互调用
		调用成员变量：this.成员变量
		调用普通非static方法：this.方法名(...);
		调用构造方法：this(...);必须在构造方法第一行
		
		this就是需要在当前类中使用  当前类  的成员【成员变量、方法、构造方法】
		super就是需要在当前类中使用  父类  的成员【成员变量、方法、构造方法】
		
		继承是在创建子类对象后，可以访问父类继承过来的成员。
		super是在设计子类的过程中，访问父类成员。
		
	2. 概念：指代父类对象。
	3. 作用：在子类设计的过程中可以访问父类中的成员【方法、成员变量、构造方法】
	4. 使用：
		调用父类成员变量：super.成员变量
		调用父类普通非static方法：super.方法名(...);
		调用父类构造方法：super(...);必须在子类构造方法第一行
					this(...);必须在当前类构造方法第一行
	5. 	注意事项：
			1. super(...)和this(...) 不能共存,因为都需要在构造方法第一行
			2. 每一个子类中的构造方法中都会有一个默认super() 调用父类的无参数构造方法
				(默认只会调用无参数的构造方法);
			        如果有显示调用父类的构造方法,那么默认调用就不存在了;
				所以，一般设计类都要提供一个无参构造，扩展性强
				
	6. super的使用和继承的区别与联系：
		1. super使用前提必须是继承
		2. 继承测试是在测试类中创建子类对象，通过子类对象调用父类继承的成员			
		3. super测试是设计子类过程中 需要在子类中调用父类成员，通过super完成			
				
 */
public class Person extends Animal {
	
	public Person() {
		// 问父类Animal的public修饰的无参构造，调用父类构造方法语法：super(...);必须在子类构造方法第一行
//		super();// 不能在普通方法中调用父类构造方法
		
		// 问父类Animal的public修饰的有参构造，调用父类构造方法语法：super(...);必须在子类构造方法第一行
		super("波多野结熊");
		
		// 问父类Animal的private修饰的有参构造，调用父类构造方法语法：super(...);必须在子类构造方法第一行
//		super(true);// 不能访问父类private修饰的构造方法
		System.out.println("Person无参构造...");
	}
	
	/**
	 * 测试方法，需求: 在子类设计的过程中，访问父类中的成员
	 * 例如：访问父类Animal中的成员变量、普通方法、构造方法【只能在子类构造方法第一行】
	 */
	public void test() {
		// 访问父类Animal的private成员变量name ，调用父类成员变量语法：super.成员变量
//		super.name = "";// 不能访问private修饰的父类成员变量
		
		// 访问父类Animal的static成员变量age ，调用父类成员变量语法：super.成员变量
		super.age = 33;// 可以访问，但是不建议访问static修饰的成员，建议使用类名访问
		System.out.println(super.age);
		
		// 访问父类Animal的public成员变量sex ，调用父类成员变量语法：super.成员变量
		super.sex = false;
		System.out.println(super.sex);
		
		// 问父类Animal的public修饰的无参构造，调用父类构造方法语法：super(...);必须在子类构造方法第一行
//		super();// 不能在普通方法中调用父类构造方法
		
		// 问父类Animal的public修饰的setName()方法，调用父类普通方法语法：super.方法名(...);
		super.setName("波多野结熊");
		String name2 = super.getName();
		System.out.println(name2);
		
		// 问父类Animal的private普通方法testPrivate
//		super.testPrivate();// 不能访问private修饰的父类中成员
		
		// 问父类Animal的static普通方法testStatic
		super.testStatic();// 可以访问，但是不建议访问static修饰的成员，建议使用类名访问
		
	}
}
