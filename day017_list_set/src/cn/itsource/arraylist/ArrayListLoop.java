package cn.itsource.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *	3. 集合遍历方式：【掌握】
 		集合遍历方式：		只有List才有双向迭代器
  
 		1. foreach()因为ArrayList间接实现了Iterable接口
 		2. 迭代器：一个集合对象可以获取多个迭代器对象（多次调用方法）,指针都是在初始位置（第一个元素前面）
 			Iterator<E> iterator()  【单向迭代器】
 				1. boolean hasNext() 如果迭代具有更多元素，则返回 true 。  
				2. Object next() 返回迭代中的下一个元素。  
				3. default void remove() 从底层集合中删除此迭代器返回的最后一个元素（可选操作）。 
			
			ListIterator<E> listIterator() 【双向迭代器】
				获取双向迭代器方式：LIst接口中方法：
					1. listIterator(),获取默认指针在头的双向迭代器对象 
					2. listIterator(int index),获取默认指针在指定的index处双向迭代器对象 
					
				void add(E e) 
					将指定的元素插入列表（可选操作）。  
				boolean hasNext() 
					返回 true如果遍历正向列表，列表迭代器有多个元素。  
				boolean hasPrevious() 
					返回 true如果遍历反向列表，列表迭代器有多个元素。  
				E next() 
					返回列表中的下一个元素，并且前进光标位置。  
				int nextIndex() 
					返回随后调用 next()返回的元素的索引。  
				E previous() 
					返回列表中的上一个元素，并向后移动光标位置。  
				int previousIndex() 
					返回由后续调用 previous()返回的元素的索引。  
				void remove() 
					从列表中删除由 next()或 previous()返回的最后一个元素（可选操作）。  
				void set(E e) 
					用 指定的元素替换由 next()或 previous()返回的最后一个元素（可选操作）。  

 		3. 遍历集合方式3：通过普通for循环，利用集合size()方法和get(int index)	（不常用）
 
  		4. 注意：在使用迭代器遍历集合的时候，不能使用集合自己的方法（增删改）操作集合对象
 
 */
public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(true);
		list.add("黄鳝");
		list.add("大蟒蛇");
		list.add("毛毛虫");
		
		// 遍历集合方式1： foreach()因为ArrayList间接实现了Iterable接口
//		for (Object ele : list) {// ele是每次遍历获取到的集合元素
//			System.out.println("元素：" + ele);
//		}
		
		/* 
		 * 遍历集合方式2： 【单向迭代器】【一次性遍历, 从左到右遍历】
		 * 	Iterator<E> iterator()  
 				1. boolean hasNext() 如果迭代具有更多元素，则返回 true 。  
				2. Object next() 返回迭代中的下一个元素。  
				3. default void remove() 从底层集合中删除此迭代器返回的最后一个元素（可选操作）。
		 */
//		Iterator iterator = list.iterator();// list通过iterator方法获取单项迭代器对象
//		// 用while循环，获取迭代器中的元素
//		while (iterator.hasNext()) {// 通过迭代器调用hasNext判断是否有下一个元素
//			// 获取下一个元素，方法：Object next()
//			Object ele = iterator.next();
//			System.out.println("元素：" + ele);
//			// 注意：在使用迭代器遍历元素的还是，不能使用集合的方法，操作（增删改）集合。但是可以使用迭代器自己的方法操作，例如：remove
////			list.add(1);
//			iterator.remove();// 删除遍历到的元素
//		}
//		System.out.println(list);
		
		/*
		 * 遍历集合方式3：【双向迭代器】
		 * 	ListIterator<E> listIterator() 
				获取双向迭代器方式：List接口中方法：
					1. listIterator(),获取默认指针在头的双向迭代器对象 
					2. listIterator(int index),获取默认指针在指定的index处双向迭代器对象 
					
				void add(E e) 
					将指定的元素插入列表（可选操作）。  
				boolean hasNext() 
					返回 true如果遍历正向列表，列表迭代器有多个元素。  
				boolean hasPrevious() 
					返回 true如果遍历反向列表，列表迭代器有多个元素。  
				E next() 
					返回列表中的下一个元素，并且前进光标位置。  
				int nextIndex() 
					返回随后调用 next()返回的元素的索引。  
				E previous() 
					返回列表中的上一个元素，并向后移动光标位置。  
				int previousIndex() 
					返回由后续调用 previous()返回的元素的索引。  
				void remove() 
					从列表中删除由 next()或 previous()返回的最后一个元素（可选操作）。  
				void set(E e) 
					用 指定的元素替换由 next()或 previous()返回的最后一个元素（可选操作）。  
		 */
		System.out.println(list);
		ListIterator listIterator = list.listIterator();// 获取无参双向迭代器
		// 从前向后遍历
//		while (listIterator.hasNext()) {// 判断是否有下一个元素
//			// 	E next() 获取下一个元素  
//			Object next = listIterator.next();
//			System.out.println(next);
//		}
		
		System.out.println("==========================");
		
		// 从后向前遍历
//		while (listIterator.hasPrevious()) {// 判断是否有上一个元素
//			// 	E previous() 获取上一个元素  
//			Object previous = listIterator.previous();
//			System.out.println(previous);
//		}
		
		// 遍历集合方式4：通过普通for循环，利用集合size()方法和get(int index)	（不常用）
		for (int i = 0; i < list.size(); i++) {// 循环次数是size()次，下标范围：0~size()-1
			// 调用方法：get(int index)，根据下标获取对应元素
			Object ele = list.get(i);
			System.out.println("元素：" + ele);
		}
		
	}

}
