package homework1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	/**
	 * 1、有如下的一个字符串  String str = “QWERTYUIQQQWJHDAADADBBBBCAD”;  
                                  ① 请统计出其中每一个字母出现的次数，在控制台打印如下的格式：
	              A----3
	              B----4
	              C----1
	              D----2
                                  ② 请打印出字母次数最多的那一对
                                  
     * 思路 : 1.将字符串转换为字符数组（字符串不能通过下标获取元素）;
     *      2.根据题意，元素是可以重复的：   可以使用list接口里面的ArrayList集合      
     *      3.根据题意，可以使用键值对：创建map接口里面的hasMap集合。containsKey()判断当前map中是否有这个key
     *      4.遍历数组，将数组的元素放入到arraylist里面
     *      5.通过工具类frequency方法,查询arrayList里面元素i出现的次数   
     *      6.将字符和次数添加到hashmap中的键值对里
     *      7.获取hashmap的键值对
     *      8.遍历hasmap, 获取键，值。                      
	 */
	public static void main(String[] args) {
		String str = "QWERTYUIQQQWJHDAADADBBBBCAD";
		char[] charArray = str.toCharArray();
		ArrayList<Character> arrayList = new ArrayList<Character>();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			arrayList.add(charArray[i]);
			int frequency = Collections.frequency(arrayList, arrayList.get(i));
			hashMap.put(arrayList.get(i), frequency);
		}
		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "----" + value);
		}
		System.out.println("====================================");
		
//		Integer max = 0;
//		for (Entry<Character, Integer> entry : entrySet) {
//			if (max < entry.getValue()) {
//				max = entry.getValue();
//				System.out.println(entry.getKey() + "-----" + entry.getValue());
//			
//			}

//			
//		}
		Collection<Integer> values = hashMap.values();
		Integer max = Collections.max(values);
		System.out.println(max);
		
//		for (Entry<Character, Integer> entry : entrySet) {
//			Character key = entry.getKey();
//			Integer value = entry.getValue();
//			if (value == max) {
//				System.out.println(entry.getKey() + "-----" + entry.getValue());
//			}
//		}
		for (Entry<Character, Integer> entry : entrySet) {
			if (max <= entry.getValue()) {
				max = entry.getValue();
				System.out.println(entry.getKey() + "-----" + entry.getValue());
			}
		
		}
	
}
}