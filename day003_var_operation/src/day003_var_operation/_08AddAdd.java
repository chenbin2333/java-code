package day003_var_operation;

/**
 *		++: ���������ص㣩
			1. ֻ��������һ�������������ǳ���
			2. ������ǰ
				a++: �ȸ�ֵ��������
					���㲽�裺
						step1���Ƚ�a��ֵ��ֵ��  a++ �������
						step2���ٽ�a��ֵ+1
				
			3. �����ں�
				++a:���������ٸ�ֵ
					���㲽�裺
						step1���Ƚ�a��ֵ+1
						step2���ٽ�a��ֵ��ֵ��  a++ �������
				
		--: �Լ�������ͬ������ȫ��ͬ�������ص㣩
 */
public class _08AddAdd {

	public static void main(String[] args) {
		// 1. ֻ��������һ�������������ǳ���
//		System.out.println(1++);// ����
//		System.out.println(++1);// ����
		
		/*
		 * 2. ������ǰ
			a++: �ȸ�ֵ��������
				���㲽�裺
					step1���Ƚ�a��ֵ��ֵ��  a++ �������
					step2���ٽ�a��ֵ+1
		 */
		int a = 1;// ����һ��int���ͱ���a��ֵ1
		int b = a++;// ����һ��int���ͱ���������a++��ֵ��++�ں�ֵ���䡿
		// ��ӡb
		System.out.println("b = " + b);// b = 1
		System.out.println("a = " + a);// a = 2
		
		/*
		 * 3. �����ں�
			++j:���������ٸ�ֵ
				���㲽�裺
					step1���Ƚ�j��ֵ+1
					step2���ٽ�j��ֵ��ֵ��  j++ �������
		 */
		int i = 1;
		int j = ++i;// ++��ǰֵ+1
		// ��ӡb
		System.out.println("i = " + i);// i = 2
		System.out.println("j = " + j);// j = 2
		
	}

}
