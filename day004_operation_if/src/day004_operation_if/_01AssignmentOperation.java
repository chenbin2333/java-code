package day004_operation_if;

/**
 *	1. 赋值运算（Assignment Operation）：（掌握）是优先级最低的一种运算，等后边的所有运算完毕后，才执行赋值运算
		+= 累加
		-= 累减
		*=
		/=
		%=
		=  
		以下这些符号也是赋值运算符，不重要
		...
		&=
		|=
		^=
		语法： 变量 += 值/另外变量;// 相当于： 变量 = (变量数据类型)(变量 + 值/另外变量);
		
		赋值运算有强制转换功能，可以避免类型提升.会有溢出风险
		例如：
			byte b = 127;
			
			b += 1; => b = (byte)(b+1);
			b = b + 1;
 */
public class _01AssignmentOperation {

	public static void main(String[] args) {
		int a = 1;
		a += 1;// 相当于：a = (int)(a + 1);
		System.out.println(a);
		
		// 举例
		byte b = 127;
//		b = b + 2;// b + 2是int类型的结果，要强转
		b += 2;// 相当于：b = (byte)(b + 1);
		System.out.println(b);
		
	}

}
