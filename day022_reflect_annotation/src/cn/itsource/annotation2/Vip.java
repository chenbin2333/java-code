package cn.itsource.annotation2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *	自定义注解声明步骤：（掌握）
		1. 创建一个注解类@Annotation：
		2. 在类上用元注解修饰（注意，根据情况，决定写几个）
			@Target({ElementType.TYPE, ElementType.METHOD})
			语法：@Target(属性名={值1, 值2...})
				@Target(value={ElementType.TYPE, ElementType.METHOD})
				简写：
				@Target({ElementType.TYPE, ElementType.METHOD})
			
			@Retention(RetentionPolicy.RUNTIME)
			语法：@Retention(属性名=值)
				例如：@Retention(value=RetentionPolicy.SOURCE)
				简写：@Retention(RetentionPolicy.SOURCE)
			
			@Documented 根据实际情况判断是否要写
			@Inherited 根据实际情况判断是否要写
			
		3. 描述注解的取值（声明一些属性）
		语法：
			@4大元注解
			public @interface 注解名{
				内部类、枚举、接口等
				数据类型 属性名() default 默认值; // default表示一个默认取值，可以不写
			}
			数据类型支持：数组、String、8个基本类型、枚举 
			属性名：见名知意，小驼峰，如果只有一个属性，建议声明为：value
			因为使用的时候，value可以省略。
		
		
 */
// 表示@Vip可以用在类名上、方法名上、字段上面。
//@Target(value={ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})// 因为value是默认的属性名，可以省略不写。因为取值是多个，不能省略{}

// @Vip注解，可以在运行时使用
//@Retention(value=RetentionPolicy.RUNTIME)// 因为属性value不是数组，所以不能加{}
@Retention(RetentionPolicy.RUNTIME)// 因为value是默认的属性名，可以省略不写。

// @Vip注解，可以生成文档说明。
@Documented // 根据实际情况判断是否要写

// @Vip注解，可以被使用类的子类继承。
@Inherited // 根据实际情况判断是否要写
public @interface Vip {
	// 注解中可以写内部枚举、内部类、内部接口等。
	// 注解中可以写属性名。其他都不能写
	public enum VipLevel {// 该枚举类，表示vip等级。该内部枚举是为了在当前Vip注解中使用的。
		ONE,
		TWO,
		THREE,
		FOUR,
		FIVE;
	}
	
	/*
	 * 属性写法：
	 * 	数据类型 属性名() default 默认值; // default表示一个默认取值，可以不写
			数据类型支持：数组、String、8个基本类型、枚举 
			属性名：见名知意，小驼峰，如果只有一个属性，建议声明为：value
			因为使用的时候，value可以省略。
	 */
	// 声明一个VipLevel类型的属性，属性名是level，默认值是： VipLevel.ONE
	VipLevel level() default VipLevel.ONE;
	
	// 测试另外几种类型的属性
	// String类型属性，属性名是str
	String str();
	
	// int[]类型属性，属性名是arr
	int[] arr();
}
