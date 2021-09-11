package cn.itsource.thread.extends1;

/**
 *	线程测试类：
 *	测试方式：
 *	剩余步骤
 *		3. 写一个测试类，在测试类中创建线程子类对象，调用对象的start()启动线程
 */
public class ThreadTest {

	public static void main(String[] args) {
		// 创建PlayThread播放线程对象
		PlayThread playThread = new PlayThread();
		// 创建DownThread播放线程对象
		DownThread downThread = new DownThread();
		
		// PlayThread调用start方法启动
		playThread.start();
		// downThread调用start方法启动
		downThread.start();
		
		// 1. 只有start方法才是启动线程，run方法只是在执行方法。
//		playThread.run();// run方法只是在调用方法，不是启动线程。
//		downThread.run();
		
	}

}
