package cn.itsource.potting2;

/**
 *	Account�˻����װ������
 */
public class AccountTest {

	public static void main(String[] args) {
		// ����Account�������޲ι���
		Account acc1 = new Account();
		// ������acc1��Ա������ֵ
//		acc1.name = "�����";// ��Ϊname��private���εģ�ֻ����Account����ʹ��
//		acc1.pwd = "696969";// ��Ϊpwd��private���εģ�ֻ����Account����ʹ��
//		acc1.money = 500.00;// ��Ϊmoney��private���εģ�ֻ����Account����ʹ��
//		acc1.vip = false;// ��Ϊvip��private���εģ�ֻ����Account����ʹ��
		
		// ��װ��ֻ��ͨ������acc1����setXxx(ʵ��)��ֵ
		acc1.setName("�����");
		acc1.setPwd("696969");
		acc1.setMoney(500.00);
		acc1.setVip(false);
		
		// ��ӡ�����Ա������ֵ: ��Ϊ��װ�󣬲���ֱ��ͨ��acc1.��Ա�������ʣ� ����ֻ���ã�����acc1 ����: ����ֵ getXxx()
		String name = acc1.getName();// ��ȡ��Ա����name��ֵ��getName()
		System.out.println(name);
		System.out.println(acc1.getPwd());
		System.out.println(acc1.getMoney());
		System.out.println(acc1.isVip());
		
		System.out.println("============================");
		
		// ���вι��촴��Account����
		Account acc2 = new Account("����С��", "996007", 50000.00, true);
		// ��ӡ���acc2��Ա������ֵ
		// ��ӡ�����Ա������ֵ: ��Ϊ��װ�󣬲���ֱ��ͨ��acc2.��Ա�������ʣ� ����ֻ���ã�����acc2 ����: ����ֵ getXxx()
		String name2 = acc2.getName();// ��ȡ��Ա����name��ֵ��getName()
		System.out.println(name2);
		System.out.println(acc2.getPwd());
		System.out.println(acc2.getMoney());
		System.out.println(acc2.isVip());
		
		// ���󣺽��Ѿ������Ķ���acc2�������޸�Ϊ��007996 
		acc2.setPwd("007996");// acc2�������setPwd������ֵ
		// ���´�ӡacc2��Ա����vip��ֵ
		System.out.println("�޸ĺ�" + acc2.getPwd());
		
	}

}
