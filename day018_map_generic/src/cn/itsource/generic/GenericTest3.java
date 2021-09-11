package cn.itsource.generic;

import java.util.Arrays;
import java.util.List;

/**
 *	 泛型generic：
 *		1. 概念：就是一个占位符号而已，在设计类的时候，占用位置	
 *				就是在设计类（接口等）的时候，没有给规定具体是什么类型的参数，
 *				在实例化或调用的时候再传入具体的类型，告诉编译器这是什么类型。
 *
 *		2. 作用：
 *				1. 帮助程序员校验代码(用泛型约束容器中的元素类型)，限制类型的使用
 *				2. 避免强制转换【遍历Map => Entry】
 *				3. 提高程序的扩展性
 *
 *		3. 使用：
 *				1. 泛型类
 *					语法：直接在类名后加上<数据类型>，一般情况下数据类型用字母代替
 *					一般是在创建对象的时候，传入具体引用数据类型
 
 *				2. 泛型方法【静态方法、实例方法】
 *					语法：在修饰符后，返回值前加上<数据类型>
 *				
 *				3. 泛型上限和下限【约束类型大小】
 *						T super Number: 表示T最小类型取值到Number类型
 *						T extends Number: 表示T最大类型取值到Number类型
 *						<? super T> 表示通配符，可以匹配任意类型
 *
 *				4. 泛型嵌套
 *					Set<Map.Entry<K,V>> entrySet() 返回所有键值对的Set集合。
 *					
 *		4. 注意事项：
 *				1. 泛型数据类型只能是引用类型
 *				2. = 两边<>中的数据必须完全一致，包括顺序
 *
 *				类型擦除（自己查）PECS原则
 *
 *		5. 常见字母含义：
 *				E element 元素,一般用在集合等容器类中
 *				T type	类型
 *				K key	键
 *				V value	值
 *				R result 返回值
 */
public class GenericTest3<T> {

	public static void main(String[] args) {
		// 需求：请设计一个方法，将两个相同类型数组合并，升序排序，并且将合并排序后数组返回。
		// 使用泛型方法
		// 合并两个Integer类型数组
		Integer[] arr1 = {1, 3, 66, 7};
		Integer[] arr2 = {69, 996, 3, -5};
		
		// 调用方法合并
		Integer[] mergeAndSort = mergeAndSort(arr1, arr2);
		System.out.println(Arrays.toString(mergeAndSort));
		
		// 合并两个String类型数组
		String[] arr3 = {"A","C","F"};
		String[] arr4 = {"D","G","B"};
//		String[] mergeAndSort2 = mergeAndSort(arr3, arr4);
//		System.out.println(Arrays.toString(mergeAndSort2));
		
	}
	
	/**
	 * 泛型下限
	 * @param list1
	 * @param list2
	 */
	public static<T> void copy(List<T> list1, List<? super T> list2) {
		//代码不写
	}
	
	/**
	 * 需求1：请设计一个方法，将两个相同类型数组合并，升序排序，并且将合并排序后数组返回。
	 * 	问题1：该方法是static修饰的方法，在类加载的时候就加载到静态区了，而泛型类是在创建对象的时候，才声明的，才能起作用
	 * 		现在需要在类加载的时候，就要声明是一个泛型，所以，只能用泛型方法解决
	 * 	解决方案：
	 * 		2. 泛型方法【静态方法、实例方法】
	 *			语法：在修饰符后，返回值前加上<数据类型>
	 * 	
	 * 	问题2：new对象，必须是确定的类型，不能是泛型，语法规范。
	 * 	解决方案：规避使用new
	 * 
	 * 需求2：限制当前泛型T类型，只能是数值类型Number
	 * 	解决方案：
	 * 		3. 泛型上限和下限【约束类型大小】
	 *				T super Number: 表示T最小类型取值到Number类型
	 *				T extends Number: 表示T最大类型取值到Number类型
	 *				<? super T> 表示通配符，可以匹配任意类型
	 * 
	 * @param arr1 参数数组1
	 * @param arr2 参数数组2
	 * @return 返回合并后升序的数组
	 */
	public static<T extends Number> T[] mergeAndSort(T[] arr1, T[] arr2) {
		// 引用类型参数，都必须先判断合法性
		if (arr1 == null || arr2 == null) {// 判断arr1和arr2是否为null
			throw new IllegalArgumentException("参数不能为null！");
		}
		// 合并数组arr1/arr2,确定新数组长度：arr1.length + arr2.length，创建新数组
//		T[] newArr = new T[arr1.length + arr2.length];// 报错，new对象必须是确定的类型。
		// 数组arr1扩容，并且将arr1复制到新数组newArr中，调用方法： Arrays.copyOf(...)
		T[] newArr = Arrays.copyOf(arr1, arr1.length + arr2.length);
		// 将数组arr2复制到newArr中，调用方法：System.arraycopy(....);
		System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
		// 升序排序
		Arrays.sort(newArr);
		// 返回新数组
		return newArr;
	}
}
