package cn.itsource.interface3;

/**
 *	�ӿ�ʵ���������
 */
public class MyInterfaceTest {

	public static void main(String[] args) {
		// ���ýӿ�IMyInterface�е�ȫ�ֳ�����MAX_VALUE ���﷨�� �ӿ���.������
		System.out.println(IMyInterface.MAX_VALUE);// 2
		System.out.println(IMyInterface.MIN_VALUE);// 1

		// ���ýӿ��е�static������testStatic1���﷨���ӿ���.������(...);
		IMyInterface.testStatic1();
		IMyInterface.testStatic2();
		
		// ���ýӿ��е�default������testDefault1���﷨��ʵ���������.������(...);
		// �ȴ���ʵ����MyInterfaceImpl����
		MyInterfaceImpl my = new MyInterfaceImpl();
		my.testDefault1();// ʵ�������my����default����
		my.testDefault2();
		
		// ���ýӿ��еĳ��󷽷�testAbstract()���﷨��ʵ���������.������(...);
		my.testAbstract();
		
		// 3. �ӿڲ���new����
//		new IMyInterface();
		
	}

}
