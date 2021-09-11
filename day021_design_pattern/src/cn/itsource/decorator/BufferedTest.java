package cn.itsource.decorator;

/**
 *	装饰者模式测试类
 */
public class BufferedTest {

	public static void main(String[] args) {
		// 创建字节流Input对象
		Input input = new Input();
		// 创建缓冲流Buffered对象,将字节流对象Input传入，包装一下
		Buffered buffered = new Buffered(input);
		
		//调用缓冲流Buffered对象的读取readMore方法
		String readMore = buffered.readMore();
		System.out.println(readMore);
		
	}

}
