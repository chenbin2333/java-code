package cn.itsource.arraylist2;

import java.util.Arrays;

/**
 * 基于数组，适用于查改。
 * 增删插效率低下
 *				1. 请设计一个类ArrayListDemo，可以装多个不同类型的数据,初始长度是10个
 *					底层是基于数组，因为是可以装不同数据类型的数据，所以是Object数组
 *					int/byte/short /boolean....
 *					Object[] value = new Object[10];
 *					value[0] = 1;//int 的1装好为对应的包装类Integer
 *
 *				2. 可以记录当前数据的个数 int size()
 *					
 *				3. 可以任意添加任意类型的数据 void add(Object obj)
 *						version2 自动扩容
 *
 *				4. 可以打印当前数据结构的对象，格式如下：[值1，值2.。。。。]
 *
 *				5. 查询指定下标的元素  Object searchByIndex(int index)
 *				6. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
 *
 *				7. 修改指定下标处的元素  void updateByIndex(int index,Object obj)
 *				8. 删除指定下标处的元素，返回删除的元素  	Object deleteByIndex(int index)
 *				9. 删除的首次出现的指定元素     void deleteByElement(Object ele)
 *				10.插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
 *					
 *				11.将对象中所有元素清空 void clear();
 *				12.可以创建指定长度的ArrayList对象
 *				13.创建一个默认长度是10的ArrayList对象
 *				14.创建一个默认长度是10，且有指定元素的ArrayList对象
 */
public class ArrayListDemo {
	/**1. 请设计一个类ArrayListDemo，可以装多个不同类型的数据,初始长度是10个*/
	private Object[] value;
	
	/**元素个数 	2. 可以记录当前数据的个数 int size()*/
	private int size;
	
	/**
	 * 3. 可以任意添加任意类型的数据 void add(Object obj)
	 */
	public void add(Object obj){
		//先判断当前数组是否需要扩容
		growArrayCapcity();
		
		//给数组添加元素
		value[size] = obj;
		
		//元素个数+1
		size++;
	}
	
	/**
	 * 数组扩容方法
	 * 扩容机制 *2
	 */
	private void growArrayCapcity() {
		//先判断当前数组是否可以装下新添加的元素
		if (size == value.length) {//判断当前元素个数是否已经等于当前数组长度了，若等于，说明数组已经装不下了，要扩容
			//数组扩容: 扩容机制，原数组长度*2 
			value = Arrays.copyOf(value, value.length * 2);//必须将新扩容后的数组地址赋值给value
		}
	}
	
	/**
	 * 2. 可以记录当前数据的个数 int size()
	 * @return
	 */
	public int size(){
		return size;
	}
	
	/**
	 * 4. 可以打印当前数据结构的对象，格式如下：[值1，值2.。。。。]
	 */
	@Override
	public String toString() {
		//数组缩容,只要将有元素的数组转换为字符串即可，所以要缩容
		Object[] newArr = Arrays.copyOf(value,size);
		
		String str = Arrays.toString(newArr);//将数组转换为字符串
		return str;
	}
	
	/**
	 * 5. 查询指定下标的元素  Object searchByIndex(int index)
	 * @param index
	 * @return
	 */
	public Object searchByIndex(int index){
		//先校验下标合法性
		checkIndex(index);//alt + shift + m 抽取成一个方法
		return value[index];
	}
	
