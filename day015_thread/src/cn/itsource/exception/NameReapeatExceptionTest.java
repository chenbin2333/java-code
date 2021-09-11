package cn.itsource.exception;

/**
 *	测试自定义异常类
 */
public class NameReapeatExceptionTest {

	public static void main(String[] args) {
		// 在main方法中，调用register方法，模拟注册过程
		// 调用register方法，模拟一个用户注册
		try {
			boolean register = register("波多野结熊");// 【背锅式】
			if (register) {
				System.out.println("注册成功！");	
			}
		} catch (NameReapeatException e) {
			e.printStackTrace();
			System.out.println("注册失败！");
		}
		System.out.println("正常执行的代码1....");
		
		// 调用register方法，模拟第二个用户注册
		try {
			boolean register = register("仓井小吕");// 【背锅式】
			if (register) {
				System.out.println("注册成功！");	
			}
		} catch (NameReapeatException e) {
			e.printStackTrace();
			System.out.println("注册失败！");
		}
		System.out.println("正常执行的代码2....");
		
	}

	/**
	 * 为了简化方法调用过程，将该方法用static修饰
	 * 用户注册方法: boolean register
	 * 
	 * 异常处理方式二：	向外在抛出给调用者，就是谁调用谁处理。为了给调用者（其他程序员）一个提示 【甩锅式】
					语法：
						当满足异常抛出条件的时候， 创建一个异常对象，通过关键字throw抛出，
						同时该方法也需要通过throws关键字,用在()后{}前，多个异常逗号隔开，顺序无所谓。
	 * 
	 * @param name 传入的用户名
	 * @return 是否注册成功
	 * @throws NameReapeatException 
	 */
	public static boolean register(String name) throws NameReapeatException {
		// 只要是引用类型，都必须先判断这个引用变量是否为null，如果是直接结束
		if (name == null) {
			return false;// 直接返回false
		}
		// 我们用String[] 来模拟数据库中所有的用户名
		String[] names = {"波多宇潇", "饭岛小吕", "仓井小吕", "吉泽骚熊", "大桥小吕", "小泽玛丽进"};
		// foreach遍历整个数组names
		for (String n : names) {
			// 要判断当前参数name跟当前数据库中元素n是否equals相等,如果是，则证明用户名重复了
			if (name.equals(n)) {// 用不为null的变量调用方法equals
				/*
				 * 使用方式：
					在条件判断语句中，满足条件后，创建一个自定义异常对象，然后
				 *	通过throw关键字抛出,并且同时在方法上也要通过throws
				 *	用在（）后｛｝前抛出，多个异常逗号隔开，顺序无所谓。	 
				 */
				throw new NameReapeatException("用户名重复了，请重新输入！");
			}
		}
		// 循环结束也没有抛出异常，证明用户名没有冲突，就返回true，注册成功
		return true;
	}
	
}
