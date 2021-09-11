package cn.itsource.annotation2;

import cn.itsource.annotation2.Vip.VipLevel;

/**
 *	为了测试注解
 *
 *	用户类
 *
 *	使用注解（掌握）
		@注解名(属性名=值, 属性名2=值2)// 类型要一致
		@注解名(属性名={值1, 值2...})  // 注解类型为数组，如果属性名是value可以省略
		@注解名 // 属性名是value,并且有默认值
 */
//@Vip(level=VipLevel.ONE, str="测试", arr={1, 2})
// 因为属性名level有默认值，所以可以不写 
@Vip(str="测试", arr={1, 2})
public class User {
	
	@Vip(level=VipLevel.TWO, str="测试2", arr={1, 2, 3})
	private String name;
	
	private String pwd;
	
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
	 * 获取注解测试方法
	 */
	@Vip(level=VipLevel.FIVE, str="测试3", arr={1, 2, 3, 4, 5})
	public void getAnnotation() {
		System.out.println(" 获取注解测试方法: getAnnotation()");
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
