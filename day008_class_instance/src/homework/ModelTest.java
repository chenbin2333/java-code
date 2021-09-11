package homework;
/**
 *  定义一个Model类，里面有姓名、性别、年龄、胸围、腰围 字段【成员变量】，
 *  请使用标准封装【this解决二义性、this()构造方法相互调用】 + this进行测试；
	建议：写上this(...)的使用。测试类：创建2个对象【无参构造+有参】，
	调用setXxx赋值/getXxx方法取值打印
 * @author Administrator
 *
 */
public class ModelTest {

	public static void main(String[] args) {
		Model model = new Model();
		model.setName("阿花");
		model.setAge(16);
		System.out.println(model.getName() + ":" + model.getAge());
		
		Model model2 = new Model("小芳");
		System.out.println(model2.getName() + "年龄：" + model2.getAge() + "，性别：" + model2.isGender());
	}

}
