package cn.itsource.arraylist;

/**
 *	ArrayListDemo测试类
 */
public class ArrayListDemoTest {

	public static void main(String[] args) {
		// 数组中，只有少数几个方法，并且是从Object中继承过来的。没有增删改查相关的方法
//		int[] arr = {1, 2, 3};
		
		// 创建一个ArrayListDemo对象
		ArrayListDemo list = new ArrayListDemo();

		// 2.获取当前数据的个数 int size()
		System.out.println(list.size());// 0
		
		// 3. 可以添加任意类型的数据 void add(Object obj)
		list.add(1);// 这里会动装箱为Integer对象1
		list.add(null);
		list.add(1);
		list.add(true);
		list.add("狼牙棒");
		list.add("手铐");
		list.add("蜡烛");
		list.add("皮鞭");
		list.add(3.14);
		list.add("蒂芙尼钢丝球");
		
		// 重新打印元素个数
		System.out.println(list.size());// 10
		
		// 直接打印list，是地址，4. 可以打印当前数据结构的对象，格式如下：[值1，值2...]
		System.out.println(list);
		
		// 5. 查询指定下标的元素  Object searchByIndex(int index)
		Object searchByIndex = list.searchByIndex(7);
		System.out.println(searchByIndex);
		
		// 6. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
		int searchByElement = list.searchByElement("黄鳝");
		System.out.println(searchByElement);
		
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("========================");
		// 8. 删除指定下标处的元素，返回删除的元素  Object deleteByIndex(int index)
		Object ele = list.deleteByIndex(1);
		System.out.println("删除的元素： " + ele);
		System.out.println(list.size());
		System.out.println(list);
	}

}
