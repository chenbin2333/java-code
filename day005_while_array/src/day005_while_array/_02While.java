package day005_while_array;

/**
 * ѭ����ϰ��
 */
public class _02While {

	public static void main(String[] args) {
		// 1.��� 1-10�����е��� ��while��do while�ֱ�ʵ��
//		int num = 1;// 1.��ʼ���������
//		while (num <= 10) {// 2. �����ж�
//			System.out.println(num);// 3.ѭ����
//			num++;// 4.ѭ������
//		}
		
//		int num2 = 1;// 1.��ʼ���������
//		do {
//			System.out.println(num2);// 3.ѭ����
//			num2++;// 4.ѭ������
//		} while (num2 <= 10);// 2. �����ж�
		
		// 2.��� 1-10������ż������while��do while�ֱ�ʵ��
//		int num3 = 1;// 1.��ʼ���������
//		while (num3 <= 10) {// 2. �����ж�
//			// �жϵ�ǰ����num3�Ƿ�Ϊż��
//			if (num3 % 2 == 0) {
//				// ���������ʹ�ӡ
//				System.out.println(num3);// 3.ѭ����
//			}
//			num3++;// 4.ѭ������
//		}
		
//		int num4 = 1;// 1.��ʼ���������
//		do {
//			// �жϵ�ǰ����num3�Ƿ�Ϊż��
//			if (num4 % 2 == 0) {
//				// ���������ʹ�ӡ
//				System.out.println(num4);// 3.ѭ����
//			}
//			num4++;// 4.ѭ������
//		} while (num4 <= 10);// 2. �����ж�
		
		// 3.��� 1-10��������֮��
//		int num5 = 1;// 1.��ʼ���������
//		int sum = 0;// ����һ��int���ͱ���sum��ֵ0�������������ֵĺ͡�
//		while (num5 <= 10) {// 2. �����ж�
//			// sum += num5;�൱�� sum = (int)(sum + num5);
//			sum += num5;// 3.ѭ����
//			num5++;// 4.ѭ������
//		}
//		System.out.println("�� : " + sum);
		
//		int num6 = 1;// 1.��ʼ���������
//		int sum = 0;// ����һ��int���ͱ���sum��ֵ0�������������ֵĺ͡�
//		do {// 2. �����ж�
//			// sum += num6;�൱�� sum = (int)(sum + num6);
//			sum += num6;// 3.ѭ����
//			num6++;// 4.ѭ������
//		} while (num6 <= 10);
//		System.out.println("�� : " + sum);
		
		// 4.��� 1-10����������֮��
//		int num7 = 1;// 1.��ʼ���������
//		int sum = 0;// ����һ��int���ͱ���sum��ֵ0�������������ֵĺ͡�
//		while (num7 <= 10) {// 2. �����ж�
//			// �жϵ�ǰ����num7�Ƿ���������!= 0
//			if (num7 % 2 != 0) {
//				// sum += num7;�൱�� sum = (int)(sum + num7);
//				sum += num7;// 3.ѭ����
//			}
//			num7++;// 4.ѭ������
//		}
//		System.out.println("������ : " + sum);
		
		int num8 = 1;// 1.��ʼ���������
		int sum = 0;// ����һ��int���ͱ���sum��ֵ0�������������ֵĺ͡�
		do {// 2. �����ж�
			// �жϵ�ǰ����num8�Ƿ���������!= 0
			if (num8 % 2 != 0) {
				// sum += num8;�൱�� sum = (int)(sum + num8);
				sum += num8;// 3.ѭ����
			}
			num8++;// 4.ѭ������
		} while (num8 <= 10);
		System.out.println("������ : " + sum);
		
		// ��ǿ1��ѭ������1-10�� ��
		// ��ǿ2����1-10�� �Ľ׳˺�(1!+2!+3!+4!+5!+...)
	}

}
