package cn.itsource.treeset;

import java.util.TreeSet;

/**
 *	|---- TreeSet(实现类)：基于TreeMap，TreeMap底层基于红黑树（特殊的二叉树，左边叉值小，右边叉值大，有自平衡机制）
  		|				1. 自然排序：元素类型必须实现了Comparable接口，且必须重写compareTo（）方法
		|					返回值  正数：升序
		|				        返回值  负数：降序
		|					返回值0：相同的元素,就不会添加了
		|					
		|				2. 定制排序：
  		|					在创建TreeSet对象的时候，传入一个Comparator接口的实现类，该实现类必须重写compare方法
  		|					返回值  正数：升序
		|				         返回值  负数：降序
		|					返回值 0：相同的元素
  		|				当自然排序和定制排序同时使用，定制排序优先级更高
  		|				一般情况下，默认排序用自然排序，特殊排序用定制排序
 */
public class TreeSetTest {

	public static void main(String[] args) {
		/*
		 * 构造方法：
		 * 		TreeSet()创建一个有自然排序功能的TreeSet对象。  默认自然排序是升序
				TreeSet(Collection c) 构造一个包含指定集合中的元素的新树集，根据其元素的 自然排序进行排序 。  
				TreeSet(Comparator comparator) 创建一个有定制排序功能的TreeSet对象。  
					可以使用Comparator的实现类对象
					也可以使用Comparator的匿名内部类
		 */
		TreeSet treeSet = new TreeSet();
		treeSet.add(96);
		treeSet.add(1);
		treeSet.add(1);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(996);
		System.out.println(treeSet);
		
		// 添加其他类型元素：String类型。需要添加不同的类型元素，必须将集合原有元素全清空：clear()
		treeSet.clear();// 清空元素
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("D");
		treeSet.add("J");
		System.out.println(treeSet);
		
		
		System.out.println("=============添加自定义类型元素===========");
		treeSet.clear();// 清空元素
		// 创建User对象
		User u1 = new User("仓井进");
		User u2 = new User("仓井进");
		User u3 = new User("加藤正浩");
		User u4 = new User("加藤正浩");
		
		// treeSet调用add添加创建的User对象
		treeSet.add(u1);// u1.compareTo(其他元素);
		treeSet.add(u2);// u2.compareTo(集合种所有元素比较一遍(u1));
		treeSet.add(u3);// u3.compareTo(集合种所有元素比较一遍(u1/u2));
		treeSet.add(u4);
		System.out.println(treeSet);
	}

}

/**
 *	为了测试TreeSet自然排序的机制,
 *	自然排序需要User实现Comparable接口，然后<>要写当前类User，重写compareTo方法。
		返回值  正数：升序
	         返回值  负数：降序
		返回值0：相同的元素,就不会添加了
 */
class User implements Comparable<User> {// User类实现Comparable接口，然后<>中写当前类User
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

	@Override // 该方法就是比较元素，自然排序的方法。默认都是升序。 该方法返回值也决定了TreeSet中的元素是否相同。
	public int compareTo(User o) {
		/*
		 * 这里该方法比较的方式是：用当前添加的元素调用compareTo方法跟集合种每一个元素比较，参数就是集合种每一个元素。
		 */
		// 需求：根据User对象的名字长度比较，大小，升序排序
		if (this.name.length() > o.name.length()) {
			return 1;
		} else if (this.name.length() < o.name.length()) {
			return -1;
		} else {// 表示姓名长度相等
			return 0;
		}
		
//		return 0;// 表示相同的元素
//		return 1;// 正数表示不相同的元素，且升序排序。1只是表示正数而已。
//		return -1;// 负数表示不相同的元素，且降序排序。-1只是表示负数而已。
	}

}

