package cn.itsource.super4;

/**
 * ���࣬������
 * 
 * ���Կ��ԴӸ������ͨ��super���� ��Щ��Ա��
 * 	���Է�ʽ�ǣ������������еĳ�Աд������private��public��static���εĳ�Ա���������������췽������
 * 	Ȼ���ڲ������д�������������������ȥ���ü̳еĳ�Ա��ӡ����ִ�У���Ч����
 * 
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
	public boolean sex;
	
	/**
	 * public�޲ι���
	 */
	public Animal() {
		System.out.println("Animal�޲ι���");
	}
	
	/**
	 *  public�вι���
	 * @param name
	 */
	public Animal(String name) {
		System.out.println("Animal String �ι���");
		this.name = name;
	}
	
	/**
	 * private ���ε��вι���
	 * @param sex
	 */
	private Animal(boolean sex) {
		this.sex = sex;
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
