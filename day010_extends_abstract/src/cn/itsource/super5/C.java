package cn.itsource.super5;

public class C extends B {
	public C() {
		// 会有一个隐式的无参super();
		super();
		System.out.println("C");
	}
	public C(int a) {
		// 会有一个隐式的无参super();
		super();
		System.out.println("C 有参构造");
	}
}
