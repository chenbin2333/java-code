package cn.itsource.interface5;


/**
 *	抽象类和接口测试类
 *
 *	上班打卡方法
 *	下班打卡方法
 *	
 *	每个工厂都是相同的，我们设计类的时候，能不能将这2个方法，设计在这三个 工厂1员工、工厂2员工、工厂3员工，
 *	应该将这2个方法抽取到抽象父类 AbstractEmployee类中
 *	工厂1、2、3工作内容完全不同，work()所以，应该在父类中，定义为抽象方法。
 *
 */
public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 * 需求：长安汽车员工管理系统。
		 *  	该项目有一个AbstractEmployee员工基类，其下有3个工厂员工子类，分别为：EmployeeFactory1、
		 * 	EmployeeFactory2、EmployeeFactory3
		 * 	   1. 所有工人都有 上班打卡方法clockIn()（所有员工打卡方式相同）
		 * 	   2. 所有工人都有 下班打卡方法clockOut()（所有员工打卡方式相同）
		 * 	   3. 但是每个工厂的子类中工作的方法work()都不同（强制重写）
		 *  
		 * 并且	
		 *     4. 工厂1员工可以微信支付和支付宝支付（需要声明两个接口IWeChat、IAlibaba，每个接口分别有一个支付方法wechatPay()/aliPay()）
		 * 	   5. 工厂2员工只能支付宝支付
		 * 请编程设计该程序实现
		 * 	工厂1工人工作内容：生产娃娃
		 * 	工厂2工人工作内容：给娃娃穿衣服
		 * 	工厂3工人工作内容：测试娃娃
		 * 
		 *  步骤：
		 *  	先设计工人基类AbstractEmployee，再设计两个接口。最后写3个工人子类，继承和实现对应的类或者接口
		 */
		// 在测试类中创建所有子类对象，然后调用全部的方法（重写的和没有重写的）
		
		// 创建工厂1员工对象
		EmployeeFactory1 emp1 = new EmployeeFactory1();
		
		// 调用上班打卡方法
		emp1.clockIn();

		// 调用下班打卡方法
		emp1.clockOut();

		// 调用工作方法
		emp1.work();
		
		// 调用阿里和微信支付
		emp1.aliPay();
		emp1.wechatPay();
		
		// 其他几个子类自己创建对象调用方法测试
		
	}

}
