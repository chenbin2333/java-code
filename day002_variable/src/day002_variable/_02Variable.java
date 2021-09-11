package day002_variable;

/**
 *	变量（重重点）	variable
	  1. 变量概念：就是一个盒子（容器），用来装数据的。同一时间只能装一个数据。
	  2. 变量作用：用来装好数据，进行运算处理的。
	  3. 使用：（重点）
	  		1. 声明变量
	  			语法：数据类型 变量名;
	  			例如：int age;//声明一个int类型的变量age(年龄)
	  			int level;
	  			
	  		2. 变量赋值： =
	  			语法：变量名 = 值; //=右边的值，赋值给 =左边的变量。注意：必须保证值和变量的数据类型一致
	  			例如：age = 23;//将23赋值给变量age。注意：必须保证值23和变量age的数据类型一致
	  		
	  		3. 变量取值：
	  			语法：变量名;
	  			
	  			使用方式：
	  				1. 直接打印输出
	  				2. 做运算（+，-，*，/....）
	  				3. 赋值给另外的变量
	  				
	  				4. 作为方法参数 使用（先不管。学习方法再用）
 */
public class _02Variable {

	public static void main(String[] args) {
		// 1. 声明变量, 语法：数据类型 变量名;
		int age;// 声明了一个int类型的变量age[年龄]
		// 2. 变量赋值, 语法：变量名 = 值; 解释： 将=右边的值，赋值给 =左边的变量。注意：必须保证值和变量的数据类型一致
		age = 25;// 将25赋值给变量age
		// 3. 变量取值, 语法：变量名;
		// 3.1 	使用方式1：直接打印输出age
		System.out.println(age);// 25
		
		// 3.1 	使用方式2：做运算（+，-，*，/....）
		// 将age的值+1，再重新赋值age
		age=age+1;// 将age的值25取出来，然后+1，再重新赋值给变量age
		System.out.println(age);// 26
		
		// 3.1 	使用方式3：赋值给另外的变量
		int age2;// 声明另外一个int变量age2
		age2 = age;// 将age中的值26赋值给age2
		System.out.println(age2);// 26
		
		/*
		 *  变量也可以声明的时候直接赋值使用
		 *  语法：数据类型 变量名 = 值;
		 *  例如： int age3 = 25;
		 */
		int age3 = 25;// 声明一个int类型变量age3，直接赋值为25
		// 直接打印输出age3的值
		System.out.println(age3);
		
		/*
		 * 变量也可以直接声明多个变量，但是不建议。
		 * 语法：
		 * 		数据类型 变量名1,变量名2,变量名3;
		 * 例如:
		 * 	int a, b, c;
		 */
		int a, b, c;// 声明int类型的3个变量，分别是a/b/c
		// 赋值
		a = 1;
		b = 2;
		c = 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		/*
		 * 变量也可以直接声明多个变量并且同时赋值，但是不建议。
		 * 语法：
		 * 		数据类型 变量名1 = 值1,变量名2 = 值2,变量名3 = 值3;
		 * 例如:
		 * 	int e = 1, f = 2, g = 3;
		 */
		int e = 1, f = 2, g = 3;// 声明int类型的3个变量，分别是e赋值为1，f赋值为2，g赋值为3
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
