package cn.itsource.this3;

/**
 *	�˻���
 *	4. this ������ѵ㡢��⣩
 	�����ͬѧ����this,���ù�this��ʲô����Ҫ������ʱ�򣬵����﷨�������òι����setXxx�����м���

	4.1. ��� thisָ����ǰ���󣬼����ĸ�������þ�ָ���ĸ�����
	4.2. ���ú�ʹ�ã�
		4.2.1	����ֲ������ͳ�Ա�����Ķ�����
			���磺
			public Account(String name) {
				//�ڷ�����ʹ�ñ�����ʱ�����ȴӾֲ���Χ�ң��ͽ�ԭ��
				//������Ϊ��Ա�����;ֲ�����������ͬ�����ڶ���������
				//Ҫ������������⣬����Ҫ�õ�this,����this���ͻ�ֱ�Ӵӳ�Ա����λ����name
				this.name = name;
			}
			
		4.2.2	�����й��췽��֮����໥���ã����Ǳ����ǹ��췽���ڵĵ�һ��		this���ù��췽�����ᴴ���¶���
			�﷨��this(...); ���ñ����е���һ�����췽���������ᴴ������Ķ��󣬻���ݲ����Զ�ƥ����ö�Ӧ�Ĺ��췽��
			
				���ã�
					1.���Դ��������ʱ�򣬸���ĳЩ��Ա����Ĭ��ֵ
					2.���Ը����������췽�����򻯸���Ա������ֵ�Ĵ���
			���磺
			//1.���Դ��������ʱ�򣬸���ĳЩ��Ա����Ĭ��ֵ
			public Account(String name) {
				//name��111111����String���ͣ�ֻ����name��һ����������111111��һ��д����ֵ
				//��ͨ���ù��췽�������Ķ�������ͬ��   ��Ĭ�����롿
				this(name,"111111");//�����ǹ��췽���ڵĵ�һ��,������õ���������String�����Ĺ��췽��
			}
			
			public Account(String name,String pwd) {
				//Ҫ������������⣬����Ҫ�õ�this,����this���ͻ�ֱ�Ӵӳ�Ա����λ����name
				this.name = name;
				this.pwd = pwd;
			}
			
			//2.���Ը����������췽�����򻯸���Ա������ֵ�Ĵ���
			public Account(String name,String pwd,double money) {
				this(name,pwd);//���������������String�����Ĺ��췽�����򻯴�������
				this.money = money;
			}
			
		-------------------����ʹ����Ϊ�˽�---------------------------------
		
		4.2.3	��Ϊ����ֵ����  �� this���ж����ַ����ʾ�����һ��������һ������
		
		4.2.4	���÷�����ʱ����Ϊʵ�ʲ���ʹ��
		
		4.2.5	�ڵ�ǰ���е��÷�����
					this.getName();
		
		
	4.3. ע�����
		4.3.1 this��������ʱ��ʹ�ã�ÿһ�������ж�����һ���Լ���this		
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
	 * 2��String�������вι���
	 * �вι������ҵ����������Ƿ�Ҫд�� 
	 * @param name
	 * @param pwd
	 */
	public Account(String name, String pwd) {
		/*
		 * ������Ϊ��Ա�����;ֲ�����������ͬ�����ڶ���������
		 * Ҫ������������⣬����Ҫ�õ�this,����this.���ͻ�ֱ�Ӵӳ�Ա����λ����name
		 * this ���� ��ʹ�ã�
				1. ����ֲ������ͳ�Ա�����Ķ�����
		 */
		this.name = name;// ���ֲ�����name��ֵ����Ա����name
		this.pwd = pwd;
	}
	
	/**
	 * 4���������вι���
	 * �вι������ҵ����������Ƿ�Ҫд�� 
	 * @param name
	 * @param pwd
	 * @param money
	 * @param vip
	 */
	public Account(String name, String pwd, double money, boolean vip) {
//		name = name;// ������name(name�Ǿֲ�����)��ֵ����Ա���� name
//		pwd = pwd;// ������p(p�Ǿֲ�����)��ֵ����Ա���� pwd
//		money = money;// ������m(m�Ǿֲ�����)��ֵ����Ա���� money
//		vip = vip;// ������v(v�Ǿֲ�����)��ֵ����Ա���� vip
		// ��ʹ��һ��������ʱ�򣬰��վͽ�ԭ�򣬻����ȴӾֲ���Χʹ�ã����ԣ��ҵ��˾ֲ���������ֵ��ʱ��û�и���Ա������ֵ�ɹ�����this���������⡣
		/*
		 * ������Ϊ��Ա�����;ֲ�����������ͬ�����ڶ���������
		 * Ҫ������������⣬����Ҫ�õ�this,����this.���ͻ�ֱ�Ӵӳ�Ա����λ����name
		 * this ���� ��ʹ�ã�
				1. ����ֲ������ͳ�Ա�����Ķ�����
		 */
		/*this.name = name;// ���ֲ�����name��ֵ����Ա����name
		this.pwd = pwd;
		��this(...)���������Ѿ�����õ�2��String�����Ĺ��췽�������򻯴���
		*/
		this(name, pwd);// ���������Ѿ�����õ�2��String�����Ĺ��췽�������򻯴��룬ע�⣺�����ڵ�ǰ���췽����һ�С�
		this.money = money;
		this.vip = vip;
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setName(String name) ����Ա����name��ֵ����Ҫ�β�
	 * @param name 
	 */
	public void setName(String name) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		/*
		 *  this ���� ��ʹ�ã�
				1. ����ֲ������ͳ�Ա�����Ķ�����
		 */
		this.name = name;// ������name��ֵ������Ա����name
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setPwd(String pwd) ����Ա����pwd��ֵ����Ҫ�β�
	 * @param pwd 
	 */
	public void setPwd(String pwd) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		/*
		 *  this ���� ��ʹ�ã�
				1. ����ֲ������ͳ�Ա�����Ķ�����
		 */
		this.pwd = pwd;// ������pwd��ֵ������Ա����pwd
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setMoney(double money) ����Ա����money��ֵ����Ҫ�β�
	 * @param money 
	 */
	public void setMoney(double money) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		/*
		 *  this ���� ��ʹ�ã�
				1. ����ֲ������ͳ�Ա�����Ķ�����
		 */
		this.money = money;// ������money��ֵ������Ա����money
	}
	
	/**
	 * 2. Ϊÿһ����Ա�����ṩ�����public���ε� void setXxx(...)����	���ó�Ա������ֵ		
	 * 	public void setVip(boolean vip) ����Ա����vip��ֵ����Ҫ�β�
	 * @param vip 
	 */
	public void setVip(boolean vip) {
		// Ϊ�˲��Է�װ���򵥣����ﲻ���κ�Ȩ�޵��ж�
		/*
		 *  this ���� ��ʹ�ã�
				1. ����ֲ������ͳ�Ա�����Ķ�����
		 */
		this.vip = vip;// ������vip��ֵ������Ա����vip
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
