package homework;
/**
 *  ����һ��Model�࣬�������������Ա����䡢��Χ����Χ �ֶΡ���Ա��������
 *  ��ʹ�ñ�׼��װ��this��������ԡ�this()���췽���໥���á� + this���в��ԣ�
	���飺д��this(...)��ʹ�á������ࣺ����2�������޲ι���+�вΡ���
	����setXxx��ֵ/getXxx����ȡֵ��ӡ��
 *
 */
public class Model {
	private String name;
	private boolean gender; //true ��ʾŮ  false ��ʾ��
	private int age;
	private double bust;
	private double waist;
	
	public Model(){
		
	}
	public Model(String name){
		this(true,18);
		this.name = name;
	}
	public Model(boolean gender,int age){
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getBust() {
		return bust;
	}
	public void setBust(double bust) {
		this.bust = bust;
	}
	public double getWaist() {
		return waist;
	}
	public void setWaist(double waist) {
		this.waist = waist;
	}
	
}
