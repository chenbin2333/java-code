package cn.itsource.recursion;

import java.io.File;

/**
 *	2. 递归recursion：【理解】
	1. 概念：是一种思想,也是一种算法。在方法内部调用自己的方法。（自己干自己）
	
	2. 作用：就是简化有相似的业务逻辑（循环）代码。
	
	3. 使用规律特点：
		1. 通过数值带入的方式，查找逻辑规律：	将所有的已知条件写出来
 				就是有相似运算逻辑的代码
 		2. 通过条件判断（条件/循环）的方式，在满足条件的时候根据规律调用自己的方法。
 			如果不满足就不会自己的方法，这就是出口
	
	4. 使用场景：
		1. 树状结构数据、菜单结构、上下级关系等的数据查询
 		2. 有相似逻辑运算的结构
 		3. 适用于层级结构少，数据量小的场景。（最重要）如果层级多，且数据量大用循环。
	
	5.  解决了哪些问题：
		(1)数据的定义是按递归定义的。（Fibonacci函数：斐波拉契数列）
 		(2)问题解法按递归算法实现。(汉诺塔问题)
 			这类问题虽则本身没有明显的递归结构，但用递归求解比迭代求解更简单，如Hanoi问题。
 		(3)数据的结构形式是按递归定义的。
 			如二叉树、广义表等，由于结构本身固有的递归特性，则它们的操作可递归地描述。
	
	6. 注意事项：
		1. 递归必须 有出口
 		2. 能用循环用循环，不要用递归，因为效率极其低下。
 			为什么效率低下？
 				方法的调用都是创建新栈帧，入栈，而栈层级是有限制的
 			StackOverflowError : 栈内存溢出错误。
 */
public class RecursionTest4 {

	public static void main(String[] args) {
		// 需求：设计方法，打印一个File对象中所有的.mp4文件
		File dir = new File("E:/");
		printMp4(dir);
		
	}
	
	/**
	 * 需求：设计方法，打印一个File对象中所有的.java文件
	 * 思路：
	 * 		1. 先判断当前File对象dir的合法性
	 * 			1.1 是否为null
	 * 			1.2 是否为在硬盘存在： exists()
	 * 		2. 判断当前dir是否是一个文件，如果是，则继续判断是否是.mp4结尾，如果是打印dir
	 * 		3. 判断当前dir是否是一个文件夹，如果是则获取所有的下一级子文件或者子文件夹
	 * 
	 * 		4. 遍历获取到的所有文件或者文件夹数组，然后继续2、3步骤的操作，这就是递归的规律。
	 * 			所以，在遍历的时候，只需要递归调用当前方法即可
	 * 
	 * @param dir
	 */
	public static void printMp4(File dir) {
		// 1. 先判断当前File对象dir的合法性: 1.1 是否为null  1.2 是否为在硬盘存在： exists()
		if (dir == null || !dir.exists()) {// 这里必须非null判断在前面，否则可能发生空指针异常
			// 直接结束方法
			return;
		}
		// 2. 判断当前dir是否是一个文件，如果是，则判断是否是.mp4结尾，如果是打印dir
		if (dir.isFile() && dir.getName().endsWith(".mp4")) {
			// 直接打印
			System.out.println(dir);
		} else if (dir.isDirectory()) {// 判断当前dir是否是文件夹
			// 获取所有的下一级子文件或者子文件夹
			File[] listFiles = dir.listFiles();
			// 为了避免空指针，要判断listFiles是否为null
			if (listFiles != null) {
				// foreach 遍历数组listFiles
				for (File f : listFiles) {// f表示每一个子文件或者子文件夹
					// 然后，继续进行上面相同的操作，这就是递归调用的方法
					printMp4(f);
				}
			}
		}
	}

}
