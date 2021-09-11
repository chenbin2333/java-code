package cn.itsource.lambda2;

/**
 *	lambda：【重点】
	1. 概念：就是对函数式接口匿名内部类的简写
	2. 作用：简化代码
	3. 使用：
		语法：
			函数式接口  变量名 = (参数1，参数2...) -> {
                  //方法体
         	}
			(参数1，参数2…)表示参数列表；
			->表示连接符；连接符号后是方法体
			{}内部是方法体 
		特点说明：
			普通方法的写法
			1、=右边的类型会根据左边的函数式接口类型自动推断； 
			2、如果形参列表为空，只需保留()； 
			3、如果形参只有1个，()可以省略，只需要参数的名称即可； 
			4、如果执行语句只有1句，且无返回值，{}可以省略，
				若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句； 
			5、形参列表的数据类型会自动推断； 
			6、lambda不会生成一个单独的内部类文件； 
			7、lambda表达式若访问了局部变量，则局部变量必须是final的，
			若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		/* 
		 * 接口使用匿名内部类的方式
		 * 	匿名内部类语法：
		 * 		接口/抽象类 变量名 = new 接口/抽象类() {// 类体
		 * 			重写全部的抽象方法
		 * 		};// 分号必须有
		 */
//		=================================== 1. 无参无返回值 ========================================
//		IMyInterface my = new IMyInterface() {
//			
//			@Override
//			public void test1() {
//				System.out.println("1. 无参无返回值");
//			}
//		};
//		// 调用方法执行即可
//		my.test1();
		
		// 无参无返回值用lambda优化1	
//		IMyInterface my = () -> {// 直接将形参和方法体保留其他删除，然后在()和{}之间加上 ->
//			System.out.println("lambda  1. 无参无返回值");
//		};// 有分号
//		// 调用方法执行即可
//		my.test1();
		
		// 无参无返回值用lambda优化2 		如果{}中执行语句只有1句，且无返回值，{}可以省略
//		IMyInterface my = () -> System.out.println("lambda优化2");
//		// 调用方法执行即可
//		my.test1();
					
		
		
//		=================================== 2. 无参有返回值 ========================================
		// 2. 无参有返回值
//		IMyInterface my = new IMyInterface() {
//			@Override
//			public int test2() {
//				return 0;
//			}
//		};
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.test2());// 0
		
		// 无参有返回值用lambda优化1	
//		IMyInterface my = () -> {
//			return 1;
//		};
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.test2());// 1
		
		// 无参有返回值用lambda优化2 		如果执行语句只有1句，且有返回值，{}可以省略，但是必须同时省略return
//		IMyInterface my = () -> 2;
//		// 调用方法，将返回值直接打印即可
//		System.out.println(my.test2());// 2				
		
		
//		=================================== 3. 有1个参无返回值 ========================================
		// 3. 有1个参无返回值
//		IMyInterface my = new IMyInterface() {
//			@Override
//			public void test3(int a) {
//				System.out.println(a);
//			}
//		};
//		// 调用方法即可
//		my.test3(1);
		
		// 有1个参无返回值 用lambda优化1	
//		IMyInterface my = (int a) -> {
//			System.out.println("3. 有1个参无返回值  lambda优化1	: " + a);
//		};
//		// 调用方法即可
//		my.test3(2);
		
		
		// 有1个参无返回值用lambda优化2 		如果执行语句只有1句，且无返回值，{}可以省略
//		IMyInterface my = (int a) -> System.out.println("3. 有1个参无返回值  lambda优化2	: " + a);
//		// 调用方法即可
//		my.test3(999);
		
		// 有1个参无返回值用lambda优化3 		如果形参列表只有一个参数可以省略 数据类型和()
//		IMyInterface my = a -> System.out.println("3. 有1个参无返回值  lambda优化2	: " + a);
//		// 调用方法即可
//		my.test3(666);
		
						
//		=================================== 4. 有多个参有返回值========================================
		// 4. 有多个参有返回值
//		IMyInterface my = new IMyInterface() {
//			@Override
//			public int test4(int a, int b) {
//				return a + b;
//			}
//		};
//		// 直接调用方法，打印返回值
//		System.out.println(my.test4(1, 1));// 2
		
		// 有多个参有返回值  用lambda优化1	
//		IMyInterface my = (int a, int b) -> {
//			return a + b;
//		};
//		// 直接调用方法，打印返回值
//		System.out.println(my.test4(2, 2));// 4		
		
		
		// 有多个参有返回值  用lambda优化2	如果执行语句只有1句，且有返回值，{}可以省略，但是必须同时省略return
//		IMyInterface my = (int a, int b) -> a + b;
//		// 直接调用方法，打印返回值
//		System.out.println(my.test4(3, 3));// 6
		
		// 有多个参有返回值  用lambda优化3	形参列表数据类型可以省略，因为只有一个抽象，程序可以自己推断【()不能省略】
		IMyInterface my = (a, b) -> a + b;
		// 直接调用方法，打印返回值
		System.out.println(my.test4(5, 5));
		
		
		/*
		 *  注意事项：
		 *  	7、lambda表达式若访问了局部变量，则局部变量必须是final的，
			若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；
		 */
//		int i = 1;
//		IMyInterface my = (a, b) -> {
//			i = 2;
//			return a + b;
//		};
//		// 直接调用方法，打印返回值
//		System.out.println(my.test4(1, 1));
		
	}

}
