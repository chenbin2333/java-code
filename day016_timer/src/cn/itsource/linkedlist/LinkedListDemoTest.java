package cn.itsource.linkedlist;

/**
 *	单向链表测试类
 */
public class LinkedListDemoTest {

	public static void main(String[] args) {
		//创建一个LinkedListDemo对象
		LinkedListDemo list = new LinkedListDemo();
		
		// 1. 可以任意添加任意类型的数据 void add(Object obj)
		list.add(1);
		list.add(true);
		list.add("蚯蚓");
		list.add("毛毛虫");
		list.add("娃娃");
		list.add(3.14);
		
		// 2. 获取元素的个数 int size()
		System.out.println(list.size());
		
		// 3.可以打印当前数据结构的对象 toString()，格式如下：[值1，值2.。。。。]
		System.out.println(list);
		
	}

}
