package cn.itsource.string;

import java.util.Arrays;

/**
 *	7. 字符串相关类：String、StringBuffer、StringBuilder	【重重点】
	（常用方法重点掌握）
	字符串相关的类：
 *		1. String 字符串类，底层是基于char[], 一旦创建长度就固定不变了,适用于字符串不经常增删改的操作的场景。父接口：CharSequence
 *			该接口的实现类：String、StringBuffer、StringBuilder
 *			String str = "abc";
 *			str += "d";//会创建新对象
 *		
 *		2. 将其他类型转换为String类型的方式效率问题：（重点）
 *			toString() > String.valueOf(Object obj); > +
 *			因为+号，底层先将字符串对象转换为StringBuilder对象，然后调用StringBuilder对象的append追加字符串方法，再调用toString方法
 *			转换为String对象
 *
 *		3. 拼接字符串效率最高的方式：	（重点）
 * 			StringBuilder.append() > StringBuffer.append() > +
 *
 *			如果经常操作字符串用StringBuilder和StringBuffer，如果是单线程或者多线程且不要求线程安全问题，用StringBuilder，
 * 			如果是多线程且是线程安全要求用StringBuffer
 
 *		4.常量池：提高效率【理解】
 * 
 * 			放字符串常量的地方，JDK8后是放在堆中
 *
	 *		当创建字符串对象是字面量(直接是="")的时候，会优先从常量池中查找，是否有该字符串对象，如果有，则会直接将常量池中的地址赋值给该String对象，
	 *		如果没有，则会在常量池创建对象，然后将对象常量池的地址给String对象保存
	 *
	 *		当创建字符串对象用new创建，会优先从常量池中查找，是否有该字符串对象，如果有，则会直接将常量池中的地址赋值给该String对象在堆中的地址，
	 *		如果没有，则会在常量池创建对象，然后将对象常量池的地址给String对象在堆中保存
	 *
	 *		equals方法：
	 *			比较两个字符串对象是否相等
	 *		
	 *		不要这样写，因为，name是String类型，有可能是null，避免空指针异常
	 *		if(name.equals("波波")){
	 *			
	 *		}
	 *		应该这样写：
	 *		if("波波".equals(name)){
	 *			
	 *		}
	 *		
	 *		不要这样写
	 *		for(int i = 0;i < arr.length; i++){
	 *
	 *		}
	 *		应该这样写：
	 *		for(int i = 0,j = arr.length; i < j; i++){
	 *
	 *		}
	 	
	 	5. String、StringBuffer、StringBuilder使用场景（重点）
	 	String 字符串类，底层是基于char[], 一旦创建长度就固定不变了,适用于字符串不经常增删改的操作的场景。
   
	 	StringBuilder: 基于定长的char[]，默认长度是16个，适用于频繁操作（增删改插）字符串的场景，
	 	该类是线程不安全的。
	 
	 	StringBuffer:基于定长的char[]，默认长度是16个，适用于频繁操作（增删改插）字符串的场景，
	 	该类是线程安全的。
		
		
	 	如果是单线程和多线程没有线程安全要求，用StringBuilder。
	 	如果是多线程有线程安全要求，用StringBuffer
	 	如果不经常操作字符串用 String节省空间
	 	
	 	StringBuffer和StringBuilder扩容机制：当要添加的字符串大于 > 当前字符数组的长度的时候
	 	扩容，扩容是： 原来长度*2+2 的方式扩容
 *
 */
public class StringTest {

	public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		1. String() 创建一个空的 String对象
				2. String(String original) 创建一个包含指定的String数据的String对象
					new String("abc");
				
				3. String(StringBuffer buffer) 
						将StringBuffer转为参数转换为String对象
				4. String(StringBuilder builder) 
						将StringBuilder转为参数转换为String对象
		 */
		String str = "abc";// 表示在常量池中创建了一个长度是3个的char数组
		String str2 = "abc";// 为了提高效率，会直接从常量池中找到上面创建的3个长度char数组，当找不到的时候，会重新再常量池创建新的char数组
		System.out.println(str == str2);// true,判断两个对象地址是否相等
		System.out.println(str.equals(str2));// true,判断两个对象值是否相等
		
