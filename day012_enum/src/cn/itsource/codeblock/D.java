package cn.itsource.codeblock;

public class D extends C {
	static {
		System.out.println("D类静态代码块........................");
	}
	
	{
		System.out.println("D类构造代码块........");
	}
	
	public D() {
		super();
		System.out.println("D类构造方法");
	}
	
	public static void main(String[] args) {
		new D();// 使用到D类，要加载D类
	}
}
