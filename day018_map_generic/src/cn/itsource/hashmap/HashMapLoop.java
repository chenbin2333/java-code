package cn.itsource.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *	5.遍历Map的三种方式：（掌握）
			1. Set<Map.Entry<K,V>> entrySet() 返回所有键值对的Set集合。  
			
			2. Set<K> keySet()   返回所有键的Set集合。  
			
			3. Collection<V> values()   返回所有值的Collection集合
			
			步骤：
				1. 根据需求调用上面某一个方法，得到（键值对Entry或者键key）Set或者Collection(value)集合
				2. 遍历第一步中的Set或者Collection集合
					1. foreach
					2. 单向迭代器
					
			遍历选择：
				如果是既需要key也需要value，最好用entrySet，其他场景根据情况
 */
public class HashMapLoop {

	public static void main(String[] args) {
		// 为了避免下面遍历HashMap强制转换问题，所以，先用一下泛型 
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("一", 1);	
		hashMap.put("二", 2);	
		hashMap.put("三", 3);	
		hashMap.put("四", 4);	
		hashMap.put("五", 5);	
		
		System.out.println(hashMap);
		// 遍历Map的第1种方式： Set<Map.Entry<K,V>> entrySet() 返回所有键值对的Set集合。  
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();// Set集合装的都是键值对
		// 再继续通过foreach或者单向迭代器遍历Entry的Set集合
//		for (Entry<String, Integer> entry : entrySet) {
//			// 调用entry中的方法获取key: getKey() 
//			String key = entry.getKey();
//			// 调用entry中的方法获取value: getValue() 
//			Integer value = entry.getValue();
//			System.out.println(key + " = " + value);
//		}
		
		// 遍历Map的第2种方式： Set<K> keySet()   返回所有键的Set集合。  
		Set<String> keySet = hashMap.keySet();
		// 继续遍历key的set集合即可
//		for (String key : keySet) {
//			System.out.println("键：" + key);
//			// 通过map中的get(Key k)获取对应的Value值
//			Integer value = hashMap.get(key);
//			System.out.println("值: " + value);
//		}
		
		// 遍历Map的第3种方式：  Collection<V> values()   返回所有值的Collection集合
		Collection<Integer> values = hashMap.values();
		// foreach遍历values集合
		for (Integer value : values) {
			System.out.println("值：" + value);
		}
	}

}
