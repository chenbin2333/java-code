package homework;

import java.util.Arrays;

/**
 * day007家庭作业
 * @author Administrator
 *
 */
public class Homework {
	public static void main(String[] args) {
		Homework.hobby("饭岛剑桥", "窥探");
		int[] arr = {1, 5, 3, 4, 8};
		Homework.swap(0, 2, arr);
		Homework.fill(arr, 0);
		Homework.product(1,2,3);
	}
	//	1. 设计一个方法，传入一个参数姓名name、一个参数爱好hobby，打印输出一句话：name的爱好是：hobby
	//2个参数 一个是 String的name  一个是String的hobby
	public static void hobby(String name,String hobby) {
		System.out.println(name+"的爱好是："+hobby);
	}
	//	2. 请设计一个方法swap，将int数组指定两个下标(下标不知道是多少，形参列表)的元素交换，不需要返回值。【中级】
	public static void swap(int a,int b,int[] rr) {
		int temp = rr[a];
		rr[a] = rr[b];
		rr[b] = temp;
		System.out.println("交换后的数组数据" + Arrays.toString(rr));
	}
	
	//	3. 请设计一个方法，将int数组arr中全部的元素批量初始化为int a。【初级】
	public static void fill(int[] arr,int a) {
		Arrays.fill(arr, a);
		System.out.println("批量初始化后的数组数据" + Arrays.toString(arr));
	}
	//	4. 请设计一个方法，求多个long类型变量的乘积,个数不确定。【初级】
	public static void product(long... a) {
		int ji = 1;
		for (long e : a) {
			ji *= e;
		}
		System.out.println("积是："+ ji);
	}
}
