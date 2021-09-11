
/**
 *	Java的参数传递：
	基本数据类型传递的是：值本身。
	引用数据类型传递的是：变量在堆中的引用地址。
 */
public class _03StackHeap {

	public static void main(String[] args) {
		int[] arr = {1, 2};
		System.out.println("改变前：" + arr[0]);// 1
		System.out.println("改变前：" + arr[1]);// 2
		// 调用change方法
		change(arr);
		System.out.println("改变后================ ：" + arr[0]);// 6
		System.out.println("改变后================ ：" + arr[1]);// 9
	}
	public static void change(int[] arr) {
		arr[0] = 6;
		arr[1] = 9;
		System.out.println("改变中-------：" + arr[0]);// 6
		System.out.println("改变中-------：" + arr[1]);// 9
	}

}
