package day006_array_method;

/**
 *	����������
 */
public class _06Method {

	public static void main(String[] args) {
		// ����1����1-10�ĺ�
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// ����2����1-100�ĺ�
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// ����3����1-10000�ĺ�
//		int sum = 0;
//		for (int i = 1; i <= 10000; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// ����4����1 - n�ĺ�
//		int sum = 0;
//		for (int i = 1; i <= 10000; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// ��main�����е��������getSum(int n)����
		// ����1����1 - 10�ĺ�
		_06Method.getSum(10);// ���÷�����������ֵ10
		
		// ����2����1 - 100�ĺ�
		_06Method.getSum(100);// ���÷�����������ֵ100
		
		// ����3����1 - 1000�ĺ�
		_06Method.getSum(1000);// ���÷�����������ֵ1000
		
		// ����4����1 - 10000�ĺ�
		_06Method.getSum(10000);// ���÷�����������ֵ10000
		
	}
	
	/**
	 * �����Ķ��塾����������
	 * @param n
	 */
	public static void getSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
