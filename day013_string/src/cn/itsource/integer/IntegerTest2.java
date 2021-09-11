package cn.itsource.integer;

/**
 *	3. 包装类：(掌握常用方法)
		基本类型		包装类		父类			父类
		byte		Byte		Number抽象	Object
		short		Short		Number抽象	Object
		int			Integer		Number抽象	Object
		long		Long		Number抽象	Object
		float		Float		Number抽象	Object
		double 		Double		Number抽象	Object
		char		Character	Object
		boolean		Boolean		Object
		自动装箱：将基本类型隐式转换为对应的包装类就是自动装箱 【jdk5】
 		自动拆箱：将包装类转换为对应的基本类型就是自动拆箱。 【jdk5】
 		注意：自动拆箱和装箱都要类型对应
 		
 		享元模式：
	 		必须是使用自动装箱方式，才用享元模式
			Byte/Short/Integer/Long 都在类的内部通过静态内部类缓存了 -128~127之间的数字，
	 		在此范围内并不会创建对象，都是用的静态缓存区的对象地址		
			
 */
public class IntegerTest2 {

	public static void main(String[] args) {
		// 正常创建Integer对象的方式
		Integer integer = new Integer(123);
		Integer integer2 = new Integer(123);
		System.out.println(integer == integer2);// false
		System.out.println(integer.equals(integer2));// true
		
		// 简化创建Integer对象的方式
		Integer integer3 = 127;// 创建Integer对象直接赋值 int值127。【自动装箱】
		int i = integer3;// 声明int变量i赋值为Integer对象integer3。【自动拆箱】
		
		Integer integer4 = 127;// 创建Integer对象直接赋值 int值127。【自动装箱】
		System.out.println(integer3 == integer4);// true
		System.out.println(integer3.equals(integer4));// true
		
		/*
		 * 在-128~127之间，我们认为 所有的Integer对象共享一个对象地址【一共256个对象，每一个值都是一个对象】
		 * 这个就是享元模式
		 * 必须是使用自动装箱方式，才用享元模式
			Byte/Short/Integer/Long 都在类的内部通过静态内部类缓存了 -128~127之间的数字，
	 		在此范围内并不会创建对象，都是用的静态缓存区的对象地址		
		 */
		
		
	}

}
