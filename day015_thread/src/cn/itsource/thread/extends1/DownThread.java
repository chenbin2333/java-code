package cn.itsource.thread.extends1;

/**
 *	下载线程类DownThread，继承了Thread类，重写了run方法
 *	1. 继承Thread类	（重点掌握）
 *		步骤：
 *			1. 写一个线程类XxxThread extends Thread类
 *			2. 重写run()方法（该方法是业务方法，启动线程后，会自动执行该方法）
 *			3. 写一个测试类，在测试类中创建线程子类对象，调用对象的start()启动线程
 */
public class DownThread extends Thread {
	@Override// run方法是业务方法，在线程启动后，会自动执行run方法中代码
	public void run() {
		// 用循环让线程执行时间长一些
		for (int i = 0; i < 50; i++) {
			// 打印一句话，表示线程执行了即可
			System.out.println("下载线程类DownThread----------> : " + i);
		}
	}
}
