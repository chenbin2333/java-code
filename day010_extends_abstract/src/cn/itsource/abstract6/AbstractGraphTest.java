package cn.itsource.abstract6;

/**
 *	������ͳ��󷽷�������
 */
public class AbstractGraphTest {

	public static void main(String[] args) {
		// ����Բ����Circle����
		Circle circle = new Circle(5);
		// circle���ø���̳й�����getArea����
		double circleArea = circle.getArea();
		System.out.println(circleArea);

		// ����������Rectangle����
		Rectangle rectangle = new Rectangle(3, 5);
		// circle���ø���̳й�����getArea����
		double rectangleArea = rectangle.getArea();
		System.out.println(rectangleArea);
		
		// �﷨�涨�������಻�ܴ�������
//		new AbstractGraph();// ���ܴ������������
	}

}
