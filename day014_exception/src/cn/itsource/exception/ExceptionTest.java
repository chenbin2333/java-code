package cn.itsource.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// 之前碰到过这样的情况
		System.out.println(1 / 0);// ArithmeticException算数异常，不能除0
		System.out.println("正常需要执行的代码....");
	}

}
