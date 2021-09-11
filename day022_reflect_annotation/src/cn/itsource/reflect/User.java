package cn.itsource.reflect;

/**
 *	为了测试反射是否可以达到我们需要的效果，例如：获取某一个字段、构造方法、普通方法。
 *	正常开发的时候，该类可能是还没有设计好 。
 *
 *	用户类
 */
public class User {
	private String name;
	private String pwd;
	
	/** 为了测试反射 */
	public int age;
	
	/** 为了测试反射 */
	public static String country;
	
	/**
	 * public修饰无参构造
	 */
	public User() {}

	/**
	 * public修饰2个String参数构造
	 * @param name
	 * @param pwd
	 */
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	
	/**
	 * private修饰1个String参数构造，测试反射用
	 * @param name
	 */
	private User(String name){
		this.name = name;
	}
	
	/**
	 * public static修饰普通方法，测试反射用
	 */
	public static void testStatic(){
		System.out.println("反射静态方法测试");
	}
	
	/**
	 *  public修饰有1个String参数普通方法，测试反射用
	 * @param str
	 */
	public void test2(String str){
		System.out.println("反射有参非静态方法测试：" + str);
	}
	
	/**
	 * private修饰有无参普通方法，测试反射用
	 */
	private void testPrivate(){
		System.out.println("反射无参私有化的方法测试");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " [" + name + ", " + pwd + "]";
	}
	
}
