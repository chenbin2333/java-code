package day006_array_method;

public class Day005Homework {

	public static void main(String[] args) {
		// 8.��forѭ����1-20�е��������ӡ20 19 18 ..... 1
		/*
		 * for(1.��ʼ������; 2.�����ж�; 3.ѭ������) {
		 * 		4. ѭ����
		 * }
		 * ��1�Σ�1 => 2 => 4 => 3
		 * ��2�Σ�2 => 4 => 3
		 * ��3�Σ�2 => 4 => 3
		 * ...
		 * ���һ�Σ�2
		 */
//		for (int i = 20; i > 0; i--) {
//			System.out.println(i);
//		}
		
		
		// 9. ��continue��ѭ�������1~50�����в���4����������
//		for (int i = 1; i < 51; i++) {
//			if (i % 4 != 0) {
//				System.out.println(i);
//			}
//		}
		
		for (int i = 1; i < 51; i++) {
			if (i % 4 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
