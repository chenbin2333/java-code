package cn.itsource.interface4;

/**
 *	当类既要继承父类，又要实现接口的时候，亲爹在前干爹在后
 *	重写全部抽象方法
 */
public class Son extends AbstractFather implements A, B, C, D {

	@Override
	public void testD() {

	}

	@Override
	public void testC() {

	}

	@Override
	public void testB() {

	}

	@Override
	public void testA() {

	}

	@Override
	public void test() {

	}

}
