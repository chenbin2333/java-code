package cn.itsource.potting1;

/**
 *	Account账户类测试类
 */
public class AccountTest {

	public static void main(String[] args) {
		// 创建Account对象，用无参构造
		Account acc1 = new Account();
		// 给对象acc1成员变量赋值
		acc1.name = "加藤宇航";
//		acc1.pwd = "696969";// 因为pwd是private修饰的，只能在Account类中使用
		acc1.money = 500.00;
		acc1.vip = false;
		// 打印输出成员变量的值
		System.out.println(acc1.name);
//		System.out.println(acc1.pwd);// 因为pwd是private修饰的，只能在Account类中使用
		System.out.println(acc1.money);
		System.out.println(acc1.vip);
		
		// 用有参构造创建Account对象
		Account acc2 = new Account("饭岛小吕", "996007", 50000.00, true);
		// 打印输出acc2成员变量的值
		System.out.println(acc2.name);
//		System.out.println(acc2.pwd);// 因为pwd是private修饰的，只能在Account类中使用
		System.out.println(acc2.money);
		System.out.println(acc2.vip);
		
		// 需求：存款5W，才能升级为vip，即vip为true。
		acc1.vip = true;// 上来就直接修改了vip的值,没有任何校验，毫无安全性可言。用封装来解决这个问题。
		// 重新打印acc1成员变量vip的值
		System.out.println(acc1.vip);
		
	}

}
