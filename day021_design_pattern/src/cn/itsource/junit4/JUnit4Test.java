package cn.itsource.junit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *	1. 单元测试：（掌握）
	1. 导入包，JUnit4包
		选中项目，右键 => Build Path  => Add Library【添加类库】  => 选中Junit
		选中JUnit4  => finish
		
	2. 写一个单元测试类，命名方式：XxxTest(测试类没有main方法)
		
	3. 在测试类中，设计测试方法，命名方式：testXxx（）
		在方法上方会自动添加一个@Test注解
		【test + alt + /】
		test方法不能改除了名字之外的任何东西【异常可以不写，但是根据情况判断】
		
	4. 运行，右键run as JUnit方式
		如果是全部执行，直接选中 @Test注解，右键run as JUnit方式
		如果是某一个方法，直接选中方法名，右键run as JUnit方式
		@Before// 预执行注解，每次执行方法前都会执行该注解
		@After// 每次执行方法后都会执行该注解
	
	5. 运行后结果解释：
		绿条：表示成功执行
		红条：表示执行失败
			1. 代码有异常
			2. 执行失败，逻辑异常【一般是断言不一致会失败】

	6. 自己扩展（测试类中的断言assert）
	
 */
public class JUnit4Test {
	/**
	 * 无参构造
	 */
	public JUnit4Test() {
		System.out.println("JUnit4Test构造方法...");
	}
	
	@Before // @Before注解表示预执行语句，该语句会在每个@Test方法执行前 提前执行
	public void testBefore() throws Exception {
		System.out.println("@Before...");
	}
	
	@Test // @Test注解表示当前方法是测试方法
	public void testJUnit() throws Exception {
//		System.out.println(1 / 0);
		System.out.println("测试方法1...");
	}
	
	@Test // @Test注解表示当前方法是测试方法，该方法可以写多个。
	public void testJUnit2() throws Exception {
		System.out.println("测试方法2...");
	}

	@After // @After注解表示后执行语句，该语句会在每个@Test方法执行后  执行
	public void testAfter() throws Exception {
		System.out.println("@After...");
	}
	
}
