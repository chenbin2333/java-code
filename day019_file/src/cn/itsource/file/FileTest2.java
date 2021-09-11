package cn.itsource.file;

import java.io.File;
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
public class FileTest2 {

	public static void main(String[] args) throws IOException {
		// 测试 获取子文件夹或者子文件方法
		
		// 方法1.String[] list()获取当前文件夹下所有的子文件夹或者子文件的名	// 文件没有下一级
		
		// 情况一： 在硬盘上存在一个文件夹dir(F:\\test)，并且该文件夹还有下一级子文件夹或子文件
		File dir = new File("F:\\test");// dir调用String[] list()
//		String[] list = dir.list();
//		System.out.println(list);
//		System.out.println(Arrays.toString(list));
		
		// 情况二：在硬盘上存在一个文件夹 dir2(F:\\test2) ，该文件夹没有下一级	返回空数组
		File dir2 = new File("F:\\test2");// dir2调用String[] list()
//		String[] list2 = dir2.list();
//		System.out.println(list2);
//		System.out.println(Arrays.toString(list2));
		
		// 情况三：在硬盘上不存在一个文件夹对象dir3(F:\\test3)  调用exist()返回false	硬盘不存在的文件夹，就没有下一级，返回null
		File dir3 = new File("F:\\test3");// dir3调用String[] list()
//		String[] list3 = dir3.list();
//		System.out.println(list3);
//		System.out.println(Arrays.toString(list3));
		
		// 情况四：在硬盘上存在一个文件对象file(F:\\test.txt) 	文件没有下一级，返回null
		File file = new File("F:\\test.txt");// file调用String[] list()
		String[] list4 = file.list();
		System.out.println(list4);
		System.out.println(Arrays.toString(list4));
		
		// 方法2.File[] listFiles() 获取当前文件夹下所有的子文件夹或者子文件对象
		
	}

}
