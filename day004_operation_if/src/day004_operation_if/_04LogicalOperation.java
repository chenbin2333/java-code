package day004_operation_if;

/**
 *	4. �߼����㣨Logical Operation�������գ��߼��������߱����ǲ������͵�ֵ�����Ǳ��ʽ
		!: ��ʾȡ�������漴�٣��Ǽټ��� (����һ������/ֵ)
		
		&&:�߼�˫�룬��ʾ���ң��мټ��٣��ж�·���ܣ�û��λ���㹦��
		
		&:�߼����룬��ʾ���ң��мټ��٣�û�ж�·���ܣ���λ���㹦��
		
		||:�߼�˫�򣬱�ʾ���ߣ����漴�棬�ж�·���ܣ�û��λ���㹦��
		
		|:�߼����򣬱�ʾ���ߣ����漴�棬û�ж�·���ܣ���λ���㹦��
		
		^:�߼���� ͬ�����桾�������á�
		
		��·���⣺���߼���������ܹ�ȷ���������ʽ���ֵ��ʱ�򣬾ͻᷢ����·�������ټ�������
		����ˣ����������ṩ��������Ч��
		
		���磺
			&&�����Ϊfalseʱ���ұߵľͶ�·��
			||�����Ϊtrueʱ���ұߵľͶ�·��
			
		�Ժ��߼����㶼�� && ���� ||
		
		���ȼ����⣺
			! > &&(&) > ||(|)
			��֤��
				true || true && false 
				�����true��&&���ȼ���
				�����false��||���ȼ��߻������
 */
public class _04LogicalOperation {

	public static void main(String[] args) {
		// ����1���Բ���ʦѧϰJava������ԲԱ��Կ�100���һ��Կ�100������ �𹿰���
		int score1 = 100;// ����һ��int����score1��ֵ100����ʾ����100
		int score2 = 100;// ����һ��int����score2��ֵ100����ʾ����100
		// �ж����������Ƿ���100������ ���ǲ��ҵĹ�ϵ
		System.out.println(score1 == 100 && score2 == 100);// true
		
		// ����2���Բ���ʦѧϰJava������ԲԱ��Կ�100������ ���Կ�100������ ��������
		// �ж����������Ƿ���һ��Ϊ100������ ���ǻ��ߵĹ�ϵ
		System.out.println(score1 == 100 || score2 == 100);// true
		
		// !:�߼��ǣ� ��ʾȡ�������漴�٣��Ǽټ��� (����һ������/ֵ)
		System.out.println(!true);// false
		System.out.println(!false);// true
		
		System.out.println("================== && ====================");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		// ����������� &&ǰ�����˶�·�����������ʽ�������ȷ����ʱ������·.�������Ч��
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		
		System.out.println("================== & ====================");
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		// ����������� &ǰû�ж�·�����滹Ҫ���㡣�����߼�����Ч�ʵ���
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		
		System.out.println("================== || ====================");
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		// ����������� ||ǰ�����˶�·�����������ʽ�������ȷ����ʱ������·.�������Ч��
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		
		System.out.println("================== | ====================");
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		// ����������� |ǰû�ж�·�������߼�����Ч�ʵ���
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		
		System.out.println("================== ^���˽⡿ ====================");
		// ^:�߼���� ͬ�����桾�õĺ��١�
		System.out.println(false ^ true);//true
		System.out.println(true ^ false);//true
		// ^���߶�����ͬ�ģ����ܶ���true���߶���false  ������Ǽ�false
		System.out.println(false ^ false);//false
		// ^���߶�����ͬ�ģ����ܶ���true���߶���false  ������Ǽ�false
		System.out.println(true ^ true);//false
		
	}

}
