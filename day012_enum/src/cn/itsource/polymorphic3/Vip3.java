package cn.itsource.polymorphic3;

/**
 * ����Vip3�̳�AbstractVip
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
public class Vip3 extends AbstractVip {

	@Override
	public void show() {
		System.out.println("26��");
	}
	
	/**
	 * 	Vip3 20~29��
	 * 		��Ȩ����: great()
	 */
	public void great() {
		System.out.println("��ţƤ......................");
	}
}
