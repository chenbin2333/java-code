package cn.itsource.static5;

/**
 *	static测试类
 */
public class StaticDemoTest {

	public static void main(String[] args) {
		// 创建一个StaticDemo对象，将成员变量a赋值为1
		StaticDemo demo = new StaticDemo();
		demo.a = 1;// 建议类名调用
		System.out.println(demo.a);// 1
		
		// 创建第二个StaticDemo对象，将成员变量a赋值为2
		StaticDemo demo2 = new StaticDemo();
		demo2.a = 2;// 建议类名调用
		System.out.println(demo2.a);// 2
		
		// 再次打印demo的成员变量a的值
		System.out.println(demo.a);// 2
		
	}

}
