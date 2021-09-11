package cn.itsource.this3;

/**
 *	账户类
 *	4. this 这个（难点、理解）
 	如果有同学不懂this,不用管this是什么，主要设计类的时候，当成语法，用在用参构造和setXxx方法中即可

	4.1. 概念： this指代当前对象，即，哪个对象调用就指代哪个对象
	4.2. 作用和使用：
		4.2.1	解决局部变量和成员变量的二义性
			例如：
			public Account(String name) {
				//在方法中使用变量的时候，优先从局部范围找，就近原则
				//这里因为成员变量和局部变量名字相同，存在二义性问题
				//要解决二义性问题，就需要用到this,加上this，就会直接从成员变量位置找name
				this.name = name;
			}
			
		4.2.2	本类中构造方法之间的相互调用，但是必须是构造方法内的第一句		this调用构造方法不会创建新对象
			语法：this(...); 调用本类中的另一个构造方法，并不会创建额外的对象，会根据参数自动匹配调用对应的构造方法
			
				作用：
					1.可以创建对象的时候，给定某些成员变量默认值
					2.可以复用其它构造方法，简化给成员变量赋值的代码
			例如：
			//1.可以创建对象的时候，给定某些成员变量默认值
			public Account(String name) {
				//name和111111都是String类型，只不过name是一个变量，而111111是一个写死的值
				//并通过该构造方法创建的对象都有相同的   【默认密码】
				this(name,"111111");//必须是构造方法内的第一句,这里调用的是有两个String参数的构造方法
			}
			
			public Account(String name,String pwd) {
				//要解决二义性问题，就需要用到this,加上this，就会直接从成员变量位置找name
				this.name = name;
				this.pwd = pwd;
			}
			
			//2.可以复用其它构造方法，简化给成员变量赋值的代码
			public Account(String name,String pwd,double money) {
				this(name,pwd);//复用上面的有两个String参数的构造方法，简化代码作用
				this.money = money;
			}
			
		-------------------下面使用作为了解---------------------------------
		
		4.2.3	作为返回值返回  ： this持有对象地址，表示该类的一个对象即是一个数据
		
		4.2.4	调用方法的时候，作为实际参数使用
		
		4.2.5	在当前类中调用方法：
					this.getName();
		
		
	4.3. 注意事项：
		4.3.1 this是设计类的时候使用，每一个对象中都会有一个自己的this		
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
	 * 2个String参数的有参构造
	 * 有参构造根据业务需求决定是否要写。 
	 * @param name
	 * @param pwd
	 */
	public Account(String name, String pwd) {
		/*
		 * 这里因为成员变量和局部变量名字相同，存在二义性问题
		 * 要解决二义性问题，就需要用到this,加上this.，就会直接从成员变量位置找name
		 * this 作用 和使用：
				1. 解决局部变量和成员变量的二义性
		 */
		this.name = name;// 将局部变量name赋值给成员变量name
		this.pwd = pwd;
	}
	
	/**
	 * 4个参数的有参构造
	 * 有参构造根据业务需求决定是否要写。 
	 * @param name
	 * @param pwd
	 * @param money
	 * @param vip
	 */
	public Account(String name, String pwd, double money, boolean vip) {
//		name = name;// 将参数name(name是局部变量)赋值给成员变量 name
//		pwd = pwd;// 将参数p(p是局部变量)赋值给成员变量 pwd
//		money = money;// 将参数m(m是局部变量)赋值给成员变量 money
//		vip = vip;// 将参数v(v是局部变量)赋值给成员变量 vip
		// 当使用一个变量的时候，按照就近原则，会优先从局部范围使用，所以，找到了局部变量，赋值的时候没有给成员变量赋值成功。用this解决这个问题。
		/*
		 * 这里因为成员变量和局部变量名字相同，存在二义性问题
		 * 要解决二义性问题，就需要用到this,加上this.，就会直接从成员变量位置找name
		 * this 作用 和使用：
				1. 解决局部变量和成员变量的二义性
		 */
		/*this.name = name;// 将局部变量name赋值给成员变量name
		this.pwd = pwd;
		用this(...)调用上面已经定义好的2个String参数的构造方法，来简化代码
		*/
		this(name, pwd);// 调用上面已经定义好的2个String参数的构造方法，来简化代码，注意：必须在当前构造方法第一行。
		this.money = money;
		this.vip = vip;
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setName(String name) 给成员变量name赋值，需要形参
	 * @param name 
	 */
	public void setName(String name) {
		// 为了测试封装更简单，这里不加任何权限的判断
		/*
		 *  this 作用 和使用：
				1. 解决局部变量和成员变量的二义性
		 */
		this.name = name;// 将参数name赋值给给成员变量name
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setPwd(String pwd) 给成员变量pwd赋值，需要形参
	 * @param pwd 
	 */
	public void setPwd(String pwd) {
		// 为了测试封装更简单，这里不加任何权限的判断
		/*
		 *  this 作用 和使用：
				1. 解决局部变量和成员变量的二义性
		 */
		this.pwd = pwd;// 将参数pwd赋值给给成员变量pwd
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setMoney(double money) 给成员变量money赋值，需要形参
	 * @param money 
	 */
	public void setMoney(double money) {
		// 为了测试封装更简单，这里不加任何权限的判断
		/*
		 *  this 作用 和使用：
				1. 解决局部变量和成员变量的二义性
		 */
		this.money = money;// 将参数money赋值给给成员变量money
	}
	
	/**
	 * 2. 为每一个成员变量提供合理的public修饰的 void setXxx(...)方法	设置成员变量的值		
	 * 	public void setVip(boolean vip) 给成员变量vip赋值，需要形参
	 * @param vip 
	 */
	public void setVip(boolean vip) {
		// 为了测试封装更简单，这里不加任何权限的判断
		/*
		 *  this 作用 和使用：
				1. 解决局部变量和成员变量的二义性
		 */
		this.vip = vip;// 将参数vip赋值给给成员变量vip
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
