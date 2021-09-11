package cn.itsource.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *	3. 日期和时间相关类：（掌握）
 *	3.2 SimpleDateFormat类，用来进行时间格式化的。
	
		Format
 *	    	|
 *	   	DateFormat
 *		   |				
 *		 SimpleDateFormat类：用来将Date和String进行格式转换的
 *						直接打印日期显示的格式不符合地区习惯，需要转换格式
 *		
 *		构造方法：
 *			SimpleDateFormat() 
			SimpleDateFormat(String pattern)  创建一个含有指定字符串模板的SimpleDateFormat对象
 *
		1. 将Date转换为String类型【根据模板转换，模板是根据不同地区习惯设置】
 *			步骤：
 *				1. 创建对象
 *					SimpleDateFormat sdf = new SimpleDateFormat(String 模板);
 *				2. 将Date转换为String
 *					sdf.format(date);
 *
 *		2. 将String转换为Date类型
 *			步骤：
 *				1. 创建对象
 *					SimpleDateFormat sdf = new SimpleDateFormat(String 模板);
 *				2. 将String转换为Date
 *					sdf.parse(str);
 *		
 *			补充：
 *					sdf.applyPattern(String pattern);可以将SimpleDateFormat重新设置模板格式
 */
public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);// Tue Apr 06 14:49:02 CST 2021
		// 因为直接打印输出date对象，不符合中国人的习惯，阅读不方便。所以用SimpleDateFormat类进行格式转换
		/*
		 * 1. 将Date转换为String类型【根据模板转换，模板是根据不同地区习惯设置】
		 *	步骤：
		 *		1. 创建对象: SimpleDateFormat sdf = new SimpleDateFormat(String 模板);
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");// 创建对象，传入设置的字符串模板：
		// 2. 将Date转换为String，调用方法：sdf.format(date);
		String format = sdf.format(date);
		System.out.println(format);
		
		/*
		 * 2. 将String转换为Date类型
		 * 步骤：
		 *		1. 创建对象: SimpleDateFormat sdf = new SimpleDateFormat(String 模板);
		 */
		String src = "2050-07-26 05:27:01";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 注意：模板必须和字符串格式完全一致
		// 2. 将String转换为Date,调用方法：sdf.parse(str);
		Date parse = sdf2.parse(src);// 红色报错，不管，直接鼠标移动到报错位置，选择弹出框的第一个选项。
		System.out.println(parse);// Tue Jul 26 05:27:01 CST 2050
		
		// 如果希望重新修改当前模板，则调用方法：sdf.applyPattern(String pattern);可以将SimpleDateFormat重新设置模板格式
		sdf.applyPattern("yyyy/MM/dd HH:mm");
		String format2 = sdf.format(parse);
		System.out.println(format2);
		
	}

}
