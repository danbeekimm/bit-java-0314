package day0404;
 //class�������͵���, �� �ۺ����� ���ϸ��̰���Ŭ����������.
//���� ��Ű�� �� ����ҰŸ� ������ Ŭ����������
//�ٸ� �������� ����ϰ������� �ٸ����� �����س�����.
class Apple{
	//������������ ����
	int a=10;
	protected int b=20;
	private int c=30;
	public int d=40;
	
	public final static String MESSAGE="Hello";
	//final���������ȵ�. ����ƽ:Ŭ���������ε� ���ٰ����ϴٴ��ǹ�
 //��������� �ۺ������̳ν���ƽ���־�.	
}

public class Ex2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple al=new Apple();
		System.out.println(al.a);
		System.out.println(al.b);
//		System.out.println(al.c); Error�� private�� ���� Ŭ����������������
		System.out.println(al.d);
		
		System.out.println(Apple.MESSAGE);//static ������ Ŭ���������� ȣ
	}

}