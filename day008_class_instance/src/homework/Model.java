package homework;
/**
 *  定义一个Model类，里面有姓名、性别、年龄、胸围、腰围 字段【成员变量】，
 *  请使用标准封装【this解决二义性、this()构造方法相互调用】 + this进行测试；
	建议：写上this(...)的使用。测试类：创建2个对象【无参构造+有参】，
	调用setXxx赋值/getXxx方法取值打印。
 *
 */
public class Model {
	private String name;
	private boolean gender; //true 表示女  false 表示男
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
