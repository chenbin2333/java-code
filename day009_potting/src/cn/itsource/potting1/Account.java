package cn.itsource.potting1;

/**
 *	�˻���
 */
public class Account {
	/** String���ͳ�Ա��������name */
	protected String name;
	
	/** String���ͳ�Ա����pwd���� */
	private String pwd;
	
	/** double���ͳ�Ա����money��� */
	double money;
	
	/** boolean���ͳ�Ա����vip�Ƿ��ǻ�Ա */
	public boolean vip;
	
	/**
	 * �޲�������
	 */
	public Account() {}
	
	/**
	 * 4���������вι���
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
	 * ��ͨ����getName��������ȡ��ǰ�����Ա����name��ֵ
	 * @return
	 */
	public String getName() {
		return name;
	}
}
