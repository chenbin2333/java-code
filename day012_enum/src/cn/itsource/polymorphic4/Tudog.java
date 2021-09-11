package cn.itsource.polymorphic4;

/**
 *	土狗 子类Tudog
 */
public class Tudog extends Dog {
	@Override
	public void eat() {
		System.out.println("骨头");
	}
	
	/**
	 * 看家护院方法：protectHome
	 */
    public void protectHome() {
		System.out.println("看家护院..");
	}
}
