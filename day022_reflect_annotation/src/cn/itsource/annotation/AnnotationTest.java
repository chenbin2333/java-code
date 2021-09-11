package cn.itsource.annotation;

import java.util.ArrayList;

/**
 *	2. 注解annotation
	1.概念： 就是一个标签，有标签后，就具有某一些标签的特性。
 		本质就是跟类、接口、枚举平级的新结构
 *	2.作用：
 *		1. 帮助程序员校验代码。例如：@Override
 *		2. 可以提高开发效率和程序的扩展性【框架技术】
			@Test
			@Before
			@After
 */
public class AnnotationTest {
	
	public static void main(String[] args) {
		
		/*
		 * @SuppressWarnings 注解用于抑制编译器警告，直白的讲就是消除Eclipse上那条黄色警告线，
			但编译器里关于这条警告的信息还在。没什么用
		 */
		@SuppressWarnings({ "rawtypes", "unused" })
		ArrayList arrayList = new ArrayList();
		
		
	}
	
	@Override // 该注解表示方法是从父类继承过来的，并且重写了。可以帮助程序员校验代码。
	public String toString() {
		return super.toString();
	}
	
	@Deprecated // @Deprecated 注解用于标识方法已过时，只要是在版本迭代中使用。
	public void test() {
		
	}
	
}
