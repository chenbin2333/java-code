package day007_api;

/**
 *	������ǿ��ϰ
 */
public class _01Method {

	public static void main(String[] args) {
		// 1. ���һ������������һ���ַ����ַ������г��ֵĴ���(�м�)
		char[] c = {'a','f','j','j','a','e','g'};
		// �������淽��getCountOfArray(char c, char[] arr);
		int countOfArray = getCountOfArray('a', c);
		System.out.println("������" + countOfArray);
		
		// 2.���һ����������ѯ������һ���ַ����ַ������е�һ�γ��ֵ�λ��
		int indexOfArray = getIndexOfArray('z', c);
		System.out.println("��һ���±꣺" + indexOfArray);
		
		// 3.���һ������������һ��int���飬��ת�������е�Ԫ�أ����ҷ��ط�ת�������(ţƤ��)
		int[] arr = {1, 9, 96, 9, 6, 66};
		int[] reverse = reverse(arr);
		for (int i : reverse) {
			System.out.println(i);
		}
		
		/*
		 * 4.���������һ������toString������һ��int[]��������������ַ���ƴ�ӣ�
		 *  	��ʽ���£�[Ԫ��1, Ԫ��2, Ԫ��3....]������ƴ�Ӻ���ַ���
		 */
		System.out.println(arr);// [I@15db9742��ַ��û�����塣
		// Ϊ�˲鿴������Ԫ�أ����Ա������顣����
		
	}
	
	/**
	 * 3.���һ������������һ��int���飬��ת�������е�Ԫ�أ����ҷ��ط�ת�������(ţƤ��)
	 * ˼·��
	 * 	��ͼ���ҽ���Ԫ�ص��±��ѭ�������Ĺ�ϵ
	 * @return
	 */
	public static int[] reverse(int[] arr) {
		// ��������ͨforѭ�����б�������Ϊ��Ҫ�����±꽻��Ԫ��
		for (int i = 0; i < arr.length / 2; i++) {
			// ͨ����ͼ��֪��������Ԫ���±��ϵ��i <=> arr.length - 1 - i
			int temp = arr[i];// ����ǰԪ�ظ�ֵ����ʱ����temp
			arr[i] = arr[arr.length - 1 - i];// �������ĺ���Ԫ�ظ�ֵ����ǰԪ��arr[i]
			arr[arr.length - 1 - i] = temp;// ����ʱ������ֵ�������Ԫ��
		}
		return arr;
	}
	
	/**
	 * 2.���һ����������ѯ������һ���ַ����ַ������е�һ�γ��ֵ�λ��
	 * 
	 * �������������������Ҫ�أ�
			1. ����ֵ���ͣ�int
			2. ��������getIndexOfArray
			3. �β��б�char c, char[] arr
			4. �����壺��ͨforѭ������arr���飬�жϵ�ǰԪ�ظ�����c�Ƿ���ȣ�������򷵻��±�i
				�����п��ܴ���һ���������ǰ����arr��û������ַ�c�����ظ�����
				��Ϊ�����±��ǣ�>= 0 
	 * @return
	 */
	public static int getIndexOfArray(char c, char[] arr) {
		// ��ͨforѭ������arr����
		for (int i = 0; i < arr.length; i++) {
			// �жϵ�ǰԪ�ظ�����c�Ƿ����
			if (arr[i] == c) {
				return i;// ������򷵻��±�i
			}
		}
		// ѭ�������󣬲���ȷ��û�ҵ�����c�����ظ���
		return -1;// ��ֻҪ�Ǹ��������ԡ�
	}
	
	
	/**
	 * 1. ���һ������������һ���ַ����ַ������г��ֵĴ���(�м�)
	 *  �������������������Ҫ�أ�
			1. ����ֵ���ͣ�int
			2. ��������getCountOfArray
			3. �β��б�char c, char[] arr
			4. �����壺
			
	 * @return
	 */
	public static int getCountOfArray(char c, char[] arr) {
		// ����һ��int����count����������ֵ0
		int count = 0;
		// foreach����arr
		for (char e : arr) {
			// �жϵ�ǰԪ��e������c�ַ��Ƿ���ȣ�����ǣ��������+1
			if (e == c) {
				count++;
			}
		}
//		System.out.println(count);
		return count;
	}
}
