package homework;
/**
 * �����εĲ�����
 */
public class RectangleTest {
	public static void main(String[] args) {
		//Ҫ���Գ����ε����һ�� ������������Ĳ��Զ��� new����
		//���� ������ = new ����������
		Rectangle lJQ = new Rectangle();
		lJQ.height = 1.68;
		lJQ.width = 1.68;
		double area = lJQ.getArea();
		System.out.println("jian��" + area);
	}
}
