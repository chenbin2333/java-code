package cn.itsource.anonymous1;

/**
 * ѧ���ࡾҵ������ơ�
 	����࣬ҵ���࣬û��main����	 => ���ģ��
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
public class Student {
	/** String���ͳ�Ա����name���������ø�ֵ */
	String name;
	
	/** int���ͳ�Ա����age���䣬���ø�ֵ */
	int age;
	
	/**
	 * ��static���ε���ͨ������hobby����
	 * @param str ���õ�����
	 */
	public void hobby(String str) {
		// ֱ����� ��name�İ����ǣ�str  ���ַ���ƴ�ӡ�
		System.out.println(name + "�İ����ǣ�" + str);
	}
}
