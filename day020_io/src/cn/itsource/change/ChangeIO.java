package cn.itsource.change;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 6. 转换流：（重点）	目前唯一一个可以设置字符集的流

		（简单的理解为包装流，就是将字节流包装以下，方便操作文本相关的数据）
 *		使用场景：
 *			别人给提供了字节流，而需要处理文本数据，这时候，就需要用转换流转换一下，更方便处理文本数据
 *
 *		作用：就是一字符流的方式读取或写出文本相关的数据
 *		
 *		InputStreamReader：将字节输入流包装一下,让其更适合读取文本文件
 *			构造方法：
 *			1.InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
 *			2.InputStreamReader(InputStream in, String charsetName) 
						创建一个使用指定字符集的InputStreamReader。  
 *			普通方法：
 *				public int read(char[] cbuf)
 *				int read(char[] cbuf, int offset, int length)  

 *		OutputStreamWriter：将字节输出流包装一下,让其更适合写出文本文件
 *			构造方法：
 *			1. OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。 
 *			2. OutputStreamWriter(OutputStream out, String charsetName) 
					创建一个使用指定字符集的OutputStreamWriter。  
			普通方法：
				void write(char[] cbuf, int off, int len)  
				append(CharSequence csq,int start,int end)
				
		只有转换流可以设置字符集	
 *
 */
public class ChangeIO {

	public static void main(String[] args) {
		// 用关流新方式创建字节输入流和字节输出流
		try (
			FileInputStream fis = new FileInputStream("reader.txt");
			FileOutputStream fos = new FileOutputStream("changeio.txt");
		){
			// 调用copyFile方法，将fis和fos作为参数传入
			changeIO(fis, fos);
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 项目中目前已经有了字节流：InputStream和OutputStream对象了，但是现在需要去处理
	 * 文本相关的数据【数据的来源是字节流】。因为文本数据用字节流处理容易乱码
	 * 	这时候，我们希望，用字符流处理它，怎么办呢？ 用 转换流 解决，将字节流包装一下，就具备了字符的处理特点
	 */
	public static void changeIO(InputStream is,OutputStream os) {
		// 先判断is和os是否为null，如果是，则抛出异常提醒调用者
		if (is == null || os == null) {
			throw new IllegalArgumentException("非法参数异常，参数不能为空！！！");
		}
		// 将转换流创建写在关流新方式中
		try (
			// 声明一个InputStreamReader输入转换流isr,赋值为新创建InputStreamReader的对象。参数是is,设置字符集为"UTF-8"	
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			
			// 声明一个OutputStreamWriter输入转换流osw,赋值为新创建OutputStreamWriter的对象。参数是os,设置字符集为"UTF-8"	
			OutputStreamWriter osw =  new OutputStreamWriter(os, "UTF-8");
				
		) {
			char[] c = new char[1024];// 创建一个1024长度的char数组c，用来保存每次读取的字符数据。
			int count;// 声明一个int类型变量count，保存每次读取的字符个数
			while ((count = isr.read(c)) != -1) {// 读取了一次，将读取的字符个数保存到count变量中，而数据是保存到字符数组c中
				// 对象fw调用方法1. void write(char[] c, int off, int len) 	将 len字符从位于偏移量 off的指定字符数组写入此文件输出流。  最常用
				osw.write(c, 0, count);// 将数组c中数据，从下标0开始写出count个【一边读取，一边写出】
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
