package day003_var_operation;

/**
 *	4. 类型转换：(掌握)
  		byte  short（char）  int  long  float（单精度）  double（双精度） (只有数值类型才能相互转换)
  		----------------------从左到右精度越来越高---------------------------->
  
  		1. 小转大，都是可以隐式转换  （从左到右）
  
  		2. 大转小，必须强制转换  （从右到左）	强制转换有数据的溢出风险。溢出的时候，会以二进制进位
  			强制转换语法：
  				小的数据类型 小的变量 = (小的数据类型)大的变量/值;		  
  		
  			当int类型的具体的值，向byte、short、char类型转换的时候，值只要在其表示范围内，都会隐式转换
 */
public class _05TypeChange {

	public static void main(String[] args) {
		// 类型转换的时候，1. 小转大，都是可以隐式转换  （从左到右）
		byte b = 1;// 声明一个byte类型变量b赋值1
		short s = b;// 声明一个short类型变量s赋值byte变量b【小转大】
		int i = s;// 声明一个int类型变量i赋值short变量s【小转大】
		long lon = i;// 声明一个long类型变量lon赋值int变量i【小转大】
		float f = lon;// 声明一个float类型变量f赋值long变量lon【小转大】
		double doub = f;// 声明一个double类型变量doub赋值float变量f【小转大】
		
		// 2. 大转小，必须强制转换  （从右到左）	强制转换有数据的溢出风险。溢出的时候，会以二进制进位
//		float f2 = doub;// 将大的类型转换为小的类型，必须强制转换，否则语法报错。
		// 强制转换语法：小的数据类型 小的变量 = (小的数据类型)大的变量/值;
		float f2 = (float)doub;// 先将double类型变量强制转换为float，然后赋值给f2.
		long lon2 = (long)f2;
		
		// 强制转换有数据的溢出风险。溢出的时候，会以二进制进位
		int j = 128;
		byte b2 = (byte)j;
		System.out.println(b2);// -128
		
		byte b3 = 127;// 127是int类型，127是具体的值，编译器可以判断出它在byte表示范围内，所以，自动转换了
		int j2 = 127;
//		byte b4 = j2;// 报错。j2是变量，变量是int类型，而byte可能装不下
		// 
		byte b4 = (byte)128;// 强制转换不仅可以转换变量，还可以转换值
	}

}
