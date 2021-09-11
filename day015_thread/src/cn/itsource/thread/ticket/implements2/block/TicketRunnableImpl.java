package cn.itsource.thread.ticket.implements2.block;

/**
 *	卖票业务类
 */
public class TicketRunnableImpl implements Runnable {
	/**票数 为了让3个线程对象共享票数*/
	private int ticket = 50;
	
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
	 * 	1. 同步代码块（重点掌握）
			语法：
				synchronized(同步对象){//必须是几个线程对象锁共享的 => static
					有线程安全问题的代码
				}	
				同步对象可以是：static修饰的对象、字节码、this(实现Runnable接口)
	 * 
	 */
	private void saleOne() {
		// 先获取当前线程对象
		Thread currentThread = Thread.currentThread();
		// 在获取该线程对象的名字
		String name = currentThread.getName();
		// 通过同步代码块，解决线程安全代码
//		synchronized (TicketRunnableImpl.class) {// 必须是几个线程对象锁共享的
		synchronized (this) {// 因为只创建了一个业务类对象，所以可以用this
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
		}
	}
}
