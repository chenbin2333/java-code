package cn.itsource.innerclass;

/**
 *	�ֻ���Phone���ⲿ�ࡿ
 *	3. �ڲ��ࣨ��⣩ ��Ϲ�ϵ
	1. ����ڲ��࣬��һ���ඨ������һ������ڲ�������������֮Ϊ�ڲ��࣬����������֮Ϊ�ⲿ 
		�ࡣ������ʶ�ڲ��༴�ɣ� 		
	2. ���ã����õ����ַ�װ����������������ʹ���ڲ���
	3. ʹ�ã�
		1. ʵ���ڲ��ࡾû��static���ε��ڲ��ࡿ
		2. ��̬�ڲ��ࣨ�Ƚϳ��ã���static���ε��ڲ��ࡿ
		3. �ڲ�ö��
		3. �ڲ��ӿ�
		
 */
public class Phone {
	/** �ֻ��� */
	private PhoneCard card;
	
	/** ���������Ա����������û������ֻ��������jdk����ģ��������������Լ���Ƶ����Ͷ��� */
//	private String card2;
	
	public Phone(String number) {
		// ���ⲿ��Phone�Ĺ��췽���У������ڲ���PhoneCard�Ĺ��췽��
		PhoneCard phoneCard = new PhoneCard(number);
		card = phoneCard;// ���´�����PhoneCard����ֵ����Ա����card
	}
	
	/**
	 *	�ֻ���PhoneCard��
	 *	��Ա�ڲ���PhoneCard������ʹ�÷���Ȩ�����η���static
	 *	static����PhoneCard�࣬���ڼ����ⲿ��Phone��ʱ��һ��PhoneCard������
	 */
	private static class PhoneCard {
		/** �ֻ��绰����number */
		String number;

		public PhoneCard(String number) {
			this.number = number;
		}
	}
	
	/**
	 * showNumber��������ʾ��ǰ���ŷ���
	 */
	public void showNumber() {
		// ֱ�Ӵ�ӡ��ǰ��Ա����card��numberֵ
		System.out.println("�ף���������Ϊ��" + card.number);
	}

}
