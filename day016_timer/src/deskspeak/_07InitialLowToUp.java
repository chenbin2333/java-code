package deskspeak;

/**
 * 7. 设计一个方法，给出一句英文句子： "let there be light"得到一个新的字符串，每个单词的首字母都替换为大写
	得到的新字符串是"Let There Be Light"【选做】	
 * @author xulei
 *
 */
public class _07InitialLowToUp {

	public static void main(String[] args) {
		String str = "let there be light";
		initialLowToUp(str);//调用方法
//		String[] s = str.split(" ");
//		for(int i = 0;i < 4;i++)
//		{
//			// 21.String substring(int beginIndex)   从当前字符串中截取beginIndex到最后的子串
//			//String substring(int beginIndex, int endIndex)  从当前字符串中beginIndex和endIndex之间截取子串（含头不含尾）
//		s[i]=s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
//		System.out.print(s[i]+' ');
//		}
	}
	/**
	 * 方法
	 * @param str
	 */
	public static void initialLowToUp(String str) {
		String[] split = str.split(" ");//按照空格将字符串截断
		for (int i = 0; i < split.length; i++) {//将每一个字符串数组的首字母变成大写。
			// char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
			char[] charArray = split[i].toCharArray();
			char charAt = split[i].charAt(0);//拿出首字母
			charAt -= 32;///变大写
			charArray[0] =charAt;//赋值给字符数组的第一个元素
			String valueOf = String.valueOf(charArray);//将字符数组转为字符串。
			split[i] = valueOf;//将这个字符串赋值给split[i]
		}
		for (int i = 0; i < split.length; i++) {
		System.out.print(split[i] +(i != split.length-1 ? " ":""));
//		if (i != split.length-1) {
//			split[i] += " "; 
//		}else{
//			split[i] += ""; 
//		}
//		System.out.print(split[i]);
		}
	}
}
