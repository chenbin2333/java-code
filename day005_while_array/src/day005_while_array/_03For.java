package day005_while_array;

/**
 *	1.3 forѭ�������Լ򵥵���Ϊ����whileѭ���ļ�д	���ص㣩
			for(1.��ʼ���������; 2.�����ж����;	4. ѭ���������){
				3. ѭ����
			}
			
			ִ�����̣����ص㣩
				��1�Σ�1. ��ʼ��������� => 2.�����ж���� => 3. ѭ���� => 4. ѭ���������
		 		��2�Σ�2. �����ж���� => 3. ѭ���� => 4. ѭ���������
		  		��3�Σ�2. �����ж���� => 3. ѭ���� => 4. ѭ���������
		  		...
 */
public class _03For {

	public static void main(String[] args) {
		// ����1.��� 1-10�����е��� 
//		int num = 1;// 1.��ʼ���������
//		while (num <= 10) {// 2. �����ж�
//			System.out.println(num);// 3.ѭ����
//			num++;// 4.ѭ������
//		}
		
		/*
		 * ��forѭ��ʵ���������
		 * for(1.��ʼ���������;	2.�����ж����;	4. ѭ���������){
				3. ѭ����
		   }
			
			ִ�����̣����ص㣩
				��1�Σ�1. ��ʼ��������� => 2.�����ж���� => 3. ѭ���� => 4. ѭ���������
		 		��2�Σ�2. �����ж���� => 3. ѭ���� => 4. ѭ���������
		  		��3�Σ�2. �����ж���� => 3. ѭ���� => 4. ѭ���������
		  		...
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);// ѭ����
		}
		
	}

}