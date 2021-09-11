package homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test5 {
	
	/**思路 : 1.将字符串转换为字符数组（字符串不能通过下标获取元素）;
     *      2.根据题意，元素是可以重复的：   可以使用list接口里面的ArrayList集合      
     *      3.根据题意，可以使用键值对：创建map接口里面的hasMap集合。
     *      4.遍历数组，将数组的元素放入到arraylist里面
     *      5.通过工具类frequency方法,查询arrayList里面元素i出现的次数   
     *      6.将字符和次数添加到hashmap中的键值对里
     *      7.获取hashmap的键值对
     *      8.遍历hasmap, 获取键，值。
	 */
	public static void main(String[] args) {
		String str = "BQWERTYUIQQQWJHDAADADBBBBCAD"; 
		// 将字符串转换为数组
		char[] charArray = str.toCharArray();
		// 创建集合对象HashMap
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		// 创建集合对象arrayList
		ArrayList<Character> arrayList = new ArrayList<Character>();
		// 遍历字符串中的元素
		for (int i = 0; i < charArray.length; i++) {
			// 将数组中的元素添加到arrayList集合中
//			Collections.addAll(arrayList, charArray[i]);
			arrayList.add(charArray[i]);
			
			// 查询arrayList里面元素i出现的次数
			int frequency = Collections.frequency(arrayList, arrayList.get(i));
			// 将字符和次数添加到hashmap中的键值对里
			hashMap.put(charArray[i], frequency);
		}
		// 获取hashmap的键值对
		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();
		// 遍历hashmap的键值对
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();  // 获取键
			Integer value = entry.getValue(); // 获取值
			System.out.println(key + "----" + value);
		}
		
		System.out.println("----------------------------------");
		// 声明一个Interger的变量max.
		Integer max = 0;
		// 遍历hashmap的键值对
		for (Entry<Character, Integer> entry : entrySet) {
			if (max <= entry.getValue()) {
				max = entry.getValue();
				System.out.println(entry.getKey() + "-----" + entry.getValue());
			}
		}

	}

}
