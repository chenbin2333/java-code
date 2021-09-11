package cn.itsource.optional;

import java.util.Optional;
import java.util.function.Function;

/**
 *	3. Optional【掌握】
	Optional类：适用于业务复杂的场景，通常配合Stream中reduce方法使用。
 *		1.概念：处理可能为null对象的容器。
 *		2.作用： 更好的 处理null的情况
 *		3.常用方法：
 *			1. static <T> Optional<T> ofNullable(T value) 
				如果value是null，则返回一个空的 Optional 。否则返回一个带有  指定值的Optional、
				
			2. T orElse(T other)如果不成立则执行 orElse中的语句 【如果Optional装的对象是null，则执行】
			
			3. <U> Optional<U> map(Function<? super T,? extends U> mapper) 处理Optional对象
				 【如果Optional装的对象 不是null ，则执行】
				
			4. boolean isPresent() 返回 true表示Optional中装的对象不为null，否则 false表示为null 。  
			
		4. 扩展：
			https://www.cnblogs.com/zhangboyu/p/7580262.html
			https://blog.csdn.net/qq_35634181/article/details/101109300
 */
public class OptionalTest {

	public static void main(String[] args) {
		// 调用getUserName方法测试
		System.out.println(getUserName(null));
		System.out.println(getUserName(new User()));
		
		System.out.println(getUserName(new User("MrWang")));
		
	}
	
	/**
	 * 请设计一个方法，传入一个User对象，如果User对象不为null，请获取对象名，将名字转换为大写，返回
	 * @param u
	 * @return
	 */
	public static String getUserName(User u) {
		/*if (u == null) {
			return "参数为null！";
		} else {
			String name = u.getName();
			if (name == null) {
				return "没有名字！";
			} else {
				return name.toUpperCase();
			}
		}*/
		// 用Optional类进行代码优化
		// 将参数u对象装到Optional容器中
//		Optional<User> optional = Optional.ofNullable(u);
//		String name = optional.map(new Function<User, String>() {// User表示参数类型，String表示方法返回值类型
//			@Override // 将传入的参数t获取名字，返回
//			public String apply(User t) {
//				return t.getName();
//			}
//		})// 将对象u的String类型名字获取到后，装到Optional中
//		.map(new Function<String, String>() {
//			@Override
//			public String apply(String t) {
//				return t.toUpperCase();// 将t转换为大写返回
//			}
//		})
//		.orElse("参数有误！");// orElse决定了返回值类型, 当名字或者用户都为null的时候，执行orElse
//		return name;
		
		// 用lambda优化
//		Optional<User> optional = Optional.ofNullable(u);
//		String name = optional.map(user -> user.getName())// 将对象u的String类型名字获取到后，装到Optional中
//		.map(t -> t.toUpperCase())
//		.orElse("参数有误！");// orElse决定了返回值类型, 当名字或者用户都为null的时候，执行orElse
//		return name;

		// 特殊方法引用优化
		String orElse = Optional.ofNullable(u).map(User :: getName)// 将u的name获取到后，装到Optional中
				.map(String :: toUpperCase)// 将u的name转换为大写返回
				.orElse("错误！");// 如果没有用户返回该值
		return orElse;
	}
}

class User {
	private String name;
	
	public User() {}

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
}
