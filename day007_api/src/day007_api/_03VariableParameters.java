package day007_api;

/**
 *	
 *	
 */
public class _03VariableParameters {

	public static void main(String[] args) {
		// 1.��2��int�����ĺͣ����һ������ʵ��
//		int sum = getSum(1, 2);// �������ݵ��÷�����ʵ�Σ��Զ�ƥ��������ص���һ������
//		System.out.println(sum);
//		// 2.��3��int�����ĺͣ����һ������ʵ��
//		int sum2 = getSum(1, 2, 3);// �������ݵ��÷�����ʵ�Σ��Զ�ƥ��������ص���һ������
//		System.out.println(sum2);
//		// 3.��4��int�����ĺͣ����һ������ʵ��
//		int sum3 = getSum(1, 2, 3, 4);// �������ݵ��÷�����ʵ�Σ��Զ�ƥ��������ص���һ������
		
		// ������������ǲ����ĸ�����ȷ��������ÿ�ֲ�����ͬ��Ҫдһ�������ķ�ʽ���ǳ��鷳������Ч�ʵ��¡�
		// ��1��2�ĺͣ�������ȴ���һ��int���飬��1��2װ��ȥ
		/*int[] arr = {1, 2};
		int sum = getSum(arr);
		System.out.println(sum);
		
		// ��1��2��3�ĺͣ�������ȴ���һ��int���飬��1��2װ��ȥ
		int[] arr2 = {1, 2, 3};
		int sum2 = getSum(1, 2, 3);
		System.out.println(sum2);
		����ÿ�δ��벻ͬ�����Ĳ�����ʱ�򣬶�Ҫ����Ա�Լ��������飬�ǳ��鷳�����������ÿɱ�����Ż�����
		*/
		// ��������ɱ��������getSum(int... arr)����1��2�ĺ�
		int sum = getSum(1, 2);// ��������ö��Ÿ���
		System.out.println(sum);
		
		int[] arr2 = {1, 2, 3};
		int sum2 = getSum(arr2);// �ɱ����Ҳ����ֱ�Ӵ���һ������
		System.out.println(sum2);
	}
	
	/*public static int getSum(int a, int b) {
		return a + b;
	}
	public static int getSum(int a, int b, int c) {
		return a + b + c;
	}
	public static int getSum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	�Ż�����������ȷ���������
	*/
	/*public static int getSum(int[] arr) {
		// ��������Խ������Ϊ�������װ����������
		int sum = 0;
		// �������飬���
		for (int e : arr) {
			sum += e;
		}
		return sum;
	}
	�ÿɱ�����Ż�
	*/
	/**
	 * @param arr ��һ���ɱ���������÷���getSum��ʱ�򣬿��Դ������������intʵ��
	 * @return
	 */
	public static int getSum(int... arr) {
		System.out.println("arr = " + arr);
		System.out.println("���ȣ� " + arr.length);
		// ��������Խ������Ϊ�������װ����������
		int sum = 0;
		// �������飬���
		for (int e : arr) {
			System.out.println("Ԫ�أ�" + e);
			sum += e;
		}
		return sum;
	}
	
}
