package cn.itsource.thread.method;

/**
 *	1.6 线程的常用方法：(掌握)
 		1. 构造方法：
			Thread() 创建一个新的 Thread对象。  
			Thread(String name) 创建一个新的有指定线程名的 Thread对象。  
			Thread(Runnable target)  将Runnable业务类对象作为参数，创建一个新的 Thread对象。    
			Thread(Runnable target, String name) 将Runnable业务类对象作为参数，创建一个新的有指定线程名的 Thread对象。  
 
 		2. 普通方法：
			1. static Thread currentThread() 返回对当前正在执行的线程对象的引用。  
			2. String getName() 返回此线程的名称。 
			3. void setName(String name) 设置线程对象的名字   
			4. void setPriority(int newPriority)   设置线程对象的优先级
			5. int getPriority()  获取线程的优先级
				1-10，越大优先级越高，执行越早，越小就执行越晚
				5是默认优先级。
				当前线程的优先级与创建线程对象的环境的优先级一致
				
			6. boolean isDaemon() 判断这个线程是否是守护线程。  GC是守护线程
				一个线程的默认状态和创建它的环境线程状态一致	
			
			7. void setDaemon(boolean on) 将当前线程设置为守护线程   
				活跃的线程不能设置为守护线程
				
			8. void join() 等待join线程执行完后，再执行当前线程【理解】
			9. void join(long millis)等待join线程线程死亡最多 millis毫秒。  【理解】
			10. static void sleep(long millis)  阻塞当前线程指定的毫秒数后再执行
				一般用来模拟网络延迟，可以做计时器，还可以做倒计时
 */
public class ThreadMethodTest {

	public static void main(String[] args) {
		// Thread常量自己看API打印 
		System.out.println(Thread.MAX_PRIORITY);// 线程最大优先级：10
		System.out.println(Thread.MIN_PRIORITY);// 线程最小优先级：1
		System.out.println(Thread.NORM_PRIORITY);// 线程默认优先级：5
		
 		/*
 		 * 1. 构造方法：
			Thread() 创建一个新的 Thread对象。  
			Thread(Runnable target)  将Runnable业务类对象作为参数，创建一个新的 Thread对象。    
			
			Thread(String name) 创建一个新的有指定线程名的 Thread对象。  
			Thread(Runnable target, String name) 
				将Runnable业务类对象作为参数，创建一个新的有指定线程名的 Thread对象。
		*/  
		// 直接创建Thread对象，传入一个线程名"波多野结熊"
		Thread xiongDa = new Thread("熊大");
		// 直接创建Thread对象,传入一个Runnable接口实现类对象和名字
		Thread xiongEr = new Thread(new PlayRunnableImpl(), "熊二");
		
 		// 2. 普通方法：
		// 1. String getName() 返回此线程的名称。 
		String name = xiongDa.getName();
		System.out.println(name);
		
		// 2. void setName(String name) 设置线程对象的名字   
		// 重新修改xiongDa名字为：波多野小吕
		xiongDa.setName("波多野小吕");
		String name2 = xiongDa.getName();
		System.out.println(name2);
		
		// 3. static Thread currentThread() 返回对当前正在执行的线程对象。  【静态方法】
		Thread mainThread = Thread.currentThread();
		System.out.println("正在执行的线程是：" + mainThread);// Thread[main,5,main]
		
		/*
		 * 4. int getPriority()  获取线程的优先级
			1-10，越大优先级越高，执行越早，越小就执行越晚
			1是最小，10是最大
			5是默认优先级。
			当前线程的优先级与创建线程对象的环境的优先级一致
			注意：优先级必须是在设置后，创建的线程对象才能生效
		 */
		int mainPriority = mainThread.getPriority();
		System.out.println("main线程优先级： " + mainPriority);
		
		// 获取xiongDa的优先级
		System.out.println(xiongDa.getPriority());
		
		// 5. void setPriority(int newPriority)   设置线程对象的优先级
		mainThread.setPriority(10);// 设置main线程优先级为10
		
		Thread thread = new Thread();// 重新创建一个新线程对象
		int priority = thread.getPriority();// 获取thread优先级
		System.out.println("main线程修改后创建线程对象的优先级：" + priority);
		
		/*
		 * 6. boolean isDaemon() 判断这个线程是否是守护线程（精灵线程、后台线程）。  GC是守护线程
		 * 	记录日志文件的线程也是守护线程
			一个线程的默认状态和创建它的环境线程状态一致	
		*/
		boolean mainDaemon = mainThread.isDaemon();
		System.out.println("main线程是否是守护线程：" + mainDaemon);// false
				
		/*
		 * 7. void setDaemon(boolean on) 将当前线程设置为守护线程   
		 * 守护线程要设置，必须确定该线程没有调用start方法
			活跃的线程不能设置为守护线程
		*/
//		xiongDa.start();// 不能在启动后，设置守护线程，否则会报错：IllegalThreadStateException非法线程状态异常
		System.out.println("xiong线程设置守护线程前-----：" + xiongDa.isDaemon());// 获取xiong线程是否是守护线程，打印
		xiongDa.setDaemon(true);// xiong线程设置为守护线程
		System.out.println("xiong线程设置守护线程后：" + xiongDa.isDaemon());// 再次获取xiong线程是否是守护线程，打印
		
		/*
		 * 10. static void sleep(long millis)  阻塞当前线程指定的毫秒数后再执行
			一般用来模拟网络延迟，可以做计时器，还可以做倒计时 【静态方法】
		*/
		try {
			Thread.sleep(5000);// 阻塞当前线程5000毫秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("阻塞后执行代码");
		
	}

}
