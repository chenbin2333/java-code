package cn.itsource.date;

import java.util.Date;

/**
 *	3. 日期和时间相关类：（掌握）
	3.1 Date类：
 *		适用于特定的某一刻时间的场景，如：订单时间、入职时间等
 *		日期相关类，指具体某一刻的时间
 *		1. 构造方法
 *			1. Date() 创建的就是当前这一刻时间的对象
 *			2. Date(long time) 	将指定毫秒数的时间转换为对应的日期时间
 				距离1970年1月1日 0时0分0秒
 *			
 *		2. 普通方法
 *			1. long getTime()将当前Date对象转换为long类型的时间毫秒数
 *			2. void setTime(long time)将long类型时间毫秒数转换为对应的Date对象
 *			3. before(Date date)判断是否在指定日期之前
 *			4. after(Date date)判断是否在指定日期之后	
 */
public class DateTest {

	public static void main(String[] args) {
		// 1. 构造方法: 1. Date() 创建的就是当前这一刻时间的对象
		Date date = new Date();// 获取此刻的时间，注意每次运行时间都会改变
		System.out.println(date);
		
		// 1. 构造方法: 2. Date(long time) 	将指定毫秒数的时间转换为对应的日期时间，距离1970年1月1日 0时0分0秒
		Date date2 = new Date(20000000L);// 距离1970年1月1日 0时0分0秒 20000000L毫秒
		System.out.println(date2);
		// 此刻时间毫秒数对应的日期
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println("date3 = " + date3);
		
		// 2. 普通方法
		// 1. long getTime()将当前Date对象转换为long类型的时间毫秒数
		
		// 2. void setTime(long time)将long类型时间毫秒数转换为对应的Date对象
		date3.setTime(0);
		System.out.println("date3 = " + date3);
		
		// 3. before(Date date)判断是否在指定日期之前
		// 4. after(Date date)判断是否在指定日期之后	
		
		// 请获取明天此刻的时间
		long now = System.currentTimeMillis();// 获取此刻毫秒数
		long tomorrow = now + 24 * 60 * 60 * 1000;// 1秒 = 1000毫秒
		Date date4 = new Date(tomorrow);
		System.out.println(date4);
		
	}

}
