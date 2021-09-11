package homework;
/**
 * 定义一个长方形的类Rectangle 
 *
 */
public class Rectangle {
	/**长方形的长*/
	double height;
	/**长方形的宽*/
	double width;
	
	/**
	 * 定义求面积的方法：
	 */
	public double getArea(){
		double area = height * width ; 
		return area;
	}
}
