package cn.itsource.override3;

/**
 *	�̳в�����
 */
public class AnimalTest {

	public static void main(String[] args) {
		// ��������Person����
		Person p = new Person();// ctrl + (fn) + 1/2 ѡ��L
		// ͨ����ǰ�������p���ø���Animal�̳й�������ͨ������eat
		p.eat();
		p.sleep();

		// ��������Pig����
		Pig p2 = new Pig();// ctrl + (fn) + 1/2 ѡ��L
		p2.eat();
		p2.sleep();
		
		// ��������Bird����
		Bird b = new Bird();// ctrl + (fn) + 1/2 ѡ��L
		b.eat();
		b.sleep();
		
	}

}
