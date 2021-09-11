package day004_operation_if;

/**
 *	switch（掌握）
		语法：
			声明变量
			switch(变量){
				case 值1:
					功能语句1
					功能语句2...
					break;
				case 值2:
					功能语句1
					功能语句2...
					break;
				case 值3:
					功能语句1
					功能语句2...
					break;
				
				default:相当于else
					default语句
					break;
			}
			switch语句优先从case开始匹配，只有case都没有匹配上才匹配default语句
			如果匹配上一个case，则会找最近的break，如果没有，则会一直向下执行，就不会
			匹配了，直到找到break或者到switch语句结束为止
			
			switch支持的数据类型：
				byte/ short / int / char / String（1.7） / 枚举类型（1.5）
				
			使用场景：
				switch不适应区间条件，只适用于一些条件比较固定的场景。例如：vip、星座、QQ状态、月份
				礼拜、生肖、季节...
				
	1.5. 使用场景：
		只有比较固定的情况下，使用switch结构，其他情况一律用if语句
 */
public class _08Switch {

	public static void main(String[] args) {
		/*
		 * 需求：增肥计划
		 * 	礼拜1：吃牛排69斤1分熟
		 * 	礼拜2：吃腰子9斤1分熟
		 * 	礼拜3：吃生蚝90刺身
		 * 	礼拜4：吃大肠刺身80斤
		 * 	礼拜5：吃大闸蟹20斤一个的
		 * 	礼拜6：喝红牛1件
		 * 	礼拜7：按摩一下，放松身体
		 */
		int weekDay = 4;
//		if (weekDay == 1) {
//			System.out.println("吃牛排69斤1分熟");
//		} else if (weekDay == 2) {
//			System.out.println("吃腰子9斤1分熟");
//		} else if (weekDay == 3) {
//			System.out.println("吃生蚝90刺身");
//		} else if (weekDay == 4) {
//			System.out.println("吃大肠刺身80斤");
//		} else if (weekDay == 5) {
//			System.out.println("吃大闸蟹20斤一个的");
//		} else if (weekDay == 6) {
//			System.out.println("喝红牛1件");
//		} else if (weekDay == 7) {
//			System.out.println("按摩一下，放松身体");
//		}
		
		/*
		 * 以上代码过于 冗余，可以用switch结构简化代码
		 * switch语法：
			声明变量
			switch(变量){
				case 值1:
					功能语句1
					功能语句2...
					break;
				case 值2:
					功能语句1
					功能语句2...
					break;
				case 值3:
					功能语句1
					功能语句2...
					break;
				
				default:相当于else
					default语句
					break;
			}
		 */
		int weekDay2 = 9;// 声明变量表示周4
		switch (weekDay2) {// 分数段
			case 1:
				// 表示匹配weekDay2 == 1
				System.out.println("吃牛排69斤1分熟");
				break;
			case 2:// 表示匹配weekDay2 == 2
				System.out.println("吃腰子9斤1分熟");
				break;
			case 3:// 表示匹配weekDay2 == 3
				System.out.println("吃生蚝90刺身");
				break;
			case 4:// 表示匹配weekDay2 == 4
				System.out.println("吃大肠刺身80斤");
				break;
			case 5:// 表示匹配weekDay2 == 5
				System.out.println("吃大闸蟹20斤一个的");
				break;
			case 6:// 表示匹配weekDay2 == 1
				System.out.println("喝红牛1件");
				break;
			case 7:// 表示匹配weekDay2 == 1
				System.out.println("按摩一下，放松身体");
				break;
			default:// 所有的case匹配不上，才执行default。default写在任意的位置都可以。
				System.out.println("可能飞升了！");
				break;
		}
		
	}

}
