package cn.itsource.abstract6;

/**
 *	�����࣬�̳���AbstractGraphͼ����
 */
public class Rectangle extends AbstractGraph {
	/** �� */
	private double height;
	
	/** �� */
	private double width;
	
	public Rectangle() {}

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	/**
	 * �����getArea
	 * @return
	 */
	public double getArea() {
		return height * width;
	}
}
