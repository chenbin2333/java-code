package day004_operation_if;

/**
 *	2. 比较运算(Compare Operation)：（掌握）结果一定是boolean类型,以后通常配合循环和条件语句使用
		>
		<
		>=
		<=
		
		==: 恒等于
			1. 比较基本类型，比较的是值是否相等
			例如： 
			int a = 1;
			int b = 1;
			System.out.println(a == b); //true
			
			2. 比较引用类型，比较的是地址是否相等【后面讲】
			
		!=: 不等于
			1. 比较基本类型，比较的是值是否不相等
			2. 比较引用类型，比较的是地址是否不相等
		
		instanceof:只能比较引用类型，一般配合条件语句使用(面向对象重点讲，今天不管)
			表示判断一个变量或者值是否属于某一个引用数据类型
			语法：
				值/变量 instanceof 引用数据类型
			例如：
				1.System.out.println("约" instanceof String); 
				
				2.String str = "不约";
				System.out.println(str instanceof String); 
	
 */
public class _02CompareOperation {

	public static void main(String[] args) {
		int i = 2;
		int j = 8;
		// 判断i和j是否相等：==
		System.out.println(i == j);// false
		// 判断i和j是否不相等: !=
		System.out.println(i != j);// true
		
	}

}
