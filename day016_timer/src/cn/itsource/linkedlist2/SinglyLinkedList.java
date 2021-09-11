package cn.itsource.linkedlist2;

/**
 *	基于变量（对象）：可以保存多个不同类型的数据
 *			
 *				1. 可以任意添加任意类型的数据 void add(Object obj)
 *				2. 可以记录当前数据的个数 int size()
 *				3. 可以打印当前数据结构的对象 toString()，格式如下：[值1，值2.。。。。]
 *
 *				根据下标查询当前的节点对象 Node searchNodeByIndex(int index)(重要方法)
 *				
 *				4. 查询指定下标的元素  Object searchByIndex(int index)
 *				5. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
 *
 *				6. 修改指定下标处的元素  void updateByIndex(int index,Object obj)
 *				7. 删除指定下标处的元素，返回删除的元素  	Object deleteByIndex(int index)
 *				8. 删除的首次出现的指定元素     void deleteByElement(Object ele)
 *				9. 插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
 *					
 *				10.将对象中所有元素清空 void clear();
 *				11.创建对象，可以直接传入一个参数初始化
 */
public class SinglyLinkedList{
	/**保存第一个添加的元素地址*/
	private Node first;
	
	/**添加的元素个数*/
	private int size;
	
	public SinglyLinkedList() {}
	
	/**
	 * 1. 可以任意添加任意类型的数据 void add(Object obj)
	 */
	public void add(Object obj){
		//添加元素
		Node node = new Node(obj);
		
		//判断是否是第一次添加元素
		if (first == null) {//表示第一次添加
			//将创建好的Node对象node的地址给first保存
			first = node;
		} else {//不是第一次添加元素
			//遍历整个链表
			//声明一个临时变量temp专门保存遍历的Node对象
			Node temp = first;//从头开始遍历
			
			//遍历链表，判断当前遍历的Node对象next是否为null，如果是表示最后一个对象
			while (temp.next != null) {//如果不是null，表示还有下一个
				//将下一个的元素地址赋值给临时变量temp保存
				temp = temp.next;
			}
			//循环结束后，肯定是最后一个元素
			temp.next = node;//将先创建的地址赋值给最后一个元素的next保存
		}
		
		//元素个数+1
		size++;
	}
	
	/**
	 * 2. 可以记录当前数据的个数 int size()
	 * @return
	 */
	public int size(){
		return size;
	}
	
	/**
	 * 3. 可以打印当前数据结构的对象 toString()，格式如下：[值1，值2.。。。。]
	 */
	@Override
	public String toString() {
		//声明一个StringBuilder对象，用来拼接字符串
		StringBuilder sb = new StringBuilder("[");
		
		//判断当前链表是否有元素
		if (first == null) {//链表没有元素，就直接返回一个空[]
			return sb.append("]").toString();
		}
		
		//声明一个临时变量temp专门保存遍历的Node对象
		Node temp = first;//从头开始遍历
		
		sb.append(temp.value);//拼接第一个元素的value值
		
		//遍历链表，拼接每一个Node对象的value值
		for (int i = 0; i < size-1; i++) {//因为上面已经拼接了第一个元素，所以遍历了size-1次
			sb.append(",");//拼接元素value前要先拼接，
			temp = temp.next;//将下一个元素的地址赋值给临时变量temp保存
			sb.append(temp.value);//拼接下一个元素的value值
		}
		//循环完毕后，所有元素的value值就拼接好了
		return sb.append("]").toString();
	}
	
	/**
	 * 根据下标查询当前的节点对象 Node searchNodeByIndex(int index)
	 * @param index
	 * @return
	 */
	private Node searchNodeByIndex(int index) {
		//判断下标的合法性
		checkIndex(index);
		
		//声明一个临时变量保存遍历到的Node元素
		Node temp = first;
		
		//遍历链表，循环次数index次
		for (int i = 0; i < index; i++) {
			//将下一个要遍历元素的地址赋值给临时变量temp
			temp = temp.next;
		}
		//循环完毕后，肯定是要查找的Node对象
		return temp;
	}
	
	/**
	 * 校验链表下标方法
	 * @param index
	 */
	private void checkIndex(int index) {
		if (index < 0 || index > size-1){
			throw new IllegalArgumentException("亲，请注意下标范围是：[0," + (size-1) + "]");
		}
	}
	
	/**
	 * 4. 查询指定下标的元素  Object searchByIndex(int index)
	 * @param index
	 * @return
	 */
	public Object searchByIndex(int index) {
		//直接调用方法：根据下标查询当前的节点对象 Node searchNodeByIndex(int index)
		Node node = searchNodeByIndex(index);
		//直接返回该node的value值
		return node.value;
	}
	
