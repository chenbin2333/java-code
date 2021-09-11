package cn.itsource.charset;

import java.io.UnsupportedEncodingException;

/**
 * 乱码问题解决方案：（掌握）
		GBK:
			中文2个字节
			英文、数字：1字节
			
		UTF-8：	
			中文3~6个字节
			英文、数字：1字节
		
			编码：将字符串转换为字节
		 * 		1. byte[] getBytes()  根据默认字符集将当前字符串转换为字节数组
		 * 		2. byte[] getBytes(String charsetName) 	UTF-8/GBK
		 * 			按照指定的字符集将将当前字符串转换为字节数组
		 * 
		 * 解码：将字节转换为字符
		 * 		1.String(byte[] bytes, int offset, int length) 
		 * 			根据默认字符集将字节数组中从指定下标开始到指定长度结束的数据转换为字符串
		 * 			
		 * 		2.String(byte[] bytes, int offset, int length, String charsetName)
		 * 			根据指定字符集将字节数组中从指定下标开始到指定长度结束的数据转换为字符串
		 * 			charsetName：字符集名	例如 ： "GBK"、"UTF-8" 、"ISO-8859-1" 
		 * 		
		 * 		不常用
		 * 		3.String(byte[] bytes) 	根据默认字符集将字节数组转换为字符串
		 * 		4.String(byte[] bytes, String charsetName) 
		 * 			根据默认字符集将字节数组转换为字符串
		 * 
		 * 这里会有乱码问题：
		 * 	产生的原因：
		 * 		1、因为字符集不统一，即编码和解码new String(b,0,read,"gbk")字符集不一致
		 * 		2、因为字节流读取汉字的时候，字节数组长度不够，将一个汉字拆开了
		 * 解决：
		 * 	1. 用字符流用统一的字符集（最常用）
		 * 		
		 * 		浏览器	：	 UTF-8 
		 * 		前台：
		 * 			HTML	：UTF-8
		 * 			CSS		：UTF-8
		 * 			JS、JSP	：UTF-8
		 * 
		 * 		后台：
		 * 			java	：UTF-8
		 * 
		 * 		数据库：
		 * 			mysql、oracle、DB2	：UTF-8
		 * 
		 * 		开发工具：UTF-8
		 * 
			2. 文本文件用统一的字符集 且用字符流读取和写出文本相关文件（最常用）
		 * 	3. 用一个大的字节数组（一般不用）	
 */
public class CharsetTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/*
		 * 编码：将字符串转换为字节
		 * 		1. byte[] getBytes()  根据默认字符集将当前字符串转换为字节数组
		 * 		2. byte[] getBytes(String charsetName) 	UTF-8/GBK
		 * 			按照指定的字符集将将当前字符串转换为字节数组
		 */
		byte[] bytes = "吉泽小吕和龙泽宇潇在速八酒店打牌的故事.avi".getBytes("GBK");
		
		/*
		 * 解码：将字节转换为字符
		 * 		1.String(byte[] bytes, int offset, int length) 
		 * 			根据默认字符集将字节数组中从指定下标开始到指定长度结束的数据转换为字符串
		 * 			
		 * 		2.String(byte[] bytes, int offset, int length, String charsetName)
		 * 			根据指定字符集将字节数组中从指定下标开始到指定长度结束的数据转换为字符串
		 * 			charsetName：字符集名	例如 ： "GBK"、"UTF-8" 、"ISO-8859-1" 
		 * 		
		 * 		不常用
		 * 		3.String(byte[] bytes) 	根据默认字符集将字节数组转换为字符串
		 * 		4.String(byte[] bytes, String charsetName) 
		 * 			根据默认字符集将字节数组转换为字符串
		 */
		String str = new String(bytes, 0, bytes.length, "UTF-8");
		System.out.println(str);
	}

}
