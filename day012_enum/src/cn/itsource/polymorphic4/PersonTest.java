package cn.itsource.polymorphic4;

/**
 *	���Զ�̬����ι��
 */
public class PersonTest {

	public static void main(String[] args) {
		// ����Person����
		Person person = new Person();
		
		// ����Hasky������
		Dog hasky = new Hasky();
		
		// ����Tudog������
		Tudog tudog = new Tudog();
		
		// person������÷�����feedDog����
		person.feedDog(tudog);
		person.feedDog(hasky);
		
		
	}

}
