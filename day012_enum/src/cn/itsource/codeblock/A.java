package cn.itsource.codeblock;

public class A {
	static {
		System.out.println("A类静态代码块........................");
	}
	
	{
		System.out.println("A类构造代码块........");
	}
	
	public A() {
		super();
		System.out.println("A类构造方法");
	}
}
