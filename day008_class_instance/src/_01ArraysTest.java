

import java.util.Arrays;

/**
 * 4. APIʹ��(�ص�)���ٳ���Ա����������߿���Ч�ʵġ�
	Arrays�����ࡾ���з�������static�����������������������
		��������ǵ�eclipse���߲����Զ�����Arrays�࣬��ctrl + shift + o����ĸ��
	
 *		1. public static String toString(int[] arr)ƴ��������Ԫ�أ���ʽ��[ֵ1,ֵ2...]
 *
		2. public static void sort(int[] arr)�������е�Ԫ������Ĭ�����򡣴�С����
			public static void sort(int[] arr, int start, int end)�������е�Ԫ������Ĭ�����򡣴�С����
			������arr�д��±�start��ʼ�� end����ָ����Χ�ڵ�Ԫ����������
			
		3. public static int binarySearch(int[] arr,int a)��ѯ����a������arr�е�һ�γ��ֵ��±ꡣ
			���û���ҵ����� ������ע�⣺����Ҫ���������ź�˳��ģ�����ͽ��򶼿��ԣ�
			
		4. public static int[] copyOf (int[] arr,int newLength)��������ݺ����ݷ���
			���ݣ����newLength����arr�����������ĳ��ȣ��������ݣ����ݺ�arr�������е�Ԫ�ض��Ѿ����Ƶ���������
		 	���ݣ����newLengthС��arr�����������ĳ��ȣ��������ݣ����ݺ�arr����Ӻ���ǰ��
			
		5. static int[] copyOfRange(int[] arr, int from, int to) 
				��ָ������arr��ָ���±귶Χ��from��to֮���Ԫ�أ����Ƶ��������С�  ����ͷ����β��  
			
		6. public static void fill(int[] arr,int a)������arr�е�Ԫ��������ʼ��Ϊa
 */
public class _01ArraysTest {

	public static void main(String[] args) {
		int[] arr = {1, 9, 96, 19, 6, 66};
		
		/*
		 * ���������һ������toString������һ��int[]��������������ַ���ƴ�ӣ�
		 *  	��ʽ���£�[Ԫ��1, Ԫ��2, Ԫ��3....]������ƴ�Ӻ���ַ���
		 */
		System.out.println(arr);// [I@15db9742��ַ��û�����塣
		
		// 1. public static String toString(int[] arr)ƴ��������Ԫ�أ���ʽ��[ֵ1,ֵ2...]
		// ����Arrays���е� toString��������Ϊ��static���Σ��ҷ���ֵ��String���ͣ����ԣ���Arrays�������ã���String��������
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		// 2. public static void sort(int[] arr)������arr�е�Ԫ������Ĭ�����򡣴�С����
		Arrays.sort(arr);// û�з���ֵ
		// �ź������Ҫ���¿�Ч�����������½�arrת��Ϊ�ַ�������ӡ�ַ���
		String str2 = Arrays.toString(arr);
		System.out.println(str2);
		
		/*
		 * 3. public static int binarySearch(int[] arr, int a)��ѯ����a������arr�� ���ֵ��±ꡣ
			���û���ҵ����� ������ע�⣺1. ����Ҫ���������ź�˳��ģ�����ͽ��򶼿��ԣ�2. �����������ǲ��ظ���Ԫ�� 
		 */
		// �ĺ�˳������飺[1, 6, 9, 19, 66, 96]��һ�δ�ǰ����ѯ�Ĺ��̽��� �����Բ���
		int binarySearch = Arrays.binarySearch(arr, 19);// ���ֲ�ѯ����arr��Ԫ�� 19 ���ֵ��±�
		// [1, 19, 19, 19, 19, 19] // 19
		System.out.println(binarySearch);// 3
		
		// 4. public static void fill(int[] arr, int a)������arr�е�Ԫ��������ʼ��Ϊa
		Arrays.fill(arr, 69);
		// �������½�arrת��Ϊ�ַ�������ӡ�ַ���
		String str3 = Arrays.toString(arr);
		System.out.println(str3);
		
		/*
		 * 4. public static int[] copyOf (int[] arr, int newLength)��������ݺ����ݷ���
			���ݣ����newLength����arr�����������ĳ��ȣ��������ݣ����ݺ�arr�������е�Ԫ�ض��Ѿ����Ƶ���������
		 	���ݣ����newLengthС��arr�����������ĳ��ȣ��������ݣ����ݺ�arr����Ӻ���ǰ��
		 */
		int[] arr2 = {1, 9, 96, 19, 6, 66};// ׼�����飬��Ϊ����
		// ����
		int[] newArr = Arrays.copyOf(arr2, 10);// ���÷�������int[]�������ս������Ϊ�ڶ���������10������ԭ��arr2���鳤��6������������
		// ��newArrת��ΪString�ַ��������ã�Arrays����toString����
		String str4 = Arrays.toString(newArr);
		// ��ӡ�ַ���
		System.out.println("���ݺ�" + str4);
		
		// ����
		int[] newArr2 = Arrays.copyOf(arr2, 4);// ���÷�������int[]�������ս������Ϊ�ڶ���������4��С��ԭ��arr2���鳤��6������������
		// ��newArr2ת��ΪString�ַ��������ã�Arrays����toString����
		String str5 = Arrays.toString(newArr2);
		// ��ӡ�ַ���
		System.out.println("���ݺ�" + str5);
		
		/*
		 * 5. static int[] copyOfRange(int[] arr, int from, int to) 
		 * ��ָ������arr��ָ���±귶Χ��from��to֮���Ԫ�أ����Ƶ��������С�  ����ͷ����β��
		 */
		int[] newArr3 = Arrays.copyOfRange(arr2, 1, 5);// ��ȡ����arr2���±�1��5֮���Ԫ�أ�����һ�����顣���������±�5��
		// ��newArr6ת��ΪString�ַ��������ã�Arrays����toString����
		String str6 = Arrays.toString(newArr3);
		// ��ӡ�ַ���
		System.out.println("��ȡ�ƶ��±���Ԫ�أ�" + str6);
		
	}

}
