package cn.itsource.simplefactory;

/**
 *	简单工厂测试类
 */
public class PhoneTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*
		 * 生产者
		 * 专门用来创建对象，需要一个什么样的对象，只要传入对应的数据，就能获取一个对象
		// 创建小米手机对象
		Phone miPhone = new MiPhone();
		// 创建华为手机对象
		Phone hua = new HuaweiPhone();
		// 创建苹果手机对象
		Phone iphone = new IPhone();
		*/
		// 调用简单工厂方法，获取一个MiPhone对象
		Phone miPhone = PhoneFactory.getOnePhone("mi");
		// 调用简单工厂方法，获取一个IPhone对象
		Phone iphone = PhoneFactory.getOnePhone("iphone");
		// 调用简单工厂方法，获取一个MiPhone对象
		Phone hua = PhoneFactory.getOnePhone("huawei");
		
		/*
		 * 我们只是需要调用一下对象的方法而已,所以，只是需要一个对象而已，并不关心对象是怎么来的
		 * 我们只是消费者
		 */
		miPhone.bell();// 使用就是消费
		hua.bell();
		iphone.bell();
		
	}

}
