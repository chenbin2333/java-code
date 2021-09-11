package deskspeak;
/**
 * 4. 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy【必做】
	提示：遍历，判断奇偶性、然后调用toUpperCase方法，然后拼接到一起
 * @author xulei
 *
 */
public class _04Lengendary {

	public static void main(String[] args) {
		String s1 = "lengendary";
		char[] s2 = new char[s1.length()];//创建一个字符数组s2，数组长度为字符串s1的长度
		for (int i = 0; i < s2.length; i++) {//遍历数组，将字符串s1的每个值赋给字符数组s2。
		// char charAt(int index) 返回 char指定索引处index的字符。 不能超过下标范围
		s2[i] = s1.charAt(i);
		if (i % 2 == 0) {//判断是否为偶数，i从0开始
		s2[i] -= 32 ;//小写变大写
		}
		//System.out.print(s2[i]);
	}
		//static String valueOf(Object obj) 将其他类型转换为String对象
		String valueOf = String.valueOf(s2);
		System.out.println(valueOf);//LeNgEnDaRy
		System.out.println("============================");

		
		//第二种方法
		String s = "lengendary";
		// char[] toCharArray() 将此字符串转换为新的字符数组。  方便遍历当前所有的字符
        char[] cs =s.toCharArray();//将字符串改成字符数组
        for (int i = 0; i < cs.length; i++) {
            if(i%2 == 0)
                cs[i] = Character.toUpperCase(cs[i]);//将下标为偶数的字符变成大写。
        }
        String result = new String(cs);
        System.out.println(result);
	
	}

}
