package cn.itsource.threadlocal;

/**
 *	ThreadLocal类	（掌握简单使用）：
 *	多线程中，尽量不要用成员变量，尽量用局部变量，为了避免安全问题。
	 解决了线程安全问题，通过线程隔离有安全问题的数据实现的，底层是通过map保存线程id和值的。
	 线程安全的方式：
	 	1. 线程同步:当需要几个线程对象共享数据的时候，解决安全问题的方案就是线程同步
	 	2. 线程隔离:当需要几个线程对象不需要 共享数据的时候，解决安全问题的方案就是线程隔离看，通过ThreadLocal类完成
 */
public class ThreadLocalTest {
	/** 声明一个静态成员变量int类型a */
	private static int a;
	
	/**
	 * 先创建一个ThreadLocal对象，传入需要隔离变量的数据类型
	 */
	private static ThreadLocal<Integer> local = new ThreadLocal<Integer>();
	
	public static void main(String[] args) {
		// 线程：苍苍
		new Thread(new Runnable() {// 匿名内部类接口
			@Override
			public void run() {
				// 创建ThreadLocal对象，因为要隔离的是a的值，a是int类型，所以，这里使用其包装类Integer
//				a = 6;
				
				// 通过threadLocal对象调用set方法
				local.set(6);
				
				try {// try在while循环外部，性能更好
					while (true) {
						Thread.sleep(2000);// 阻塞2秒
						// 通过threadLocal对象获取线程隔离的值a
						Integer a = local.get();
						// 获取线程名，拼接a的值
						System.out.println(Thread.currentThread().getName() + " : " + a);// 6
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "苍苍").start();
		
		// main线程
		// 给a赋值为69
//		a = 69;
		// 通过threadLocal对象调用set方法
		local.set(69);
		
		try {// try在while循环外部，性能更好
			while (true) {
				Thread.sleep(2000);// 阻塞2秒
				// 通过threadLocal对象获取线程隔离的值a
				Integer a = local.get();
				// 获取线程名，拼接a的值
				System.out.println(Thread.currentThread().getName() + " : " + a);// 69
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
