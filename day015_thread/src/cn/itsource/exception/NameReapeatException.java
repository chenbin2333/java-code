package cn.itsource.exception;

/**
 * 用户名重复异常NameReapeatException，继承Exception
 *	4. 自定义异常： 命名XxxException （掌握）
			设计步骤：	
				1. 设计一个XxxException 去继承 Exception 类
				2. 通过eclipse工具生成一个随机的序列化号 serialVersionUID（选第2个）
					将鼠标移动到类名上，在弹框中选择第二个
				3. 通过eclipse工具生成一个无参构造和一个String类型参数的构造
					alt+shift+s弹框选择通过SuperClass的方式生成，勾选无参构造和String参数构造即可
 */
public class NameReapeatException extends Exception {

	/**
	 * 2. 通过eclipse工具生成一个随机的序列化号 serialVersionUID（选第2个）
					将鼠标移动到类名上，在弹框中选择第二个
	 */
	private static final long serialVersionUID = -5844378185908159486L;

	public NameReapeatException() {
		super();
	}

	public NameReapeatException(String message) {
		super(message);
	}
	
}
