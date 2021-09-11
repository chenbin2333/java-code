package cn.itsource.interface5;

/**
 *	 需求：长安汽车员工管理系统。
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
public class EmployeeFactory3 extends AbstractEmployee {
	
	@Override
	public void work() {
		System.out.println("测试娃娃。。。");
	}

}
