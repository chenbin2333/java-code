package day004_operation_if;

/**
 *	4. 逻辑运算（Logical Operation）（掌握）逻辑运算两边必须是布尔类型的值或者是表达式
		!: 表示取反，非真即假，非假即真 (操作一个变量/值)
		
		&&:逻辑双与，表示并且，有假即假，有短路功能，没有位运算功能
		
		&:逻辑单与，表示并且，有假即假，没有短路功能，有位运算功能
		
		||:逻辑双或，表示或者，有真即真，有短路功能，没有位运算功能
		
		|:逻辑单或，表示或者，有真即真，没有短路功能，有位运算功能
		
		^:逻辑异或， 同假异真【基本不用】
		
		短路问题：当逻辑运算左边能够确定整个表达式结果值的时候，就会发生短路，不会再计算后面的
		结果了，这样可以提供程序运算效率
		
		例如：
			&&当左边为false时，右边的就短路了
			||当左边为true时，右边的就短路了
			
		以后，逻辑运算都用 && 或者 ||
		
		优先级问题：
			! > &&(&) > ||(|)
			验证：
				true || true && false 
				如果是true，&&优先级高
				如果是false，||优先级高或者相等
 */
public class _04LogicalOperation {

	public static void main(String[] args) {
		// 需求1：苍苍老师学习Java，如果苍苍笔试考100，且机试考100，则奖励 金箍棒。
		int score1 = 100;// 声明一个int变量score1赋值100。表示笔试100
		int score2 = 100;// 声明一个int变量score2赋值100。表示机试100
		// 判断两个变量是否都是100，这里 就是并且的关系
		System.out.println(score1 == 100 && score2 == 100);// true
		
		// 需求2：苍苍老师学习Java，如果苍苍笔试考100，或者 机试考100，则奖励 狼牙棒。
		// 判断两个变量是否有一个为100，这里 就是或者的关系
		System.out.println(score1 == 100 || score2 == 100);// true
		
		// !:逻辑非， 表示取反，非真即假，非假即真 (操作一个变量/值)
		System.out.println(!true);// false
		System.out.println(!false);// true
		
		System.out.println("================== && ====================");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		// 下面两句代码 &&前发生了短路。当整个表达式结果可以确定的时候发生短路.可以提高效率
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		
		System.out.println("================== & ====================");
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		// 下面两句代码 &前没有短路，后面还要计算。单与逻辑运算效率低下
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		System.out.println("================== || ====================");
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		// 下面两句代码 ||前发生了短路。当整个表达式结果可以确定的时候发生短路.可以提高效率
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		
		System.out.println("================== | ====================");
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		// 下面两句代码 |前没有短路。单或逻辑运算效率低下
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		
		System.out.println("================== ^【了解】 ====================");
		// ^:逻辑异或， 同假异真【用的很少】
		System.out.println(false ^ true);//true
		System.out.println(true ^ false);//true
		// ^两边都是相同的，不管都是true或者都是false  结果都是假false
		System.out.println(false ^ false);//false
		// ^两边都是相同的，不管都是true或者都是false  结果都是假false
		System.out.println(true ^ true);//false
		
	}

}
