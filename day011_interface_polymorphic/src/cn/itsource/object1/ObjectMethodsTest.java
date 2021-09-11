package cn.itsource.object1;

/**
 *	6. Object类中的方法（重点、难点）
	1. int hashCode() 返回对象的哈希码值。  作用在数据结构的时候讲
 
 	2. String toString() 返回对象的字符串表示形式。如果需要打印对象的指定格式，
 		则需要重写当前对象所对应类的toString方法即可。
 		例如：打印Student对象为指定格式，则要重写 Student类的toString方法
 		
 	3. boolean equals(Object obj) 根据实际业务，判断两个对象成员变量的值是否相等，
				不是直接判断==【就是比较成员变量的值是否相等】
	 		判断当前对象和obj参数成员变量的值是否相等
	 		以后比较引用类型调用equals方法比较
	 		
	 		通过快捷键：alt + shift + s 选择hashCode和equals生成选项，在弹出的窗口中，勾选比较的成员变量OK即可
 		例如：
 			两个学生Student对象，我们认为姓名和电话号码相同就是同一个人，就用重写Student学生类的equals方法
 			两个教师Teacher对象，我们认为身份证号相同就是同一个人，就用重写Teacher教师类的equals方法
 			    
 	4. Class getClass() 即当前对象所对应的字节码文件   （反射最常用）
	 		字节码文件用==比较（了解）
	 		 Class类是 字节码文件类型 
	 		 例如： 
	 		 	user对象调用getClass()获取的是user对象的字节码文件 User类
 */
public class ObjectMethodsTest {

	public static void main(String[] args) {
		// 先创建User对象u1
		User u1 = new User("波多野宇潇", 22);
		// 先创建User对象u1
		User u2 = new User("波多野宇潇", 22);
		
		// 1. int hashCode() 返回对象的哈希码值。  作用在数据结构的时候讲
		int hashCode1 = u1.hashCode();
		System.out.println("哈希值1 ： " + hashCode1);// 366712642
		
		int hashCode2 = u2.hashCode();
		System.out.println("哈希值2 ： " + hashCode2);// 1829164700
	 	
		/*
		 * 2. String toString() 返回对象的字符串表示形式。如果需要打印对象的指定格式，
	 		则需要重写当前对象所对应类的toString方法即可。
	 		例如：打印Student对象为指定格式，则要重写 Student类的toString方法
		 */
		// 直接打印对象，打印的是地址，对我们程序员没有意义。
		// 需求 1：所以，我们希望打印对象的时候，是打印的对象成员变量的值。我们希望打印格式如下：[成员变量值1, 成员变量值2...]
		System.out.println(u1);// cn.itsource.object1.User@15db9742
		System.out.println(u2);// cn.itsource.object1.User@6d06d69c
		
		/*
		 * 3. boolean equals(Object obj) 根据实际业务，判断两个对象成员变量的值是否相等，
				不是直接判断==【就是比较成员变量的值是否相等】
	 		判断当前对象和obj参数成员变量的值是否相等
	 		以后比较引用类型调用equals方法比较
	 		
	 		通过快捷键：alt + shift + s 选择hashCode和equals生成选项，在弹出的窗口中，勾选比较的成员变量OK即可
 			例如：
 				两个学生Student对象，我们认为姓名和电话号码相同就是同一个人，就用重写Student学生类的equals方法
 				两个教师Teacher对象，我们认为身份证号相同就是同一个人，就用重写Teacher教师类的equals方法
 				
		 *  需求 2: 需要在添加用户的时候，可以判断是否是同一个用户对象
		 *  现在就是要比较两个对象成员变量的值是否相等
		 */
		System.out.println(u1 == u2);// false，比较两个对象是否是同一个，== 比较的是堆中的地址。
		/*
		 * 从Object中继承的equals方法，默认是==比较，不满足子类User的需求，User 希望比较的是成员变量name和age的值
		 */
		System.out.println("两个对象比较： " + u1.equals(u2));// true，比较的是name和age的值
		
		/*
		 * String是引用类型，而引用类型保持数据都是通过成员变量来完成的。
		 * String类型保存数据的成员变量是 char[]，所以，要比较两个String对象是否相等，就相当于比较的是
		 * 这两个对象的成员变量中 char[]的值是否相等，这里就相当于调用了String类中的equals比较的。因为
		 * 如果不是equals比较，==是比较的地址没有意义。
		 */
		String str = "123";
		String str2 = "123";
		System.out.println(str.equals(str2));
		
		/*
		 * 4. Class getClass() 即当前对象所对应的字节码文件   （反射最常用）
	 		字节码文件用==比较（了解）判断两个字节码文件是否相等用==比较
	 		 Class类是 字节码文件类型
	 		 例如： 
	 		 	user对象调用getClass()获取的是user对象的字节码文件 User类
		 */
		Class<? extends User> class1 = u1.getClass();
		Class<? extends User> class2 = u2.getClass();
		System.out.println(class1);// class cn.itsource.object1.User
		System.out.println(class2);// class cn.itsource.object1.User
		System.out.println(class1 == class2);// true
		
		// jdk中自带的类，都已经将上面的这些方法重写了
	}

}
