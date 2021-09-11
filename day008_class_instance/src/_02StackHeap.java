
/**
 *	Java的参数传递：
	基本数据类型传递的是：值本身。
	引用数据类型传递的是：变量在堆中的引用地址。
 */
public class _02StackHeap {

	public static void main(String[] args) {
		int a = 1;
		System.out.println("改变前：" + a);// 1
		// 调用change方法
		change(a);
		System.out.println("改变后================ ：" + a);// 1	
	}

	public static void change(int a) {
		a = 2;
		System.out.println("改变中-------：" + a);// 2
	}
		
}
