package cn.itsource.decorator;

/**
 *	该类为了增强读取字节的效率，将字节输入流Input加强了
 *	命名方式：XxxDecorator
 *	装饰着模式：
 * 	装饰模式指的是在不必改变原类（Input）文件和使用继承的情况下，动态地扩展一个对象的功能。
 * 		它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 * 
 * 	实现步骤 ：通过对原类文件继承，对原有方法功能的基础上，增强新的功能
 * 
 * 	使用场景：
 * 		需要对原有功能进行加强的时候，就需要用装饰者模式
 */
public class Buffered extends Input {
	/** 需要加强该类的功能，就要声明一个实例变量 */
	private Input in;
	
	public Buffered(Input in) {
		super();
		this.in = in;
	}

	/**
	 * 该方法加强了读取字节的效率
	 * @return
	 */
	public String readMore(){
		//调用Input的读取方法，加强功能
		int read = in.read();
		// 假设这里已经加强了功能
		if (read != -1) {
			return "有数据";
		} else {
			return null;//没有数据
		}
	}
}
