package cn.itsource.thread.ticket.extends1.method;

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
	 * 	方式2. 同步方法（重点掌握）
			用synchronized关键字修饰方法即可，在修饰符位置，返回值前面
			如果方法是static修饰的：同步的是 :当前类.class 
			如果方法是非static修饰的：同步的是: this 
			
			如果继承Thread的方式，同步方法的话，就需要将方法改为static修饰，所以说，一般我们不用同步方法
			一般建议继承Thread用同步代码块或者锁机制
	 */
	private static synchronized void saleOne() {// 同步方法，如果方法是实例方法，则同步对象默认是this。如果是类方法，同步对象默认是：当前类.class
		// 获取当前线程对象，调用方法： static Thread currentThread()
		Thread currentThread = Thread.currentThread();
		// 获取当前线程的名字：String getName();
		String n = currentThread.getName();
		// 再次判断是否有余票：
		if (ticket > 0) {
			// 在方法中写一句打印票号
			System.out.println(n + " --- 当前票号： " + ticket);
			// 票数-1
			ticket--;
		}
	}
}
