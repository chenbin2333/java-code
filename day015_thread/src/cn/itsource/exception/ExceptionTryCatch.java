package cn.itsource.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *	处理异常案例：【不用写代码，能看懂就可以】
 *		方式1：try catch
 *
 *		5. 处理异常的方式：【重点】只需要会选择就可以了，主要是eclipse工具
 *			方式一：try catch	【背锅式】
 *				try {
 *					异常可能发生的代码
 *				} catch (可能的异常类1 e) {// 当发生异常的时候，JVM会自动根据异常类型，创建一个异常对象，将异常信息保存到对象e中。异常信息通过继承Throwable类中的方法获取
 *					处理异常的操作：
 *					1. 打印异常的信息到控制台；
						// 处理方式1 ：获取异常原因    一般处理后给前台页面返回，给用户提示问题原因 
						String message = e.getMessage();
						System.out.println(message);
						// 2. 处理方式2：打印堆栈跟踪日志  推荐 给程序员看的，帮助程序员定位错误的位置，处理异常
						e.printStackTrace();	
						
						// 3. 处理方式3 ：异常类型和异常原因【了解】
						String str = e.toString();
						System.out.println(str);
						
					2. 可以把异常信息保存到一个文件中，可以持久的存储起来；(IO后才能用)
					 	因为实际项目有可能有很多异常打印到控制台，不能随时关注，这时就需要将日志保存
						
 *				} catch (可能的异常类2 e){// 注意：必须子类异常在上面，父类异常在下面。如果异常没有关系，顺序无所谓。
 *					处理方式同上
 *				} .....
 *				finally {
 *					不管上面的上面的执行情况是怎样的，finally代码永远都会执行
 *					一般只是释放资源，不写业务逻辑代码。
 *					例如，在finally中关流、释放锁等	
 *				}			
 *			
 *				try catch处理方式注意事项：
 *					1. 子类异常在上面，父类异常在下面，平级异常顺序无所谓
 *					2. 不要用一个最大的异常处理，尽量细化异常处理方式，因为不同的异常处理的方式是不同的。
 */
public class ExceptionTryCatch {

	public static void main(String[] args) {
		//声明一个FileInputStream对象赋值为null，为了在finally中关闭流
		FileInputStream fis = null;
		
		//声明FileOutputStream变量，在try赋值创建的对象
		FileOutputStream fos = null;
		
		try {
			//有异常的代码
			fis = new FileInputStream("C:/Users/admin/Desktop/test.jpg");
			fos = new FileOutputStream("C:/Users/admin/Desktop/copyPic.jpg");//有异常的代码
			byte[] b = new byte[1024];
			int read = -1;
			while ((read = fis.read(b)) != -1) {//有异常的代码
				fos.write(b,0,read);//有异常的代码
			}
		} catch (FileNotFoundException e) {// 注意：必须子类异常在上面，父类异常在下面。如果异常没有关系，顺序无所谓。
			// 1. 打印异常的信息到控制台；
			// 打印堆栈跟踪信息: e.printStackTrace()。用来帮助程序员定位错误的位置和错误原因。
			e.printStackTrace();
			
			// 获取错误原因，给用户反馈用的:e.getMessage()
			String message = e.getMessage();
			System.out.println(message);
			
			// 表示该异常FileNotFoundException处理方式是不一样的
			System.out.println("文件未找到异常！！！");
			/*
			 * 2. 可以把异常信息保存到一个日志文件中，可以持久的存储起来；(IO后才能用)
				因为实际项目有可能有很多异常打印到控制台，不能随时关注，这时就需要将日志保存 
			 */
		} catch (IOException e) {// 2. 不要用一个最大的异常处理，尽量细化异常处理方式，因为不同的异常处理的方式是不同的。
			e.printStackTrace();
			// 表示该异常IOException处理方式是不一样的
			System.out.println("IO异常！！！");
		} catch (Exception e) {// 2. 不要用一个最大的异常处理，尽量细化异常处理方式，因为不同的异常处理的方式是不同的。
			e.printStackTrace();
			// 表示该异常Exception处理方式是不一样的
			System.out.println("其他异常！！！");
		} finally {// 只有需要释放资源的时候，才写finally
			/*
			 * 	不管上面的上面的执行情况是怎样的，finally代码永远都会执行
			 *		一般只是释放资源，不写业务逻辑代码。
			 *		例如，在finally中关流、释放锁等	
			 */
			System.out.println("不管上面的上面的执行情况是怎样的，finally代码永远都会执行。");
		}
		
		System.out.println("需要执行的代码");
	}
	
}
