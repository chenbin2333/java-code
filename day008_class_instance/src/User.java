
/**
 *	用户类 
 *		1. 设计类，业务类，没有main方法	 => 设计模板
		语法：
			public class Xxx {
				成员变量; => 属性，静止的部分
				非static方法; => 行为，动态的部分
			}
			
		要求：
			1.类名，大驼峰，见名知意，不能以jdk中存在的类命名
			2.成员变量名和方法名，小驼峰，见名知意
			3.在类名、方法名、成员变量名上面写文档注释
 */
public class User {
	/** String类型成员变量name姓名 */
	String name;
	
	/** int类型成员变量age年龄 */
	int age;
	
	/**
	 * User类的无参构造
	 */
	public User() {
		System.out.println("User类的无参构造...");
	}
	
	/**
	 * User类的String参数和int参数 构造
	 * @param n 要赋给成员变量name的值n
	 * @param a 要赋给成员变量age的值a
	 */
	public User(String n, int a) {
		name = n;// 给成员变量name赋值为n
		age = a;// 给成员变量age赋值为a
		System.out.println("User类的String参数和int参数 构造...");
	}
	
	/**
	 * 非static修饰普通方法：爱好hobby
	 * @param str 爱好的内容
	 */
	public void hobby(String str) {
		System.out.println(name + "的爱好是：" + str);
	}
}
