
/**
 *	�û��� 
 *		1. ����࣬ҵ���࣬û��main����	 => ���ģ��
		�﷨��
			public class Xxx {
				��Ա����; => ���ԣ���ֹ�Ĳ���
				��static����; => ��Ϊ����̬�Ĳ���
			}
			
		Ҫ��
			1.���������շ壬����֪�⣬������jdk�д��ڵ�������
			2.��Ա�������ͷ�������С�շ壬����֪��
			3.������������������Ա����������д�ĵ�ע��
 */
public class User {
	/** String���ͳ�Ա����name���� */
	String name;
	
	/** int���ͳ�Ա����age���� */
	int age;
	
	/**
	 * User����޲ι���
	 */
	public User() {
		System.out.println("User����޲ι���...");
	}
	
	/**
	 * User���String������int���� ����
	 * @param n Ҫ������Ա����name��ֵn
	 * @param a Ҫ������Ա����age��ֵa
	 */
	public User(String n, int a) {
		name = n;// ����Ա����name��ֵΪn
		age = a;// ����Ա����age��ֵΪa
		System.out.println("User���String������int���� ����...");
	}
	
	/**
	 * ��static������ͨ����������hobby
	 * @param str ���õ�����
	 */
	public void hobby(String str) {
		System.out.println(name + "�İ����ǣ�" + str);
	}
}
