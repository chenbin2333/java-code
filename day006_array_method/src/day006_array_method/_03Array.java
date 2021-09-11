package day006_array_method;

/**
 *	 数组练习题
 */
public class _03Array {

	public static void main(String[] args) {
		// 需求1: 请求出下面数组所有元素之和
		int[] arr = {1, 2, 3, 69};
		/*
		 * 思路：将每个元素取出来，累加到和中
		 * 即，foreach遍历数组
		 */
		int sum = 0;// 声明一个sum变量，赋值0
		// foreach遍历arr
		for (int e : arr) {
			// 将每一个元素累加到sum中
			sum += e;
		}
//		System.out.println(sum);
		
		// 需求2: 请求出下面数组arr2所有偶数元素之和
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum2 = 0;
		for (int e : arr2) {
			// 判断当前元素e是否为偶数，如果是则累加到sum2中
			if (e % 2 == 0) {
				sum2 += e;
			}
		}
//		System.out.println(sum2);
		
		// 需求3: 找出数组nums中元素 22 第一次出现的下标位置,打印出来
		int[] nums = {11, 22, 33, 44, 22, 55}; 
		/*
		 * 思路：普通for循环遍历，因为找下标。
		 * 	在遍历过程中，每次循环将遍历到的元素nums[下标] == 22，打印出来，再结束循环。
		 */
		for (int i = 0; i < nums.length; i++) {
			// 条件判断:当前元素nums[下标] == 22
			if (nums[i] == 22) {
				System.out.println("第一次下标：" + i);
				break;// 结束循环
			}
		}
		
		
		// 需求4：求出数组arr3中的最大值
		int[] arr4 = {11, 2, 13, 64, 69, 9}; 
		/*
		 * 思路：将每一个元素取出来，比较大小，将大的装到临时变量max中。
		 * 最后，循环结束后，最大值就找到了
		 */
		int max = arr4[0];// 声明一个临时变量max赋值为数组第一个元素
		// 用foreach遍历数组arr4
		for (int e : arr4) {
			// 判断当前元素e跟max大小，如果当前元素e > max
			if (e > max) {
				max = e;// 将最大的元素重新赋值给临时变量max
			}
		}
		System.out.println("最大值：" + max);
		
		// 用普通for遍历数组arr4
		int max2 = arr4[0];// 声明一个临时变量max赋值为数组第一个元素
		for (int i = 1; i < arr4.length; i++) {// 因为第一个元素赋值给max2了，所以，可以从第二个元素开始比较
			// 判断当前元素arr4[i]跟max2大小，如果当前元素arr4[i] > max2
			if (arr4[i] > max2) {
				max2 = arr4[i];// 将最大的元素重新赋值给临时变量max2
			}
		}
		System.out.println("最大值：" + max2);
		
	}

}
