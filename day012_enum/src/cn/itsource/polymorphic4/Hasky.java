package cn.itsource.polymorphic4;

/**
 *	哈士奇狗子类Hasky
 */
public class Hasky extends Dog {
	@Override
	public void eat() {
		System.out.println("沙发..");
	}
	
	/**
	 * 拆家方法：breakHome
	 */
    public void breakHome() {
		System.out.println("拆家..");
	}
}
