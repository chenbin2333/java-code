package day004_operation_if;

/**
 *	2. �Ƚ�����(Compare Operation)�������գ����һ����boolean����,�Ժ�ͨ�����ѭ�����������ʹ��
		>
		<
		>=
		<=
		
		==: �����
			1. �Ƚϻ������ͣ��Ƚϵ���ֵ�Ƿ����
			���磺 
			int a = 1;
			int b = 1;
			System.out.println(a == b); //true
			
			2. �Ƚ��������ͣ��Ƚϵ��ǵ�ַ�Ƿ���ȡ����潲��
			
		!=: ������
			1. �Ƚϻ������ͣ��Ƚϵ���ֵ�Ƿ����
			2. �Ƚ��������ͣ��Ƚϵ��ǵ�ַ�Ƿ����
		
		instanceof:ֻ�ܱȽ��������ͣ�һ������������ʹ��(��������ص㽲�����첻��)
			��ʾ�ж�һ����������ֵ�Ƿ�����ĳһ��������������
			�﷨��
				ֵ/���� instanceof ������������
			���磺
				1.System.out.println("Լ" instanceof String); 
				
				2.String str = "��Լ";
				System.out.println(str instanceof String); 
	
 */
public class _02CompareOperation {

	public static void main(String[] args) {
		int i = 2;
		int j = 8;
		// �ж�i��j�Ƿ���ȣ�==
		System.out.println(i == j);// false
		// �ж�i��j�Ƿ����: !=
		System.out.println(i != j);// true
		
	}

}
