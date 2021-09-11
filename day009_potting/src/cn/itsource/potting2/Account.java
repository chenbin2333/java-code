package cn.itsource.potting2;

/**
 *	�˻���
 *	��װ���裺���ص㣩
		 1. ˽�л���Ա��������private���γ�Ա������
		 2. Ϊÿһ����Ա�����ṩ�����public���ε�		
				����ֵ���� getXxx()����	��ȡ��Ա������ֵ�������ǰ��Ա����������boolean���ͣ���getXxx()��Ϊ isXxx()
				
				void setXxx(...)����	���ó�Ա������ֵ
		 3. �ṩһ���޲ι��졾SE���佲��
		 4. ������public����
 */
public class Account {// 4. ������public����
	/** String���ͳ�Ա��������name	1. ˽�л���Ա��������private���γ�Ա������ */
	private String name;
	
	/** String���ͳ�Ա����pwd���� 	1. ˽�л���Ա��������private���γ�Ա������ */
	private String pwd;
	
	/** double���ͳ�Ա����money���	1. ˽�л���Ա��������private���γ�Ա������ */
	private double money;
	
	/** boolean���ͳ�Ա����vip�Ƿ��ǻ�Ա	1. ˽�л���Ա��������private���γ�Ա������ */
	private boolean vip;
	
	/**
	 * 3. �ṩһ���޲ι��졾SE���佲��
	 * �޲�������
	 */
	public Account() {}
	
	/**
	 * 4���������вι���
	 * �вι������ҵ����������Ƿ�Ҫд�� 
	 * @param n
	 * @param p
	 * @param m
	 * @param v
	 */
	public Account(String n, String p, double m, boolean v) {
		name = n;// ������n(n�Ǿֲ�����)��ֵ����Ա���� name
		pwd = p;// ������p(p�Ǿֲ�����)��ֵ����Ա���� pwd
		money = m;// ������m(m�Ǿֲ�����)��ֵ����Ա���� money
		vip = v;// ������v(v�Ǿֲ�����)��ֵ����Ա���� vip
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setName(String n) ����Ա����name��ֵ����Ҫ�β�
	 * @param n 
	 */
	public void setName(String n) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		name = n;// ������n��ֵ������Ա����name
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setPwd(String p) ����Ա����pwd��ֵ����Ҫ�β�
	 * @param p 
	 */
	public void setPwd(String p) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		pwd = p;// ������p��ֵ������Ա����pwd
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setMoney(double m) ����Ա����money��ֵ����Ҫ�β�
	 * @param m 
	 */
	public void setMoney(double m) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		money = m;// ������m��ֵ������Ա����money
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setVip(boolean v) ����Ա����vip��ֵ����Ҫ�β�
	 * @param v 
	 */
	public void setVip(boolean v) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		vip = v;// ������v��ֵ������Ա����vip
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε�: 
	 * 	����ֵ���� getXxx()����	��ȡ��Ա������ֵ�������ǰ��Ա����������boolean���ͣ���getXxx()��Ϊ isXxx()
	 * 	public String getName()��ȡ��Ա����name��ֵ
	 * @return
	 */
	public String getName() {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		return name;// ֱ�ӷ��س�Ա����name��ֵ
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε�: 
	 * 	����ֵ���� getXxx()����	��ȡ��Ա������ֵ�������ǰ��Ա����������boolean���ͣ���getXxx()��Ϊ isXxx()
	 * 	public String getPwd()��ȡ��Ա����pwd��ֵ
	 * @return
	 */
	public String getPwd() {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		return pwd;// ֱ�ӷ��س�Ա����pwd��ֵ
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε�: 
	 * 	����ֵ���� getXxx()����	��ȡ��Ա������ֵ�������ǰ��Ա����������boolean���ͣ���getXxx()��Ϊ isXxx()
	 * 	public double getMoney()��ȡ��Ա����money��ֵ
	 * @return
	 */
	public double getMoney() {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		return money;// ֱ�ӷ��س�Ա����money��ֵ
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε�: 
	 * 	����ֵ���� getXxx()����	��ȡ��Ա������ֵ�������ǰ��Ա����������boolean���ͣ���getXxx()��Ϊ isXxx()
	 * 	public boolean isVip()��ȡ��Ա����vip��ֵ
	 * @return
	 */
	public boolean isVip() {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		return vip;// ֱ�ӷ��س�Ա����vip��ֵ
	}
	
}
