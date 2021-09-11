package cn.itsource.thread.implements2;

/**
 * 播放业务类PlayRunnableImpl
 *	2. 实现Runnable接口	（重点掌握）	
 *		1. 写一个实现业务类XxxRunnableImpl implements Runnable接口
 *		2. 重写run()方法（该方法是业务方法，启动线程后，会自动执行该方法）
 *		3. 写一个测试类，在测试类中
 *			先创建业务类对象，再创建线程对象，并且将业务类对象作为参数传入线程的构造方法中，
 			调用线程对象的start()启动线程
 */
public class PlayRunnableImpl implements Runnable {

	@Override// run方法是业务方法，在线程启动后，会自动执行run方法中代码
	public void run() {
		// 用循环让线程执行时间长一些
		for (int i = 0; i < 50; i++) {
			// 打印一句话，表示线程执行了即可
			System.out.println("播放业务类PlayRunnableImpl...: " + i);
		}
	}

}
