package cn.itsource.thread.ticket.implements2.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 *	卖票业务类
 */
public class TicketRunnableImpl implements Runnable {
	/**票数 为了让3个线程对象共享票数*/
	private int ticket = 50;
	
	/**因为几个线程对象共享同一个业务对象，所以不用static修饰该对象*/
	private final ReentrantLock lock = new ReentrantLock();//创建一个ReentrantLock对象，并且对象是不可变的。
	
	@Override
	public void run() {
		//只要有票就一直卖，用while循环
		while (ticket > 0) {
			//调用卖一张票方法
			saleOne();
		}
	}
	
	/**
	 * 卖一张票方法
	 * 线程同步
	 * 锁机制：
	 * 	 lock.lock();  // 上锁
	     try {
	       	//有线程安全问题的代码
	     } finally {
	       lock.unlock();//释放锁
	     }对象可以是：static修饰的对象、字节码、this(实现Runnable接口)
	 * 
	 */
	private void saleOne() {
		//先获取当前线程对象
		Thread currentThread = Thread.currentThread();
		//在获取该线程对象的名字
		String name = currentThread.getName();
		lock.lock();//上锁
		//通过锁机制，解决线程安全代码
		try {
			//再次判断ticket是否>0
			if (ticket > 0) {
				/*
				 * 有线程安全问题的代码
				 * 打印票号
				 */
				System.out.println(name + "---当前票号：" + ticket);
				//票数-1
				ticket--;
			}
		} finally {
			lock.unlock();//释放锁
		}
	}
}
