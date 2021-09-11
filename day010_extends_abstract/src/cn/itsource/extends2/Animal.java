package cn.itsource.extends2;

/**
 * ���࣬������
 * 
 * ���Կ��ԴӸ���̳���Щ��Ա��
 * 	���Է�ʽ�ǣ������������еĳ�Աд������private��public��static���εĳ�Ա���������������췽������
 * 	Ȼ���ڲ������д�������������������ȥ���ü̳еĳ�Ա��ӡ����ִ�У���Ч����
 * 
 * 	���ԴӸ���̳���Щ��Ա�������գ�
		���˹��췽��֮�����г�Ա�����Լ̳С�
		����private���εĳ�Ա������ͨ����ӣ�����public��protected���εķ�������ʽ���ʡ�
		
	�����п���д��Ա��
		1. ��Ա������
 *			1. private
 *			2. public
 *			3. static
 *
 *		2. ��ͨ������
 *			1. private
 *			2. public
 *			3. static
 *
 *		3. ���췽�� ��
 *			public	
 */
public class Animal {
	/** private ��Ա���� name */
	private String name;
	
	/** static ��Ա���� age */
	static int age;
	
	/** public ��Ա���� sex */
	public String sex;
	
	/**
	 * public�޲ι���
	 */
	public Animal() {}
	
	/**
	 *  Ĭ��public�вι���
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * Ĭ��public ��ͨ����getName��
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Ĭ��public ��ͨ����getName��
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * private��ͨ����testPrivate
	 */
	private void testPrivate() {
		System.out.println("testPrivate����");
	}
	
	/**
	 * static��ͨ����testStatic
	 */
	static void testStatic(){
		System.out.println("testStatic��������������");
	}
	
}
