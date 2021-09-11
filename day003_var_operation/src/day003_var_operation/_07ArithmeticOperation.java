package day003_var_operation;

/**
 * 6.1 �������㣨Arithmetic Operation�������գ�
		+ ��
			ֻ��String�ַ�������ļӷ����㣬����ƴ�ӹ��ܣ���String֮ǰ����ʾ�ӷ����㣬֮�󣬲ű�ʾ����
		-
		*
		/ �� ���ܳ�0
		 	���������
				1) 10/3 =3�� 
				2) 10.0/3=3.33333��
				3) 0/0
				4) 0.0/0.0  
				  	�����NaN ,�κε�NaN���������Լ��������⣩
				5) 1.0/0.0   �����Infinity,��ʾ�����
		
		%ģ��ȡ�ࣩ���൱��������	10%3 ��ʾ������1
			���ã�1. ������ 	2. ��һ�����ı���
				3. ���Բ��һ����λ������
 */
public class _07ArithmeticOperation {

	public static void main(String[] args) {
		System.out.println("==================== ���� / ������С��λ =====================");
		System.out.println(10 / 1);// 10
		System.out.println(10 / 2);// 5
		System.out.println(10 / 3);// 3
		System.out.println(10 / 4);// 2
		System.out.println(10 / 5);// 2
		System.out.println(10 / 6);// 1
		System.out.println(10 / 7);// 1
		System.out.println(10 / 8);// 1
		System.out.println(10 / 9);// 1
		System.out.println(10 / 10);// 1
		System.out.println(10 / 11);// 0
//		System.out.println(10 / 0);// ��ĸ����Ϊ0������ᱨ�쳣  ArithmeticException �����쳣
		
		System.out.println("==================== ������� =====================");
		
		/*
		 * ������������˽⡿
				1) 10/3 =3�� 
				2) 10.0/3=3.33333��
				3) 0/0
				4) 0.0/0.0  
				  	�����NaN ,�κε�NaN���������Լ��������⣩not a number����һ������
				5) 1.0/0.0   �����Infinity,��ʾ�����
		 */
		System.out.println(10.0 / 3);// 3.33333...
		System.out.println(0.0 / 0.0);// NaN 
		
		System.out.println(1.0 / 0.0);// Infinity��ʾ�����
		System.out.println(-1.0 / 0.0);// Infinity��ʾ�����
		
		System.out.println("==================== % ģ��ȡ�ࣩ =====================");
		System.out.println(10 % 1);// ��ʾ��10/1������ 0
		System.out.println(10 % 2);// 0
		System.out.println(10 % 3);// 1
		System.out.println(10 % 4);// 2
		System.out.println(10 % 5);// 0
		System.out.println(10 % 6);// 4
		System.out.println(10 % 7);// 3
		System.out.println(10 % 8);// 2
		System.out.println(10 % 9);// 1
		System.out.println(10 % 10);// 0
		System.out.println(10 % 11);// 10
//		System.out.println(10 % 0);// ����ģ0
		
		// �������ʮ��λ��ֵ  / % 
		int a = 127;
		// ���λ 
		System.out.println(a % 10);
		
		// ��ʮλ ��1. ������λ��  2.����ʮλ����ֵ 
		System.out.println(a / 10 % 10);// 
		
		// ���λ ��ֱ������ʮλ�͸�λ
		System.out.println(a / 100);
	}

}
