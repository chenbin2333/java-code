package homework;
/**
 *  ����һ��������Dog
	���������ԣ��Ա������� 
	�����·����� public void eat(String food)������
	��дһ����������ԣ�
	����2����������:
	һ������ ��ֵΪ��ĸ��1�� ���Ա�ĸ	�ԣ����ӣ����вι���ʵ�ֳ�Ա������ֵ�������ҵ��ö���ĳԷ�����
	һ������ ��ֵΪ������1�� ���Ա𣺹�	�ԣ�����ͷ���ö�����.��Ա�����ķ�ʽ��ֵ����Ӧ�ĳ�Ա�����������ҵ��ö���ĳԷ���
 *
 */
public class Dog {

	char gender; // �Ա�
	String name; // ����
	/**�����·����� public void eat(String food)������*/
	public void eat(String food){
		System.out.println(name + "���ˣ�" + food);
	}
	// �вι���
	public Dog(char g, String n) {
		gender = g;
		name = n;
	}
	// �޲ι���
	public Dog() {
		
	}
	
}
