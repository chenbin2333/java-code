package homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HomeWork {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		//test1(list);
		test2();
		//test3();
//		String src = "abcdabceabcvab";
//		String str = "ab";
//		System.out.println(test4(src, str, 0, 0));
	}
	/*
	 * 1. 将ArrayList集合中重复元素，用最简单的方式去重，必须保证原有顺序【必做】
			1. 运行效率最快
			2. 代码最简洁
		思路：
			使用linkedHashSet去重，并保证有序
	 */
	public static void test1(ArrayList list) {
		LinkedHashSet linkedHashSet = new LinkedHashSet(list);
		System.out.println(linkedHashSet);
	}
	
	/*
	 * 2. 设计一个方法，输入一个字符串参数，将字符串中重复的字符去除后返回新字符串。
			例如("abcdefa") => abcdef【高级，牛皮的做】
			char[] c = toCharArray();
			转换为Character[]
			List<Character> list = Arrays.asList(c);
			LinkedHashSet lhs = new LinkedHashSet(list);
			new StringBuilder().append(元素).toString
	 */
	public static void test2() {
		String str = "abcdefa";
		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char d : c) {
			// sb.indexOf(str);查找当前str在sb中第一次出现的下标
			if (sb.indexOf(String.valueOf(d)) < 0) {
				sb.append(d);
			} 
		}
		sb.toString();
//		char[] c = str.toCharArray();
//		// 对字符数组进行排序，让重复的字符连续排列
//		Arrays.sort(c);
//		str = String.valueOf(c);
//		System.out.println(str.replaceAll("(.)\\1+", "$1"));// 这样可以去除连续重复的字符
		System.out.println(new StringBuilder(new StringBuilder(str).reverse().toString().replaceAll("(.)(?=.*\\1)","")).reverse().toString());
	}
	
	/*
	 * 3. 设计一个方法，查询一个字符串str在另外一个字符串src中出现的次数【高级，牛皮的做】
	 * 	思路：
	 * 		将src中的str替换为空字符串，将src替换前后的长度相减再除以str的长度得到出现的次数
	 */
	public static void test3() {
//		String src = "abcdabceabcvab";
//		String str = "ab";
//		int count = 0;
//		while(src.indexOf(str) != -1) {
//			src = src.substring(src.indexOf(str) + str.length());
//			System.out.println(src);
//			count++;
//		}
//		System.out.println(count);
		
//		String src = "abcdabceabcvab";
//		String str = "ab";
//		int len = src.length();
//		int len2 = src.replace(str, "").length();
//		System.out.println("出现了：" + (len - len2) / str.length() + "次");
		
		String src = "abcdabceabcvab";
		String str = "ab";
		char[] c = src.toCharArray();
		char[] c1 = str.toCharArray();
//		int i = 0;
//		int j = 0;
//		int count = 0;
//		for (; i < c.length; i++) {
//			if (c[i] == c1[j]) {
//				if (j == c1.length - 1) {
//					count++;
//					j = 0;
//				} else {
//					j++;
//				}
//			} else {
//				j = 0;
//				if (c[i] == c1[j]) {
//					j++;
//				}
//			}
//		}
//		System.out.println(count);
		
		HashSet<Character> hs = new HashSet<Character>();
		for (Character ch : c1) {
			hs.add(ch);
		}
		int i = 0;
		int count = 0;
		for (Character ch : c) {
			if(!hs.add(ch)) {
				i++;
			} else {
				i = 0;
			}
			if(i == 2) {
				count++;
				i = 0;
			}
		}
		System.out.println(count);
	}
	
	public static int test4(String src, String str, int i, int count) {
		if(src.indexOf(str, i) == -1) {
			return count;
		}
		return test4(src, str, src.indexOf(str, i) + str.length(), count + 1);
	}
}
