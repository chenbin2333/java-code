package day004_operation_if;

/**
 *	1. ��ֵ���㣨Assignment Operation���������գ������ȼ���͵�һ�����㣬�Ⱥ�ߵ�����������Ϻ󣬲�ִ�и�ֵ����
		+= �ۼ�
		-= �ۼ�
		*=
		/=
		%=
		=  
		������Щ����Ҳ�Ǹ�ֵ�����������Ҫ
		...
		&=
		|=
		^=
		�﷨�� ���� += ֵ/�������;// �൱�ڣ� ���� = (������������)(���� + ֵ/�������);
		
		��ֵ������ǿ��ת�����ܣ����Ա�����������.�����������
		���磺
			byte b = 127;
			
			b += 1; => b = (byte)(b+1);
			b = b + 1;
 */
public class _01AssignmentOperation {

	public static void main(String[] args) {
		int a = 1;
		a += 1;// �൱�ڣ�a = (int)(a + 1);
		System.out.println(a);
		
		// ����
		byte b = 127;
//		b = b + 2;// b + 2��int���͵Ľ����Ҫǿת
		b += 2;// �൱�ڣ�b = (byte)(b + 1);
		System.out.println(b);
		
	}

}
