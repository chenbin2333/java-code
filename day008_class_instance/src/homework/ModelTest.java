package homework;
/**
 *  ����һ��Model�࣬�������������Ա����䡢��Χ����Χ �ֶΡ���Ա��������
 *  ��ʹ�ñ�׼��װ��this��������ԡ�this()���췽���໥���á� + this���в��ԣ�
	���飺д��this(...)��ʹ�á������ࣺ����2�������޲ι���+�вΡ���
	����setXxx��ֵ/getXxx����ȡֵ��ӡ
 * @author Administrator
 *
 */
public class ModelTest {

	public static void main(String[] args) {
		Model model = new Model();
		model.setName("����");
		model.setAge(16);
		System.out.println(model.getName() + ":" + model.getAge());
		
		Model model2 = new Model("С��");
		System.out.println(model2.getName() + "���䣺" + model2.getAge() + "���Ա�" + model2.isGender());
	}

}
