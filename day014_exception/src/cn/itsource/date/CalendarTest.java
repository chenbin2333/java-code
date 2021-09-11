package cn.itsource.date;

import java.util.Calendar;

/**
 *	3.3 Calendar日历类。主要用来操作一段时间和进行时间加减等场景			
		使用：
 *			构造方法是protected修饰，所以只能通过下面的方式创建对象
 *			 Calendar rightNow = Calendar.getInstance();获取一个对象
 *
 *		常用方法：
 * 			1.int get(int field)  	获取某一个字段（当前Calendar常量）的时间
 *			2.abstract void add(int field, int amount)  添加时间操作
	 * 			field:是Calendar中的常量
	 * 			amount:如果是正数表示加，如果是负数表示减
	 * 			月份从：0-11	
	 * 			如果月份超过11，则进年，如果日期超过所在月份的最大或者最小一天，则进月或者退月
	 * 		3.void set(int field, int value)根据当前Calendar常量设置时间   
	 * 		4.Date getTime()   将Calendar对象转换为Date类型
	 * 		5.void setTime(Date date)  将Date转换为Calendar
	 * 		6.boolean after(Object when)  
	 * 		7.boolean before(Object when)  
	 
	时间、日历、时间格式化类使用场景：【掌握】
		Calendar抽象类，日历类。主要是用来操作日期的，例如，加减日期，比较日期，判断一段时间等
 		Date类：适用于具体某一刻时间，一般用在例如，订单时间、用户注册时间等
 		SimpleDateFormat类：将日期和字符串进行格式转换		

 */
public class CalendarTest {

	public static void main(String[] args) {
		// 通过静态方法获取一个对象：Calendar rightNow = Calendar.getInstance();
		Calendar instance = Calendar.getInstance();// 其实本质是获取了一个子类对象，只不过用多态来保存子类对象
		System.out.println(instance);
		
		// 调用方法：
		// 1.int get(int field) 获取某一个字段（当前Calendar常量）的时间
		int year = instance.get(Calendar.YEAR);// 这里就是获取年这个字段的值，使用常量YEAR
		int month = instance.get(Calendar.MONTH);// 这里就是获取月份这个字段的值	月份是：0-11
		int day = instance.get(Calendar.DAY_OF_MONTH);// 这里就是获取月份中的日期这个字段的值
		System.out.println(year + "年" + (month + 1) + "月" + day + "日");
		
		/*
		 * 2.abstract void add(int field, int amount)  添加时间操作
		 * 		field:是Calendar中的常量
		 * 		amount:如果是正数，表示+，如果是负数，就是减。但是注意，月、日都会导致进位退位
		 * 		月份从：0-11	
		 * 		如果月份超过11，则进年，如果日期超过所在月份的最大或者最小一天，则进月或者退月
		 */
//		instance.add(Calendar.YEAR, 2);// +2年
//		year = instance.get(Calendar.YEAR);// 重新获取年
//		System.out.println("新的年：" + year);
		
		instance.add(Calendar.MONTH, 9);// +9个月
		year = instance.get(Calendar.YEAR);// 重新获取年，因为进位了年，即年+1了
		month = instance.get(Calendar.MONTH);// 重新获取年和月
		System.out.println("新的年：" + year);
		System.out.println("新的月：" + month);
		
		// 3.void set(int field, int value)可以直接设置某一个字段的值，例如设置年   set(Calendar.YEAR，2050)； 
		
		// 4.Date getTime()   将Calendar对象转换为Date类型
		// 5.void setTime(Date date)  将Date转换为Calendar
		// 6.boolean after(Object when)  
		// 7.boolean before(Object when)  
	}

}
