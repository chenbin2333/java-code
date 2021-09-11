package cn.itsource.override3;

/**
 *	继承测试类
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建子类Person对象
		Person p = new Person();// ctrl + (fn) + 1/2 选择L
		// 通过当前子类对象p调用父类Animal继承过来的普通方法：eat
		p.eat();
		p.sleep();

		// 创建子类Pig对象
		Pig p2 = new Pig();// ctrl + (fn) + 1/2 选择L
		p2.eat();
		p2.sleep();
		
		// 创建子类Bird对象
		Bird b = new Bird();// ctrl + (fn) + 1/2 选择L
		b.eat();
		b.sleep();
		
	}

}
