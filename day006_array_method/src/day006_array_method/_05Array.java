package day006_array_method;

/**
 *	4. ����ע�����
		4.1 ������±귶Χ��[0, arr.length-1],�����±귶Χ�ᱨ��
			ArrayIndexOutOfBoundsException �����±�Խ���쳣
		
		4.2 ���鶯̬�������Է�Ϊ������
			1. int[] arr;//ֻ������һ��int���͵����飬��û�д�����������û�з����ڴ�ռ䣩
			2. arr = new int[����];//�����ڴ�ռ䣬��̬��������
			
		4.3 ���龲̬�������Է�Ϊ������
			1. int[] arr;//ֻ������һ��int���͵����飬��û�д�����������û�з����ڴ�ռ䣩
			2. arr = new int[]{1,2,43};//�����ڴ�ռ䣬��̬��������
			����ֱ������д��
				arr = {1,2,43};//�﷨����
		
		4.4 ����һ�����������Ⱦ͹̶������ˡ�
			������Ȳ������߳��ȶ��ˣ�����Ҫ���������飬��ԭ��������Ԫ�ظ��Ƶ��������С�	
			 int[] arr = {1,2,43};
			 arr = new int[]{1,43};//�����µ��ڴ��������´����µ�����
			
		4.5 ������������������,ֱ�Ӵ�ӡ�������Ǵ�ӡ�ĵ�ַ
		4.6 ��̬������û�и�����Ԫ�ظ�ֵ����ϵͳ�����Ĭ��ֵ
			��byte/short/int/long����������Ĭ��ֵ��0
			(float��double)С������Ĭ��ֵ��0.0
			boolean����:false
			char����Ĭ��ֵ�����ַ�
		
		4.7 ��ָ���쳣��NullPointerException
			����ԭ�򣺵���ͼȥ���������ݵ�ʱ�򣬶���ʱ�������û�����ݣ���ᷢ���ô���
			
		4.8 ���������������������ǲ�����
			int arr[] = new int[2];// []���������󣬲�����
 */
public class _05Array {
	/** ������̬��Ա����arr5������ֵ */
	static int[] arr5;// Ĭ��ֵ��null
	static String str;// Ĭ��ֵ��null
	
	public static void main(String[] args) {
		// 4.2 ���鶯̬�������Է�Ϊ������
		int[] arr;// �������飬��ջ�д���������û�д���
		arr = new int[2];// �ڶ��д���2�����ȵ����飬��ֵ��arr����
		
		// 4.3 ���龲̬�������Է�Ϊ������
		int[] arr2;
//		arr2 = {1, 2};�﷨����
		arr2 = new int[]{1, 2};// �﷨����
		
		/*
		 * 4.4 ����һ�����������Ⱦ͹̶������ˡ�
			������Ȳ������߳��ȶ��ˣ�����Ҫ���������飬��ԭ��������Ԫ�ظ��Ƶ��������С�	
		 */
		
		String[] strs = new String[2];
		System.out.println(strs[0]);// null
		System.out.println(strs[1]);// null
		
		// 4.8 ���������������������ǲ�����
		int arr3[] = new int[2];
		
		System.out.println("��Ա����arr5��" + arr5);
		// 	NullPointerException��ָ���쳣
		System.out.println(arr5[0]);// ȥ����������arr5�ĵ�һ��Ԫ�أ�����û�У���Ϊû�д������顣
		
		int[] arr6 = arr3;// ���Խ�����һ������arr3��ַ��ֵ���´���������arr6
		
	}

}