		String str3 = new String("abc");// 创建了几个对象？
		String str4 = new String("abc");
		System.out.println(str3 == str4);// false,判断两个对象地址是否相等
		System.out.println(str3.equals(str4));// true,判断两个对象值是否相等
		
		
		str += "d";// 字符串拼接，表示在常量池中创建了一个新的char数组，长度是4个，并且将原来数组中的abc复制到了新数组【变量字符串拼接，会在常量池创建新的字符串常量】
		String str5 = "abc" + "d";// "abcd"，会优先从常量池查找有没有 "abcd"，有就直接用，没有就在常量池创建
		System.out.println(str);
		System.out.println(str == str5);// false
		
		
		// 神奇的东西
		char[] c = {'a', 'b', 'c', 'd', 'j'};
		System.out.println(c);// abcdj 直接打印字符数组就是打印的字符串
		System.out.println("地址：" + c);// 地址：[C@15db9742
		
		// 常用方法：
		// 1.char charAt(int index) 返回 char指定索引处index的字符。 不能超过下标范围
//		str = "abcefg";
//		char charAt = str.charAt(3);
//		System.out.println("下标3处的字符：" + charAt);
		
		// 2.String concat(String str) 将指定的字符串连接到该字符串的末尾。 相当于：+
// 		String concat = str.concat("大宝剑");
//		System.out.println("concat: " + concat);
//		System.out.println("str : " + str);
		
		/*
		 * 3.boolean contains(CharSequence s) 判断当前对象是否包含连续的参数s。s可以是以下三个子类的对象
		 * CharSequence接口，包含下面子类：String、StringBuffer、StringBuilder
		 */
//		str = "abcdefg";
//		boolean contains = str.contains("abc");// 判断当前对象str是否包含连续的参数abc
//		System.out.println("是否包含：" + contains);
		
		// 4.boolean endsWith(String suffix) 判断当前字符串是否以指定的后缀suffix结尾。（参数必须连续）  
		// 5.boolean startsWith(String prefix) 判断当前字符串是否以指定的前缀prefix开头。  （参数必须连续）  
		str = "某菲和波多野结熊老师速8.avi";
		boolean endsWith = str.endsWith(".avi");// 判断字符串str是否以 .avi结尾
		System.out.println("是否已指定的后缀结尾：" + endsWith);
		
//		/*
//		 * 8.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
//		 * srcBegin：字符串开始下标
//		 * srcEnd：字符串结束下标(不包含)
//		 * dstBegin：数组dst的下标
//		 * 将此字符串中的字符复制到目标字符数组dst中。  (含头不含尾)[srcBegin,srcEnd)
//		 */
//		str = "abceeeabcdefg";
//		char[] dst = new char[5];
//		str.getChars(2, 6, dst, 1);// 将字符串str中下标2开始到6结束【不包含6】的字符复制到数组dst中，从数组的下标1开始粘贴
//		System.out.println(Arrays.toString(dst));
//		
		// 9.int indexOf(String s) 返回s第一次在当前对象str中出现的索引 ，-1表示没有找到（注意：这里s必须也是匹配连续的字符串）
		str = "abcedfabdashj";
		int indexOf = str.indexOf("ab");// 查询当前str是 连续的字符串ab第一次出现的下标
		System.out.println("下标：" + indexOf);
		
//		// 10.int indexOf(String s, int fromIndex) 返回s在当前对象指定下标fromIndex后第一次出现的索引  (str是作为一个整体匹配下标的)
//		int indexOf2 = str.indexOf("abc",4);
//		System.out.println("下标：" + indexOf2);
//		
//		// 11.int lastIndexOf(String str) 返回指定子字符串最后一次出现的字符串中的索引。  
//		// 12.int lastIndexOf(String str, int fromIndex) 返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向前搜索。  
//		
//		// 13.boolean isEmpty() 当 length()为 0时，返回 true 。  
//		
//		// 14.int length() 返回此字符串的长度。  
		
		System.out.println("======================== 之间的方法我会讲 ==========================");
		// 15.boolean matches(String regex)  判断当前字符串对象是否匹配给定的正则表达式regex，通常用来进行权限限制，字符格式限制   	一般用了做校验：如，用户名和密码的合法性
//		str = "abc1";
		String regex = "^[a-zA-Z]+$";// 匹配a-z或者A-Z之间任意 >= 1个字符
//		boolean matches = str.matches(regex);// 判断str是否满足a-z或者A-Z之间任意一个字符的要求
//		System.out.println("是否满足:" + matches);
		
