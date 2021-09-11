package cn.itsource.linkedlist2;

/**
 * 测试SinglyLinkedList类
 */
public class SinglyLinkedListTest {
	public static void main(String[] args) {
		// 创建对象
		SinglyLinkedList list = new SinglyLinkedList();

		// 1. 可以任意添加任意类型的数据 void add(Object obj)
		list.add(1);
		list.add(true);
		list.add(3.14);
		list.add("黄瓜");
		list.add("黄瓜");
		list.add(null);
		list.add(false);

		// 2. 获取当前数据的个数 int size()
		System.out.println(list.size());

		// 3. 可以打印当前数据结构的对象，格式如下：[值1，值2.。。。。]
		System.out.println(list);

		/*
		 * 根据下标查询当前的节点对象 Node searchNodeByIndex(int index)
		 * 该方法只是为了LinkedList中其他方法服务的，所以是私有化的方法，这里为了测试 现将方法临时改为public修饰的
		 * 并且Node这个内部类也要声明为public的 打印该Node对象的value值查看是否正确
		 */
		// Node node = list.searchNodeByIndex(3);
		// System.out.println(node.value);

		// 4. 查询指定下标的元素 Object searchByIndex(int index)
		

		// 5. 查询指定的元素第一次出现的位置 int searchByElement(Object ele);
	

		// 7. 修改指定下标处的元素 void updateByIndex(int index,Object obj)

		// 剩余测试自己测

	}

}
