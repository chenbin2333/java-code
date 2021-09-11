package cn.itsource.arraylist2;

/**
 *	测试ArrayListDemo类
 */
public class ArrayListDemoTest {
	public static void main(String[] args) {
		// 创建对象
		ArrayListDemo list = new ArrayListDemo();

		// 3. 可以任意添加任意类型的数据 void add(Object obj)
		list.add(1);//实际添加的是Integer类型的1
		list.add(true);
		list.add(3.14);
		list.add("黄瓜");
		list.add("狼牙棒");
		list.add(null);
		

		// 2. 获取当前数据的个数 int size()
		System.out.println(list.size());

		// 4. 可以打印当前数据结构的对象，格式如下：[值1，值2.。。。。]
		System.out.println(list);

		// 5. 查询指定下标的元素 Object searchByIndex(int index)极限测试
		Object searchByIndex = list.searchByIndex(5);
		System.out.println(searchByIndex);

		// 6. 查询指定的元素第一次出现的位置 int searchByElement(Object ele);
		int searchByElement = list.searchByElement("娃娃");
		System.out.println(searchByElement);

		// 7. 修改指定下标处的元素 void updateByIndex(int index,Object obj)
		list.updateByIndex(3, "蜡烛");
		System.out.println(list);
		
		// 8. 删除指定下标处的元素，返回删除的元素 Object deleteByIndex(int index) 必须结合画图
		Object deleteByIndex = list.deleteByIndex(3);
		System.out.println("要删除的元素：" + deleteByIndex);
		System.out.println(list);
		
		// 剩余方法自己测试

	}

}