		/**
		 * replace()和replaceAll()，replaceFirst()区别
		 * replace()只能匹配String、StringBuffer、StringBuilder对象
		 * replaceAll()和replaceFirst()可以匹配正则表达式，更灵活
		 * 如：
		 */
		// 17.String replaceAll(String regex, String replacement) regex是正则表达式，将当前字符串中的regex全部替换为replacement  
		str = "abc.efadg";
		regex = "\\.";// 正则表达式中的.表示匹配任意一个字符 【\.在正则表达式中表示字符.  在Java中\需要转义一下，所以\\】
//		regex = ".";// 正则表达式中.表示匹配一个字符
		String replaceAll = str.replaceAll(regex, "#");
		System.out.println("replaceAll=====》: " + replaceAll);
		
//		// 18.String replaceFirst(String regex, String replacement)  将当前字符串中的第一个regex替换为replacement 
//		String replaceFirst = str.replaceFirst(regex, "#");
//		System.out.println("replaceFirst: " + replaceFirst);
		
		// 19.String[] split(String regex)  将当前字符串对象按照给定的正则表达式regex分割为String[]
//		str = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
//		// 请将当前str中所有的ip地址打印出来
//		String[] split = str.split(";");
//		for (String s : split) {
//			System.out.println(s);
//		}
		System.out.println("======================== 之间的方法我会讲 ==========================");
		
		/*
		 * 16.String replace(CharSequence target, CharSequence replacement)   将当前字符串中的target替换为replacement,通常用来和谐用语
		 * 父接口：CharSequence
 		 *			该接口的实现类：String、StringBuffer、StringBuilder
		 */
//		str = "WQNMLGB，你个DSB，我CNM";// WQNMLGB/DSB/CNM：和谐用语
//		String replace = str.replace("WQNMLGB", "*******");// *******,你个DSB，我CNM
//		System.out.println(replace);// *******，你个DSB，我CNM
//		System.out.println(str);// WQNMLGB，你个DSB，我CNM
//		
//		String replace2 = replace.replace("DSB", "***");//*******,你个***，我CNM
//		System.out.println(replace2);
//		
//		String replace3 = replace2.replace("CNM", "***");//*******,你个***，我CNM
//		System.out.println(replace3);
		
//		// 20.CharSequence subSequence(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
//		str = "12345678";
//		CharSequence subSequence = str.subSequence(1, 6);
//		System.out.println(subSequence);
//		
//		// 21.String substring(int beginIndex)   从当前字符串中截取beginIndex到最后的子串
//		str = "12345678";
//		String substring = str.substring(1);
//		System.out.println(substring);
//		// 22.String substring(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
//		
		str = "172.168.11.65;192.168.11.66;172.168.11.69;169.168.11.169;";
		// 需求：请将字符串中ip是172开头的 最后一段打印出来
		/*
		 * 思路：
		 * 1. 将字符串str先进行按照;分割
		 * 2. 遍历字符串数组，判断字符串以172开头的
		 * 3. 在以172的字符串中，再截取最后一个.后面的字符，打印
		 */
		String[] split2 = str.split(";");// split拆分str对象，得到String[]
		// 遍历数组
//		for (String s : split2) {
//			System.err.println("s=========>" + s);
//			// 判断字符串以172开头的：startsWith()
//			if (s.startsWith("172")) {
//				System.err.println("172----:" + s);
//				// 先找出最后一个.的下标，int lastIndexOf(String str)
//				int index = s.lastIndexOf(".");
//				
//				// 从最后一个点截取剩余字符串 ：String substring(int beginIndex)
//				String substr = s.substring(index + 1);// +1是为了将字符串中的.去掉
//				System.err.println(substr);
//			}
//		}
		
		// 23.char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
		str = "abcdef";
//		char[] charArray = str.toCharArray();
//		for (char d : charArray) {
//			System.out.println(d);
//		}
		
		// 24.String toUpperCase() 将此字符转换为全大写	一般用于验证码
		// 25.String toLowerCase() 将此字符转换为全小写	一般用于验证码
//		String upperCase = str.toUpperCase();
//		System.out.println(upperCase);
//		
		// 26.String trim() 将当前字符串对象中字符前面和后面的空格去除	用了避免用户的一些不当输入
//		str = "		asdlkjfal		jfdaklfj 		dsalkj		";
//		String trim = str.trim();
//		System.out.println(trim);
//		
		// 27.static String valueOf(Object obj) 将其他类型转换为String对象，为了使用String中的方法处理数据。
		String valueOf = String.valueOf(true);
		System.out.println(valueOf);
		
	}

}
