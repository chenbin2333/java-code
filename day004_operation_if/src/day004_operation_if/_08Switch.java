package day004_operation_if;

/**
 *	switch�����գ�
		�﷨��
			��������
			switch(����){
				case ֵ1:
					�������1
					�������2...
					break;
				case ֵ2:
					�������1
					�������2...
					break;
				case ֵ3:
					�������1
					�������2...
					break;
				
				default:�൱��else
					default���
					break;
			}
			switch������ȴ�case��ʼƥ�䣬ֻ��case��û��ƥ���ϲ�ƥ��default���
			���ƥ����һ��case������������break�����û�У����һֱ����ִ�У��Ͳ���
			ƥ���ˣ�ֱ���ҵ�break���ߵ�switch������Ϊֹ
			
			switch֧�ֵ��������ͣ�
				byte/ short / int / char / String��1.7�� / ö�����ͣ�1.5��
				
			ʹ�ó�����
				switch����Ӧ����������ֻ������һЩ�����ȽϹ̶��ĳ��������磺vip��������QQ״̬���·�
				��ݡ���Ф������...
				
	1.5. ʹ�ó�����
		ֻ�бȽϹ̶�������£�ʹ��switch�ṹ���������һ����if���
 */
public class _08Switch {

	public static void main(String[] args) {
		/*
		 * �������ʼƻ�
		 * 	���1����ţ��69��1����
		 * 	���2��������9��1����
		 * 	���3�������90����
		 * 	���4���Դ󳦴���80��
		 * 	���5���Դ�բз20��һ����
		 * 	���6���Ⱥ�ţ1��
		 * 	���7����Ħһ�£���������
		 */
		int weekDay = 4;
//		if (weekDay == 1) {
//			System.out.println("��ţ��69��1����");
//		} else if (weekDay == 2) {
//			System.out.println("������9��1����");
//		} else if (weekDay == 3) {
//			System.out.println("�����90����");
//		} else if (weekDay == 4) {
//			System.out.println("�Դ󳦴���80��");
//		} else if (weekDay == 5) {
//			System.out.println("�Դ�բз20��һ����");
//		} else if (weekDay == 6) {
//			System.out.println("�Ⱥ�ţ1��");
//		} else if (weekDay == 7) {
//			System.out.println("��Ħһ�£���������");
//		}
		
		/*
		 * ���ϴ������ ���࣬������switch�ṹ�򻯴���
		 * switch�﷨��
			��������
			switch(����){
				case ֵ1:
					�������1
					�������2...
					break;
				case ֵ2:
					�������1
					�������2...
					break;
				case ֵ3:
					�������1
					�������2...
					break;
				
				default:�൱��else
					default���
					break;
			}
		 */
		int weekDay2 = 9;// ����������ʾ��4
		switch (weekDay2) {// ������
			case 1:
				// ��ʾƥ��weekDay2 == 1
				System.out.println("��ţ��69��1����");
				break;
			case 2:// ��ʾƥ��weekDay2 == 2
				System.out.println("������9��1����");
				break;
			case 3:// ��ʾƥ��weekDay2 == 3
				System.out.println("�����90����");
				break;
			case 4:// ��ʾƥ��weekDay2 == 4
				System.out.println("�Դ󳦴���80��");
				break;
			case 5:// ��ʾƥ��weekDay2 == 5
				System.out.println("�Դ�բз20��һ����");
				break;
			case 6:// ��ʾƥ��weekDay2 == 1
				System.out.println("�Ⱥ�ţ1��");
				break;
			case 7:// ��ʾƥ��weekDay2 == 1
				System.out.println("��Ħһ�£���������");
				break;
			default:// ���е�caseƥ�䲻�ϣ���ִ��default��defaultд�������λ�ö����ԡ�
				System.out.println("���ܷ����ˣ�");
				break;
		}
		
	}

}
