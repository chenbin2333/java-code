package cn.itsource.interface2;

/**
 *	�����ࣺ���Խӿ�ʵ�����еĹ���
 *	���Է�ʽ������ʵ������󣬵���ȫ��ʵ�ֵķ���
 */
public class USB3_0Test {

	public static void main(String[] args) {
		// ����USB3_0Impl����
		USB3_0Impl usb = new USB3_0Impl();
		// ����ʵ�ַ�����power()
		usb.power();
		// ����ʵ�ַ�����dataTransfer()
		usb.dataTransfer();
	}

}
