package cn.itsource.interface2;

/**
 *	IUSB3_0�Ľӿ�ʵ����USB3_0Impl��ͨ��implementsʵ��
 *	
 *	 	
	 �ӿ�Ҫʹ�ã�������ʵ���ࡾ���ࡿ��
	 �﷨��
	 	public(abstract) class �ӿ���Impl implements �ӿ���1, �ӿ�2...{
	 		�����һ���ǳ�����������дȫ���ĳ��󷽷�
	 	}
 */
public class USB3_0Impl implements IUSB3_0 {

	@Override
	public void power() {
		System.out.println("���...");
	}

	@Override
	public void dataTransfer() {
		System.out.println("���ݴ���...");
	}

}
