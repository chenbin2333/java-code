package cn.itsource.codeblock;

public class D extends C {
	static {
		System.out.println("D�ྲ̬�����........................");
	}
	
	{
		System.out.println("D�๹������........");
	}
	
	public D() {
		super();
		System.out.println("D�๹�췽��");
	}
	
	public static void main(String[] args) {
		new D();// ʹ�õ�D�࣬Ҫ����D��
	}
}
