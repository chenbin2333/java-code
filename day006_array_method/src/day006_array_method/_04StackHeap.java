package day006_array_method;

/**
 *	6. 扩展（内存图）
		基本类型具体的值在栈帧中	
		引用类型具体的值在堆中	
 */
public class _04StackHeap {

	public static void main(String[] args) {
		int[] arr2 = {1, 2, 5};
		int[] arr = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr);// [I@15db9742
		arr[0] = 1;
		arr[1] = 9;
		arr[2] = 6;
//		arr[3] = 5;// 给第4个元素赋值。ArrayIndexOutOfBoundsException 数组下标越界异常。证明下标超过了数组有效范围
			
		int a = 1;
		int b = 1;
		a = 2;	
	}

}
