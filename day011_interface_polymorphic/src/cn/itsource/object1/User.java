package cn.itsource.object1;

/**
 *	用户类User
 */
public class User {
	private String name;
	private int age;
	
	public User() {}

	/**
	 * 快捷键：alt + shift + s 选择 using Field，然后在选择需要的成员变量，生成构造方法
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 快捷键：alt + shift + s 选择 getter and setter，然后在选择需要的成员变量，生成get和set方法
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// 需求 1：所以，我们希望打印User对象的时候，是打印的对象成员变量的值。
		// 我们希望打印格式如下：[成员变量值1, 成员变量值2...]
		return "[" + name + ", " + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)// 判断当前对象和参数是否是同一个地址
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())// obj.getClass()获取参数对应的字节码文件
			return false;
		User other = (User) obj;// 向下造型，为了使用User中的成员变量和方法
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (this.name != other.name)// String类型如果没有重写Object继承的equals方法，默认是==比较地址，我们现在想要比较的是String对象中的 值
			return false;
		return true;
	}
	
}
