package cn.itsource.hashset;

import java.util.HashSet;

/**
 *	-Set(接口)表示无序（存入和取出）不可重复集合，可以保存null元素
 * 				|----HashSet(实现类)：基于HashMap，HashMap基于hashCode，是一个非线程安全。
 						HashMap底层是键值对的数组+链表+红黑树(1.8)
 * 						判断重复的机制：
 * 							1. 先判断元素的hashCode值
 * 							2. 在hashCode相等的情况下，继续判断equals比较，如果都相等认为是同一个元素
 * 						|
 * 						|----LinkedHashSet(是一个有序的HashSet，在HashSet基础上维护了一个链表) 
 */
public class HashSetTest {

	public static void main(String[] args) {
		/*
		 *	构造方法：
		 *		HashSet() 
					构造一个新的空集合; HashMap实例具有默认初始容量（16）和负载因子（0.75）。  
					16就是键值对数组的长度，负载因子（0.75）指的是当容量达到75%,就会扩容
				HashSet(Collection c) 
					构造一个包含指定集合中的元素的新集合。  
				HashSet(int initialCapacity) 
					创建HashMap对象，键值对数组长度是initialCapacity，标签默认负载因子（0.75）。  
				HashSet(int initialCapacity, float loadFactor) 【不建议用】
					构造一个新的空集合; 背景HashMap实例具有指定的初始容量和指定的负载因子。  
		 */
		HashSet hashSet = new HashSet();
		
		// 以下常用方法自己练习：
		// boolean add(E e) 
		hashSet.add("嘿咻");
		hashSet.add(69);
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(5);
		hashSet.add("随便");
		hashSet.add(null);
		System.out.println(hashSet);
		
		// 清除数据:clear()
		hashSet.clear();
		
		// 创建User对象
		User u1 = new User("仓井进");
		User u2 = new User("仓井进");
		User u3 = new User("加藤正浩");
		User u4 = new User("加藤正浩");
		
		// equals比较
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u3));
		System.out.println(u3.equals(u4));
		
		// hashCode()值
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		System.out.println(u4.hashCode());
		
		/*
		 * 判断重复的机制：
		 * 		1. 先判断元素的hashCode值
		 * 		2. 在hashCode相等的情况下，继续判断equals比较，如果都相等认为是同一个元素
		 */
		// hashSet调用add添加创建的User对象
		hashSet.add(u1);
		hashSet.add(u2);
		hashSet.add(u3);
		hashSet.add(u4);
		System.out.println(hashSet);
		
		// void clear() 
		// boolean contains(Object o) 
		// boolean isEmpty() 
		// Iterator<E> iterator() 
		// boolean remove(Object o) 
		// int size() 
		
		// 遍历方式： 1. foreach	2. 单向迭代器
	}

}
/**
 *	为了测试HashSet判断重复的机制
 */
class User {
	private String name;
	
	public User() {}

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
