package cn.itsource.interface3;

/**
 *	接口IMyInterface的实现类MyInterfaceImpl，重写全部的抽象方法
 */
public class MyInterfaceImpl implements IMyInterface {

	@Override
	public void testAbstract() {
		System.out.println("重写的抽象方法...");
	}

}
