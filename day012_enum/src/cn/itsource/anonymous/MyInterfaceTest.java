package cn.itsource.anonymous;

/**
 *	�ӿڲ�����
 *	�����ڲ��������
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		/*
		 * ���裬��������ӿ�IMyInterfaceʵ����MyInterfaceImpl�������Ķ���ֻ��Ҫʹ��һ�Σ����ʱ���������������Ȼ�󴴽�����
		 * �ǳ��鷳����ô���Ǿ��룬�ܲ��ܽ��������ʹ����������Ĺ������������أ��ܣ�ͨ�������ڲ�����﷨���Ϳ��Խ��ӿڡ��������������
		 * �ʹ�������Ĺ����϶�Ϊһ���򻯴��롣���ʱ�򣬾Ͳ���Ҫ�ٵ�����������ˡ�
		 * 
		 * �����ڲ����﷨�������գ�
			�ӿ���/�������� ������� = new �ӿ�/������() {// �����Ƕ�̬�ķ�ʽ��������������������������ǲ�֪�����Ǳ�����������֣�
				// ��дȫ�����󷽷�
			};// ע�⣺�����ٷֺ�;
		 */
		IMyInterface my = new IMyInterface() {// �������ڲ���Ķ���װ����������У�����������
			// {}�е��������ڲ�������壬��д��ȫ�����󷽷�
			@Override
			public void testAbstract2() {
				System.out.println("�����ڲ�����󷽷�2");
			}
			
			@Override
			public void testAbstract1() {
				System.out.println("�����ڲ�����󷽷�1");
			}
			
		};
		// �������ڲ������my���÷���
		my.testAbstract1();
		my.testAbstract2();
		
	}

}
