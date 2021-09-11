package day006_array_method;

/**
 *	1.7 双层for循环，其实，本质外层循环的循环体  是另外一个循环而已	(了解)
			for(1.初始化条件;	2.条件判断;	3. 循环控制语句){
				4. for(5.初始化条件;	6.条件判断;	7. 循环控制语句){
					8. 循环体
				}
			}
			
			执行流程：
				自己画图去研究
			
			总结的规律：（当成是轮子，可以直接使用）
				外层循环执行一次，内层循环执行所有次
				外层循环负责行数，内层负责每一行中列数
				尽量减少嵌套层级
					
			双层for练习
				1.打印九九乘法表	
		
	最核心的是掌握循环的流程（看笔记+画图）
 */
public class ForFor {

	public static void main(String[] args) {
		out:// 锚点,名字随便起
		for (int j = 1; j <= 5; j++) {
			in:for (int i = 1; i <= 5; i++) {
				System.out.print("*");
				if (i == 2) {
					break out;// 直接跳出到out这层
				}
			}
			System.out.println();
		}
	
	}

}
