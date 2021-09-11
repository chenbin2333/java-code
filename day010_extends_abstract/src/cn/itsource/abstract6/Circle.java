package cn.itsource.abstract6;

/**
 *	圆形Circle类，继承了AbstractGraph图形类
 */
public class Circle extends AbstractGraph {
	/** 半径 */
	private double r;
	
	public Circle() {}

	public Circle(double r) {
		super();
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	/**
	 * 求面积getArea
	 * @return
	 */
	public double getArea() {
		return 3.14 * r * r;
	}
}
