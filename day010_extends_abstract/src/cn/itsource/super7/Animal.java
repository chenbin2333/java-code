package cn.itsource.super7;

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
	
	public Animal() {
		System.out.println("Animal�޲ι���");
	}
	public Animal(String name) {
		System.out.println("Animal String �ι���");
		this.name = name;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
