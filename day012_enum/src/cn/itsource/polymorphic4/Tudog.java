package cn.itsource.polymorphic4;

/**
 *	���� ����Tudog
 */
public class Tudog extends Dog {
	@Override
	public void eat() {
		System.out.println("��ͷ");
	}
	
	/**
	 * ���һ�Ժ������protectHome
	 */
    public void protectHome() {
		System.out.println("���һ�Ժ..");
	}
}
