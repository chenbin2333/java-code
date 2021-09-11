package deskspeak;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Homework {

	public static void main(String[] args) {
		arrNew();
		countNum();
		countP();
		lengen();
		dataOutPut();
		// 因为题意返回的是数组地址，所以遍历
		for (String s : test06()) {
			System.out.println(s);
		}
		System.out.println(test07("let there be light"));
	}
	/**
	 * 1. 将int[] arr = ｛22，11，44，8，2，80，77｝ 
	 * 复制arr到新数组 newArr中连续4个元素，
	 * 源数组从第3个元素开始赋值，
		新数组从第2个元素开始粘贴，
		新数组的长度根据复制的元素个数确定。最后升序排列		
	 */
	public static void arrNew() {
		int[] arr= {22, 11, 44, 8, 2, 80, 77};
		//赋值3号到6号的元素到新数组
		int[] arr2 = new int[5];
		//int[] arr2 = Arrays.copyOfRange(arr, 2 , 6);
		//int[] arr3 = new int[arr2.length + 1];
		System.arraycopy(arr, 2, arr2,1, 4);
		//从动态创建的新数组第二个开始赋值
//		for (int i = 0; i < arr2.length; i++) {
//			arr3[i + 1] = arr2[i];
//		}
		//升序排列
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
	/**
	 * 	//如："abc21b416u" ===> 输出5
	public static int isNumeric(String str){
		代码
	}
	 */
	public static void countNum(){
		String str = "abc21b416u";
		int count = 0;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			//逐个字母使用isDigit判断是不是数字
			if (Character.isDigit(str.charAt(i))) {
				count += 1;
			}
		}
		System.out.println(count);
	}
	/**
	 * "peter piper picked a peck of pickled peppers"
	 * 统计这段绕口令有多少个以p开头的单词
	 */
	public static void countP(){
		String str = "peter piper picked a peck of pickled peppers";
		//按空格分为字符串数组
		String[] str1 = str.split(" ");
		int count = 0;
		for (String s : str1) {
			//遍历数p
			if (s.startsWith("p")) {
				count += 1;
			}
		}
		System.out.println("有" + count + "个p开头的单词");
	}
	/**
	 * 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
	 */
	public static void lengen(){
		String str = "lengendary";
		// 字符串分割为数组
		String[] str1 = str.split("");

//		for (String s : str1) {
//			System.out.println(s);
//		}
		// 改变数组偶数字母为大写  
		for (int i = 0; i < str1.length; i += 2) {
			str1[i] = str1[i].toUpperCase();
		}
		for (String s : str1) {
			System.out.print(s);
		}
		System.out.println();
	}
	/**
	 * 
	现有一个Date对象【自己创建一个即可】，请将该对象中获取 年月日时分秒 分别打印输出。
	提示：用到Calendar和Calendar中方法
	Calendar c = getInstance();
	 */
	public static void dataOutPut(){
		// 创建calendar对象
		Calendar calendar = Calendar. getInstance();
		Date date = new Date();
		calendar.setTime(date);
		System.out.println("年：" + calendar.get(Calendar.YEAR));
		System.out.println("月：" + calendar.get(Calendar.MONTH));
		System.out.println("日：" + calendar.get(Calendar.DATE));
	}
	/**
	 * 6. 请将下面所有的文件中选出所有是txt类型的文件，并将该类型文件所有首字母改为大写，
	并且返回新数组String[] arr = {"hao.html", "Hello.exe", "haha.txt", "abc.txt",
			"cdf.doc", "test.png", "test2.jpg"};
	 */
	public static String[] test06(){
		String[] arr = {"hao.html", "Hello.exe", "haha.txt", "abc.txt","cdf.doc", "test.png", "test2.jpg"};
		for (int i = 0; i < arr.length; i++) {
			// 逐个遍历将首字母大写
			if (arr[i].endsWith("txt")) {
				arr[i] = arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
			}
		}
		return arr;
	}
	/**
	 * 7. 设计一个方法，给出一句英文句子： "let there be light"得到一个新的字符串，每个单词的首字母都替换为大写
		得到的新字符串是"Let There Be Light"
	 */
	public static String test07(String s){
		String str99 = ""; 
		String[] str = s.split(" ");
		for (String ss : str) { 
			String str3 = ss.substring(0,1).toUpperCase() + ss.substring(1);
			str99 += str3 + " ";
		}
		//trim() 方法用于删除字符串的头尾空白符。
		return str99.trim();
	}
}
