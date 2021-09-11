package cn.itsource.thread.ticket.implements2.lock;

/**
 *	卖票测试类
 *	也是线程同步测试
 */
public class TicketTest {

	public static void main(String[] args) {
		//创建一个业务类TicketRunnableImpl对象
		TicketRunnableImpl ticket = new TicketRunnableImpl();
		//创建一个Thread对象，将ticket传入，且赋值名字为：老吕
		Thread laoLv = new Thread(ticket,"老吕");
		//创建一个Thread对象，将ticket传入，且赋值名字为：：波多
		Thread boDuo = new Thread(ticket,"波多老师");
		//创建一个Thread对象，将ticket传入，且赋值名字为：：杏梨
		Thread xingLi = new Thread(ticket,"杏梨大老师");
		
		//启动三个线程对象
		laoLv.start();
		boDuo.start();
		xingLi.start();
	}

}
