package day004_operation_if;

/**
 * 1.6. ѡ��ṹע��������˽⣩
		1. ѡ��ṹ�Ǵ��ϵ��¿�ʼƥ�䣬һ��ƥ����һ�������������������ͽ����ˣ�
			���º���Ҳ��ƥ��������Ҳ����ִ����
			
		2. if �� if else ��䣬������Բ�д{},���ǲ�����
			��Ϊ��д{} ,ֻ�ܿ���һ�д���
			
		3. if(){} else if(){}����Բ�д else��һ�����ҵ���������
 */
public class _07If {

	public static void main(String[] args) {
		/*
		 * 1. ѡ��ṹ�Ǵ��ϵ��¿�ʼƥ�䣬һ��ƥ����һ�������������������ͽ����ˣ�
			���º���Ҳ��ƥ��������Ҳ����ִ���� 
		 */
//		if (true) {
//			System.out.println("if");
//		} else if(true) {
//			System.out.println("��1�� else if");
//		} else if(true) {
//			System.out.println("��2�� else if");
//		} else if(true) {
//			System.out.println("��3�� else if");
//		}
		
		/*
		 * 2. if �� if else ��䣬������Բ�д{},���ǲ�����
			��Ϊ��д{} ,ֻ�ܿ���һ�д���
		 */
		int a = 3;
		int b = 2;
		if (a < b) 
			System.out.println("if");
//		System.out.println("�м����");// �����д{}��ֻ�ܿ���һ����룬���м䲻�ܼ���������
		else 
			System.out.println(" else ");
		
		if (a < b) 
			System.out.println("if");
		
		System.out.println("if�����....");
		
	}

}
