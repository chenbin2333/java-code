package cn.itsource.polymorphic3;

/**
 * 子类Vip1继承AbstractVip
 *账户管理系统，账户登录，登录后，显示当前账户的会员等级
 * Vip类，是所有会员的父类，有一个方法 show(),因为每个账户等级都是不同的，所以要强制重写;显示会员等级
 * 3个子类：
 * 	Vip1 1~9级
 * 		特权方法：low()
 * 	Vip2 10~19级
 * 		特权方法: normal()
 * 	Vip3 20~29级
 * 		特权方法: great()
 */
public class Vip1 extends AbstractVip {

	@Override
	public void show() {
		System.out.println("9级");
	}
	
	/**
	 * 	Vip1 1~9级
	 * 		特权方法：low()
	 */
	public void low() {
		System.out.println("你很low...");
	}
}
