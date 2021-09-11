package cn.itsource.abstract6;

/**
 *	所有图形父类：图形类AbstractGraph
 *	4. 抽象方法 abstract 方法（重点）
		1. 概念：就是没有任何方法体，且用abstract修饰的方法，()后用分号。
		2. 语法：
				修饰符 abstract 返回值类型 方法名(...); 
	
		3. 作用：从语法层面强制所有的子类重写该方法，保证业务逻辑的合理性
		
	5.  抽象类 abstract修饰的类（重点）
		1. 概念：抽象类 abstract修饰的类，是一种新结构。
		2. 抽象类作用：就是用来装抽象方法的。
		3. 语法：（重点）
			命名一般类名AbstractXxx
		 		修饰符 abstract class AbstractXxx {
				 		实例变量【非static修饰的成员变量】
				 		类变量【static修饰的成员变量】
				 		实例方法【非static修饰的成员方法】
				 		类方法【static修饰的成员方法】
				 		构造方法  // 语法规定：抽象类不能创建对象。只能在子类中通过super使用
						抽象方法：修饰符 abstract 返回值类型 方法名(...);
				}
		4. 抽象类的使用场景： 【理解】
			1. 一般作为业务父类（基类，模板类）
			2. 需要所有子类强制重写方法。例如，模板方法模式。
					
		5. 注意事项：【了解】
			1. 语法规定：抽象类不能创建对象。不能new 对象。只能在子类中通过super使用
			2. 并不是每一个方法都需要重写，子类可以直接调用父类继承的其他实例【没有static修饰的普通方法】方法。
				只有每个子类业务都不同的时候，才用抽象方法强制子类重写。
 */
public abstract class AbstractGraph {
	/**
	 * 求面积getArea
	 * 为了让每一个子类都可以按照自己的业务逻辑重写方法，所以我们用抽象方法来从语法上强制子类重写
	 * @return
	 */
//	public double getArea() {
//		// 因为当前方法有double返回值，所以必须要求我们返回一个double数据。返回任何数据都不合适
//		return 0.0;// 先随便返回一个数据值
//	}
	
	/**
	 * 求面积getArea
	 * 为了让每一个子类都可以按照自己的业务逻辑重写方法，所以我们用抽象方法来从语法上强制子类重写
	 * 
	 * 抽象方法 abstract 方法（重点）
	 * 	 语法：修饰符 abstract 返回值类型 方法名(...);
	 * @return
	 */
	public abstract double getArea();
	
}
