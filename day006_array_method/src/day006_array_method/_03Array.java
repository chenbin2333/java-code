package day006_array_method;

/**
 *	 ������ϰ��
 */
public class _03Array {

	public static void main(String[] args) {
		// ����1: �����������������Ԫ��֮��
		int[] arr = {1, 2, 3, 69};
		/*
		 * ˼·����ÿ��Ԫ��ȡ�������ۼӵ�����
		 * ����foreach��������
		 */
		int sum = 0;// ����һ��sum��������ֵ0
		// foreach����arr
		for (int e : arr) {
			// ��ÿһ��Ԫ���ۼӵ�sum��
			sum += e;
		}
//		System.out.println(sum);
		
		// ����2: �������������arr2����ż��Ԫ��֮��
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum2 = 0;
		for (int e : arr2) {
			// �жϵ�ǰԪ��e�Ƿ�Ϊż������������ۼӵ�sum2��
			if (e % 2 == 0) {
				sum2 += e;
			}
		}
//		System.out.println(sum2);
		
		// ����3: �ҳ�����nums��Ԫ�� 22 ��һ�γ��ֵ��±�λ��,��ӡ����
		int[] nums = {11, 22, 33, 44, 22, 55}; 
		/*
		 * ˼·����ͨforѭ����������Ϊ���±ꡣ
		 * 	�ڱ��������У�ÿ��ѭ������������Ԫ��nums[�±�] == 22����ӡ�������ٽ���ѭ����
		 */
		for (int i = 0; i < nums.length; i++) {
			// �����ж�:��ǰԪ��nums[�±�] == 22
			if (nums[i] == 22) {
				System.out.println("��һ���±꣺" + i);
				break;// ����ѭ��
			}
		}
		
		
		// ����4���������arr3�е����ֵ
		int[] arr4 = {11, 2, 13, 64, 69, 9}; 
		/*
		 * ˼·����ÿһ��Ԫ��ȡ�������Ƚϴ�С�������װ����ʱ����max�С�
		 * ���ѭ�����������ֵ���ҵ���
		 */
		int max = arr4[0];// ����һ����ʱ����max��ֵΪ�����һ��Ԫ��
		// ��foreach��������arr4
		for (int e : arr4) {
			// �жϵ�ǰԪ��e��max��С�������ǰԪ��e > max
			if (e > max) {
				max = e;// ������Ԫ�����¸�ֵ����ʱ����max
			}
		}
		System.out.println("���ֵ��" + max);
		
		// ����ͨfor��������arr4
		int max2 = arr4[0];// ����һ����ʱ����max��ֵΪ�����һ��Ԫ��
		for (int i = 1; i < arr4.length; i++) {// ��Ϊ��һ��Ԫ�ظ�ֵ��max2�ˣ����ԣ����Դӵڶ���Ԫ�ؿ�ʼ�Ƚ�
			// �жϵ�ǰԪ��arr4[i]��max2��С�������ǰԪ��arr4[i] > max2
			if (arr4[i] > max2) {
				max2 = arr4[i];// ������Ԫ�����¸�ֵ����ʱ����max2
			}
		}
		System.out.println("���ֵ��" + max2);
		
	}

}
