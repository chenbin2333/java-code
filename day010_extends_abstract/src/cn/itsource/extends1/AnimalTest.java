package cn.itsource.extends1;

/**
 *	继承测试类
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();// ctrl + (fn) + 1/2 选择L
		// 通过当前子类对象p调用父类Animal继承过来的成员变量 name
		p.name = "波多野结熊";
		// 通过当前子类对象p调用父类Animal继承过来的成员变量 age
		p.age = 33;
		// 打印输出一下name和age的值
		System.out.println(p.name);
		System.out.println(p.age);
		// 通过当前子类对象p调用父类Animal继承过来的普通方法：eat
		p.eat();
		
		// 通过当前子类对象p调用特有方法:coding
		p.coding();
		// 其他子类自己测试
		
	}

}
