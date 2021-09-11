package cn.itsource.thread.implements2;

/**
 *	线程测试类：
 *	测试方式：
 *	剩余步骤
 *		3. 写一个测试类，在测试类中
 *			先创建业务类对象，再创建线程对象，并且将业务类对象作为参数传入线程的构造方法中，
 			调用线程对象的start()启动线程
 */
public class ThreadTest {

	public static void main(String[] args) {
		// 创建PlayRunnableImpl播放业务类对象
		PlayRunnableImpl play = new PlayRunnableImpl();
		
		// 创建DownRunnableImpl下载业务类对象
		DownRunnableImpl down = new DownRunnableImpl();
		
		// 创建Thread对象，将play作为构造方法参数传入
		Thread playThread = new Thread(play);
		
		// 创建Thread对象，将down作为构造方法参数传入
		Thread downThread = new Thread(down);
		
		// PlayThread调用start方法启动
		playThread.start();
		
		// downThread调用start方法启动
		downThread.start();
		
	}

}
