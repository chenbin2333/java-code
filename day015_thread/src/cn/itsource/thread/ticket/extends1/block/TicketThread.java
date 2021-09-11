package cn.itsource.thread.ticket.extends1.block;

/**
 *	卖票线程类TicketThread继承了Thread
 *		设计一个static修饰的实例变量 ticket，赋值50，表示票数
 *		设计一个saleOne方法，卖一张票，在方法中写一句打印票号，然后票数-1
 *		重写run方法，在run中循环调用saleOne方法卖票
 */
public class TicketThread extends Thread {
	/** private static修饰的实例变量 ticket，赋值50，表示票数 */
	private static int ticket = 50;
	
	/** 为了几个线程对象共享同一个同步对象，所以用static修饰，这里对象类型可以是任意类型 */
	private static Object obj = new Object();
	
	/**
	 * 使用快捷键，自动生成对应的构造方法，选择无参构造和String有参构造
	 */
	public TicketThread() {
		super();
	}

	public TicketThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// while循环，只要有票就一直卖
		while (ticket > 0) {// ticket > 0表示有票
			// 调用saleOne方法
			saleOne();
		}
	}
	
	/**
	 * private修饰的saleOne卖一张票方法
	 * 因为有线程安全问题，所以用线程同步解决
	 * 
	 * 	方式1. 同步代码块（重点掌握）
			语法：
				synchronized(同步对象) {// 必须是几个线程对象所共享的 => static
					有线程安全问题的代码
				}	
				同步对象可以是：static修饰的对象、字节码、this(实现Runnable接口)
	 */
	private void saleOne() {
		// 获取当前线程对象，调用方法： static Thread currentThread()
		Thread currentThread = Thread.currentThread();
		// 获取当前线程的名字：String getName();
		String n = currentThread.getName();
		// 同步代码块语法
//		synchronized (obj) {// 同步对象obj，必须是被几个线程对象共享，这里我们用的是static修饰的实例变量
//		synchronized (String.class) {// 同步对象也可以是元空间的字节码文件，任意的字节码文件都可以
		synchronized (TicketThread.class) {// 同步对象建议写当前类的字节码文件
			// 再次判断是否有余票：
			if (ticket > 0) {
				// 在方法中写一句打印票号
				System.out.println(n + " --- 当前票号： " + ticket);
				// 票数-1
				ticket--;
			}
		}
	}
}
