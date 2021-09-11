package cn.itsource.abstract6;

/**
 *	Բ��Circle�࣬�̳���AbstractGraphͼ����
 */
public class Circle extends AbstractGraph {
	/** �뾶 */
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
	 * �����getArea
	 * @return
	 */
	public double getArea() {
		return 3.14 * r * r;
	}
}
