package cn.itsource.super7;

/**
		���ø����Ա������super.��Ա����
		���ø�����ͨ��static������super.������(...);
		���ø��๹�췽����super(...);���������๹�췽����һ��
 */
public class Person extends Animal {
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Person() {
//		super();
		super("");
	}
	
	/**
	 * ���Է����������������з��ʸ����:
	 * 1. ��Ա����name
	 * 2. ��ͨ����getName()/setName(...) 3. ���췽��
	 * 
	 */
	public void test() {
//		super();
//		super.name = "";
		
//		setName("������");
		super.setName("����ķ���");
		System.out.println(super.getName());
		
	}
	
}
