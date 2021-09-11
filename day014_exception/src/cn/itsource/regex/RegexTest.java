package cn.itsource.regex;

/**
 *		
1. 正则表达式：Regex(Regular Expression)
 *		1.1. 概念：就是字符串匹配的机制
 *			跨平台，Java/JS/c++/sql
 
 *		1.2. 作用：
 *			校验做一些要求判断，例如：账号规范、密码强度、身份证、电话号码/邮箱。。。。等
 *			
 *		1.3. 语法：
 			取值范围：
			[AbZ] 匹配26个大写字母中的一个
			[a-z] 匹配26个小写字母中的一个
			[0-9] 匹配0至9数字中的一个
			[A-Za-z0-9] 匹配26个大写字母、26个小写字母和0至9数字中的一个
				
			
			\d等价于[0-9]	匹配一个任意数字
			\D等价于[^0-9]	匹配一个任意非数字字符		 ^是除此之外
			\w等价于[A-Za-z_0-9]匹配任意一个字符		 ^是除此之外
			\W等价于[^A-Za-z_0-9]。
			
			
			取值的个数：
			?等价于匹配长度{0, 1} 0<= 个数 <=1
			*等价于匹配长度{0, } 个数  >= 0
			+等价于匹配长度{1,} 个数 	>= 1
			{n, m} 匹配长度在n到m之间 n<= 个数 <=m
			{n, } 匹配长度大于等于n   n<= 个数
			{n} 匹配n个 
			
			常用运算符与表达式:
			^ 表示正则表达式开始（可写可不写），匹配输入字符串开始的位置。如果是在取值范围[]中使用，则表示除了...
			$ 表示正则表达式结尾（可写可不写），匹配输入字符串结尾的位置
			如果正则表达式使用了^$表示全匹配，包括顺序
			^[abc]+$ 表示匹配必须是连续的 abc中多个abc
			[abc]+ 表示匹配abc中任意一个或者多个，可以是无序的
			加^$的话就代表把整个要匹配的字符串当成一个整体做一次匹配，
				而不加则一个字符串可以匹配多次，只能代表这个字符串中有符合条件的并不代表改字符串符合条件
			
			
			() 域段（一组数据，就是一个整体）
			[] 包含,默认是一个字符长度
			[^] 不包含,默认是一个字符长度
			
			. 任何单个字符(\. 字符点)
			| 或
			& 并且
			\ 转义
			
			^[0-9]+(.[0-9]{1,2})?$ :表示匹配 0-9的数字1个到任一个 和（ . 和 0-9 一个或者两个）括号中可以有0或者1个
 *
 *	
 *		1.4. 以后用到了，就直接百度，如果说网上没有，再回来看api，学习语法
 *
 *		1.5. 主要使用在String相关方法中：
 *			1. matches() 判断当前String对象是否满足正则表达式
 *			2. split()		当前String对象按照正则表达式拆分
 *			3. replaceAll()	当前String对象将满足正则表达式的部分全部替换为指定的字符串
 *			4. replaceFirst() 当前String对象将满足正则表达式第一个出现的部分替换为指定的字符串
 *
 *		1.6. 参见Matcher 和 Pattern类，加强正则表达式(扩展)
 */
public class RegexTest {

	public static void main(String[] args) {
		// 声明一个String变量
		String str = "abcbbabc";
		// 声明一个正则表达式
		String regex = "[abc]+";// 匹配abc中>=1个
		// matches()
		boolean matches = str.matches(regex);
		System.out.println(matches);
		
		// 验证手机号码：1[3-9][0-9]{9}
//		str = "13376765089";
//		regex = "^[1][3-9][0-9]{9}$";
//		boolean matches2 = str.matches(regex);
//		System.out.println(matches2);
		
		str = "abababacadad";
		regex = "[ab]";// 正则表达式中的.表示匹配任意一个字符 【\.在正则表达式中表示字符.  在Java中\需要转义一下，所以\\】
		String replaceAll = str.replaceAll(regex, "#");// 这里表示判断当前str中是否包含regex字符，如果有，则替换为#
		System.out.println(replaceAll);// ##c.ef#dg
		
		str = "abababa";
		regex = "^[ab]+$";// 正则表达式中的.表示匹配任意一个字符 【\.在正则表达式中表示字符.  在Java中\需要转义一下，所以\\】
		String replaceAll2 = str.replaceAll(regex, "#");// 这里表示判断当前str中是否完全满足regex要求，如果满足，则替换为#
		System.out.println(replaceAll2);// abc.efadg
		
	}

}
