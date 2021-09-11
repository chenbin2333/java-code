package cn.itsource.thread.ticket.extends1.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 *	卖票线程类TicketThread继承了Thread
 *		设计一个static修饰的实例变量 ticket，赋值50，表示票数
 *		设计一个saleOne方法，卖一张票，在方法中写一句打印票号，然后票数-1
 *		重写run方法，在run中循环调用saleOne方法卖票
 */
public class TicketThread extends Thread {
	/** private static修饰的实例变量 ticket，赋值50，表示票数 */
	private static int ticket = 50;
	
	/** 声明一个ReentrantLock锁对象。为了几个线程对象共享同一个同步对象，所以用static修饰，这里对象类型可以是任意类型 */
	private static final ReentrantLock lock = new ReentrantLock();
	
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
	 * 	第二种：乐观锁（自己扩展）（重点掌握）
			锁机制: Lock接口的实现类ReentrantLock【可重入互斥锁】
				构造方法：
					1. ReentrantLock() 创建一个 ReentrantLock的实例。   不要公平机制。效率高
					2. ReentrantLock(boolean fair) 根据给定的公平政策创建一个 ReentrantLock的实例。 
						 理论上获取锁的几率是相同的
				 class X {
				   private final ReentrantLock lock = new ReentrantLock();
				
				   public void m() { 
				     lock.lock();  // 上锁
				     try {
				       	// 有线程安全问题的代码
				     } finally {
				       lock.unlock();//释放锁
				     }
				   }
				 }
	 */
	private void saleOne() {
		// 获取当前线程对象，调用方法： static Thread currentThread()
		Thread currentThread = Thread.currentThread();
		// 获取当前线程的名字：String getName();
		String n = currentThread.getName();
		// 锁机制
		lock.lock();  // 上锁
		try {// 有线程安全问题代码
			// 再次判断是否有余票：
			if (ticket > 0) {
				// 在方法中写一句打印票号
				System.out.println(n + " --- 当前票号： " + ticket);
				// 票数-1
				ticket--;
			}
		} finally {
			lock.unlock();// 释放锁
		}
	}
}
