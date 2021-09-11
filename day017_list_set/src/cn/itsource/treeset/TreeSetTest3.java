package cn.itsource.treeset;

import java.util.TreeSet;

/**
 *----TreeSet(实现类)：基于TreeMap，TreeMap底层基于红黑树（特殊的二叉树，左边叉值小，右边叉值大，有自平衡机制）
 * 				|		1. 自然排序：元素类型必须实现了Comparable接口，且必须重写compareTo（）方法
							返回值  正数：升序
						        返回值  负数：降序
							返回值0：相同的元素,就不会添加了
							
						2. 定制排序：
 * 							在创建TreeSet对象的时候，传入一个Comparator接口的实现类，该实现类必须重写compare方法
 * 							  返回值  正数：升序
						          返回值  负数：降序
							  返回值 0：相同的元素
 * 					当自然排序和定制排序同时使用，定制排序优先级更高
 * 					一般情况下，默认排序用自然排序，特殊排序用定制排序
 */
public class TreeSetTest3 {

	public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		TreeSet()创建一个有自然排序功能的TreeSet对象。  要求元素实现Comparable接口
				TreeSet(Collection c) 构造一个包含指定集合中的元素的新树集，根据其元素的 自然排序进行排序 。  
				TreeSet(Comparator comparator) 创建一个有定制排序功能的TreeSet对象。  
					可以使用Comparator的实现类对象
					也可以使用Comparator的匿名内部类
		 */
		TreeSet treeSet = new TreeSet();
		treeSet.add(6);
		treeSet.add(9);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(22);
		System.out.println(treeSet);// [1, 2, 6, 9, 22]
		// E ceiling(E e) 回集合中的>=e元素的最小元素，如果没有此元素，则返回 null 。 
		Object ceiling = treeSet.ceiling(2);
		System.out.println(ceiling);// 2
		
		// E first() 返回此集合中当前的第一个（最低）元素。  
		System.out.println(treeSet.first());
		
		// E floor(E e) 返回此集合中最大的元素<= e给定元素，如果没有这样的元素，则返回 null  
		
		// E higher(E e) 返回集合中的>e元素的最小元素，如果没有此元素则返回 null 。  
		Object higher = treeSet.higher(2);
		System.out.println(higher);// 6
		
		// E last() 返回此集合中当前的最后（最高）元素。  
		
		// E lower(E e) 返回这个集合中最大的元素<给定的元素，如果没有这样的元素，则返回 null 。  
		
		// E pollFirst() 检索并删除第一个（最低）元素，或返回 null如果该集合为空。 
		// E pollLast()检索并删除最后一个（最高）元素，如果此集合为空，则返回 null 。  
		
	}

}
