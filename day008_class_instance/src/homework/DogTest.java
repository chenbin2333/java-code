package homework;
/**
 * ����2����������:
	һ������ ��ֵΪ��ĸ��1�� ���Ա�ĸ	�ԣ����ӣ����вι���ʵ�ֳ�Ա������ֵ�������ҵ��ö���ĳԷ�����
	һ������ ��ֵΪ������1�� ���Ա𣺹�	�ԣ�����ͷ���ö�����.��Ա�����ķ�ʽ��ֵ����Ӧ�ĳ�Ա�����������ҵ��ö���ĳԷ���
 *
 */
public class DogTest {

	public static void main(String[] args) {
		//ͨ���޲ι��촴���Ĺ���
		Dog dog = new Dog();
		dog.gender = '��';
		dog.name = "Harry";
		dog.eat("����ͷ");
		System.out.println(dog.name + ":" + dog.gender);
		
		//ͨ���вι��촴����������
		Dog dog2 = new Dog('��',"Tom");
		dog2.eat("����");
		System.out.println(dog2.name + ":" + dog2.gender);
	}

}
