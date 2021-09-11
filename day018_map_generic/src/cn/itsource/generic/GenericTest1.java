package cn.itsource.generic;

import java.util.ArrayList;

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
public class GenericTest1 {

	public static void main(String[] args) {
		// 创建ArrayList没有使用泛型,不能限制集合元素类型。所以使用泛型，来限制集合元素类型
		ArrayList<String> list = new ArrayList<String>();
		// 集合list只能装 姓名，是String类型的值
		list.add("波多宇潇");
		list.add("吉泽海龙");
		list.add("小泽玛宇航");
		// 需求：希望当前集合list只能添加String类型数据
		Duck duck1 = new Duck("龙泽小吕");
//		list.add(duck1);// 报错，因为泛型限制了list只能装String类型的值
		
	}

}
/**
 *	鸭类Duck
 */
class Duck {
	String name;

	public Duck(String name) {
		super();
		this.name = name;
	}
	
}

