package cn.itsource.polymorphic1;

/**
 *	多态测试类1
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 人是属于动物	 正确的，语法正确
		Animal an1 = new Person();// 这就是多态
		
		// 猪是属于动物	 正确的，语法正确
		Animal an2 = new Pig();// 这就是多态
		
		// 猪是属于人类	 不正确的，语法不正确
//		Person p1 = new Pig();
		
		// 动物是属于猪 不正确的，语法不正确
//		Pig p2 = new Animal();
		
		// 人是属于猪类	 不正确的，语法不正确
//		Pig p3 = new Person();
		
		// 动物是属于人	 不正确的，语法不正确
//		Person p4 = new Animal();
		
	}

}
