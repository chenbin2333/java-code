package cn.itsource.polymorphic4;

/**
 *	人类，有喂狗方法
 */
public class Person {
	
	/**
	 * 喂狗方法
	 * @param dog
	 *//*
	public void feedDog(Tudog dog) {
		// 调用狗的eat方法
		dog.eat();
	}
	
	*//**
	 * 喂狗方法
	 * @param dog
	 *//*
	public void feedDog(Hasky dog) {
		// 调用狗的eat方法
		dog.eat();
	}
	*/
	
	/**
	 * 喂狗方法
	 * @param dog
	 */
	public void feedDog(Dog dog) {// 用多态的方式，写参数，可以喂所有的 子类狗
		// 调用狗的eat方法
		dog.eat();
		if (dog instanceof Tudog) {
			// 强制转换
			Tudog tudog = (Tudog)dog;
			tudog.protectHome();
		} else if (dog instanceof Hasky) {
			// 强制转换
			Hasky hasky = (Hasky)dog;
			hasky.breakHome();
		}
	}
	
}
