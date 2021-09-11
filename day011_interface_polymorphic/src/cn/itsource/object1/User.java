package cn.itsource.object1;

/**
 *	�û���User
 */
public class User {
	private String name;
	private int age;
	
	public User() {}

	/**
	 * ��ݼ���alt + shift + s ѡ�� using Field��Ȼ����ѡ����Ҫ�ĳ�Ա���������ɹ��췽��
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * ��ݼ���alt + shift + s ѡ�� getter and setter��Ȼ����ѡ����Ҫ�ĳ�Ա����������get��set����
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// ���� 1�����ԣ�����ϣ����ӡUser�����ʱ���Ǵ�ӡ�Ķ����Ա������ֵ��
		// ����ϣ����ӡ��ʽ���£�[��Ա����ֵ1, ��Ա����ֵ2...]
		return "[" + name + ", " + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)// �жϵ�ǰ����Ͳ����Ƿ���ͬһ����ַ
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())// obj.getClass()��ȡ������Ӧ���ֽ����ļ�
			return false;
		User other = (User) obj;// �������ͣ�Ϊ��ʹ��User�еĳ�Ա�����ͷ���
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (this.name != other.name)// String�������û����дObject�̳е�equals������Ĭ����==�Ƚϵ�ַ������������Ҫ�Ƚϵ���String�����е� ֵ
			return false;
		return true;
	}
	
}
