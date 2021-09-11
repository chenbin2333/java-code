package cn.itsource.potting1;

/**
 *	账户类
 */
public class Account {
	/** String类型成员变量姓名name */
	protected String name;
	
	/** String类型成员变量pwd密码 */
	private String pwd;
	
	/** double类型成员变量money余额 */
	double money;
	
	/** boolean类型成员变量vip是否是会员 */
	public boolean vip;
	
	/**
	 * 无参数构造
	 */
	public Account() {}
	
	/**
	 * 4个参数的有参构造
	 * @param n
	 * @param p
	 * @param m
	 * @param v
	 */
	public Account(String n, String p, double m, boolean v) {
		name = n;// 将参数n(n是局部变量)赋值给成员变量 name
		pwd = p;// 将参数p(p是局部变量)赋值给成员变量 pwd
		money = m;// 将参数m(m是局部变量)赋值给成员变量 money
		vip = v;// 将参数v(v是局部变量)赋值给成员变量 vip
	}
	
	/**
	 * 普通方法getName，用来获取当前对象成员变量name的值
	 * @return
	 */
	public String getName() {
		return name;
	}
}
