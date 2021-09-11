package cn.itsource.super5;

public class D extends C {
	public D() {
		// 会有一个隐式的无参super()，如果我们写了一个有参super(...)，则无参的就不存在了
		super(1);
		System.out.println("D");
	}
}
