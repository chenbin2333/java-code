package cn.itsource.interface2;

/**
 *	测试类：测试接口实现类中的功能
 *	测试方式：创建实现类对象，调用全部实现的方法
 */
public class USB3_0Test {

	public static void main(String[] args) {
		// 创建USB3_0Impl对象
		USB3_0Impl usb = new USB3_0Impl();
		// 调用实现方法：power()
		usb.power();
		// 调用实现方法：dataTransfer()
		usb.dataTransfer();
	}

}
