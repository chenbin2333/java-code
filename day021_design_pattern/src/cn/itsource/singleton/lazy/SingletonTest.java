package cn.itsource.singleton.lazy;

/**
 *	单例模式测试类,测试多个对象为同一个
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		// 获取第一个Singleton对象
		Singleton instance = Singleton.getInstance();
		// 因为类变量instance没有用private修饰，所以，可以在同包类任意访问修改
//		Singleton.instance = null;// private修饰就不能访问了
		// 获取第二个Singleton对象
		Singleton instance2 = Singleton.getInstance();
		// 只要比较2个对象的地址即可，如果是true，则为同一个对象
		System.out.println(instance == instance2);
		
	}

}
