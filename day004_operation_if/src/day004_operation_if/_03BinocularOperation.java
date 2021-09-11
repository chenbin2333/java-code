package day004_operation_if;

/**
 *	3. ��Ŀ(��Ԫ)����(Binocular Operation)����ʾ���xΪtrue��ִ��y������ִ��z
		�﷨�� x ? y : z;
		x:��boolean����ֵ����boolean���ʽ��
		y��z:�����Ǳ��ʽ��Ҳ������ֵ���߱���
		
		���Ҫ������Ŀ����Ľ��������Ҫ��y��z��������ȫһ��
		��Ŀ�������Ƕ��ʹ��
		
		���磺
			���������е����ֵ������Сֵ
			int a = 1;
			int b = 2;
			int max = a > b ? a : b;
			
			Ƕ��ʹ�ã�(���������õ����)
			int a = 1;
			int b = 2;
			int c = 3;
			int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
 */
public class _03BinocularOperation {

	public static void main(String[] args) {
		// ����2��int����a/b
		int a = 1;
		int b = 2;
		// �������a > b�������ֵ��"�������ǳԴ�ͣ�" ,����"�������ҳԵ���з��"
		/*
		 * �﷨�� x ? y : z;
			x:��boolean����ֵ����boolean���ʽ��
			y��z:�����Ǳ��ʽ��Ҳ������ֵ���߱���
		 */
		System.out.println(a > b ? "�������ǳԴ�ͣ�" : "�������ҳԵ���з��");
		
		// ����2���ҳ�a��b�����ı���
		int max = a > b ? a : b;
		System.out.println("���ֵ�� " + max);
		
		// ����3��int������ֵ
		int i = 1;
		int j = 2;
		int k = 3;
		// ����3���ҳ�i/j/k�����ֵ
		/*
		 * 1. �ȱȽ�i��j���ҳ�����
		 * 2. �ٱȽ����ֵ��k˭��
		 */
		int max2 = i > j ? i : j;// 1. �ȱȽ�i��j���ҳ�����
		max2 = max2 > k ? max2 : k;
		System.out.println("3�������ֵ��" + max2);
		
		// ��Ŀ���㻹����Ƕ��ʹ�á������������ˡ�
		int max3 = i > j ? (i > k ? i : k) : (j > k ? j : k);
		System.out.println("3�������ֵ��" + max3);
	}

}
