package cn.itsource.hashmap;

import java.util.HashMap;

/**
 *	3. Map的继承体系 是一个独立的体系，跟Collection一毛关系都没有
			Map   接口
			  |--   HashMap   ：基于hashCode(),底层是Entry键值对的数组，数组中装装的是键值对，
			  					会根据添加的key的hashCode值 模 当前数组的length（默认是16），
			  		（掌握）		而得到数组的下标，进而保存键值对。如果key模length后，得到的下标是相等的，
			  					就会发生hash碰撞（哈希冲突），这时候再继续判断key的equals方法，
			  					如果equals判断为true，就会将原来的键值对覆盖，如果是false，
			  					就会在该下标处的原来键值对后面形成  链表，如果链表长度达到8个，就形成	红黑树。
			  					当删除键值对后剩余的数量小于等于6的时候，就重新将红黑树，退化为链表。
			  					（jdk1.8）put添加/remove删除
			  		
			  					key判断键是否重复和HashSet判断重复一样:1. hashCode  2.equals()
			  		
			  		
			  |		HashMap底层是Entry（键值对）的数组，并且维护了链表和红黑树【1.8】
 */
public class HashMapTest {

	public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		1. HashMap()构造一个空的 HashMap ，默认初始容量（16）和默认负载系数（0.75）。  
		 * 			容量16：是键值对的数组长度16
		 * 			负载系数0.75：扩容机制是当容量达到75%的时候，开始扩容，就是创建新数组，复制元素
		 * 			一般就使用默认的负载系数，因为经过测试这是最优化的
		 * 
				2. HashMap(int initialCapacity) 创建空的 HashMap具有指定的初始容量initialCapacity和默认负载因子（0.75）。  
					避免哈希碰撞
				3. HashMap(int initialCapacity, float loadFactor) 构造一个空的 HashMap具有指定的初始容量和负载因子。  【少用】
				4. HashMap(Map m) 创建一个HashMap对象，并且传入另一个Map对象m，这样先创建对象就有了与m相同的数据
		 */
		HashMap hashMap = new HashMap();
		System.out.println(hashMap);
		// 1.V put(K key, V value)如果当前key，没有，则是添加操作，如果key是存在的则进行equals判断，如果equals相等，则是覆盖操作，如果equals不相等，value追加到末尾则会形成链表或者红黑树
		hashMap.put(5, "五");
		hashMap.put(1, "一");
		hashMap.put(1, "一");
		hashMap.put(2, "二");
		hashMap.put(3, "三");
		System.out.println(hashMap);
		// 重新修改key=1  的值为 "一一"
		hashMap.put(1, "一一");
		// 重新打印hashMap
		System.out.println(hashMap);
		
		// HashMap判断key是否重复机制：1. 先看key的hashCode值  2. hashCode值相同，再看key的equals方法, 都想相同，才认为是相同的key
		// 2.void putAll(Map m) 将传入的Map作为参数，创建一个新的HashMap对象
		
		// 3.V get(Object key)根据key去获取value值,如果key不存在，则返回null
		
		// 4.V remove(Object key)根据key删除当前map对象中的这一对键值对  
		
		// 5.boolean remove(Object key, Object value)只有key和value都存在的时候，才能删除
		
		// 6.V replace(K key, V value)根据key替换为新的value的值
		// 7.boolean replace(K key, V oldValue, V newValue)  只有当key和value都存在的情况下，才能替换为新的  newValue值
		
		// 8.boolean containsKey(Object key)判断当前map集合对象中是否包含这个key
		
		// 9.boolean containsValue(Object value)判断当前map集合对象中是否包含这个value，包含则返回 true 。  
		
		// 10.void clear()清除所有的键值对对象
		
		// 11.boolean isEmpty()判段当前map对象是否是空集合 。
		
		// 自定义类型作为key，判断key是否重复
		// HashMap判断key是否重复机制：1. 先看key的hashCode值  2. hashCode值相同，再看key的equals方法, 都想相同，才认为是相同的key
		User u1 = new User("苍苍");
		User u2 = new User("苍苍");
		User u3 = new User("苍苍2");
		User u4 = new User("苍苍2");
		
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u3));
		System.out.println(u3.equals(u4));
		hashMap.clear();
		hashMap.put(u1,"1");
		hashMap.put(u2,"2");
		hashMap.put(u3,"3");
		hashMap.put(u4,"4");
		System.out.println(hashMap);
		
	}

}


/**
 *	验证HashMap判断key重复的机制
 */
class User {
	String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

