package cn.itsource.local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Local【掌握】本地
 *		【多练习LocalDateTime中的方法】
	  Local(本地) − 简化了日期时间的处理，没有时区的问题。
	Zoned(时区) − 通过指定的时区处理日期时间。
	新的java.time包涵盖了所有处理日期，时间，日期/时间，时区，时刻（instants），过程（during）与时钟（clock）的操作
		LocalDate：本地日期
		LocalTime：本地时间
		LocalDateTime：本地日期时间【建议使用】
		ZonedDateTime：时区日期时间
		ZonedID
		只要为了解决：
			1. 线程安全问题
			2. 时间单位不统一问题
	 * 	1. 先获取通过静态方法获取对应的对象
	 * 	2. 调用方法
 */
public class LocalDateTest {

	public static void main(String[] args) {
		// 获取当前的日期时间 【多练习LocalDateTime中的方法】
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("当前时间: " + currentTime); 
		
		LocalDate date1 = currentTime.toLocalDate(); 
		System.out.println("date1: " + date1); 
		
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds = currentTime.getSecond();
		System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);
		
		System.out.println("===================================");
		
		// 获取当前时间日期
		// 将字符串解析为对应的时区日期时间对象
		ZonedDateTime date = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]"); 
		System.out.println("date: " + date);
		
		ZoneId id = ZoneId.of("Europe/Paris");// 将字符串转换为对应的时区id 
		System.out.println("ZoneId: " + id);
		
		ZoneId currentZone = ZoneId.systemDefault(); // 获取当前默认的系统时区
		System.out.println("当期时区: " + currentZone);
		
	}

}
