package cn.itsource.object1;

/**
 *	6. Object���еķ������ص㡢�ѵ㣩
	1. int hashCode() ���ض���Ĺ�ϣ��ֵ��  ���������ݽṹ��ʱ��
 
 	2. String toString() ���ض�����ַ�����ʾ��ʽ�������Ҫ��ӡ�����ָ����ʽ��
 		����Ҫ��д��ǰ��������Ӧ���toString�������ɡ�
 		���磺��ӡStudent����Ϊָ����ʽ����Ҫ��д Student���toString����
 		
 	3. boolean equals(Object obj) ����ʵ��ҵ���ж����������Ա������ֵ�Ƿ���ȣ�
				����ֱ���ж�==�����ǱȽϳ�Ա������ֵ�Ƿ���ȡ�
	 		�жϵ�ǰ�����obj������Ա������ֵ�Ƿ����
	 		�Ժ�Ƚ��������͵���equals�����Ƚ�
	 		
	 		ͨ����ݼ���alt + shift + s ѡ��hashCode��equals����ѡ��ڵ����Ĵ����У���ѡ�Ƚϵĳ�Ա����OK����
 		���磺
 			����ѧ��Student����������Ϊ�����͵绰������ͬ����ͬһ���ˣ�������дStudentѧ�����equals����
 			������ʦTeacher����������Ϊ���֤����ͬ����ͬһ���ˣ�������дTeacher��ʦ���equals����
 			    
 	4. Class getClass() ����ǰ��������Ӧ���ֽ����ļ�   ��������ã�
	 		�ֽ����ļ���==�Ƚϣ��˽⣩
	 		 Class���� �ֽ����ļ����� 
	 		 ���磺 
	 		 	user�������getClass()��ȡ����user������ֽ����ļ� User��
 */
public class ObjectMethodsTest {

	public static void main(String[] args) {
		// �ȴ���User����u1
		User u1 = new User("����Ұ����", 22);
		// �ȴ���User����u1
		User u2 = new User("����Ұ����", 22);
		
		// 1. int hashCode() ���ض���Ĺ�ϣ��ֵ��  ���������ݽṹ��ʱ��
		int hashCode1 = u1.hashCode();
		System.out.println("��ϣֵ1 �� " + hashCode1);// 366712642
		
		int hashCode2 = u2.hashCode();
		System.out.println("��ϣֵ2 �� " + hashCode2);// 1829164700
	 	
		/*
		 * 2. String toString() ���ض�����ַ�����ʾ��ʽ�������Ҫ��ӡ�����ָ����ʽ��
	 		����Ҫ��д��ǰ��������Ӧ���toString�������ɡ�
	 		���磺��ӡStudent����Ϊָ����ʽ����Ҫ��д Student���toString����
		 */
		// ֱ�Ӵ�ӡ���󣬴�ӡ���ǵ�ַ�������ǳ���Աû�����塣
		// ���� 1�����ԣ�����ϣ����ӡ�����ʱ���Ǵ�ӡ�Ķ����Ա������ֵ������ϣ����ӡ��ʽ���£�[��Ա����ֵ1, ��Ա����ֵ2...]
		System.out.println(u1);// cn.itsource.object1.User@15db9742
		System.out.println(u2);// cn.itsource.object1.User@6d06d69c
		
		/*
		 * 3. boolean equals(Object obj) ����ʵ��ҵ���ж����������Ա������ֵ�Ƿ���ȣ�
				����ֱ���ж�==�����ǱȽϳ�Ա������ֵ�Ƿ���ȡ�
	 		�жϵ�ǰ�����obj������Ա������ֵ�Ƿ����
	 		�Ժ�Ƚ��������͵���equals�����Ƚ�
	 		
	 		ͨ����ݼ���alt + shift + s ѡ��hashCode��equals����ѡ��ڵ����Ĵ����У���ѡ�Ƚϵĳ�Ա����OK����
 			���磺
 				����ѧ��Student����������Ϊ�����͵绰������ͬ����ͬһ���ˣ�������дStudentѧ�����equals����
 				������ʦTeacher����������Ϊ���֤����ͬ����ͬһ���ˣ�������дTeacher��ʦ���equals����
 				
		 *  ���� 2: ��Ҫ������û���ʱ�򣬿����ж��Ƿ���ͬһ���û�����
		 *  ���ھ���Ҫ�Ƚ����������Ա������ֵ�Ƿ����
		 */
		System.out.println(u1 == u2);// false���Ƚ����������Ƿ���ͬһ����== �Ƚϵ��Ƕ��еĵ�ַ��
		/*
		 * ��Object�м̳е�equals������Ĭ����==�Ƚϣ�����������User������User ϣ���Ƚϵ��ǳ�Ա����name��age��ֵ
		 */
		System.out.println("��������Ƚϣ� " + u1.equals(u2));// true���Ƚϵ���name��age��ֵ
		
		/*
		 * String���������ͣ����������ͱ������ݶ���ͨ����Ա��������ɵġ�
		 * String���ͱ������ݵĳ�Ա������ char[]�����ԣ�Ҫ�Ƚ�����String�����Ƿ���ȣ����൱�ڱȽϵ���
		 * ����������ĳ�Ա������ char[]��ֵ�Ƿ���ȣ�������൱�ڵ�����String���е�equals�Ƚϵġ���Ϊ
		 * �������equals�Ƚϣ�==�ǱȽϵĵ�ַû�����塣
		 */
		String str = "123";
		String str2 = "123";
		System.out.println(str.equals(str2));
		
		/*
		 * 4. Class getClass() ����ǰ��������Ӧ���ֽ����ļ�   ��������ã�
	 		�ֽ����ļ���==�Ƚϣ��˽⣩�ж������ֽ����ļ��Ƿ������==�Ƚ�
	 		 Class���� �ֽ����ļ�����
	 		 ���磺 
	 		 	user�������getClass()��ȡ����user������ֽ����ļ� User��
		 */
		Class<? extends User> class1 = u1.getClass();
		Class<? extends User> class2 = u2.getClass();
		System.out.println(class1);// class cn.itsource.object1.User
		System.out.println(class2);// class cn.itsource.object1.User
		System.out.println(class1 == class2);// true
		
		// jdk���Դ����࣬���Ѿ����������Щ������д��
	}

}
