package cn.itsource.static5;

/**
 *	static������
 */
public class StaticDemoTest {

	public static void main(String[] args) {
		// ����һ��StaticDemo���󣬽���Ա����a��ֵΪ1
		StaticDemo demo = new StaticDemo();
		demo.a = 1;// ������������
		System.out.println(demo.a);// 1
		
		// �����ڶ���StaticDemo���󣬽���Ա����a��ֵΪ2
		StaticDemo demo2 = new StaticDemo();
		demo2.a = 2;// ������������
		System.out.println(demo2.a);// 2
		
		// �ٴδ�ӡdemo�ĳ�Ա����a��ֵ
		System.out.println(demo.a);// 2
		
	}

}
