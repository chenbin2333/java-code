
/**
 *	Java�Ĳ������ݣ�
	�����������ʹ��ݵ��ǣ�ֵ����
	�����������ʹ��ݵ��ǣ������ڶ��е����õ�ַ��
 */
public class _03StackHeap {

	public static void main(String[] args) {
		int[] arr = {1, 2};
		System.out.println("�ı�ǰ��" + arr[0]);// 1
		System.out.println("�ı�ǰ��" + arr[1]);// 2
		// ����change����
		change(arr);
		System.out.println("�ı��================ ��" + arr[0]);// 6
		System.out.println("�ı��================ ��" + arr[1]);// 9
	}
	public static void change(int[] arr) {
		arr[0] = 6;
		arr[1] = 9;
		System.out.println("�ı���-------��" + arr[0]);// 6
		System.out.println("�ı���-------��" + arr[1]);// 9
	}

}
