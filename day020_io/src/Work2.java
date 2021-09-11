

import java.io.File;
import java.util.Arrays;

/**
 * 2. 写一个方法，传入一个文件夹对象File file，统计该文件夹大小（递归）（中级）
	可能会使用到的方法：length() 、isFile()、isDirectory() 、listFiles(...)【选做】
	方法：至少有3种，只要会一种即可
		方法1：静态的
		方法2：两个参数，一个File对象，一个文件大小
		方法3：参考getSum
 * @author DB
 *
 */
public class Work2 {

	public static void main(String[] args) {
		// 创建File对象,参数为F盘
		File file = new File("F:/");
		// 调用方法name
		long fileLength = getFileLength(file);
		System.out.println(fileLength);
	}
	public static long getFileLength(File file) {
		// 定义一个long类型的变量记录文件的大小
		long sum = 0;
		// 判断当前路径对象是否存在
		if(file == null || !file.exists()){
			return sum;
        }
		// 调用listFiles方法,得出每个文件夹或者文件的名字返回为File对象数组
		File[] listFiles = file.listFiles();
		if (listFiles != null) {
			// 循环遍历数组获取文件对象的路径
			for (File file2 : listFiles) {
				// 调用isFile方法判断当前是否是文件
				if (file2.isFile()) {
					// 调用length方法得到文件的大小,用sum累加
					sum += file2.length();
				} else {
					// 如果是文件夹,则调用getFileLength方法,递归遍历每个层级下的文件,sum累加每次最后得到的文件大小,
					sum += getFileLength(file2);
				}
			}
		}
		return sum;
	}
}
