package day006_array_method;

/**
 *	1 ���������������壩��������Ҫ��
			1.1. ����main��������ǰ���У���main����ƽ���ĵط�
			1.2. �������������������Ҫ�أ�
					1. ����ֵ���ͣ�
					2. ��������
					3. �β��б���
					4. �����壺
			1.3. ����ʵ�������޸ķ�������Ҫ��
		
	2 �����ĵ��ã�������Ҫ��
			��Ҫ���÷����Ƿ���static���Σ�
				2.1 ��static���Σ��ã���ǰ����.������(ʵ��(����/ֵ)); 
				2.2 û��static���Σ��ã���ǰ��Ķ�����.������(ʵ��(����/ֵ)); // ���������ã��⼸�춼����
				
				���������
					������÷���Ŀǰ����ָmain�������ͱ����÷�����ͬһ�����У��Ҷ��л��߶�û��static���Σ����Լ�дΪ��
					������(ʵ��(����/ֵ));		
					
				ע�⣺���÷�����ʱ�򣬴���Ĳ����������������͡�˳������ ����������һ��
 */
public class _07Method {
	
	/**
	 * ���� ������int���ͱ����ĺͣ����ҽ��ͷ��ء�
	 * 
	 * ���������������壩��������Ҫ��
	 * 	1. ����main��������ǰ���У���main����ƽ���ĵط�
		2. �������������������Ҫ�أ�
			1. ����ֵ���ͣ�int 
			2. ��������getSum
			3. �β��б���int a, int b
			4. �����壺������������ӣ�Ȼ��ͨ��return�ؼ��ַ���
		3. ����ʵ�������޸ķ�������Ҫ��
	 * @param args
	 */
	public static int getSum(int a, int b) {
		// ������������ӣ�Ȼ��ͨ��return�ؼ��ַ���
//		int sum = a + b;
//		return sum;// ͨ��return�ؼ��ֽ�sum����
		// �����������϶�Ϊһ
		return a + b;// return�����ȼ��ܵ͵�һ�����㣬�����ұ���������ִ�н����󣬲Ž�������ء�
	}
	
	public static void main(String[] args) {
		// ����1�� ������int���ͱ����ĺͣ����ҽ��ͷ��ء�
		/*
		 * 2 �����ĵ��ã�������Ҫ��
			��Ҫ���÷����Ƿ���static���Σ�
				2.1 ��static���Σ��ã���ǰ����.������(ʵ��(����/ֵ)); 
		 */
		// ��1��2�ĺ͡� ���÷�������ʵ��:1��2����ΪgetSum������һ�������͵ڶ�����������int���͡�
		int sum = _07Method.getSum(1, 2);// ��ΪgetSum�������з���ֵ����int�����ԣ�������int�������淵��ֵ����ӡ���ܿ���Ч��
		// ��ӡ����sum
		System.out.println(sum);
		
		// ��3��6�ĺ�
		int sum2 = _07Method.getSum(3, 6);// ��ΪgetSum�������з���ֵ����int�����ԣ�������int�������淵��ֵ����ӡ���ܿ���Ч��
		// ��ӡ����sum2
		System.out.println(sum2);
		
		/*
		 * ���������
			������÷���Ŀǰ����ָmain�������ͱ����÷�����ͬһ�����У��Ҷ��л��߶�û��static���Σ����Լ�дΪ��
			������(ʵ��(����/ֵ));
		 */
		// ����main�����е���getSum��������main�ǵ��÷���getSum�Ǳ����÷�����ͬһ����_07Method�У����ԣ����Լ�д
		int sum3 = getSum(3, 6);
		// ��ӡ����sum3
		System.out.println(sum3);
		
	}
	
}