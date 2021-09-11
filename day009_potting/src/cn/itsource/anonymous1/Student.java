package cn.itsource.anonymous1;

/**
 * 学生类【业务类设计】
 	设计类，业务类，没有main方法	 => 设计模板
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
public class Student {
	/** String类型成员变量name姓名，不用赋值 */
	String name;
	
	/** int类型成员变量age年龄，不用赋值 */
	int age;
	
	/**
	 * 非static修饰的普通方法：hobby爱好
	 * @param str 爱好的内容
	 */
	public void hobby(String str) {
		// 直接输出 ：name的爱好是：str  【字符串拼接】
		System.out.println(name + "的爱好是：" + str);
	}
}
