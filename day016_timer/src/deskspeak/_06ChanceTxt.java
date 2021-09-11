package deskspeak;

import java.util.Arrays;

/**
 * 6. 请将下面所有的文件中选出所有是txt类型的文件，并将该类型文件所有首字母改为大写，
	并且返回新数组（中级） 【选做】
	String[] arr = {"hao.html", "Hello.exe", "haha.txt", "abc.txt",
			"cdf.doc", "test.png", "test2.jpg"};
			
			思路：先遍历将每一个字符串拿出来，再判断哪些字符串以txt结尾，最后再改首字母。
 *
 */
public class _06ChanceTxt {

	public static void main(String[] args) {
		String[] arr = {"hao.html", "Hello.exe", "haha.txt", "abc.txt","cdf.doc", "test.png", "test2.jpg"};
		for (int i = 0; i < arr.length; i++) {
		//boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。（参数必须连续）
		if (arr[i].endsWith("txt")) {
			char charAt = arr[i].charAt(0);//取出第一个字母。
			charAt -= 32;//将txt结尾的字符串的首字母变成大写。
			// char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
			char[] charArray = arr[i].toCharArray();
			charArray[0] =charAt; 
			String valueOf = String.valueOf(charArray);//将字符数组转为字符串。
			arr[i] = valueOf;//将这个字符串赋值给arr[i]

//			System.out.println(arr.toString());
//			System.out.println(arr[i]);
		}	
		}
		System.out.println(Arrays.toString(arr));//[hao.html, Hello.exe, Haha.txt, Abc.txt, cdf.doc, test.png, test2.jpg]
		
		
		
		//2
		for (int i = 0; i < arr.length; i++) {
		// 逐个遍历将首字母大写
		if (arr[i].endsWith("txt")) {
			arr[i] = arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
		}
	}
		System.out.println(Arrays.toString(arr));//[hao.html, Hello.exe, Haha.txt, Abc.txt, cdf.doc, test.png, test2.jpg]
	}

}
