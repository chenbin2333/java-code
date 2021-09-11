package cn.itsource.jar;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *	3.2 使用jar包（掌握）
			step1：在当前项目下，创建一文件夹folder，叫lib
			step2：将jar包复制到当前的lib文件夹中
			step3：将所有的jar包选中右键，build path
				add library
			step4：测试的时候，先将原有的类删除，再在我们代码中通过创建对象或者类名的方式使用即可
 */
public class JarTest {
	@Test
	public void testJar() throws Exception {
		// 使用导入的jar中StringUtil类的方法isNull
		System.out.println(StringUtil.isNull(""));
	}
}
