package cn.itsource.jar;

/**
 *	3.1 封装jar包	（造轮子）
			step1：选中自己想要封装成jar包的类，右键export导出
				在输入框中输入 jar:
					2. Runnable jar File：可以自己执行的jar包，有main方法		(几乎不用)
						要封装为可以执行的jar包，必须先运行一下当前类。
						然后在下面写一个jar包的名字，然后选择生成jar包的路径，finish即可
				
				在cmd控制台中，切换路径到jar文件所在的目录。
				输入 ：java -jar jar包名.jar
 */
public class RunnableJarFile {

	public static void main(String[] args) {
		System.out.println("RunnableJarFile...");
	}

}
