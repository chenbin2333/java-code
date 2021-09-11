package cn.itsource.anonymous;

/**
 *	接口测试类
 *	匿名内部类测试类
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		/*
		 * 假设，我们这个接口IMyInterface实现类MyInterfaceImpl，创建的对象只需要使用一次，这个时候，我们再设计子类然后创建对象
		 * 非常麻烦，那么我们就想，能不能将设计子类和创建子类对象的工作交给工具呢？能，通过匿名内部类的语法，就可以将接口、抽象类设计子类
		 * 和创建对象的工作合二为一，简化代码。这个时候，就不需要再单独设计子类了。
		 * 
		 * 匿名内部类语法：（掌握）
			接口名/抽象类名 父类变量 = new 接口/抽象类() {// 这里是多态的方式接受子类对象（这个子类的名字我们不知道，是编译器起的名字）
				// 重写全部抽象方法
			};// 注意：不能少分号;
		 */
		IMyInterface my = new IMyInterface() {// 将匿名内部类的对象装到父类变量中，是向上造型
			// {}中的是匿名内部类的类体，重写了全部抽象方法
			@Override
			public void testAbstract2() {
				System.out.println("匿名内部类抽象方法2");
			}
			
			@Override
			public void testAbstract1() {
				System.out.println("匿名内部类抽象方法1");
			}
			
		};
		// 用匿名内部类对象my调用方法
		my.testAbstract1();
		my.testAbstract2();
		
	}

}
