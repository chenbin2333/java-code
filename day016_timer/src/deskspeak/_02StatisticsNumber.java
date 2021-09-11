package deskspeak;
/**
 * 2. 统计字符串中数字个数			【必做】
	//如："abc21b416u" ===> 输出5
	public static int isNumeric(String str){
		代码
	}
	
	思路：首先通过String类里面的charAt()方法字符串中每个位置的字符，
		然后通过Character.isDigit()方法来判断得到的字符是否为数字并计数。
 * @author xulei
 *
 */
public class _02StatisticsNumber {

	public static void main(String[] args) {
		String str = "abc21b416u";
		int numeric = isNumeric(str);
		System.out.println(numeric);

	}
	public static int isNumeric(String str) {
		int count = 0;//计数器
		for (int i = 0; i < str.length(); i++) {//遍历
			char charAt = str.charAt(i);
			if (Character.isDigit(charAt)) {//调用Character.isDigit()方法来判断得到的字符是否为数字并计数
				count++;
			}
		}
		return count;
	}

}
