package cn.itsource.extends2;

/**
 *	�̳в����࣬�ڲ������д�������������������ȥ���ü̳еĳ�Ա��ӡ����ִ�У���Ч����
 */
public class AnimalTest {

	public static void main(String[] args) {
		// ����Person����
		Person p = new Person();// ctrl + (fn) + 1/2 ѡ��L
		// ͨ����ǰ�������p���ø���Animal�̳й�����private��Ա���� name
//		p.name = "����Ұ����";// ���ܼ̳�private���εĳ�Ա�����ǿ���ͨ����ӷ���ʹ��
		// ͨ��p����public���ε�setName����|
		p.setName("����Ұ����");
		// ͨ��p����public���ε�getName����|
		System.out.println(p.getName());
		
		// ͨ����ǰ�������p���ø���Animal�̳й�����static��Ա���� age
		p.age = 33;// ���Լ̳�static���εĳ�Ա�����ǲ��������������ֱ�ӷ��ʣ�Ӧ����: ����.����
		// ��ӡ���һ��age��ֵ
		System.out.println(p.age);
		
		// ͨ����ǰ�������p���ø���Animal�̳й�����public��Ա���� sex
		p.sex = "��";
		System.out.println(p.sex);
		
		// ���췽���Ͳ��ò����ˣ���Ϊֻ��ͨ��new�����ã����������������á����ܼ̳й��췽����
		
		// ͨ����ǰ�������p���ø���Animal�̳й�����private��ͨ������testPrivate
//		p.testPrivate();// �������ܼ̳�
		
		// ͨ����ǰ�������p���ø���Animal�̳й�����static��ͨ������testStatic
		p.testStatic();// ���Լ̳�static���εĳ�Ա�����ǲ��������������ֱ�ӷ��ʣ�Ӧ����: ����.����
		
	}

}
