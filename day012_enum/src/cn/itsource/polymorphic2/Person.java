package cn.itsource.polymorphic2;

/**
 *	�������ࣺPerson
 */
public class Person extends Animal {
	int age = 2;
	
	@Override
	public void eat() {
		System.out.println("�Դ󳦴���...");
	}
	
	/**
	 * ߣ���뷽��coding
	 */
	public void coding() {
		System.out.println("ߣ...");
	}
}
