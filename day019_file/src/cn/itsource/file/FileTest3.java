package cn.itsource.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 *	File
		3. 常用方法：
			常用方法：获取子文件夹或者子文件方法
		 * 	1.String[] list()获取当前文件夹下所有的子文件夹或者子文件的名	// 文件没有下一级
			2.File[] listFiles() 获取当前文件夹下所有的子文件夹或者子文件对象
		
			===================================有过滤功能===================================
 *			3.String[] list(FilenameFilter filter) 
				获取根据文件名过滤后的文件名
				FilenameFilter：文件名过滤器接口
			4.File[] listFiles(FilenameFilter filter)
				获取根据文件名过滤后的文件对象
				FilenameFilter：文件名过滤器接口
				
			-----------------------------上面只能根据文件名或者文件夹名过滤，下面的可以通过文件的其他属性过滤，例如：文件大小等-----------------------------
			5.File[] listFiles(FileFilter filter)
				获取根据文件过滤后的文件对象
				FileFilter：文件过滤器接口
 */
public class FileTest3 {

	public static void main(String[] args) throws IOException {
		// 在硬盘上存在一个文件夹dir(F:\\test)，并且该文件夹还有下一级子文件夹或子文件
		File dir = new File("F:\\test");
		
		/*
		 * 3.String[] list(FilenameFilter filter) 
				获取根据文件名过滤后的文件名
				FilenameFilter：文件名过滤器接口 
		 */
//		String[] list = dir.list(new FilenameFilter() {// 匿名内部类方式，直接new 接口即可自动生成
//			
//			@Override // accept方法，是过滤方法。
//			public boolean accept(File dir, String name) {
//				System.out.println("dir: " + dir);// dir是当前文件夹对象
//				System.out.println("name    : " + name);//  name表示当前遍历到的子文件或者子文件夹名
////				return false;// false表示所有子文件或者子文件夹不满足要求
////				return true;// false表示所有子文件或者子文件夹满足要求
//				// 需求：获取所有的 exe子文件
//				return name.endsWith(".exe");
//			}
//		});
//		// 打印数组
//		System.out.println("list = " + list);
//		// 打印数组的拼接字符串
//		System.out.println(Arrays.toString(list));
			
		
		/*
		 * 4.File[] listFiles(FilenameFilter filter)
				获取根据文件名过滤后的文件对象
				FilenameFilter：文件名过滤器接口
		 */
//		File[] list2 = dir.listFiles(new FilenameFilter() {// 匿名内部类方式，直接new 接口即可自动生成
//			
//			@Override // accept方法，是过滤方法。
//			public boolean accept(File dir, String name) {
//				System.out.println("dir: " + dir);// dir是当前文件夹对象
//				System.out.println("name    : " + name);//  name表示当前遍历到的子文件或者子文件夹名
////				return false;// false表示所有子文件或者子文件夹不满足要求
////				return true;// false表示所有子文件或者子文件夹满足要求
//				// 需求：获取所有的 txt子文件
//				return name.endsWith(".txt");
//			}
//		});
//		// 打印数组
//		System.out.println("list2 = " + list2);
//		// 打印数组的拼接字符串
//		System.out.println(Arrays.toString(list2));
		
		
		
		/*
		 * 5.File[] listFiles(FileFilter filter)【该方法扩展性强】
				获取根据文件过滤后的文件对象
				FileFilter：文件过滤器接口
		 */
		File[] list3 = dir.listFiles(new FileFilter() {
			
			@Override // accept方法是过滤方法
			public boolean accept(File pathname) {
				// pathname：是当前遍历到的子文件或者子文件夹对象
				System.out.println("pathname = " + pathname);
				// 需求：获取所有的 .txt文件或者 文件长度>=60000kb的文件 60000kb = 60000*1024b		
				/*if (pathname.getName().endsWith(".txt") || pathname.length() >= 20000*1024) {
					return true;
				}
				return false;
				用下面一句代码简化
				*/
				return pathname.getName().endsWith(".txt") || pathname.length() >= 60000*1024;
			}
		});
		// 打印数组
		System.out.println("list3 = " + list3);
		// 打印数组的拼接字符串
		System.out.println(Arrays.toString(list3));
		
		
	}

}
