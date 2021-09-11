package cn.itsource.system;

/**
 * 	拼接字符串效率最高的方式：
 * 		StringBuilder.append() > StringBuffer.append() > + 
 * 
 * 		通过System.currentTimeMillis()测试
 * 		如果经常操作字符串用StringBuilder和StringBuffer，如果是单线程或者多线程且不要求线程安全问题，用StringBuilder，
 * 		如果是多线程且是线程安全要求用StringBuffer
 */
public class StringBuilderTest2 {

	public static void main(String[] args) {
		//String拼接时间
//		String str = "";
//		long strStart = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			str += i;
//		}
//		long strEnd = System.currentTimeMillis();
//		System.out.println("字符串拼接+运行时间： " + (strEnd - strStart)+"毫秒");
		
		//StringBuffer拼接时间
		StringBuffer buffer = new StringBuffer("");
		long bufferStart = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			buffer.append(i);
		}
		long bufferEnd = System.currentTimeMillis();
		System.out.println("StringBuffer拼接运行时间===== ： " + (bufferEnd - bufferStart));
		
		//StringBuffer拼接时间
		StringBuilder builder = new StringBuilder("");
		long builderStart = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			builder.append(i);
		}
		long builderEnd = System.currentTimeMillis();
		System.out.println("StringBuilder拼接运行时间： " + (builderEnd - builderStart));
		
	}

}
