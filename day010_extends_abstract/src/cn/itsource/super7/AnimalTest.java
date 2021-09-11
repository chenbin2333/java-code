package cn.itsource.super7;

/**
 *	继承super使用
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建子类Person对象
		Person p = new Person();// 在创建子类对象的时候，在子类构造方法中，有调用父类Animal的无参构造
//		
//		System.out.println("===========");
//		// 子类对象p调用test方法
//		p.test();
		
		System.out.println(p.getName());
		
		Person p2 = new Person();
		System.out.println(p2.getName());
	}
	
}