	/**
	 * 5. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
	 * @param ele
	 * @return
	 */
	public int searchByElement(Object ele) {
		//声明一个临时变量保存遍历到的Node元素
		Node temp = first;
		
		//在遍历之前就要判断ele是否为null，避免空指针异常
		if (ele == null) {
			//遍历链表，循环次数最多是size次
			for (int i = 0; i < size; i++) {
				if (ele == temp.value) {
					return i;
				}
				//如果不相等，将下一个要遍历的地址赋值给temp
				temp = temp.next;
			}
		}else {//只要在else中，已经排除了ele是null的情况
			//遍历链表，循环次数最多是size次
			for (int i = 0; i < size; i++) {
				if (ele.equals(temp.value)) {
					return i;
				}
				//如果不相等，将下一个要遍历的地址赋值给temp
				temp = temp.next;
			}
		}
		//遍历玩数组后，如果没有找到返回-1
		return -1;
	}
	
	/**
	 * 6. 修改指定下标处的元素  void updateByIndex(int index,Object obj)
	 * @param index
	 * @param obj
	 * @throws IllegalArgumentException 
	 */
	public void updateByIndex(int index,Object obj) throws IllegalArgumentException{
		//校验数组下标范围
		checkIndex(index);
		//调用查询指定下标的Node节点 Node searchNodeByIndex(int index)
		Node node = searchNodeByIndex(index);
		//直接将查询到的节点对象value值赋值为obj
		node.value = obj;
	}
	
	/**
	 * 7. 删除指定下标处的元素，返回删除的元素  	Object deleteByIndex(int index)
	 * @param index
	 * @return
	 * @throws IllegalArgumentException
	 */
	public Object deleteByIndex(int index) throws IllegalArgumentException{
		//校验数组下标范围
		checkIndex(index);
		//如果是删除第一个元素，直接将第2个元素的地址赋值给first即可
		Node now = null;
		if (index == 0) {
			//保存第一个元素
			now = first;
			//将第二个元素地址赋值给first
			first = first.next;
		} else {
			//查询出index上一个节点
			Node prefix = searchNodeByIndex(index-1);
			//查询出要删除的index处的节点
			now = searchNodeByIndex(index);
			//将上一个节点的next赋值为index的next（就是index后一个的地址）
			prefix.next = now.next;
		} 
		//元素个数-1
		size--;
		//将要删除的Node元素的value值返回
		return now.value;
	}
	
	/**
	 * 8. 删除的首次出现的指定元素     void deleteByElement(Object ele)
	 * @param ele
	 * @throws IllegalArgumentException 
	 */
	public void deleteByElement(Object ele) throws IllegalArgumentException{
		//调用方法查找该元素下标，如果下标是-1，表示该链表中没有该元素，直接结束方法
		int index = searchByElement(ele);
		if (index < 0) {
			return;
		}
		//调用上面根据指定下标删除元素方法
		deleteByIndex(index);
	}
	
	/**
	 * 9. 插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
	 * 跟删除方法类似，通过画图得知，只需要将index上一个元素的next赋值为当前插入的元素地址，将插入的元素next赋值为index处元素的地址即可
	 * @param index
	 * @param obj
	 * @throws IllegalArgumentException 
	 */
	public void insertByIndex(int index,Object obj) throws IllegalArgumentException{
		//校验数组下标范围
		checkIndex(index);
		//创建一个Node对象，保存obj的值
		Node node = new Node(obj);
		//如果是插入的下标是0，直接将第first元素的地址赋值给新插入的元素next，将first赋值为新插入的元素地址即可
		if (index == 0) {
			//将原来的第一个元素地址赋值给新插入的元素next保存
			node.next = first;
			//将first赋值为新插入的元素node地址即可
			first = node;
		} else {
			//查询出index上一个节点
			Node prefix = searchNodeByIndex(index-1);
			//查询出插入index处的节点
			Node now = searchNodeByIndex(index);
			//将新插入的节点node的next赋值为index处的now的地址
			node.next = now;
			//将是一个节点的next赋值为新插入的node地址
			prefix.next = node;
		} 
		//元素个数+1
		size++;
	}
	
	/**
	 * 10.将对象中所有元素清空 void clear();
	 */
	public void clear(){
		//直接将第一个元素赋值null即可
		first = null;
		//元素个数归零
		size = 0;
		//思路扩展：更好的方式是将链表遍历后，将每一元素赋值为null，有利于GC回收垃圾，提高资源利用率
	}
	
	/**
	 * 11.创建对象，可以直接传入一个参数初始化
	 * @param obj
	 */
	public SinglyLinkedList(Object obj){
		//因为是第一次添加，所以直接调用添加方法即可
		add(obj);
	}
	
	/**
	 * 内部类
	 * 不希望在SinglyLinkedList外部被使用到当前Node类，所以用private修饰
	 */
	private class Node{
		/**保存添加的数据*/
		Object value;
		
		/**保存的是下一个Node对象的地址(元素地址)*/
		Node next;
		
		/**
		 * 每次添加元素的时候，就要创建一个Node对象，并且给该
		 * 对象的value赋值，赋值为新建的元素值
		 * @param value
		 */
		public Node(Object value) {
			this.value = value;
		}
	}
}
