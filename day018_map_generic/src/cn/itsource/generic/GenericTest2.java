package cn.itsource.generic;

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
public class GenericTest2 {

	public static void main(String[] args) {
		// 需求：请设计一个类Point，用来表示坐标点，至少有x/y
		Point<Integer, Double> point = new Point<Integer, Double>();// 在使用该类的时候，传入具体的类型
		Point<Integer, Integer> point2 = new Point<Integer, Integer>();// 在使用该类的时候，传入具体的类型
	}

}

/**
 *	坐标点类Point
 *	1. 泛型类
 *	语法：直接在类名后加上<数据类型>，一般情况下数据类型用字母代替
 *	一般是在创建对象的时候，传入具体引用数据类型
class Point1 {
	double x;
	double y;
}
class Point2 {
	int x;
	int y;
}
*/
//class Point<数据类型> {// 泛型类，只是一个临时的代替符号，这里可以写任意的字符，也可以写中文，但是不建议
class Point<T, T2> {// 泛型类，只是一个临时的代替符号，这里可以写任意的字符，可以写多个泛型。
	T x;
	T2 y;
}