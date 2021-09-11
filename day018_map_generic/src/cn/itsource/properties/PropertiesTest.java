package cn.itsource.properties;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;

/**
 *	Properties类：常用来做配置文件	（掌握）
 *		3. 使用：一定要使用Properties自己的方法，才能使key和value都是String类型
 *			3.1. 将内存中的数据，写出到硬盘
 *				void list(PrintStream out) 将此属性列表打印到指定的输出流。  
				void list(PrintWriter out) 将此属性列表打印到指定的输出流。  
 *				
 				存放值方法： setProperty(String key,String value);
 */
public class PropertiesTest {

	public static void main(String[] args) throws Exception {
		// 将内存中的数据，写出到硬盘
		// 1. 先创建Properties对象: 无参构造 Properties() 
		Properties p = new Properties();
		// 2. Properties对象p调用赋值方法【准备数据】 存放值方法： setProperty(String key,String value);
		// 在项目中配置文件的key都是约定好的 
		p.setProperty("username", "admin");// key:"username" 指用户名
		p.setProperty("password", "root");// key:"password" 指密码
		
		/*
		 * 步骤3. 调用void list(PrintStream out) 方法将内存中的p的数据写到硬盘
		 * 		这里需要PrintStream对象，所以需要从API中找到构造方法(找最熟悉)
		 *			构造方法 PrintStream(String fileName) 使用指定的文件名创建新的打印流，无需自动换行。 
		 *				fileName：文件名
		 *					1. 绝对路径：是从盘符（Windows）或者根目录（Linux）开始的
		 *						例如：F:/test/mysql.properties
		 *					2. 相对路径：是从当前项目开始，保存到当前项目下【必须刷新项目才能看到文件】
		 *						例如：mysql.properties	
				使用IO流的时候，必须要记得关流： close();用finally
		 */
		// 先创建一个PrintStream对象ps,赋值为new出来的PrintStream对象，参数是String类型的，值:"mysql.properties"
		PrintStream ps = new PrintStream("mysql.properties");// 表示会在当前项目目录下 生成一个 mysql.properties 名字的文件。刷新项目可以看到
		// Properties对象p调用list方法,将ps作为参数传入。将数据写到硬盘
		p.list(ps);
		
		// 打印一句话，表示写出成功！
		System.out.println("写出硬盘成功！");
		
	}

}
