package cn.itsource.super7;

/**
		调用父类成员变量：super.成员变量
		调用父类普通非static方法：super.方法名(...);
		调用父类构造方法：super(...);必须在子类构造方法第一行
 */
public class Person extends Animal {
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Person() {
//		super();
		super("");
	}
	
	/**
	 * 测试方法，需求，在子类中访问父类的:
	 * 1. 成员变量name
	 * 2. 普通方法getName()/setName(...) 3. 构造方法
	 * 
	 */
	public void test() {
//		super();
//		super.name = "";
		
//		setName("子类中");
		super.setName("父类的方法");
		System.out.println(super.getName());
		
	}
	
}
