package cn.itsource.override3;

/**
 *	����
 *	ͨ��extends�ؼ��ּ̳и���Animal
 */
public class Person extends Animal {
	/**
	 * ��eat����
	 */
	@Override // @Override��ע�⣬������������ԱУ����롣�����ʾeat�����ǴӸ���̳й�����д�ġ�
	public void eat() {
		System.out.println("������");
	}
}