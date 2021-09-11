package deskspeak;
/**
 * 3. "peter piper picked a peck of pickled peppers"统计这段绕口令有多少个以p开头的单词【必做】
	String中方法：split/startWith
 * @author xulei
 *
 */
public class _03StatisticsP {

	public static void main(String[] args) {
		int count = 0;
		String str = "peter piper picked a peck of pickled peppers";
		String[] split = str.split(" ");//按照空格将字符串分割，得到字符串数组split
		
		//遍历数组
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
			if (split[i].startsWith("p")) {//判断string数组的元素是否以p字母开头
				count++;
			}
		}
		System.out.println("该字符串中有" + count + "个p开头的单词");

	}

}
