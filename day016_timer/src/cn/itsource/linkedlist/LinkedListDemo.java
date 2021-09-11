package cn.itsource.linkedlist;

import java.util.Arrays;

/**
 *	单向链表LinkedListDemo类，底层基于 变量
 *	基于变量（对象）：可以保存多个不同类型的数据
 *			
 *		1. 可以任意添加任意类型的数据 void add(Object obj)
 *		2. 可以记录当前数据的个数 int size()
 *		3. 可以打印当前数据结构的对象 toString()，格式如下：[值1，值2.。。。。]
 *
 *		根据下标查询当前的节点对象 Node searchNodeByIndex(int index)(重要方法)
 *				
 *		4. 查询指定下标的元素  Object searchByIndex(int index)
 *		5. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
 *
 *		6. 修改指定下标处的元素  void updateByIndex(int index,Object obj)
 *		7. 删除指定下标处的元素，返回删除的元素  	Object deleteByIndex(int index)
 *		8. 删除的首次出现的指定元素     void deleteByElement(Object ele)
 *		9. 插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
 *					
 *		10.将对象中所有元素清空 void clear();
 *		11.创建对象，可以直接传入一个参数初始化
 *	
 */
public class LinkedListDemo {
	/** 保持单向链表头元素的地址 */
	private Node first;
	
	/** 2. 声明一个int变量size，可以记录当前数据的个数 */
	private int size;
	
	/**
	 *  2.获取当前数据的个数 int size()
	 *  int size()
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 3. 可以添加任意类型的数据 void add(Object obj)
	 * @param obj
	 */
	public void add(Object obj) {
		/*// 第1次添加元素
		// 因为数据都是通过Node对象来装的，所以，每次添加都要创建Node对象
		Node node = new Node(obj);
		// 将第一次添加的node对象地址赋值给实例变量first保存。这是头元素
		first = node;
		// 元素个数+1
		size++;
		
		// 第2次添加元素
		// 因为数据都是通过Node对象来装的，所以，每次添加都要创建Node对象
		Node node2 = new Node(obj);
		// 将第2次添加的node2对象地址赋值给头元素first的next保存。这是头元素
		first.next = node2;
		// 元素个数+1
		size++;
		
		// 第3次添加元素
		// 因为数据都是通过Node对象来装的，所以，每次添加都要创建Node对象
		Node node3 = new Node(obj);
		// 将第2次添加的node2对象地址赋值给头元素first的next保存。这是头元素
		first.next.next = node2;
		// 元素个数+1
		size++;
		因为只有第一次添加才是不同的情况，需要给头元素first赋值，其他情况都是：找到链表最后一个元素，给这个末尾元素的next赋值
		*/
		// 创建Node对象，保存添加的数据值obj
		Node node = new Node(obj);
		
		// 判断是否是第一次添加的条件：1. size==0 或者 2.first == null
		if (first == null) {// 表示第一次添加
			// 将第一次添加的node对象地址赋值给实例变量first保存。这是头元素
			first = node;
		} else {// 表示不是 第一次添加
			// 声明一个临时Node变量 temp，保存将要遍历的node对象地址
			Node temp = first;// 将第一个元素first赋值给临时变量temp
			// 遍历整个链表，找到最后一个元素,必须从头元素开始遍历
			while (temp.next != null) {// 判断条件是只有当前next值！=null，就表示还有下一个元素
				// 将下一个元素地址重新赋值给temp
				temp = temp.next;
			}
			// 循环结束后，就肯定是最后一个元素了，就将新添加的元素赋值给最后的next保存
			temp.next = node;
		}
		// 元素个数+1
		size++;
	}
	
	/**
	 * 3. 可以打印当前数据结构的对象 toString()，格式如下：[值1，值2.。。。。]
	 */
	public String toString() {
		// 创建StringBuilder对象用来拼接字符串的，初始赋值 '['
		StringBuilder sb = new StringBuilder("[");
		if (first != null) {// 表示当前链表有数据
			// 遍历整个链表
			// 声明一个临时Node变量 temp，保存将要遍历的node对象地址
			Node temp = first;// 将第一个元素first赋值给临时变量temp
			sb.append(temp.value);// 将第一个元素的value值拼接sb上
			// 遍历整个链表，找到最后一个元素,必须从头元素开始遍历
			while (temp.next != null) {// 判断条件是只有当前next值！=null，就表示还有下一个元素
				// 先拼接一个，
				sb.append(", ");
				// 将下一个元素地址重新赋值给temp
				temp = temp.next;
				// 拼接当前元素的value值
				sb.append(temp.value);
			}
		}
		// 最后必须都要拼接一个 ']'
		return sb.append(']').toString();
	}
	
	/**
	 *	静态内部类Node，只有一个作用，保存数据和下一个Node对象的地址
	 */
	private static class Node {
		/** 保存添加的元素 */
		Object value;
		
		/** 保存下一个Node对象的地址 */
		Node next;
		
		public Node(Object value) {
			super();
			this.value = value;
		}
	}
	
}
