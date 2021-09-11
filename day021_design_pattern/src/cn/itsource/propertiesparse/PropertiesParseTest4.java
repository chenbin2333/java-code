package cn.itsource.propertiesparse;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

/**
 *	4. 	Properties资源（配置）文件的解析（重点）
---------------------------------（注意：重点）-------------------------------------
	以后配置文件都要放到项目中的一个或者几个单独的文件夹中，为了好管理。
	该文件夹类型是source folder类型，资源文件夹，eclipse工具会自动编译
---------------------------------------------------------------------------------
		
	传统方式获取流是new创建的，而在web开发中有可能获取不到配置文件，为了避免这种情况，用以下方式获取流：
 
 	1. 通过当前类字节码文件获取流
 		当前类.class.getResourceAsStream("/文件路径/文件名");
 		/:如果是source文件夹，直接写文件名，如果是普通文件夹写文件夹名/文件名
 		
 	2. 通过类加载器的方式 
 		1.同当前类的加载器获取
 			1.当前类.class.getClassLoader();// 获取当前类加载器
 			2.classLoader.getResourceAsStream("文件路径/文件名");//通过类加载器获取流对象,如果是源文件夹，直接文件名
 
 		2.通过当前线程的类加载器获取流
 			1、ClassLoader classLoader = Thread.currentThread().getContextClassLoader();	//获取当前线程类加载器
			2、InputStream is = classLoader.getResourceAsStream("文件路径/文件名");//通过当前线程的类加载器获取流对象,如果是源文件夹，直接文件名
			
		建议用当前线程类的加载器方式获取流，线程安全问题
 */
public class PropertiesParseTest4 {
	@Test
	public void testPropertiesParse() {
		// 1. 创建Properties对象
		Properties p = new Properties();
		// 获取当前线程，然后继续获取当前线程的类加载器：
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		// 用关流新方式创建IO流对象
		try (
			/*
			 * 1.通过当前类的加载器获取
	 			2.classLoader.getResourceAsStream("文件路径/文件名");//通过类加载器获取流对象,如果是源文件夹，直接文件名
			 */
			InputStream is = classLoader.getResourceAsStream("mysql.properties");
		) {
			// 3. p调用load(流对象)，将配置文件的数据加载到内存的Properties对象p中
			p.load(is);
			// 4. p调用getProperty(String key)
			String username = p.getProperty("username");
			String password = p.getProperty("password");
			System.out.println(username + " : " + password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
