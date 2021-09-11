package homework;
/**
 * 长方形的测试类
 */
public class RectangleTest {
	public static void main(String[] args) {
		//要测试长方形的类第一步 创建长方形类的测试对象 new出来
		//类名 对象名 = new 类名（）；
		Rectangle lJQ = new Rectangle();
		lJQ.height = 1.68;
		lJQ.width = 1.68;
		double area = lJQ.getArea();
		System.out.println("jian桥" + area);
	}
}
