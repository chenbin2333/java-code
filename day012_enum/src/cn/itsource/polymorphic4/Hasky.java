package cn.itsource.polymorphic4;

/**
 *	��ʿ�湷����Hasky
 */
public class Hasky extends Dog {
	@Override
	public void eat() {
		System.out.println("ɳ��..");
	}
	
	/**
	 * ��ҷ�����breakHome
	 */
    public void breakHome() {
		System.out.println("���..");
	}
}
