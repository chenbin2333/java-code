package cn.itsource.extends2;

/**
 *	继承测试类，在测试类中创建子类对象，用子类对象去调用继承的成员打印或者执行，看效果。
 */
public class AnimalTest {

	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();// ctrl + (fn) + 1/2 选择L
		// 通过当前子类对象p调用父类Animal继承过来的private成员变量 name
//		p.name = "波多野结熊";// 不能继承private修饰的成员，但是可以通过间接发生使用
		// 通过p调用public修饰的setName方法|
		p.setName("波多野结熊");
		// 通过p调用public修饰的getName方法|
		System.out.println(p.getName());
		
		// 通过当前子类对象p调用父类Animal继承过来的static成员变量 age
		p.age = 33;// 可以继承static修饰的成员，但是不建议用子类对象直接访问，应该用: 类名.访问
		// 打印输出一下age的值
		System.out.println(p.age);
		
		// 通过当前子类对象p调用父类Animal继承过来的public成员变量 sex
		p.sex = "男";
		System.out.println(p.sex);
		
		// 构造方法就不用测试了，因为只有通过new来调用，不能用子类对象调用【不能继承构造方法】
		
		// 通过当前子类对象p调用父类Animal继承过来的private普通方法：testPrivate
//		p.testPrivate();// 报错，不能继承
		
		// 通过当前子类对象p调用父类Animal继承过来的static普通方法：testStatic
		p.testStatic();// 可以继承static修饰的成员，但是不建议用子类对象直接访问，应该用: 类名.访问
		
	}

}
