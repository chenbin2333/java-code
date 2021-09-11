package cn.itsource.interface2;

/**
 *	IUSB3_0的接口实现类USB3_0Impl，通过implements实现
 *	
 *	 	
	 接口要使用，必须有实现类【子类】：
	 语法：
	 	public(abstract) class 接口名Impl implements 接口名1, 接口2...{
	 		如果是一个非抽象的类必须重写全部的抽象方法
	 	}
 */
public class USB3_0Impl implements IUSB3_0 {

	@Override
	public void power() {
		System.out.println("充电...");
	}

	@Override
	public void dataTransfer() {
		System.out.println("数据传输...");
	}

}
