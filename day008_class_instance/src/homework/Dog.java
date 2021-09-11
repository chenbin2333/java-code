package homework;
/**
 *  定义一个狗狗类Dog
	有如下属性：性别，姓名。 
	有如下方法： public void eat(String food)方法。
	请写一个测试类测试：
	创建2个狗狗对象:
	一个名字 赋值为：母狗1号 ，性别：母	吃：包子（用有参构造实现成员变量赋值），并且调用对象的吃方法。
	一个名字 赋值为：公狗1号 ，性别：公	吃：大馒头（用对象名.成员变量的方式赋值给对应的成员变量），并且调用对象的吃方法
 *
 */
public class Dog {

	char gender; // 性别
	String name; // 姓名
	/**有如下方法： public void eat(String food)方法。*/
	public void eat(String food){
		System.out.println(name + "吃了：" + food);
	}
	// 有参构造
	public Dog(char g, String n) {
		gender = g;
		name = n;
	}
	// 无参构造
	public Dog() {
		
	}
	
}
