package homework;

import java.util.Arrays;

/**
 * day007��ͥ��ҵ
 * @author Administrator
 *
 */
public class Homework {
	public static void main(String[] args) {
		Homework.hobby("��������", "��̽");
		int[] arr = {1, 5, 3, 4, 8};
		Homework.swap(0, 2, arr);
		Homework.fill(arr, 0);
		Homework.product(1,2,3);
	}
	//	1. ���һ������������һ����������name��һ����������hobby����ӡ���һ�仰��name�İ����ǣ�hobby
	//2������ һ���� String��name  һ����String��hobby
	public static void hobby(String name,String hobby) {
		System.out.println(name+"�İ����ǣ�"+hobby);
	}
	//	2. �����һ������swap����int����ָ�������±�(�±겻֪���Ƕ��٣��β��б�)��Ԫ�ؽ���������Ҫ����ֵ�����м���
	public static void swap(int a,int b,int[] rr) {
		int temp = rr[a];
		rr[a] = rr[b];
		rr[b] = temp;
		System.out.println("���������������" + Arrays.toString(rr));
	}
	
	//	3. �����һ����������int����arr��ȫ����Ԫ��������ʼ��Ϊint a����������
	public static void fill(int[] arr,int a) {
		Arrays.fill(arr, a);
		System.out.println("������ʼ�������������" + Arrays.toString(arr));
	}
	//	4. �����һ������������long���ͱ����ĳ˻�,������ȷ������������
	public static void product(long... a) {
		int ji = 1;
		for (long e : a) {
			ji *= e;
		}
		System.out.println("���ǣ�"+ ji);
	}
}
