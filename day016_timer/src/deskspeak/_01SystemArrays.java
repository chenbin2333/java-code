package deskspeak;

import java.util.Arrays;

/**
 * 1. 将int[] arr = ｛22，11，44，8，2，80，77｝ 复制arr到新数组 newArr中连续4个元素，源数组从第3个元素开始赋值，
	新数组从第2个元素开始粘贴，新数组的长度根据复制的元素个数确定。最后升序排列		【必做】
		（提示：System方法和Arrays方法）  
 * @author xulei
 *
 */
public class _01SystemArrays {

	public static void main(String[] args) {
		int[] arr = {22 , 11 , 44 , 8 , 2 , 80 , 77};
		int[] newArr = new int[5];
		System.arraycopy(arr, 2, newArr, 1, 4);
		Arrays.sort(newArr);
		System.out.println("升序排列后：" + Arrays.toString(newArr));//[0, 2, 8, 44, 80]

	}

}
