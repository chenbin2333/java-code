package cn.itsource.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.itsource.uitl.IOUtil;

/**
 *	文件复制案例
 *	使用到文件字节输入流、文件字节输出流
 *	并且一边读取，一边写出
 */
public class FileCopy {

	public static void main(String[] args) {
		// 创建FileInputStream文件字节输入流对象fis,赋值为null。 【为了可以在finally中关流可以访问到fis，所以声明在try上面】
		FileInputStream fis = null;
		// 创建FileOutputStream文件字节输入流对象fos,赋值为null。【为了可以在finally中关流可以访问到fos，所以声明在try上面】
		FileOutputStream fos = null;
		try {
			// 将对象fis赋值为新创建的FileInputStream对象，参数为：mygirl.jpg【参数表示在当前项目下存在一个mygirl.jpg文件】
			fis = new FileInputStream("mygirl.jpg");
			// 将对象fos赋值为新创建的FileOutputStream对象，参数为：copyJpg.jpg
			fos = new FileOutputStream("copyJpg.jpg");// 输出的文件在相对路径下，即项目下面
			
			byte[] b = new byte[1024];// 创建一个1024长度的byte数组b，用来保存每次读取的字节数据。
			int count;// 声明一个int类型变量count，保存每次读取的字节个数
			while ((count = fis.read(b)) != -1) {// 读取了一次，将读取的字节个数保存到count变量中，而数据是保存到字节数组b中
				// 对象fos调用方法1. void write(byte[] b, int off, int len) 	将 len字节从位于偏移量 off的指定字节数组写入此文件输出流。  最常用
				fos.write(b, 0, count);// 将数组b中数据，从下标0开始写出count个【一边读取，一边写出】
			}
			// 打印一句话，表示运行结束
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {// 关流必须在finally中，关流原则:先开后关。
			// 先开后关,直接调用工具类IOUtil中方法close
			IOUtil.close(fis, fos);
		}
	}

}
