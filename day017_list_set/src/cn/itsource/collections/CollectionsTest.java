package cn.itsource.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *	Collections工具类（所有的方法都是static修饰的）
 *	主要用来操作集合
 *	Arrays
 */
public class CollectionsTest {

	public static void main(String[] args) {
		// 1.static boolean addAll(Collection c, Object... elements)将所有指定的元素添加到指定的集合。
		ArrayList list = new ArrayList();
		/*
		 * 构造方法：
		 * 		1. ArrayList() 构造一个初始容量为十的空列表。  
				2. ArrayList(Collection c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。  
				3. ArrayList(int initialCapacity) 构造具有指定初始容量的空列表。  
					如果可以预估集合可以装多少个元素，就要设置大小，节省数组扩容时间，提升效率
		 */
//		Collections.addAll(list, 1, 2, "苍苍老师", true);
		System.out.println(list);
		// 2.static void fill(List list, Object obj)用指定的元素obj代替指定集合list中的所有元素。(批量初始化)
		// 3.static Object max(Collection coll)根据自然顺序返回给定集合coll的最大元素。（注意：元素必须是同一种类型,且实现Comparable接口）
		// 4.static Object max(Collection coll, Comparator comp)据定制排序comp，返回给定集合coll中的最大元素。（注意：元素必须是同一种类型）
		User u1 = new User("仓井进");
		User u2 = new User("仓井进");
		User u3 = new User("加藤正浩");
		User u4 = new User("加藤正浩很短");
		Collections.addAll(list, u1, u2, u3, u4);
		Object max = Collections.max(list, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// 关系：o1 > o2  o1 < o2  o1 = o2
				return o1.getName().length() - o2.getName().length();
			}
		});
		System.out.println(list);
		System.out.println(max);
		// 5.static Object min(Collection coll)根据自然顺序返回给定集合coll的最小元素。（注意：元素必须是同一种类型,且实现Comparable接口）
		// 6.static Object min(Collection coll, Comparator comp)据定制排序comp，返回给定集合coll中的最小元素。（注意：元素必须是同一种类型）
		// 7.static void reverse(List list)反转指定集合list中元素的顺序。
		// 8.static void shuffle(List list)将集合中list中元素的随机打乱顺序，常常用来洗牌。
		// 9.static void sort(List list) 将list集合升序排序。（注意：元素必须是同一种类型）
		// 10.static void sort(List list, Comparator c)根据指定的比较器c对指定的集合list进行排序。（注意：元素必须是同一种类型）
		// 11.static void swap(List list, int i, int j)交换集合list中下标i和下标j的元素位置。
		// 12.static List synchronizedList(List list)将list对象转换为线程安全的。
		// 13.static Map<K,V> synchronizedMap(Map<K,V> m)将map对象转换为线程安全的。
		// 14.static Set<T> synchronizedSet(Set s)将set对象转换为线程安全的。
	}
	
}
/**
 *	为了测试TreeSet自然排序的机制,
 *	自然排序需要User实现Comparable接口，然后<>要写当前类User，重写compareTo方法。
		返回值  正数：升序
	         返回值  负数：降序
		返回值0：相同的元素,就不会添加了
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

}

