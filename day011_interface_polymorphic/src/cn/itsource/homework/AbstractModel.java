package cn.itsource.homework;
/**
 *  设计一个父类AbstractModel类，
		有成员变量： 
			姓名name
			腰围 double类型
			臀围 double类型
			胸围 double类型
			请使用标准封装【private修饰】+继承+方法重写的方式完成该案例
		有普通非static方法：
			走台方法walkThrough()，每个子类模特走台方式完全相同
			
			换衣服抽象方法changeClothes()，每个子类模特换衣服方式完全 不 相同
 *
 */
public abstract class AbstractModel {

	private String name;
	private double width;
	private double hip;
	private double bust;
	
	public void walkThrough() {
		System.out.println("走的都是一模一样没什么看头");
	}
	public abstract void changeClothes();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHip() {
		return hip;
	}
	public void setHip(double hip) {
		this.hip = hip;
	}
	public double getBust() {
		return bust;
	}
	public void setBust(double bust) {
		this.bust = bust;
	}
	
}
