package cn.itsource.simplefactory;

/**
 *	简单工厂模式：（后面可以用反射优化代码）
 *	优点：
 *		1.将生产和消费分离（解耦），即创建对象和使用对象的功能分离，便于管理
 *		将对象管理交给了工厂。
 *	缺点：
 *		1.扩展性弱，如果添加了新的产品，则需要修改工厂方法
 *
 *	使用场景：
 *		适用于产品数量较少，且不经常改变的情况
 */
public class PhoneFactory {
	
	/**
	 * 该方法专门用来根据参数创建对象
	 * @param phoneName
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static Phone getOnePhone(String phoneName) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//		if ("iphone".equals(phoneName)) {
//			return new IPhone();// 创建一个IPhone对象返回
//		} else if ("huawei".equals(phoneName)) {
//			return new HuaweiPhone();// 创建一个HuaweiPhone对象返回
//		} else if ("mi".equals(phoneName)) {
//			return new MiPhone();// 创建一个MiPhone对象返回
//		} else {
//			throw new IllegalArgumentException("不支持手机类型");
//		}
		Class<?> clazz = Class.forName(phoneName);
		return (Phone) clazz.newInstance();
	}
}
