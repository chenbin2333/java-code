package cn.itsource.anonymous1;

/**
 * ҵ����Student�Ĳ�����
 *	���ص����ա�		
	3.2. ���һ�������࣬������������XxxTest������main����
		�ڲ������main�����У�д���´��룺	
	
			3.2.1. ��������	=> ����ģ��
				�﷨��
					���� �������������� = new ����();
				
				���磺
					Student stu = new Student();
				
			3.2.2. �������Ա������ֵ	=> ��д��Ϣ
				�﷨��	
					������.��Ա���� = ֵ;//ע�⣺ֵ�ͳ�Ա�����������ͱ�����ȫһ��
				
				���磺
					stu.name = "С���";//name��String����
					stu.age = 22;//age��int����
					
					
			3.2.3. �����ȡֵ/���÷���:	�����ֻ��Ҫ��ӡ���һ�£���һ�½������
						�����ֻ��Ҫ��ӡ���һ�³�Ա��������һ�½������
			 			����һ�·�static���εķ���			
					�﷨��
						������.��Ա����;
						������.��static����(...);
 */
public class StudentTest {

	public static void main(String[] args) {
		Student stu2 = new Student();
		stu2.name = "��������";
		stu2.age = 22;
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		stu2.hobby("���");
		
		// �������󣬵��ǲ��ñ������ֶ��еĵ�ַ
		new Student();// û�����ù�ϵ�Ķ�����������
		
		System.out.println(new Student());// Student@15db9742
		
	}
	
}
