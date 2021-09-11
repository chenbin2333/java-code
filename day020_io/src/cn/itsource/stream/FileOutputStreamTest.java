package cn.itsource.stream;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 2.字节流：（重点）
 * 使用场景：
 *		1.字节流适用于处理非文本、文字相关数据外所有的流问题，如，png/jpg/avi/map4/mp3/exe/doc
 *		2.字符流只适合处理【运算】文本、文字相关数据（编码乱码问题），主要是用来将读取的数据进行运算。例如，判断某字符串出现的次数等
 *
 	2.输出流	abstract class OutputStream:这个抽象类是表示输出字节流的所有类的超类。
			|
		FileOutputStream 子类:文件字节输出流
			1. 构造方法
					FileOutputStream(String name) 		name：表示(绝对路径、相对路径)文件名
					FileOutputStream(String name, boolean append) 
						append：表示是否在该文件末尾追加数据，如果为true，表示追加，false，表示从头开始覆盖
						默认是false
					FileOutputStream(File file) 
					FileOutputStream(File file, boolean append) 
			
			2. 普通方法：
				// 1. void write(byte[] b, int off, int len) 	将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。  最常用
				// 2. void write(byte[] b)将 b.length个字节从指定的字节数组写入此文件输出流。  
				// 3. void write(int b) 将指定的字节写入此文件输出流。  
 */
public class FileOutputStreamTest {

	public static void main(String[] args) {
		// 创建FileOutputStream文件字节输入流对象fos,赋值为null。 【为了可以在finally中关流可以访问到fos，所以声明在try上面】
		FileOutputStream fos = null;
		try {
			// 将对象fos赋值为new出来的FileOutputStream对象，参数为：outstream.txt
//			fos = new FileOutputStream("outstream.txt");// 【参数表示在当前项目下存在一个outstream.txt文件】
			fos = new FileOutputStream("outstream.txt", true);// 表示后文件末尾继续追加数据
			// 声明一个String变量str,随便赋值，用来进行编码准备
			String str = "吉泽小吕和龙泽宇潇如家.avi";
			/*
			 * 将str进行【编码】：
			 * 【编码：将字符串转换为字节数组】
			 * 	byte[] getBytes() 
					使用环境默认的字符集将字符串转换为字节数组。  
				byte[] getBytes(String charsetName) 
					使用指定的字符集将字符串转换为字节数组
			 */
			byte[] b = str.getBytes();
			// 1. void write(byte[] b, int off, int len) 	将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。  最常用
			fos.write(b, 0, b.length);
			// 打印一句话，表示运行结束
			System.out.println("写出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 关流必须在finally中
			// 只能关闭流，调用流中的方法：close()
			try {
				// 先判断fos不能为null，避免空指针异常。
				if (fos != null) {
					// fos调用close方法关闭流，释放资源
					fos.close();// 报错，继续try
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
