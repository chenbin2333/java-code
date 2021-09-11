package cn.itsource.string;

/**
 *5. String、StringBuffer、StringBuilder使用场景（重点）
	 	String 字符串类，底层是基于char[], 一旦创建长度就固定不变了,适用于字符串不经常增删改的操作的场景。
	 		String是根据创建对象的时候，参数来决定创建char[]数组的长度。
	 	String str = "abc";
   
	 	StringBuilder: 基于可变char[]，默认长度是16个，适用于频繁操作（增删改插）字符串的场景，
	 	该类是线程不安全的。效率高
	 
	 	StringBuffer:基于可变的char[]，默认长度是16个，适用于频繁操作（增删改插）字符串的场景，
	 	该类是线程安全的。效率低
	
	 	如果是单线程和多线程没有线程安全要求，用StringBuilder，因为效率高。
	 	如果是多线程有线程安全要求，用StringBuffer，因为线程安全
	 	如果不经常操作字符串用 String节省空间【不经常替换、拼接、删除、插入用String】
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		1.StringBuilder() 创建一个空字符串对象，初始容量为16个字符。  
				2.StringBuilder(CharSequence seq) 构造一个包含与指定的相同字符的字符串构建器 CharSequence 。  
					CharSequence：可以是String、StringBuffer、StringBuilder对象
				3.StringBuilder(int capacity) 构造一个没有字符的字符串构建器，
					由 capacity参数指定char[]的初始容量。  	节省了数组扩容时间
					
				4.StringBuilder(String str)构造一个初始化为指定字符串内容的字符串构建器。  
		 *
		 */
		StringBuilder sb = new StringBuilder();// 创建一个默认16个长度的char[]数组
		StringBuilder sb2 = new StringBuilder("abc");// 创建一个19个长度的char[]数组
		
		/*
		 * 常用方法：
		 * 		-1. int capacity() 当前容量，即，可以装的元素个数。  
		 * 		0. int length() 当前元素真实长度  
		 * 		1. StringBuilder append(Object obj) 在队尾添加字符串 obj
		 * 		2. StringBuilder delete(int start, int end)  删除指定起始start和结束end位置之间的字符 [start, end)
		 * 		3. StringBuilder deleteCharAt(int index) 删除指定下标index处的字符
		 * 		4. StringBuilder insert(int offset, Object obj) 在指定下标offset处插入一个任意类型数据obj
		 * 		5. StringBuilder reverse()将当前StringBuilder对象翻转
		 * 		6. void setCharAt(int index, char ch) 修改指定下标index处的字符为ch  
				7. void setLength(int newLength)  设置字符串长度是newLength
   				8. trimToSize() 将所有没有使用的数组空间去除	。 如果使用setLength,该方法无效
		 */
		// -1. int capacity() 当前容量，即，可以装的元素个数。  
		int capacity = sb2.capacity();
		System.out.println("capacity: " + capacity);// 19
		// 0. int length() 当前元素真实长度  
		int length = sb2.length();
		System.out.println("length: " + length);// 3
		
		// 1. StringBuilder append(Object obj) 在队尾添加字符串 obj
		// 因为append方法返回值类型是StringBuilder，所以，可以连续调用append方法
		StringBuilder append = sb.append(true).append("abc");// 在sb对象后，追加boolean类型的true后，继续追加abc字符串
		System.out.println("sb = " + sb);// trueabc
		System.out.println(append);// trueabc
		
//		// 2. StringBuilder delete(int start, int end)  删除指定起始start和结束end位置之间的字符 [start, end)
//		sb.delete(0, 3);// 删除对象sb中下标0~3之间的字符，不包含3，不需要返回值。含头不含尾
//		System.out.println(sb);
//		
//		// 3. StringBuilder deleteCharAt(int index) 删除指定下标index处的字符
//		sb.deleteCharAt(0);// 删除对象sb中下标0处的字符
//		System.out.println(sb);
//		
//		// 4. StringBuilder insert(int offset, Object obj) 在指定下标offset处插入一个任意类型数据obj
//		sb.insert(0,"狼牙棒").insert(0, 69);// 先将sb对象下标0插入"狼牙棒"，后继续在下标0处插入int类型69
//		System.out.println(sb);
//		
//		// 5. StringBuilder reverse()将当前StringBuilder对象翻转
//		sb.reverse();// 将当前StringBuilder对象sb翻转
//		System.out.println(sb);
//		
//		// 6. void setCharAt(int index, char ch) 修改指定下标index处的字符为ch 
//		sb.setCharAt(0, '插');// 将下标0处的字符修改为 '插'
//		System.out.println(sb);
		
		// 7. void setLength(int newLength)  设置字符串长度是newLength
//		sb = new StringBuilder();
//		sb.setLength(1000);
//		System.out.println("设置后的长度length：" + sb.length());
//		System.out.println("设置后容量capacity：" + sb.capacity());
//		System.out.println(sb);
		
		// 8. trimToSize() 将所有没有使用的数组空间去除	。 如果使用setLength,该方法无效
//		sb.trimToSize();
//		capacity = sb.capacity();
//		System.out.println("容量：" + capacity);
//		System.out.println("长度：" + sb.length());
		
	}

}
