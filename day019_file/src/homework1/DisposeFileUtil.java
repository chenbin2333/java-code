package homework1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

public class DisposeFileUtil {
	public static void writerToDisk() throws Exception {
		// 创建Properties对象
		Properties p = new Properties();
		// 创建 PrintStream对象
		PrintStream ps = new PrintStream("myLove.properties");
		// 存放值
		p.setProperty("name", "James");
		p.setProperty("add", "USA");
		// 将数据写到硬盘
		p.list(ps);
	}
	public static void readFromDisk() throws Exception {
		// 创建Properties对象
		Properties p = new Properties();
		// 创建FileInputStream对象
		FileInputStream file = new FileInputStream("myLove.properties");
		// 将数据读取到内存
		p.load(file);
		// 通过key获取值
		String name = p.getProperty("name");
		String add = p.getProperty("add");
		System.out.println(name);
		System.out.println(add);
	}
}

