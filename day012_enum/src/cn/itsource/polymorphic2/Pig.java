package cn.itsource.polymorphic2;

/**
 *	�������ࣺPig
 */
public class Pig extends Animal {
	int age = 3;
	
	@Override
	public void eat() {
		System.out.println("�԰ײ�...");
	}
	
	/**
	 * ���ײ˷�����gongBaiCai
	 */
	public void gongBaiCai() {
		System.out.println("���ײ�...");
	}
}
