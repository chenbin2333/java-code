package cn.itsource.lambda1;

/**
 *	测试接口类
 *	测试lambda表达式
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		/*
		 *  通过匿名内部类方式，创建IMyInterface子类对象
		 *  语法：
		 *  	接口 变量 = new 接口() {
		 *  		重写全部抽象方法
		 *  	};// 必须加上;
		 */
		IMyInterface my = new IMyInterface() {
			
			@Override
			public void testAbstract() {
				System.out.println("匿名内部类重写方法");
			}
		};
		// 调用抽象方法：testAbstract()
		my.testAbstract();
		
		// lambda初体验
		IMyInterface my2 = () -> {
			System.out.println("lambda重写方法");
		};
		// 调用lambda抽象方法：testAbstract()
		my2.testAbstract();
		
		// lambda初体验2
		IMyInterface my3 = () -> System.out.println("lambda2重写方法");
		// 调用lambda抽象方法：testAbstract()
		my3.testAbstract();
		
	}

}
