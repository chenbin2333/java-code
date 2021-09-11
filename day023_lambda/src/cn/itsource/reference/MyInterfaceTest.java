package cn.itsource.reference;

import java.util.function.Function;

/**
 *	4. lambda中方法引用：【掌握】
		https://blog.csdn.net/weixin_42022555/article/details/81943263
		可以看看
	
		4.1. 静态方法引用
			语法 ： 类名::方法名
			注意事项：
				被引用的方法参数列表和函数式接口中抽象方法的参数一致！！
				接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
				接口的抽象方法有返回值，引用的方法必须有相同类型的返回值！！
			由于满足抽象参数列表与引用参数列表相同，所以可以写成静态方法引用的格式
			
		4.2. 实例方法引用
			语法 ： 对象名::非静态方法名
			注意事项：
				被引用的方法参数列表和函数式接口中抽象方法的参数一致！！
				接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
				接口的抽象方法有返回值，引用的方法必须有相同类型的返回值！！
		
		4.3. 构造方法引用
			语法 ：类名::new
			注意事项：
				被引用的类必须存在一个构造方法与函数式接口的抽象方法参数列表一致
			
		4.4. 数组构造方法引用
			语法 ：数据类型[]::new
		
		4.5. 特定类型的方法引用 【了解】
			语法 ：类名::非静态方法
		
		4.6.类中方法调用父类或本类方法引用 【了解】
			语法 ：
				this::方法名
				super::方法名
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		// ============================== 4.1. 静态方法引用 ==================================
		// 用匿名内部类写法
//		IMyInterface my = new IMyInterface() {
//			@Override
//			public int parse(String str) {
//				// 将String对象转换为int类型,Integer.parseInt(String str)
//				return Integer.parseInt(str);
//			}
//		};
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.parse("12"));
		
		// 用lambda优化
//		IMyInterface my = str -> Integer.parseInt(str);// 在lambda表达式中引用 Integer的静态方法parseInt
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.parse("123"));
		
		
		// 在lambda表达式中引用Integer的静态方法
		/*
		 * 4.1. 静态方法引用
			语法 ： 类名::静态方法名【简化了lambda表达式中的形参和->】
			简化前提：要么满足1、2 ，要么满足1、3
				1. 被引用的静态方法参数列表和函数式接口中抽象方法的参数列表一致！！（必须的）
				2. 接口的抽象方法有返回值，引用的静态方法必须有相同类型的返回值！！
				3. 接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
			由于满足抽象参数列表与引用参数列表相同，所以可以写成静态方法引用的格式
			
		 * 用lambda表达式优化代码2	4.1. 静态方法引用	优化
		 * 因为函数式接口中的抽象方法parse形参是 一个String类型，并且 引用Integer的静态方法parseInt，
		 * 	形参是 一个String类型，还满足了 parse方法的返回值类型是int，Integer的静态方法parseInt返回值也是int类型，
		 * 所以，可以使用静态方法引用的简化写法：	 类名::方法名
		 */
		// 用lambda 静态方法优化 
//		IMyInterface my = Integer :: parseInt;// 简化了形参和->。Integer :: parseInt相当于：str -> Integer.parseInt(str);
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.parse("1234"));
		
		
		
		
		
		
//		==============================4.2. 构造方法引用==================================
		/*
		 * 4.2. 构造方法引用
			用匿名内部类写法
		 */
//		IMyInterface my = new IMyInterface() {
//			@Override
//			public Integer getInteger(String str) {
//				// Integer类中构造方法可以将String对象str转换为Integer对象
//				return new Integer(str);// 匿名内部类在引用构造方法
//			}
//		};
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.getInteger("123"));
				
		// 用lambda表达式优化代码
//		IMyInterface my = str -> new Integer(str);// lambda优化代码。lambda表达式中在引用Integer构造方法
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.getInteger("123"));
		
		/*
		 * 用lambda表达式优化代码2	4.3. 构造方法引用	优化2
			构造方法形参和 函数式接口的抽象方法参数列表一致，所以，可以使用构造方法引用的简化写法：	
			语法 ：类名::new
		 */
		// 用lambda 构造方法引用 优化代码
//		IMyInterface my = Integer :: new;// 【简化了形参】,这里Integer :: new 相当于：str -> new Integer(str);
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.getInteger("12345"));
		
		
//		============================== 4.3. 实例方法引用 ==================================
		/*
		 * 4.3. 实例方法引用
		 */
		// 判断字符串str是否以指定的参数后缀结尾
		String str = "小吕和某毅在速八学习.avi";
		
		/*
		 * 函数式接口：
		 * 	public interface Function<T,R>
		 * 		R apply(T t) 将参数T，传入lambda中，处理完了后，返回一个结果R
		*/
		// 匿名内部类
//		Function<String, Boolean> func = new Function<String, Boolean>() {
//			@Override
//			public Boolean apply(String t) {
//				// 判断当前str是否是指定的后缀t结尾
//				return str.endsWith(t);// 在匿名内部类中引用对象str的实例方法
//			}
//		};
//		// func调用方法apply,直接打印结果
//		System.out.println(func.apply(".avi"));// true
		
		// lambda优化
//		Function<String, Boolean> func = t -> str.endsWith(t);// 在lambda中引用对象str的实例方法: endsWith
//		// func调用方法apply,直接打印结果
//		System.out.println(func.apply(".avi"));// true
		
		/*
		 * 4.3. 实例方法引用
			语法 ： 对象名::实例方法名
			注意事项：
				被引用的实例方法参数列表和函数式接口中抽象方法的参数一致！！
				接口的抽象方法没有返回值，引用的方法可以有返回值也可以没有
				接口的抽象方法有返回值，引用的实例方法必须有相同类型的返回值！！
		 */
		// 用lambda优化2 	4.2. 实例方法引用优化
//		Function<String, Boolean> func = str :: endsWith;// 【简化了形参】str :: endsWith; => str :: endsWith 相当于 t -> str.endsWith(t)
//		// func调用方法apply,直接打印结果
//		System.out.println(func.apply(".avi"));// true
		
		
		/*
		 * 4.4. 特殊方法引用 【掌握】
			语法 ： 类名::实例方法名
			注意事项：
				在抽象方法中，参数作为实例方法调用者，就可以简化
		 */
		// 需求：判断String类型参数t是否为空字符，调用isEmpty方法
//		IMyInterface2<String, Boolean> my = new IMyInterface2<String, Boolean>() {
//			@Override
//			public Boolean test(String t) {
//				return t.isEmpty();// 在匿名内部类中形参t是 实例方法isEmpty调用者
//			}
//		};
//		// 调用方法apply
//		System.out.println(my.test("测试"));
		
		// 用lambda优化2 	
//		IMyInterface2<String, Boolean> my = t -> t.isEmpty();// 在lambda中, 参数t是实例方法调用者，满足它特殊方法引用语法
//		// 调用方法apply
//		System.out.println(my.test("a"));
		
		// 用lambda优化2 	4.4. 特殊方法引用优化，类名 :: 实例方法名【优化了形参】
		IMyInterface2<String, Boolean> my = String :: isEmpty;// String :: isEmpty相当于：t -> t.isEmpty()
		// 调用方法apply
		System.out.println(my.test(""));
		
	}

}
