package cn.itsource.potting2;

/**
 *	账户类
 *	封装步骤：（重点）
		 1. 私有化成员变量（用private修饰成员变量）
		 2. 为每一个成员变量提供合理的public修饰的		
				返回值类型 getXxx()方法	获取成员变量的值，如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
				
				void setXxx(...)方法	设置成员变量的值
		 3. 提供一个无参构造【SE反射讲】
		 4. 该类用public修饰
 */
public class Account {// 4. 该类用public修饰
	/** String类型成员变量姓名name	1. 私有化成员变量（用private修饰成员变量） */
	private String name;
	
	/** String类型成员变量pwd密码 	1. 私有化成员变量（用private修饰成员变量） */
	private String pwd;
	
	/** double类型成员变量money余额	1. 私有化成员变量（用private修饰成员变量） */
	private double money;
	
	/** boolean类型成员变量vip是否是会员	1. 私有化成员变量（用private修饰成员变量） */
	private boolean vip;
	
	/**
	 * 3. 提供一个无参构造【SE反射讲】
	 * 无参数构造
	 */
	public Account() {}
	
	/**
	 * 4个参数的有参构造
	 * 有参构造根据业务需求决定是否要写。 
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
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setName(String n) 给成员变量name赋值，需要形参
	 * @param n 
	 */
	public void setName(String n) {
		// 为了测试封装更简单，这里不加任何权限的判断
		name = n;// 将参数n赋值给给成员变量name
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setPwd(String p) 给成员变量pwd赋值，需要形参
	 * @param p 
	 */
	public void setPwd(String p) {
		// 为了测试封装更简单，这里不加任何权限的判断
		pwd = p;// 将参数p赋值给给成员变量pwd
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setMoney(double m) 给成员变量money赋值，需要形参
	 * @param m 
	 */
	public void setMoney(double m) {
		// 为了测试封装更简单，这里不加任何权限的判断
		money = m;// 将参数m赋值给给成员变量money
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setVip(boolean v) 给成员变量vip赋值，需要形参
	 * @param v 
	 */
	public void setVip(boolean v) {
		// 为了测试封装更简单，这里不加任何权限的判断
		vip = v;// 将参数v赋值给给成员变量vip
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的: 
	 * 	返回值类型 getXxx()方法	获取成员变量的值，如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
	 * 	public String getName()获取成员变量name的值
	 * @return
	 */
	public String getName() {
		// 为了测试封装更简单，这里不加任何权限的判断
		return name;// 直接返回成员变量name的值
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的: 
	 * 	返回值类型 getXxx()方法	获取成员变量的值，如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
	 * 	public String getPwd()获取成员变量pwd的值
	 * @return
	 */
	public String getPwd() {
		// 为了测试封装更简单，这里不加任何权限的判断
		return pwd;// 直接返回成员变量pwd的值
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的: 
	 * 	返回值类型 getXxx()方法	获取成员变量的值，如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
	 * 	public double getMoney()获取成员变量money的值
	 * @return
	 */
	public double getMoney() {
		// 为了测试封装更简单，这里不加任何权限的判断
		return money;// 直接返回成员变量money的值
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的: 
	 * 	返回值类型 getXxx()方法	获取成员变量的值，如果当前成员变量类型是boolean类型，将getXxx()改为 isXxx()
	 * 	public boolean isVip()获取成员变量vip的值
	 * @return
	 */
	public boolean isVip() {
		// 为了测试封装更简单，这里不加任何权限的判断
		return vip;// 直接返回成员变量vip的值
	}
	
}
