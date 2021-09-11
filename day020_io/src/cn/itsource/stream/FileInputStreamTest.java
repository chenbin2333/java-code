package cn.itsource.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * 2.字节流：（重点）
 * 使用场景：
 *		1.字节流适用于处理非文本、文字相关数据外所有的流问题，如，png/jpg/avi/map4/mp3/exe/doc
 *		2.字符流只适合处理【运算】文本、文字相关数据（编码乱码问题），主要是用来将读取的数据进行运算。例如，判断某字符串出现的次数等
 *
 *	1.输入流	abstract class InputStream:这个抽象类是表示输入字节流的所有类的超类。
 *							|
 *					FileInputStream 子类:文件字节输入流
 *						1. 构造方法
 *							FileInputStream(String name) 	name：表示(绝对路径、相对路径)文件名
 *							FileInputStream(File file) 
 *
 *						2. 普通方法：
							// 1. int read(byte[] b) 从输入流读取一些字节数，并将它们存储到缓冲区 b 。 【最常用】
 *							// 2. int read() 从输入流读取数据的下一个字节。  【了解】
							// 3. int read(byte[] b, int off, int len) 	从输入流读取最多 len字节的数据到一个字节数组。	
							
 */
public class FileInputStreamTest {

	public static void main(String[] args) {
		// 创建FileInputStream文件字节输入流对象fis,赋值为null。 【为了可以在finally中关流可以访问到fis，所以声明在try上面】
		FileInputStream fis = null;
		try {
			// 将对象fis赋值为new出来的FileInputStream对象，参数为：instream.txt
			fis = new FileInputStream("instream.txt");// 【参数表示在当前项目下存在一个instream.txt文件】
			
			// abcabcabc123哈哈哈【文件中数据】
			// 1. int read(byte[] b) 从输入流读取一些字节数，并将它们存储到缓冲区 b，返回值就是读取的字节个数 ,-1表示读完了。  最常用
			// 声明一个byte数组b，用来保存每次读取的字节数据，长度10。
			byte[] b = new byte[10];
			// 声明一个int类型变量count，保存每次读取的字节个数
			int count;
			// 因为不确定读取的次数，所以，while循环读取
			while ((count = fis.read(b)) != -1) {// 每次读取，将读取的字节个数保存到count变量中，而数据是保存到字节数组b中
				System.out.println("读取的字节数：" + count);
				/*
				 * 解码，将字节转换为字符串的过程
					1. String(byte[] bytes, String charsetName)"UTF-8"
							将byte数组，使用指定字符集转换为 String对象。   
					2. String(byte[] bytes) 将byte数组，用默认字符集转换为 String对象。  
					3. String(byte[] bytes, int offset, int length) 
							将byte数组的指定下标开始，指定长度的数据，使用默认字符集转换为 String对象。 
					4. String(byte[] bytes, int offset, int length, String charsetName) charsetName：字符集名
							将byte数组的指定下标开始，指定长度的数据，使用指定字符集转换为 String对象
				 */
				// 需求：看一下读取的字节数据，则需要用String构造方法创建对象，转换为字符串查看
				// 直接打印将byte数组b作为参数创建的String对象,【注意：】将字节数组b中从下标0开始连续count个字节转换为字符串
				System.out.println(new String(b, 0, count));
				
				// 3. int read( byte[] b,int off, int len) 	从输入流读取最多 len字节的数据到一个字节数组。【很少用】
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 关流必须在finally中
			// 只能关闭流，调用流中的方法：close()
			try {
				// 先判断fis不能为null，避免空指针异常。
				if (fis != null) {
					// fis调用close方法关闭流，释放资源
					fis.close();// 报错，继续try
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
