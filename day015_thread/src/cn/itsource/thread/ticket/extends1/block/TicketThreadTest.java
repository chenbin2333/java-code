package cn.itsource.thread.ticket.extends1.block;

/**
 *	卖票案例测试类
 */
public class TicketThreadTest {

	public static void main(String[] args) {
		// 创建3个TicketThread对象
		TicketThread boDuo = new TicketThread("波多野结熊");
		TicketThread jinJin = new TicketThread("何进进");
		TicketThread xiaoHang = new TicketThread("小小小小小小小小航");
		// 调用start方法启动3个线程
		boDuo.start();
		jinJin.start();
		xiaoHang.start();
	}

}
