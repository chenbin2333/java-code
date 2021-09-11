package cn.itsource.interface5;

/**
 *	 ���󣺳�������Ա������ϵͳ��
 *  	����Ŀ��һ��AbstractEmployeeԱ�����࣬������3������Ա�����࣬�ֱ�Ϊ��EmployeeFactory1��
 * 	EmployeeFactory2��EmployeeFactory3
 * 	   1. ���й��˶��� �ϰ�򿨷���clockIn()������Ա���򿨷�ʽ��ͬ��
 * 	   2. ���й��˶��� �°�򿨷���clockOut()������Ա���򿨷�ʽ��ͬ��
 * 	   3. ����ÿ�������������й����ķ���work()����ͬ��ǿ����д��
 *  
 * ����	
 *     4. ����1Ա������΢��֧����֧����֧������Ҫ���������ӿ�IWeChat��IAlibaba��ÿ���ӿڷֱ���һ��֧������wechatPay()/aliPay()��
 * 	   5. ����2Ա��ֻ��֧����֧��
 * ������Ƹó���ʵ��
 * 	����1���˹������ݣ���������
 * 	����2���˹������ݣ������޴��·�
 * 	����3���˹������ݣ���������
 * 
 *  ���裺
 *  	����ƹ��˻���AbstractEmployee������������ӿڡ����д3���������࣬�̳к�ʵ�ֶ�Ӧ������߽ӿ�
 */
public abstract class AbstractEmployee {
	/**
	 * 1. ���й��˶��� �ϰ�򿨷���clockIn()������Ա���򿨷�ʽ��ͬ��
	 */
	public void clockIn() {
		System.out.println("�ϰ��");
	}
	
	
	/**
	 *  2. ���й��˶��� �°�򿨷���clockOut()������Ա���򿨷�ʽ��ͬ��
	 */
	public void clockOut() {
		System.out.println("�°��");
	}
	
	/**
	 *  3. ����ÿ�������������й����ķ���work()����ͬ��ǿ����д��
	 *   ���󷽷�
	 */
	public abstract void work();
	
}
