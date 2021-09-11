package cn.itsource.final6;

/**
 * 2. final���η������գ�
	1  final����
			�ؼ��֣����η�����ʾ���յġ�����һ������һ����Ա���ó�Ա�Ͳ����ٱ��޸��ˡ� 
	2  final���ã�
			���뱻��������Ա�޸Ĵ��룬��final
	3. ʹ�ã�		
			�������Σ�
				�ⲿ�ࣺ̫���࣬���ܱ��̳�
	 			ʵ��������������������ʱ��ֵ�����ڹ��췽���и�ֵ
				������� ������������ʱ��ֵ 
				ʵ�����������ܱ�������д				
	 			�෽�������ܱ�������д
	 			�ڲ��ࣺ
				�ֲ�������
			�������Σ�
 				���췽��
		
	4. ʹ�ó����������գ�
		1. ���뱻�����޸Ĵ������final
		2. final���εĳ�Ա�������ǳ������ڳ������С������潲��
 */
public class FinalDemo {
	/** private���ε�int���ͳ�Ա����a */
//	private final int a = 2;// �����a����������ͬʱ���븳ֵ
	private final int a;// �����a����������ͬʱ���븳ֵ
	
	/** public static���ε�String���ͳ�Ա����str */
	public static final String STR = "����";// �����STR����������ͬʱ���븳ֵ
	
	/**
	 * public���ε�FinalDemo���޲ι���
	 */
	public FinalDemo() {
		// ʵ����������final���Σ����� �� 1.��������ͬʱ��ֵ ���� 2.�ڹ��췽���и�ֵ
		a = 1;
	}

	/**
	 *  private���ε�FinalDemo��int�ι���
	 * @param a
	 */
	private FinalDemo(int b) {
		// ʵ����������final���Σ����� �� 1.��������ͬʱ��ֵ ���� 2.�ڹ��췽���и�ֵ
		a = 3;
	}
	
	/**
	 * public���ε�test1����
	 */
	public static final void test1() {
		final int a;// �ֲ�������ֻ��final�������ξֲ�����,����������ʱ�򲻸�ֵ������ʹ��ǰ������ֵ
		a = 1;// final���εľֲ�����һ����ֵ���Ͳ����޸���
		System.out.println(a);
//		a = 2;// final���εľֲ�����һ����ֵ���Ͳ����޸���
		
	}
	
	/**
	 * public���ε�testPrivate����
	 */
	public final void testPrivate() {
		System.out.println("testPrivate");
	}
	
	/**
	 *	��̬�ڲ���InnerClass����һ�������������һ�����������
	 *	�ڲ��໹�����÷���Ȩ�����η�����
	 *	����ǰ�����static���������Ǿ�̬�ڲ���
	 */
	static final class InnerClass {
		
	}
	
	/**
	 *	�ڲ���InnerClass2����һ�������������һ�����������
	 *	�ڲ��໹�����÷���Ȩ�����η�����
	 *	����ǰ�����static���������Ǿ�̬�ڲ���
	 */
	final class InnerClass2 {
		
	}
	
}
