package cn.itsource.autocloseable;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import cn.itsource.uitl.IOUtil;

/**
 *	7. jdk7关流的新方式：
	 用新结构可以自动关流
	前提：该流必须是实现了一个接口	AutoCloseable	
	语法：
		try(
			// 只能写创建流的操作，不能写其他业务操作
		){
			// 可能有异常的代码或者业务代码
		} catch (异常类型1 e) {
			
		}...不需要finally关流了
 */
public class AutoCloseableTest {

	public static void main(String[] args) {
		try (
			// 只能写创建流操作，不能写其他业务操作
			FileReader fr = new FileReader("reader.txt");
			FileWriter fw = new FileWriter("writer.txt");
		) {
			// 可能有异常的代码或者业务代码
			char[] c = new char[1024];
			int count;
			while ((count = fr.read(c)) != -1) {
				fw.write(c, 0, count);
			}
			System.out.println("复制成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
