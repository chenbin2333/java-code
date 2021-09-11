package cn.itsource.codeblock;

public class C extends B {
	static {
		System.out.println("C类静态代码块........................");
	}
	
	{
		System.out.println("C类构造代码块........");
	}
	
	public C() {
		super();
		System.out.println("c类构造方法");
	}
}
