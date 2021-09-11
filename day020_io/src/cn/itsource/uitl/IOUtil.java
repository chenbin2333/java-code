package cn.itsource.uitl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/**
 *	IO流工具类，专门用来关流
 */
public class IOUtil {
	
	/**
	 * 关闭字节流方法，所有子类都可以使用。
	 * @param is
	 * @param os
	 */
	public static void close(InputStream is, OutputStream os) {
		// 先开后关
		try {// 先写try，在try中写if判断
			// os非空判断，不为null才调用方法close
			if (os != null) {
				// 调用close()关流
				os.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 判断is是否非null
				if (is != null) {
					// 继续try catch
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
	
	/**
	 * 关闭字符流方法，所有子类都可以使用。
	 * @param reader
	 * @param writer
	 */
	public static void close(Reader reader, Writer writer) {
		// 先开后关
		try {// 先写try，在try中写if判断
			// writer非空判断，不为null才调用方法close
			if (writer != null) {
				// 调用close()关流
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 判断reader是否非null
				if (reader != null) {
					// 继续try catch
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}
}
