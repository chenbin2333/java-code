package day007_api;

/**
 *	1.4 ����ע��������˽⡿  
		1 �������õ�ʱ��ʵ��(����/ֵ) ����� �β���ȫһ��
		2 һ�����У�ֻ����һ������ǩ��
		3 ����ֵ������void�������ñ������ܣ����ܷ��ڴ�ӡ�����
		4 ����ֵ����void������returnһ�����ݣ������������ͺͷ���ֵ������ȫһ��
		5 return�����ݣ������if����ѭ������У����뱣֤����������ѭ����䲻����������£�Ҳ�����ݵķ���
		
 */
public class _04Method {

	public static void main(String[] args) {
		// 3 ����ֵ������void�������ñ������ܣ����ܷ��ڴ�ӡ�����
//		String str = test();// ����ֵ������void
//		System.out.println(test());
	}
	
	/**
	 * 5 return�����ݣ������if����ѭ������У����뱣֤����������ѭ����䲻����������£�Ҳ�����ݵķ���
	 */
	public static int getIndexOfArray(int[] arr, int a) {
		if (a > 1) {
			return a;
		} 
		return 1;
	}
	
	public static void test() {
		System.out.println("����");
		return;
	}
	
	public static int test2() {
		return 1;
//		return 1L;// ���ص�ֵ�������ͺͷ���ֵ������ȫһ��
	}
	
}
