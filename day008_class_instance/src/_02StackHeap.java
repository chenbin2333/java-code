
/**
 *	Java�Ĳ������ݣ�
	�����������ʹ��ݵ��ǣ�ֵ����
	�����������ʹ��ݵ��ǣ������ڶ��е����õ�ַ��
 */
public class _02StackHeap {

	public static void main(String[] args) {
		int a = 1;
		System.out.println("�ı�ǰ��" + a);// 1
		// ����change����
		change(a);
		System.out.println("�ı��================ ��" + a);// 1	
	}

	public static void change(int a) {
		a = 2;
		System.out.println("�ı���-------��" + a);// 2
	}
		
}
