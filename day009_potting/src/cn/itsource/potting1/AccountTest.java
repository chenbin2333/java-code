package cn.itsource.potting1;

/**
 *	Account�˻��������
 */
public class AccountTest {

	public static void main(String[] args) {
		// ����Account�������޲ι���
		Account acc1 = new Account();
		// ������acc1��Ա������ֵ
		acc1.name = "�����";
//		acc1.pwd = "696969";// ��Ϊpwd��private���εģ�ֻ����Account����ʹ��
		acc1.money = 500.00;
		acc1.vip = false;
		// ��ӡ�����Ա������ֵ
		System.out.println(acc1.name);
//		System.out.println(acc1.pwd);// ��Ϊpwd��private���εģ�ֻ����Account����ʹ��
		System.out.println(acc1.money);
		System.out.println(acc1.vip);
		
		// ���вι��촴��Account����
		Account acc2 = new Account("����С��", "996007", 50000.00, true);
		// ��ӡ���acc2��Ա������ֵ
		System.out.println(acc2.name);
//		System.out.println(acc2.pwd);// ��Ϊpwd��private���εģ�ֻ����Account����ʹ��
		System.out.println(acc2.money);
		System.out.println(acc2.vip);
		
		// ���󣺴��5W����������Ϊvip����vipΪtrue��
		acc1.vip = true;// ������ֱ���޸���vip��ֵ,û���κ�У�飬���ް�ȫ�Կ��ԡ��÷�װ�����������⡣
		// ���´�ӡacc1��Ա����vip��ֵ
		System.out.println(acc1.vip);
		
	}

}
