package cn.itsource.system;

import java.util.Arrays;

/**
 *	System类（重点掌握两个方法）
	1.System.arraycopy(Object[] src, int srcPos, Object[] dest, int destPos, int length)(掌握)
		数组复制方法
		src: 源数组
		srcPos:源数组开始复制的下标
		dest: 目标数组
		destPos:目标数组开始复制下标
		length: 复制的元素个数
		从源数组src中的srcPos下标处，开始复制 length个元素到目标数组dest中，从destPos下标开始粘贴
		注意不要超过两个数组的长度限制,并且这个方法可以对同一个数组进行复制
		
	2.System.currentTimeMillis()（掌握）返回当前long类型时间毫秒数。主要是用了测试程序运行时间
 */
public class SystemTest {

	public static void main(String[] args) {
		// 2.System.currentTimeMillis()（掌握）返回当前long类型时间毫秒数。主要是用了测试程序运行时间
		long startTime = System.currentTimeMillis();// 获取数组复制之前的时间毫秒数
		
		/*
		 * 1.System.arraycopy(Object[] src, int srcPos, Object[] dest, int destPos, int length)(掌握)
			数组复制方法
			src: 源数组
			srcPos:源数组开始复制的下标
			dest: 目标数组
			destPos:目标数组开始复制下标
			length: 复制的元素个数
			从源数组src中的srcPos下标处，开始复制 length个元素到目标数组dest中，从destPos下标开始粘贴
			注意不要超过两个数组的长度限制,并且这个方法可以对同一个数组进行复制
		 */
		// 先创建两个数组，一个动态创建，一个静态创建
		int[] src = {1, 2, 6, 9, 69};
		int[] dest = new int[4];
		// 需求：从数组src的第2个元素开始复制到目标数组 dest中，从目标数组第一个元素开始粘贴，连续复制3个元素。
		System.arraycopy(src, 1, dest, 0, 3);
		// 调用完方法后，直接调用toString方法打印数组字符串
		String str = Arrays.toString(dest);
		System.out.println(str);
		
		// 2.System.currentTimeMillis()（掌握）返回当前long类型时间毫秒数。主要是用了测试程序运行时间
		long endTime = System.currentTimeMillis();// 获取数组复制之后的时间毫秒数
		System.out.println("复制数组用时：" + (endTime - startTime) + "毫秒");
	}

}
