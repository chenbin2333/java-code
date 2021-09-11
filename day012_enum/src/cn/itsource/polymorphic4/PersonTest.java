package cn.itsource.polymorphic4;

/**
 *	测试多态案例喂狗
 */
public class PersonTest {

	public static void main(String[] args) {
		// 创建Person对象
		Person person = new Person();
		
		// 创建Hasky狗对象
		Dog hasky = new Hasky();
		
		// 创建Tudog狗对象
		Tudog tudog = new Tudog();
		
		// person对象调用方法：feedDog方法
		person.feedDog(tudog);
		person.feedDog(hasky);
		
		
	}

}
