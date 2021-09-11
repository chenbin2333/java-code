package day004_operation_if;

/**
 *	5. 位运算（了解）不用管
		~n:	按位取反
			记住公式：n的按位取反结果是： -(n+1)
			
		&: 按位与，有0即0
			3&5 = 1
			0011  => 3
			0101  => 5
			----&
			0001  => 1
		
		|:按位或，有1即1
			3|5 = 7
			0011  => 3
			0101  => 5
			----|
			0111  => 7
		
		^:按位异或，同0异1		常常用来交换两个变量的值
			3^5 = 6
			0011  => 3
			0101  => 5
			----^
			0110  => 6
			
		m << n: 按位左位移，如果m是正数，右边补0，是负数就补1  相当于*2^n 次方，有溢出风险
			3<<2 = 12	*2^2
			0011  => 3
			---- <<
			1100  => 12		
		
		m >> n: 按位右位移，如果m是正数，左边补0，是负数就补1  相当于/2^n 次方
			3>>2 = 0	/2^2
			0011  => 3
			---- <<
			0000  => 0		
			
		m >>> n: 无符号右位移，不管m是正数还是负数，左边永远补0，这样的话，负数移动后就变成了正数，失去了数学意义
 */
public class _05BitOperation {

	public static void main(String[] args) {
		// ~
		System.out.println(~3);// -4
		System.out.println(~-4);// 3
		
		System.out.println(3 ^ 5);// 6
		System.out.println(3 & 5);// 1
		System.out.println(3 | 5);// 7
		System.out.println(3 << 2);// 12
		System.out.println(3 >> 2);
		System.out.println(-3 >>> 2);
	}

}
