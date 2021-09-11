package cn.itsource.buffered;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import cn.itsource.uitl.IOUtil;

/**
 * 8. 缓冲流：（重点）包装流
 *		1.概念： 提高读取和写出效率的流,缓冲流可以使用标记和回读方法，缓冲流还有预读功能。
 *		2.作用： 标记和回读和预读。
 		3.使用场景：适用于大文件的上传和下载。
 *		4.
 *			BufferedInputStream
 *				字节输入缓冲流构造方法：
		 		1.BufferedInputStream(InputStream in) 创建一个默认缓冲区大小的缓冲流
				2.BufferedInputStream(InputStream in, int size)创建一个指定缓冲区大小size的缓冲流
				
 *			BufferedOutputStream
 				字节输出缓冲流构造方法：
				1.BufferedOutputStream(OutputStream out) 
				2.BufferedOutputStream(OutputStream out, int size) 
 *				
 *			BufferedReader
 				 字符输入缓冲流构造方法：
		 		1.BufferedReader(Reader in) 创建一个默认缓冲区大小的缓冲流
				2.BufferedReader(Reader in, int size) 创建一个指定缓冲区大小的缓冲流
 *				
 				特殊的读取方法，其他读取方法跟字符流一样：
 					String readLine()读取一行字符串
 
 *			BufferedWriter
				字符输出缓冲流构造方法：
				1.BufferedWriter(Writer out) 
				2.BufferedWriter(Writer out, int size) 
			
				特殊的写出方法，其他写出方法跟字符流一样：
 					writer（String str）
 *					newLine()写出一个换行符
 */
public class BufferedTest {

	public static void main(String[] args) {
		try (
			// 只能写创建流操作，不能写其他业务操作
			FileReader fr = new FileReader("reader.txt");
			// 创建字符输入缓冲流BufferedReader，将字符流对象作为参数
			BufferedReader br = new BufferedReader(fr);
				
			FileWriter fw = new FileWriter("buff.txt");
			// 创建字符输入缓冲流BufferedReader，将字符流对象作为参数
			BufferedWriter bw = new BufferedWriter(fw);
				
		) {
			// 可能有异常的代码或者业务代码
			String line;// 声明一个String遍历line用来保存每次读取一行的数据
			// 输入缓冲流中readLine方法是表示读取一行数据
			while ((line = br.readLine()) != null) {// 只要读取的数据不为null，表示没有读完
				System.out.println(line);
				// 输出缓冲流将读取的一行数据line写出去
				bw.write(line);
				// 写出换行符，newLine()写出一个换行符
				bw.newLine();
			}
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
