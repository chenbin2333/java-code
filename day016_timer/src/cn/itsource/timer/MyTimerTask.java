package cn.itsource.timer;

import java.util.TimerTask;

/**
 *	定时任务子类MyTimerTask，继承了TimerTask，重写run方法，该方法是定时器启动后，会自动执行的任务。
 */
public class MyTimerTask extends TimerTask {

	@Override // run方法，该方法是定时器启动后，会自动执行的任务
	public void run() {
		System.out.println("啪...");
	}

}
