package cn.itsource.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *	定时器类Timer【掌握】
	1. 作用：闹钟、定时上传功能、闲时上传、断点续传
	2. 使用：
		1. 创建对象
 			Timer() 创建一个新的定时器对象
 			Timer(String name) 创建一个新的定时器，其相关线程具有指定的名称
	
		2. 常用方法
			1.void schedule(TimerTask task, Date time) 在指定的时间执行指定的任务  
			2.void schedule(TimerTask task, long delay) 
				在指定的毫秒数之后执行指定的任务。  
			3.void schedule(TimerTask task, Date firstTime, long period) 
				从指定 的时间开始 ，间隔指定的毫秒数重复的执行
			4.void schedule(TimerTask task, long delay, long period) 
				从指定 的时间延迟后 ，间隔指定的毫秒数重复的执行
				
			5.void scheduleAtFixedRate(TimerTask task, Date firstTime, long period) 
				从指定 的时间开始 ，间隔指定的毫秒数重复的执行 (如果当期覅人Time是过去时间，会一次性将所有缺少的任务执行完毕)
			6.void scheduleAtFixedRate(TimerTask task, long delay, long period) 
				从指定 的时间延迟后 ，间隔指定的毫秒数重复的执行(不能执行过去任务，否则会抛出异常，delay不能为负数)
			7. void cancel() 终止当前任务。
 */
public class TimerTest {

	public static void main(String[] args) {
		// 创建Timer对象
		Timer timer = new Timer();
		// 因为该方法需要一TimerTask子类对象，所以需要先设计一个类继承TimerTask
		// 1.void schedule(TimerTask task, Date time) 在指定的时间time一次性执行指定的任务 task
		// 创建一个定时任务子类MyTimerTask对象
		MyTimerTask task = new MyTimerTask();
		// 获取当前时间毫秒数：System.currentTimeMillis()
		long now = System.currentTimeMillis();
		long later = now + 2000;// 2秒后时间毫秒数
		// 创建一个2秒后的Date对象
		Date date = new Date(later);
//		timer.schedule(task, date);// 在指定的日期2秒后一次性执行指定的任务task
		
		// 2.void schedule(TimerTask task, long delay) 在指定的毫秒数delay之后执行指定的任务task。  
//		timer.schedule(task, 2000);// 在2秒后执行定时任务
		
		// 3.void schedule(TimerTask task, Date firstTime, long period) 从指定firstTime 的时间开始 ，间隔指定的period毫秒数重复的执行
//		timer.schedule(task, date, 1000);// 在2秒后，每隔1秒执行一次定时任务。过去时间也可以。
		
		// 4.void schedule(TimerTask task, long delay, long period) 从指定 的时间延迟后 ，间隔指定的period毫秒数重复的执行
//		timer.schedule(task, 2000, 2000);// 在2秒后执行定时任务// 不能使用过去时间即 delay参数不能为负数
		
		// 5.void scheduleAtFixedRate(TimerTask task, Date firstTime, long period) 
//		timer.scheduleAtFixedRate(task, date, 1000);// 从指定date 的时间开始 ，间隔指定的1000毫秒数重复的执行 (如果Time是过去时间，会一次性将所有缺少的任务执行完毕)
		
		// 6.void scheduleAtFixedRate(TimerTask task, long delay, long period) 
		// 从指定 的时间延迟后 ，间隔指定的毫秒数重复的执行(不能执行过去任务，否则会抛出异常，delay不能为负数)
//		timer.scheduleAtFixedRate(task, 2000, 2000);// 不能使用过去时间即参数delay不能为负数
		
		// 7. void cancel() 终止当前任务。
		timer.scheduleAtFixedRate(new TimerTask() {// 匿名内部类，将设计抽象类TimerTask子类和创建子类对象合二为一
			/** 声明一个int类型计数器，赋值0 */
			int count = 0;
			
			@Override // 重写全部抽象方法
			public void run() {
				// 请执行5次任务后终止任务
				System.out.println("啪啪啪...");
				if (++count == 5) {// 如果计数器是==5，则终止任务
					// timer调用方法：cancel()终止任务
					timer.cancel();
				}
			}
		}, 1000, 50);// 1秒后，每间隔50毫秒周期性执行任务
	}

}
