package cn.itsource.homework;
/**
 *  ���һ������AbstractModel�࣬
		�г�Ա������ 
			����name
			��Χ double����
			��Χ double����
			��Χ double����
			��ʹ�ñ�׼��װ��private���Ρ�+�̳�+������д�ķ�ʽ��ɸð���
		����ͨ��static������
			��̨����walkThrough()��ÿ������ģ����̨��ʽ��ȫ��ͬ
			
			���·����󷽷�changeClothes()��ÿ������ģ�ػ��·���ʽ��ȫ �� ��ͬ
 *
 */
public abstract class AbstractModel {

	private String name;
	private double width;
	private double hip;
	private double bust;
	
	public void walkThrough() {
		System.out.println("�ߵĶ���һģһ��ûʲô��ͷ");
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
