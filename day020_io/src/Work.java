

import java.io.File;

/**
 * 1. 写一个方法，传入一个文件夹对象File file，删除当前文件夹中全部内容【必做】

2. 写一个方法，传入一个文件夹对象File file，统计该文件夹大小（递归）（中级）
	可能会使用到的方法：length() 、isFile()、isDirectory() 、listFiles(...)【选做】
	方法：至少有3种，只要会一种即可
		方法1：静态的
		方法2：两个参数，一个File对象，一个文件大小
		方法3：参考getSum
 * @author 朱
 *
 */
public class Work {

	public static void main(String[] args) {
		//1. 写一个方法，传入一个文件夹对象File file，删除当前文件夹中全部内容【必做】
		File file = new File("E:\\2021_03_15班 成都\\作业\\day001");
		delete(file);
	}
	public static void delete(File file) {
		if (file == null || !file.exists()) {
			return;
		} 
		if (file.isFile()) {//判断是否为文件
			file.delete();//是文件直接删除
		} else if (file.isDirectory()) {//判断是否为文件夹
			File[] listFiles = file.listFiles();//获取当前文件夹的子文件或者文件夹
			if (listFiles != null) {//判断此数组是否为null
				for (File e : listFiles) {//递归
					delete(e);
				} 
				file.delete();//当所有文件删除完的时候 就会删除文件夹 
			}
		}
	}
}
