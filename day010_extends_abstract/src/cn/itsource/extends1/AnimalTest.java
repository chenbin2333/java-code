package cn.itsource.extends1;

/**
 *	�̳в�����
 */
public class AnimalTest {

	public static void main(String[] args) {
		// ����Person����
		Person p = new Person();// ctrl + (fn) + 1/2 ѡ��L
		// ͨ����ǰ�������p���ø���Animal�̳й����ĳ�Ա���� name
		p.name = "����Ұ����";
		// ͨ����ǰ�������p���ø���Animal�̳й����ĳ�Ա���� age
		p.age = 33;
		// ��ӡ���һ��name��age��ֵ
		System.out.println(p.name);
		System.out.println(p.age);
		// ͨ����ǰ�������p���ø���Animal�̳й�������ͨ������eat
		p.eat();
		
		// ͨ����ǰ�������p�������з���:coding
		p.coding();
		// ���������Լ�����
		
	}

}
