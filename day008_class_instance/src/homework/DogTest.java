package homework;
/**
 * 创建2个狗狗对象:
	一个名字 赋值为：母狗1号 ，性别：母	吃：包子（用有参构造实现成员变量赋值），并且调用对象的吃方法。
	一个名字 赋值为：公狗1号 ，性别：公	吃：大馒头（用对象名.成员变量的方式赋值给对应的成员变量），并且调用对象的吃方法
 *
 */
public class DogTest {

	public static void main(String[] args) {
		//通过无参构造创建的狗狗
		Dog dog = new Dog();
		dog.gender = '雄';
		dog.name = "Harry";
		dog.eat("大馒头");
		System.out.println(dog.name + ":" + dog.gender);
		
		//通过有参构造创建狗狗对象
		Dog dog2 = new Dog('雌',"Tom");
		dog2.eat("包子");
		System.out.println(dog2.name + ":" + dog2.gender);
	}

}
