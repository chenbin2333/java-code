package day003_var_operation;

/**
 *	4. ����ת����(����)
  		byte  short��char��  int  long  float�������ȣ�  double��˫���ȣ� (ֻ����ֵ���Ͳ����໥ת��)
  		----------------------�����Ҿ���Խ��Խ��---------------------------->
  
  		1. Сת�󣬶��ǿ�����ʽת��  �������ң�
  
  		2. ��תС������ǿ��ת��  �����ҵ���	ǿ��ת�������ݵ�������ա������ʱ�򣬻��Զ����ƽ�λ
  			ǿ��ת���﷨��
  				С���������� С�ı��� = (С����������)��ı���/ֵ;		  
  		
  			��int���͵ľ����ֵ����byte��short��char����ת����ʱ��ֵֻҪ�����ʾ��Χ�ڣ�������ʽת��
 */
public class _05TypeChange {

	public static void main(String[] args) {
		// ����ת����ʱ��1. Сת�󣬶��ǿ�����ʽת��  �������ң�
		byte b = 1;// ����һ��byte���ͱ���b��ֵ1
		short s = b;// ����һ��short���ͱ���s��ֵbyte����b��Сת��
		int i = s;// ����һ��int���ͱ���i��ֵshort����s��Сת��
		long lon = i;// ����һ��long���ͱ���lon��ֵint����i��Сת��
		float f = lon;// ����һ��float���ͱ���f��ֵlong����lon��Сת��
		double doub = f;// ����һ��double���ͱ���doub��ֵfloat����f��Сת��
		
		// 2. ��תС������ǿ��ת��  �����ҵ���	ǿ��ת�������ݵ�������ա������ʱ�򣬻��Զ����ƽ�λ
//		float f2 = doub;// ���������ת��ΪС�����ͣ�����ǿ��ת���������﷨������
		// ǿ��ת���﷨��С���������� С�ı��� = (С����������)��ı���/ֵ;
		float f2 = (float)doub;// �Ƚ�double���ͱ���ǿ��ת��Ϊfloat��Ȼ��ֵ��f2.
		long lon2 = (long)f2;
		
		// ǿ��ת�������ݵ�������ա������ʱ�򣬻��Զ����ƽ�λ
		int j = 128;
		byte b2 = (byte)j;
		System.out.println(b2);// -128
		
		byte b3 = 127;// 127��int���ͣ�127�Ǿ����ֵ�������������жϳ�����byte��ʾ��Χ�ڣ����ԣ��Զ�ת����
		int j2 = 127;
//		byte b4 = j2;// ������j2�Ǳ�����������int���ͣ���byte����װ����
		// 
		byte b4 = (byte)128;// ǿ��ת����������ת��������������ת��ֵ
	}

}