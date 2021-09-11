package cn.itsource.interface2;

/**
 *	1. 接口interface（重点）
	1 概念：是一种新结构，跟类平级。是一种标准，只要达到标准就具有这个接口的功能。
		是一些抽象方法的集合。
	
	2 作用：提高程序的扩展性。因为在java中是单继承，而 多实现（接口）
	3 语法：（重点）
		声明接口语法：
			public interface I接口名 {// 名字不是阿里规范，只是建议写法
		 		全局常量;// 默认都会有一个public static final修饰成员变量，建议简写	// 调用方式：只能是通过: 接口名.常量名;
					【必须是声明的同时接着赋值】 	命名：全大写用_隔开：MAX_VALUE					
		 		抽象方法;// 前面会有默认的public abstract修饰，建议简写
		 
		 		// 从jdk1.8开始有的
		 		public default 返回值类型 方法名(...){  // 调用方式：只能是通过  实现类对象.方法名(...);
		 			
		 		}
				// 从jdk1.8开始有的
		 		public static 返回值类型 方法名(...){  // 调用方式：只能是通过: 接口名.方法名(...);
		 
		 		}
		 	}
		 	
		 接口要使用，必须有实现类【子类】：
		 语法：
		 	public(abstract) class 接口名Impl implements 接口名1, 接口2...{
		 		如果是一个非抽象的类必须重写全部的抽象方法
		 	}
	 
	4 注意事项 （重点）
		1. 接口命名规则：IXxx【I接口名：不是阿里巴巴规范要求，只是建议的写法】
 		2. 接口实现类命名规则：接口名Impl【接口名Impl：不是阿里巴巴规范要求，只是建议的写法】
 			只实现一个接口，就是用 上面建议的命名，如果实现多个接口，根据实际业务需求命名
 			
		3. 接口中没有构造方法,也不能new对象
 		4. 如果接口中只有一个抽象方法，该接口就是函数式接口，函数式接口可以用@FunctionalInterface
 		 注解修饰，函数式接口可以使用jdk8新特性lambda表达式。
 		 
		5. 只要一个接口中只有一个抽象方法，不管有没有@FunctionalInterface，该接口都是函数式接口。
		6. 接口必须被子类通过implements全部实现其内的抽象方法
 */
public interface IUSB3_0 {
	/**
	 * 抽象方法，充电方法：power()
	 */
	public abstract void power();
	
	/**
	 * 抽象方法，数据传输方法：dataTransfer()
	 * 在接口中，抽象方法，前面默认（缺省）就有：public abstract 修饰，所以可以省略，也建议省略。
	 */
	void dataTransfer();
	
}
