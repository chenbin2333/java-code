package cn.itsource.abstract6;

/**
 *	抽象类和抽象方法测试类
 */
public class AbstractGraphTest {

	public static void main(String[] args) {
		// 创建圆形类Circle对象
		Circle circle = new Circle(5);
		// circle调用父类继承过来的getArea方法
		double circleArea = circle.getArea();
		System.out.println(circleArea);

		// 创建矩形类Rectangle对象
		Rectangle rectangle = new Rectangle(3, 5);
		// circle调用父类继承过来的getArea方法
		double rectangleArea = rectangle.getArea();
		System.out.println(rectangleArea);
		
		// 语法规定：抽象类不能创建对象。
//		new AbstractGraph();// 不能创建抽象类对象
	}

}
