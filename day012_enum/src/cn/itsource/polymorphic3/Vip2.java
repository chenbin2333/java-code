package cn.itsource.polymorphic3;

/**
 * ����Vip2�̳�AbstractVip
 *�˻�����ϵͳ���˻���¼����¼����ʾ��ǰ�˻��Ļ�Ա�ȼ�
 * Vip�࣬�����л�Ա�ĸ��࣬��һ������ show(),��Ϊÿ���˻��ȼ����ǲ�ͬ�ģ�����Ҫǿ����д;��ʾ��Ա�ȼ�
 * 3�����ࣺ
 * 	Vip1 1~9��
 * 		��Ȩ������low()
 * 	Vip2 10~19��
 * 		��Ȩ����: normal()
 * 	Vip3 20~29��
 * 		��Ȩ����: great()
 */
public class Vip2 extends AbstractVip {

	@Override
	public void show() {
		System.out.println("17��");
	}
	
	/**
	 * 	Vip2 10~19��
	 * 		��Ȩ����: normal()
	 */
	public void normal() {
		System.out.println("��һ���............");
	}
}
