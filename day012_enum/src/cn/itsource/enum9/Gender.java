package cn.itsource.enum9;

/**
 *	6. 枚举enum (重点掌握)
	1. 概念：就是一种跟类平级的新结构，适用于类中常量取值比较固定的场景
	2. 作用：就是简化类中全局常量这种代码
	3. 语法：
		 声明语法：(掌握)
			public enum 枚举类名Enum {
				字段（全大写、下划线。简化的就是全局常量）
				实例变量（尽量是private final修饰的）
				实例方法
				类方法【一般不会使用】
				构造方法 - 枚举中的构造方法默认都是private修饰，不能够是public，protected修饰
					构造方法作用：只能在当前枚举类中使用，就是给当前枚举类对象初始化实例变量的
			}
	
	4. 注意：
		4.1. 字段之间用逗号，最后一个字段用分号结束
		4.2. 可以写中文字段，但是不建议
		4.3. 枚举类都会隐式继承了抽象类Enum类（所有枚举类的基类），不能显示写出extends来
		4.4. 构造方法必须是private的
		4.5. 实例变量只能写在字段下
		
	5. 使用场景：(掌握)
		适用于一些取值固定的情况。例如：Vip、性别、QQ状态、星座、季节。。。。
 */
public enum Gender {
	未知,
	MAN,
	WOMAN;
}