	/**
	 * 校验下标方法
	 * @param index
	 */
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			//抛出非法参数异常，提示一下
			throw new IllegalArgumentException("请注意下标范围，范围是：[0," + (size-1) + "]");
		}
	}
	
 	/**
 	 * 6. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
 	 * @param ele
 	 * @return
 	 */
	public int searchByElement(Object ele){
		//如果ele是null元素,为了避免空指针一次，用 == 比较
		if (ele == null) {
			//遍历数组，如何用==比较，如果有相等就返回下标
			for (int i = 0; i < size; i++) {//注意，这里必须是装的元素个数，而不是数组长度
				if (ele == value[i]) {//如果相等就返回
					return i;//返回下标
				}
			}
		} else {
			//遍历数组，如何用equals比较，如果有相等就返回下标
			for (int i = 0; i < size; i++) {//注意，这里必须是装的元素个数，而不是数组长度
				if (ele.equals(value[i])) {//如果相等就返回
					return i;//返回下标
				}
			}
		}
		//如果找不到就返回-1
		return -1;//表示没有找到
	}
 
 	/**
 	 * 7. 修改指定下标处的元素  void updateByIndex(int index,Object obj)
 	 * @param index
 	 * @param obj
 	 */
	public void updateByIndex(int index,Object obj){
		//先校验下标合法性
		checkIndex(index);//alt + shift + m 抽取成一个方法
		
		//通过下标修改数组元素
		value[index] = obj;
	}
	
 	/**
 	 * 8. 删除指定下标处的元素，返回删除的元素  	Object deleteByIndex(int index)
 	 * //注意，该方法必须结合画图来实现
 	 * @param index
 	 * @return
 	 */
	public Object deleteByIndex(int index){
		//先校验下标合法性
		checkIndex(index);//alt + shift + m 抽取成一个方法
		
		//声明一个变量保存要删除的元素
		Object obj = value[index];
		
		//注意，该方法必须结合画图来实现
		System.arraycopy(value, index + 1,value,index,size - index -1);//必须结合画图确定复制的元素个数和下标
		
		//删除后元素个数-1
		size--;
		return obj;
	}
	
	/**
	 * 9. 删除的首次出现的指定元素     void deleteByElement(Object ele)
	 * @param ele
	 */
	public void deleteByElement(Object ele){
		//直接调用上面的方法，获取ele的下标，如果下标合法证明有当前元素ele，直接调用上面根据下标删除方法删除即可
		int index = searchByElement(ele);
		//如果index < 0或者大于最大下标，说明当前数组中没有该元素，直接结束方法
		if (index <0 || index > size-1) {
			return;
		}
		
		//调用根据下标删除方法
		deleteByElement(index);
	}
	
	/**
	 * 10.插入指定下标处一个指定元素 void insertByIndex(int index,Object obj)
	 * 也要考虑3种情况，首、尾和中间
	 * 也要结合画图，参考删除方法
	 * 图见课堂画图
	 * @param index
	 * @param obj
	 */
	public void insertByIndex(int index,Object obj) {
		//因为数组下标有可能越界，所以要校验合法性,注意，这里特殊处理，因为允许在size处插入元素，所以判断条件要改一下
		if (index < 0 || index > size){
			throw new IllegalArgumentException("亲，请注意,只允许插入下标范围是：[0," + size + "]之内的元素");
		}
		
		//先将特殊情况单独处理，即下标 是size的时候，相当于直接在添加元素，所以直接调用add方法
		if (index == size) {
			add(obj);
			return;//添加完毕后，必须结束方法
		}
		
		//先判断是否需要扩容，这里因为在add方法中也有扩容需求，所以将扩容功能抽取为一个方法growArrayCapcity
		growArrayCapcity();
		
		//画图 搞清楚需要复制几个元素和下标的几个特殊情况：第一个、最后一个。注意：必须先复制再给指定下标元素赋值。
		System.arraycopy(value, index, value, index+1, size-index);
		//给指定下标元素赋值
		value[index] = obj;
		//元素个数+1
		size++;	
	}	

	/**
	 * 11.将对象中所有元素清空 void clear();
	 */
	public void clear(){
		//循环遍历，重新赋值null/Arrays.fill()
		
		//将vlaue重新赋值即可
		value = new Object[10];//没有充分调用GC
		//元素个数重置为0
		size = 0;
		//扩展：遍历数组将每一个元素赋值为null，可以提高GC回收能力，节约资源
	}
	
	/**
	 * 12.可以创建指定长度的ArrayList对象
	 * @param length
	 */
	public ArrayListDemo(int length) {
		super();
		value = new Object[length];
	}
	
	/**
	 * 13.创建一个默认长度是10的ArrayList对象
	 */
	public ArrayListDemo() {
		this(10);
	}
	
	/**
	 * 14.创建一个默认长度是10，且有指定元素的ArrayList对象
	 */
	public ArrayListDemo(Object obj) {
		this(10);
		//直接都用添加元素方法
		add(obj);
	}
}
