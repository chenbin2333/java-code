package day007_api;

/**
 *	��������overload�������ա�
	1.1 �����ͬһ�����У���������ͬ���β��б�ͬ�����Ƿ�������
	1.2 ���ã�
		1. ���Լ���������ͻ
		2. ���Լ��ٳ���Ա����ɱ�����������һ������
			
	1.3 ʹ�ã�
		����������ʱ��д��ͬ���βμ��ɡ�
		���÷�����ʱ�򣬳������ݲ������������͡�˳���Զ�ƥ����õ�
 *	
 */
public class _02Overload {

	public static void main(String[] args) {
		// 1.��2��int�����ĺͣ����һ������ʵ��
		int sum = getSum(1, 2);// �������ݵ��÷�����ʵ�Σ��Զ�ƥ��������ص���һ������
		System.out.println(sum);
		
		// 2.��3��int�����ĺͣ����һ������ʵ��
		int sum2 = getSum(1, 2, 3);// �������ݵ��÷�����ʵ�Σ��Զ�ƥ��������ص���һ������
		System.out.println(sum2);
		
		// 3.��4��int�����ĺͣ����һ������ʵ��
		int sum3 = getSum(1, 2, 3, 4);// �������ݵ��÷�����ʵ�Σ��Զ�ƥ��������ص���һ������
		
	}
	
	/**
	 * 1.��2��int�����ĺͣ����һ������ʵ��
	 * @param ����һ��ע�⣬��ʾ���� a
	 * @param ���� b
	 * @return ��ʾ�з���ֵ�����ص���a��b�ĺ�
	 */
	public static int getSum(int a, int b) {
		System.out.println("��2��int������������");
		return a + b;
	}
	
	/**
	 * ���ط���
	 * 2.��3��int�����ĺͣ����һ������ʵ��
	 * @param a 
	 * @param b
	 * @param c
	 * @return ���ص���a��b��c�ĺ�
	 */
	public static int getSum(int a, int b, int c) {
		System.out.println("====��3��int������������");
		return a + b + c;
	}
	
	/**
	 * ���ط���
	 * 3.��4��int�����ĺͣ����һ������ʵ��
	 * @param a 
	 * @param b
	 * @param c
	 * @param d
	 * @return ���ص���a��b��c��d�ĺ�
	 */
	public static int getSum(int a, int b, int c, int d) {
		System.out.println("---------------��4��int������������");
		return a + b + c + d;
	}
	
}
