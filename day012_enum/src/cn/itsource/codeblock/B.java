package cn.itsource.codeblock;

public class B extends A {
	static {
		System.out.println("B类静态代码块........................");
	}
	
	{
		System.out.println("B类构造代码块........");
	}
	
	public B() {
		super();
		System.out.println("B类构造方法");
	}
}
