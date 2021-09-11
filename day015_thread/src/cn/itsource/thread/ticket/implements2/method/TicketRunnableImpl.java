package cn.itsource.thread.ticket.implements2.method;

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
	 * 	2. 同步方法（重点掌握）
			用synchronized关键字修饰方法即可，在修饰符位置，返回值前面
			如果方法是static修饰的：同步的是 :当前类.class 
			如果方法是非static修饰的：同步的是: this【每个线程对象都有自己的this】 
			
			如果继承Thread的方式，同步方法的话，就需要将方法改为static修饰，所以说，一般我们不用同步方法
			一般建议继承Thread用同步代码块或者锁机制
	 */
	private synchronized void saleOne() {//同步对象是this
		//先获取当前线程对象
		Thread currentThread = Thread.currentThread();
		//在获取该线程对象的名字
		String name = currentThread.getName();
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
