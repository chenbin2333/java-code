package cn.itsource.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *	4.2 BigInteger:比long类型精度更高的整数类型
	
		BigDecimal:比double类型精度更高的类型，一般使用在金融相关行业。例如，银行、保险公司等【掌握】
		建议大家用String类型的有参构造，因为double类型参数会有精度丢失问题。
			注意除法的溢出问题。用重载方法
 */
public class BigDecimalTest {

	public static void main(String[] args) {
		// BigInteger:构造方法:BigInteger(String val) 【自己敲一下】
		
		/*
		 * 构造方法：
		 *		BigDecimal(String val)  建议使用这种方式创建，因为其他方式有可能会有精度丢失
		 */
		BigDecimal big = new BigDecimal("3.1415926");
		BigDecimal big2 = new BigDecimal("0.0005926");
		
		// 加法：BigDecimal add(BigDecimal augend) 返回 BigDecimal ，其值是 (this + augend)  
		BigDecimal add = big.add(big2);
		System.out.println("和：" + add);
		
		// 减法：BigDecimal subtract(BigDecimal subtrahend) 返回 BigDecimal ，其值是 (this - subtrahend) 
		
		
		// 乘法：BigDecimal multiply(BigDecimal multiplicand) 返回 BigDecimal ，其值是 (this × multiplicand)， 
		
		
		// 除法：BigDecimal divide(BigDecimal divisor)返回BigDecimal ，其值为(this / divisor 
//		BigDecimal divide = big.divide(big2);// ArithmeticException 算数异常
//		System.out.println("商：" + divide);
		
		/*
		 * 当精度超出BigDecimal表示范围的时候，就需要用divide方法重载方法
		 * 1. BigDecimal divide(BigDecimal divisor, int scale, int roundingMode) 
		 * scale:保留的小数位数
		 * roundingMode:是BigDecimal常量，	通过类.常量使用,例如：BigDecimal.ROUND_DOWN 
		 * 
		 * 2. public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
		 * 该方法能够设置小数位数的参数，如果需要设置指定小数位数，用重载方法
		 * 	RoundingMode：就是一个枚举类，是决定取舍方式的。
		 * 		使用方式：枚举名.字段；
		 * scale:保留的小数位数
		 * 
		 * 建议使用：该方法可以决定保留小数的位数
		 */
		//  1. BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
//		BigDecimal divide = big.divide(big2, 6, BigDecimal.ROUND_CEILING);// ,表示保留6位小数，然后取舍方式是：使用BigDecimal类中的常量
//		System.out.println("商：" + divide);
		
		// 2. public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
		BigDecimal divide2 = big.divide(big2, 8, RoundingMode.CEILING);// 使用枚举字段
		System.out.println("商：" + divide2);
		
	}

}
