package cn.itsource.potting2;

/**
 *	Account账户类封装测试类
 */
public class AccountTest {

	public static void main(String[] args) {
		// 创建Account对象，用无参构造
		Account acc1 = new Account();
		// 给对象acc1成员变量赋值
//		acc1.name = "加藤宇航";// 因为name是private修饰的，只能在Account类中使用
//		acc1.pwd = "696969";// 因为pwd是private修饰的，只能在Account类中使用
//		acc1.money = 500.00;// 因为money是private修饰的，只能在Account类中使用
//		acc1.vip = false;// 因为vip是private修饰的，只能在Account类中使用
		
		// 封装后，只能通过对象acc1调用setXxx(实参)赋值
		acc1.setName("加藤宇航");
		acc1.setPwd("696969");
		acc1.setMoney(500.00);
		acc1.setVip(false);
		
		// 打印输出成员变量的值: 因为封装后，不能直接通过acc1.成员变量访问， 所以只能用：对象acc1 调用: 返回值 getXxx()
		String name = acc1.getName();// 获取成员变量name的值：getName()
		System.out.println(name);
		System.out.println(acc1.getPwd());
		System.out.println(acc1.getMoney());
		System.out.println(acc1.isVip());
		
		System.out.println("============================");
		
		// 用有参构造创建Account对象
		Account acc2 = new Account("饭岛小吕", "996007", 50000.00, true);
		// 打印输出acc2成员变量的值
		// 打印输出成员变量的值: 因为封装后，不能直接通过acc2.成员变量访问， 所以只能用：对象acc2 调用: 返回值 getXxx()
		String name2 = acc2.getName();// 获取成员变量name的值：getName()
		System.out.println(name2);
		System.out.println(acc2.getPwd());
		System.out.println(acc2.getMoney());
		System.out.println(acc2.isVip());
		
		// 需求：将已经创建的对象acc2的密码修改为：007996 
		acc2.setPwd("007996");// acc2对象调用setPwd方法赋值
		// 重新打印acc2成员变量vip的值
		System.out.println("修改后：" + acc2.getPwd());
		
	}

}
