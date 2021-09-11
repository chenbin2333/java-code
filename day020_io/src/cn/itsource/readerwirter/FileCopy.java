package cn.itsource.readerwirter;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import cn.itsource.uitl.IOUtil;

/**
 *	文件复制案例
 *	使用到文件字符输入流、文件字符输出流
 *	并且一边读取，一边写出
 *
 *		字符流：（重点）
 *	使用场景：使用于处理文本相关的数据。
 *
 *		Reader 抽象类：
 *				|子类
 *			InputStreamReader（转换流）
 *				|子类
 *			FileReader：适用于读取字符相关的文件
 *				1. 构造方法：
 *						1.FileReader(File file) 
						2.FileReader(String fileName)	fileName：文件名（相对路径/绝对路径）
 *
 *				2. 读取方法：
 *						3. int read(char[] c)读取字符到char数组中		最常用
 *						2. int read()读取一个字符
 *						3. int read(char[] c,int start,int length)读取制定长度的字符到char数组中
 *				
 *		Writer 抽象类：
 *				|子类
 *			OutputStreamWriter（转换流）
 *				|子类
 *			FileWriter：适用于写出字符相关的文件
 *				1. 构造方法：
				 * 		1.FileWriter(File file) 	默认是false
						2.FileWriter(File file, boolean append)  
							append：表示是在文件末尾追加还是从头覆盖，如果true追加，false覆盖，默认是false
						3.FileWriter(String fileName) 	默认是false
						4.FileWriter(String fileName, boolean append)  
							fileName：文件名（相对路径/绝对路径）
 *				2. 写出方法：
 						// append方法底层就是write()方法。可以写出字符串序列【StringBuffer、StringBuilder、String】可以连续调用append方法；append().append()
 *						1. public Writer append(CharSequence csq, int start, int end)
 *						2. public Writer append(char c)
 *						3. public Writer append(CharSequence csq)
 						
 *						4. public void write(char[] c)
 *						5. public void write(String str)
 *						6. public void write(String str,int start,int end)
 */
public class FileCopy {

	public static void main(String[] args) {
		// 创建FileReader文件字符输入流对象fr,赋值为null。 【为了可以在finally中关流可以访问到fr，所以声明在try上面】
		FileReader fr = null;
		// 创建FileWriter文件字符输入流对象fw,赋值为null。【为了可以在finally中关流可以访问到fw，所以声明在try上面】
		FileWriter fw = null;
		try {
			// 将对象fr赋值为新创建的FileReader对象，参数为：reader.txt【参数表示在当前项目下存在一个reader.txt文件】
			fr = new FileReader("reader.txt");
			// 将对象fw赋值为新创建的FileWriter对象，参数为：writer.txt
			fw = new FileWriter("writer.txt");// 输出的文件在相对路径下，即项目下面
			
			char[] c = new char[1024];// 创建一个1024长度的char数组c，用来保存每次读取的字符数据。
			int count;// 声明一个int类型变量count，保存每次读取的字符个数
			while ((count = fr.read(c)) != -1) {// 读取了一次，将读取的字符个数保存到count变量中，而数据是保存到字符数组c中
				// 对象fw调用方法1. void write(char[] c, int off, int len) 	将 len字符从位于偏移量 off的指定字符数组写入此文件输出流。  最常用
				fw.write(c, 0, count);// 将数组c中数据，从下标0开始写出count个【一边读取，一边写出】
				/*
				 *  append方法底层就是write()方法。
				 *  可以写出字符串序列【StringBuffer、StringBuilder、String】
				 *  可以连续调用append方法；append().append()
				 */
				// 这里只是为了测试append方法而已，自己根据需求确定是否要写。
				fw.append(new String(c, 0, count)).append("\r\n");
				/*
				 *  该方法是刷新方法，其实字符流输出流在写出数据的时候，并没有真正的写出去，而是写在在字符缓冲区，
				 *  当调用flush方法的时候，才真正的将缓冲区数据写到硬盘。
				 *  关流会自动先调用flush方法
				 */
//				fw.flush();
			}
			// 打印一句话，表示运行结束
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 关流必须在finally中，关流原则:先开后关。
			// 先开后关,直接调用工具类IOUtil中方法close
			IOUtil.close(fr, fw);
		}
	}

}
