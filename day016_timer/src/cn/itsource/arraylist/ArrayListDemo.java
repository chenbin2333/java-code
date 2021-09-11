package cn.itsource.arraylist;

import java.util.Arrays;

/**
 *	1. 需求1：
 *				1. 请设计一个类，可以装多个不同类型的数据,初始长度是10个
 *					底层是基于数组，因为是可以装不同数据类型的数据，所以是Object数组
 *					int/byte/short /boolean....
 *					Object[] value = new Object[10];
 *					value[0] = 1;//int 的1装好为对应的包装类Integer
 *
 *				2. 可以记录当前数据的个数 int size()
 *					
 *				3. 可以添加任意类型的数据 void add(Object obj)
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
	/** 1. 请设计一个类，可以装多个不同类型的数据,初始长度是10个 */
	private Object[] value = new Object[10];
	
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
	 *		version2 自动扩容
	 * @param obj
	 */
	public void add(Object obj) {
		// 添加数据相当于给数组value元素赋值，所以，必须知道下标。
		/*// 第1次添加，下标：0  元素个数：size=0
		value[0] = obj;
		// 元素个数+1
		size++;
		
		// 第2次添加，下标：1  元素个数：size=1
		value[1] = obj;
		// 元素个数+1
		size++;
				
		// 第3次添加，下标：2  元素个数：size=2
		value[2] = obj;
		// 元素个数+1
		size++;
		规律：要添加的元素下标刚好是目前size的值
		*/
		// 每次添加元素的时候，必须先判断当前数组value是否可以装下添加的元素，判断的条件：size == value.length，扩容
		if (size == value.length) {// 说明已经装不下了，需要扩容。扩容机制：原长度 * 2
			value = Arrays.copyOf(value, value.length * 2);// 注意：必须将新扩容后的数组，重新赋值给value保存。
		}
		value[size] = obj;// 直接通过下标赋值obj
		// 元素个数+1
		size++;
	}
	
	/**
	 * 4. 可以打印当前数据结构的对象，格式如下：[值1，值2...]
	 */
	public String toString() {
		// 可以遍历拼接，但是很麻烦
		// 直接将value缩容为size个的新数组
		Object[] newArr = Arrays.copyOf(value, size);
		// 利用Arrays工具类中的toString方法将新数组newArr 拼接字符串
		String str = Arrays.toString(newArr);
		return str;
	}
	
	/**
	 * 5. 查询指定下标的元素  Object searchByIndex(int index)
	 * @param index 下标
	 * @return
	 */
	public Object searchByIndex(int index) {
		// 校验下标合法范围: 0~size-1
		checkIndex(index);
		// 直接通过下标获取对应元素
		return value[index];
	}

	/**
	 * 校验下标方法： private void checkIndex(int index)
	 * 抽取方法快捷键：alt + shift + m
	 * @param index
	 */
	private void checkIndex(int index) {
		if (index < 0 || index > size - 1) {// 判断非法范围
			// 创建一个ArrayIndexOutOfBoundsException异常对象抛出给调用者
			throw new ArrayIndexOutOfBoundsException("下标越界，下标范围是：[0, " + (size - 1) + "]");
		}
	}
	
	/**
	 * 6. 查询指定的元素第一次出现的位置  int searchByElement(Object ele);
	 * @param ele
	 * @return
	 */
	public int searchByElement(Object ele) {
		// 思路：遍历数组value，将每一个元素value[i]跟ele元素equals方法，如果相等则返回下标，如果循环结束也不相等，返回-1
		// 先判断参数ele是否为null，因为参数只需要判断一次即可
		if (ele == null) {// 如果ele是null，则用==比较
			for (int i = 0; i < size; i++) {// 这里循环次数是size次，因为只有size个元素。不是数组长度个
				// 将每一个元素value[i]跟ele元素equals方法
				if (value[i] == ele) {// 比较引用类型默认值null必须用==比较
					return i;// 返回下标
				}
			}
		} else {// 如果ele不是null，则用equals比较
			for (int i = 0; i < size; i++) {// 这里循环次数是size次，因为只有size个元素。不是数组长度个
				// 将每一个元素value[i]跟ele元素equals方法
				if (ele.equals(value[i])) {// 必须用参数ele调用equals方法，因为参数已经确定了不是null，而元素有可能还是为null
					return i;// 返回下标
				}
			}
		}
		// 如果循环结束也不相等，返回-1
		return -1;// 表示没有找到
	}
	
	/**
	 * 7. 修改指定下标处的元素  void updateByIndex(int index, Object obj)
	 * @param index
	 * @param obj
	 */
	public void updateByIndex(int index, Object obj) {
		// 校验下标合法范围: 0~size-1
		checkIndex(index);
		// 直接通过数组value下标index重新赋值为obj
		value[index] = obj;
	}
	
	/**
	 * 8. 删除指定下标处的元素，返回删除的元素  Object deleteByIndex(int index)
	 * @param index
	 * @return
	 */
	public Object deleteByIndex(int index) {
		// 校验下标合法范围: 0~size-1
		checkIndex(index);
		// 因为数组删除元素后，被删除的元素就找不到了，所以先用临时变量保存一下
		Object temp = value[index];
		// 根据画图，得出删除数组头元素、中间元素，尾元素都可以使用同一个方法完成
		System.arraycopy(value, index + 1, value, index, size - index - 1);
		// 将下标最后一个元素赋值为null，充分调用GC，回收资源
		value[size - 1] = null;
		// 元素个数-1
		size--;
		// 返回temp删除的元素
		return temp;
	}
	
}
