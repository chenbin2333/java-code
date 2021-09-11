
/**
 * 业务类Student的测试类
 *	【重点掌握】		
	3.2. 设计一个测试类，测试类命名，XxxTest，包含main方法
		在测试类的main方法中，写以下代码：	
	
			3.2.1. 创建对象：	=> 复制模板
				语法：
					类名 对象名（变量） = new 类名();
				
				例如：
					Student stu = new Student();
				
			3.2.2. 给对象成员变量赋值	=> 填写信息
				语法：	
					对象名.成员变量 = 值;//注意：值和成员变量数据类型必须完全一致
				
				例如：
					stu.name = "小洁洁";//name是String类型
					stu.age = 22;//age是int类型
					
					
			3.2.3. 对象的取值/调用方法:	在这里，只需要打印输出一下，看一下结果即可
						在这里，只需要打印输出一下成员变量，看一下结果即可
			 			调用一下非static修饰的方法			
					语法：
						对象名.成员变量;
						对象名.非static方法(...);
 */
public class _05StudentTest {

	public static void main(String[] args) {
		// 第一个对象
		// 1.创建对象，语法：类名 对象名（变量） = new 类名(); 
		_04Student stu = new _04Student();// 创建一个_04Student类型的对象，赋值给_04Student类型变量stu保存
		
		// 2.给对象成员变量赋值,语法：	对象名.成员变量 = 值;//注意：值和成员变量数据类型必须完全一致
		stu.name = "波多野结熊";// 给对象stu的String类型成员变量name赋值为："波多野结熊"
		stu.age = 33;// 给对象stu的int类型成员变量age赋值为：33
		
		/*
		 *  3. 对象的取值/调用方法:	在这里，只需要打印输出一下，看一下结果即可
				在这里，只需要打印输出一下成员变量，看一下结果即可
	 			调用一下非static修饰的方法			
			语法：
				对象名.成员变量;
				对象名.非static方法(...);
		 */
		System.out.println(stu.name);// 直接打印输出 对象stu的成员变量 name的值
		System.out.println(stu.age);// 直接打印输出 对象stu的成员变量 age的值
		
		// 4. 对象调用方法，语法：对象名.方法名(...);// 注意：方法没有static修饰
		stu.hobby("pen水！");// 用对象stu调用非static修饰的hobby(爱好)方法，注意传入实参
		
		// 第二个对象
		_04Student stu2 = new _04Student();
		stu2.name = "吉泽宇潇";
		stu2.age = 22;
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		stu2.hobby("射击");
	}

}
