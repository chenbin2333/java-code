package cn.itsource.polymorphic4;

/**
 *	���࣬��ι������
 */
public class Person {
	
	/**
	 * ι������
	 * @param dog
	 *//*
	public void feedDog(Tudog dog) {
		// ���ù���eat����
		dog.eat();
	}
	
	*//**
	 * ι������
	 * @param dog
	 *//*
	public void feedDog(Hasky dog) {
		// ���ù���eat����
		dog.eat();
	}
	*/
	
	/**
	 * ι������
	 * @param dog
	 */
	public void feedDog(Dog dog) {// �ö�̬�ķ�ʽ��д����������ι���е� ���๷
		// ���ù���eat����
		dog.eat();
		if (dog instanceof Tudog) {
			// ǿ��ת��
			Tudog tudog = (Tudog)dog;
			tudog.protectHome();
		} else if (dog instanceof Hasky) {
			// ǿ��ת��
			Hasky hasky = (Hasky)dog;
			hasky.breakHome();
		}
	}
	
}
