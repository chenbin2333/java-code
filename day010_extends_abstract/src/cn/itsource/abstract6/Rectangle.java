package cn.itsource.abstract6;

/**
 *	矩形类，继承了AbstractGraph图形类
 */
public class Rectangle extends AbstractGraph {
	/** 长 */
	private double height;
	
	/** 宽 */
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
	 * 求面积getArea
	 * @return
	 */
	public double getArea() {
		return height * width;
	}
}
