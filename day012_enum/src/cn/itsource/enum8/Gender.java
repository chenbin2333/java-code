package cn.itsource.enum8;

/**
 *	6. ö��enum (�ص�����)
	1. �������һ�ָ���ƽ�����½ṹ�����������г���ȡֵ�ȽϹ̶��ĳ���
	2. ���ã����Ǽ�����ȫ�ֳ������ִ���
	3. �﷨��
		 �����﷨��(����)
			public enum ö������Enum {
				�ֶΣ�ȫ��д���»��ߡ��򻯵ľ���ȫ�ֳ�����
				ʵ��������������private final���εģ�
				ʵ������
				�෽����һ�㲻��ʹ�á�
				���췽�� - ö���еĹ��췽��Ĭ�϶���private���Σ����ܹ���public��protected����
					���췽�����ã�ֻ���ڵ�ǰö������ʹ�ã����Ǹ���ǰö��������ʼ��ʵ��������
			}
	
	4. ע�⣺
		4.1. �ֶ�֮���ö��ţ����һ���ֶ��÷ֺŽ���
		4.2. ����д�����ֶΣ����ǲ�����
		4.3. ö���඼����ʽ�̳��˳�����Enum�ࣨ����ö����Ļ��ࣩ��������ʾд��extends��
		4.4. ���췽��������private��
		4.5. ʵ������ֻ��д���ֶ���
		
	5. ʹ�ó�����(����)
		������һЩȡֵ�̶�����������磺Vip���Ա�QQ״̬�����������ڡ�������
 */
public enum Gender {
	/** String���͵�ȫ�ֳ���MAN�� */
//	public static final String MAN = "��";
//	MAN();// MAN()�൱�ڣ�public static final Gender MAN = new Gender(); ()��ʾ�ڵ��õ�ǰö������޲ι��죬���Լ�()
//	MAN;// MAN �൱�ڣ�MAN()
//	REN_YAO,// ������Ϊ��ö����û�������޲ι���
	δ֪("δ֪"),// 4.2. ����д�����ֶΣ����ǲ�����
	// �ֶ�֮���ö��ţ����һ���ֶ��÷ֺŽ���
	MAN("��"),// MAN("��") �൱�ڣ�public static final Gender MAN = new Gender("��"); 
	WOMAN("Ů");// MAN("��") �൱�ڣ�public static final Gender MAN = new Gender("��");
	
	/** ʵ������String name�����ã�����ǰö���ֶα���ֵ�� */
	private String name;

	/**
	 * ���췽�� - ö���еĹ��췽��Ĭ�϶���private���Σ����ܹ���public��protected����
					���췽�����ã�ֻ���ڵ�ǰö������ʹ�ã����Ǹ���ǰö��������ʼ��ʵ��������
	 * @param name
	 */
	private Gender(String name) {
		this.name = name;
	}
	
	@Override // ʵ������
	public String toString() {
		return this.name;// ���ص�ǰ��ö�ٶ�����
	}
	
	/**
	 * �෽����testStatic
	 */
	public static void testStatic() {
		System.out.println("�෽��");
	}
	
}
