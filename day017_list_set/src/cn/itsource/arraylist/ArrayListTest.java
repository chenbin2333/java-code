package cn.itsource.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *	Collection(所有集合的根接口)  【每次只能存放一个元素】
 * 		|----List(接口)表示有序（存入和取出）可重复集合，可以保存null元素 
 * 				|---ArrayList(实现类) 基于数组，查改快  
 * 				|---LinkedList(实现类)基于变量，双向链表，增删插快 
 * 				|	因为LinkedList中有多个接口的实现方法，所以，同样一个功能可以有多个方法实现，
 * 					但是，尽量不要交叉使用（使用同一个接口中的方法），因为交叉使用就会导致
 *					既不能完全具其中有一个接口的完整特性
 * 				|---Vector(就是一个线程安全的ArrayList) 
 */
public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		1. ArrayList() 构造一个初始容量为十的空列表。  
				2. ArrayList(Collection c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序。  
				3. ArrayList(int initialCapacity) 构造具有指定初始容量的空列表。  
					如果可以预估集合可以装多少个元素，就要设置大小，节省数组扩容时间，提升效率
		 */
		ArrayList list = new ArrayList();
		
		
		// 1.boolean add(Object e)将指定的元素追加到此列表的末尾。如果添加的是其他集合，则会将其他集合作为整体插入
		list.add(1);// 1是Integer类型
		list.add(1);
		list.add(true);// true是Boolean类型
		list.add(3.14);
		list.add("皮鞭");
		System.out.println(list);
		
		// 创建另外一个ArrayList集合对象
		ArrayList list2 = new ArrayList();
		list2.add("蜡烛");
		list2.add("黄鳝");
		list2.add("啤酒瓶");
		// add方法可以添加其他集合对象，是作为一个整体添加的
//		list.add(list2);
//		System.out.println("add添加另一个集合后：" + list);// [1, 1, true, 3.14, 皮鞭, [I@15db9742, [蜡烛, 黄鳝, 啤酒瓶]]
		
		// 2.void add(int index, Object element)在此列表中的指定位置插入指定的元素。
		
		
		// 3.boolean addAll(Collection c)按指定集合的Iterator返回的顺序将指定集合中的所有元素追加到此列表的末尾。
		list.addAll(list2);// 会将集合中元素插入，而不是将集合作为整体插入
		System.out.println("addAll添加另外的集合： " + list);
		
		// 4.void clear() 从列表中删除所有元素。
		
		// 5.boolean contains(Object o) 判定当前集合中是否包含 o这个元素
		
		// 6.E get(int index)根据下标index获取指定的元素。
		
		// 7.int indexOf(Object o) 返回此列表中指定元素的第一次出现的索引，如果此列表不包含元素，则返回-1。
		
		// 8.int lastIndexOf(Object o) 返回此列表中指定元素的最后一次出现的索引，如果此列表不包含元素，则返回-1。
		
		// 9.boolean isEmpty()如果此列表不包含元素，则返回 true 。
		
		// 10.Object remove(int index) 删除该列表中指定位置的元素并且返回。
//		System.out.println("删除之前：" + list);
//		Object remove = list.remove(1);// 只要传入的是int类型都会当成是下标，不会当成是元素
//		System.out.println("删除的元素是：" + remove);
//		System.out.println("删除后：" + list);
		
		// 11.boolean remove(Object o) 从列表中删除指定元素的第一个出现（如果存在）。注意：如果传入的参数是int类型，会默认调用下标的删除方法，如果想要删除的是Integer元素，则必须制定参数是Integer类型
		System.out.println("删除之前：" + list);
		boolean remove2 = list.remove(Integer.valueOf(1));// 需要删除1这个元素，这里就必须用包装类手动包装一下
		// 只要传入的是int类型都会当成是下标，不会当成是元素
		System.out.println("删除的元素是否成功：" + remove2);
		System.out.println("后：" + list);
		
		// 12.boolean removeAll(Collection c)将c中和当前集合对象共有的元素全部删除
		
		// 13.E set(int index, E element)将指定下标index处的元素修改为element
		
		// 14.int size() 返回此列表中的元素数。
		
		// 15.Object[] toArray()将ArrayList对象转换为数组	重要
		Object[] array = list.toArray();
		// 扩展：将数组转换为集合对象	Arrays类中static <T> List<T> asList(Object... a) 返回由指定数组支持的固定大小的列表。
		List<Integer> asList = Arrays.asList(1, 2, 3);// 注意：这里必须是包装类的数组才能转换为集合对象
		System.out.println(asList);
		List<String> asList2 = Arrays.asList("1", "Test", "钢丝球");// 数组是什么类型，集合中元素就全是这个类型的
		System.out.println(asList2);
		List<? extends Object> asList3 = Arrays.asList("钢丝球", 1, true);
		System.out.println(asList3);
		
		Integer[] arr = {1, 2, 3};
		List<Integer> asList4 = Arrays.asList(arr);// 可变参数，传入一个数组也可以【必须是引用类型数组】
		System.out.println(asList4);
		
		// 16.void trimToSize() 将ArrayList对象中未使用的空间去除（基本不用）
	}

}
