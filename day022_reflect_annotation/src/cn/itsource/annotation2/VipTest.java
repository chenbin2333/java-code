package cn.itsource.annotation2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 *	Vip注解测试类
 */
public class VipTest {

	public static void main(String[] args) throws Exception, SecurityException {
		// 需求1：将User字节码中的所有注解获取到【字节码获取的是类上的注解】
//		Annotation[] annotations = User.class.getAnnotations();
//		for (Annotation annotation : annotations) {
//			System.out.println(annotation);
//		}
		
		// 需求2：将User字节码中的getAnnotation方法所有注解中所有注解获取到【字节码获取的是类上的注解】
		// 先通过User.class获取getAnnotation方法
//		Method getAnnotation = User.class.getMethod("getAnnotation");
		Method[] methods = User.class.getDeclaredMethods();
		// 遍历所有的方法
		for (Method method : methods) {
			// 获取每个方法上的注解
			Annotation[] annotations = method.getDeclaredAnnotations();
			// 遍历注解数组
			for (Annotation annotation : annotations) {
				// 判断当前注解是否是Vip.class类型注解，如果是可以执行该方法，如果不是则不执行
				if (annotation.annotationType() == Vip.class) {// Vip.class值字节码类型。annotation是注解类型
					// 调用toString，将注解转换为字符串
					String str = annotation.toString();
					System.out.println(str);
					
					// 判断字符串是否包含FIVE等级
					if (str.contains("FIVE")) {
						// 如果包含，则执行对应代码
						System.out.println("FIVE.......");
					}
					// method执行方法，调用invoke
					method.invoke(new User());
				}
			}
			
		}
		
	}

}
