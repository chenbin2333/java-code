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
		自动装箱：将基本类型隐式转换为对应的包装类就是自动装箱
 		自动拆箱：将包装类转换为对应的基本类型就是自动拆箱。
 		注意：自动拆箱和装箱都要类型对应
 		
 		享元模式：
	 		必须是使用自动装箱方式，才用享元模式
			Byte/Short/Integer/Long 都在类的内部通过静态内部类缓存了 -128~127之间的数字，
	 		在此范围内并不会创建对象，都是用的静态缓存区的对象地址		
			
 */
public class IntegerTest {

	public static void main(String[] args) {
		/*
		 * 调用Integer类中的常量字段：	  调用方式：类名.字段名
		 *  static int BYTES 		用于表示二进制补码二进制形式的 int值的字节数。  
			static int MAX_VALUE 	一个持有最大值一个 int可以有2 31 -1。  
			static int MIN_VALUE 	的常量保持的最小值的 int可以具有，-2 31。  
			static int SIZE 		用于表示二进制补码二进制形式的 int值的位数。  
		 */
		System.out.println(Integer.BYTES);// 4
		System.out.println(Integer.MAX_VALUE);// 2147483647
		System.out.println(Integer.MIN_VALUE);// -2147483648
		
		/*
		 *	因为当前类中有非static方法，所以需要创建对象
		 *	构造方法： 
		 * 		1.Integer(int value) 将int参数转换为Integer对象 
				2.Integer(String s) 将String参数s转换为对应的Integer对象，注意，必须保证字符串只能是数字，负责会报错NumberFormatException。  
		 */
		Integer integer = new Integer(123);
		System.out.println(integer);
		
		// 构造方法:2.Integer(String s) 使用
		// NumberFormatException数字格式异常，通常是将字符串转换为数值类型的时候，有非数字的字符的时候发生该错误
		Integer integer2 = new Integer("123");
		System.out.println(integer2);
		
		// 调用普通方法：1. static修饰的 =>类名.方法名(....)	2. 非static修饰的	=>对象名.方法名(....)
		// 1. byte byteValue() 将当前的Integer对象转换为byte类型。  如果超出表示范围，会强制转换
		// 转换的时候，如果超过byte表示范围，会以二进制方式进位
		
		// 2. static int max(int a, int b) 返回两个 int的较大值，就像调用 Math.max一样 。  
		
		// 3. static int min(int a, int b) 返回两个 int的较小值，就像调用 Math.min一样 。  
		
		// 4. static int parseInt(String s) 将字符串参数转换为有正负的十进制整数。
		int parseInt = Integer.parseInt("123");// NumberFormatException数字格式异常，通常是将字符串转换为数值类型的时候，有非数字的字符的时候发生该错误  
		System.out.println(parseInt);
		
		// 5. static int sum(int a, int b) 根据+运算符将两个整数相加。 
		
		// 6. static String toHexString(int i) 将int类型的十进制值转换为十六进制的值 
		
		// 7. static Integer valueOf(String s)  将String类型转换为Integer类型
	}

}
