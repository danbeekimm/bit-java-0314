package day0405;

class Color{
	private String colorName;
	
	Color()
	{
//		System.out.println("super ����Ʈ ������");
	}
	Color(String colorName)
	{
		this.colorName=colorName;
//		System.out.println("super 2��° ������");
	}
	//����ϴ� �޼���
	public void write() {
		System.out.println("�ڵ�����"+colorName);
	}
}
class Red extends Color
{
	private String myCar;
	
	Red()
	{
//		super("���");// �����Ǿ����� , �θ��� ����Ʈ �������� ȣ��
		//���ڰ��ִ� �����ڴ� �����ȵ�("���"), �ݵ��ù��
//		System.out.println("sub ����Ʈ ������");
	}
	Red (String myCar,String colorName)

	{
			super(colorName);
			this.myCar=myCar;
			}
	@Override //�θ�� �Ȱ����������θ�����
	public void write() {
		// TODO Auto-generated method stub
		super.write(); //
		//����������� ���� ��ó���� �����θ��� write�� ������ this�� ��� �ڱⲨ�����ȹ�����
	System.out.println("�����̸�:"+myCar);
	
	
	}
}
public class Ex4Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red r1=new Red();
		r1.write(); //�θ��� ����Ʈ�������� �ٵ����������� ����������
		
		System.out.println("=====================");
		Red r2=new Red("�ҳ�Ÿ","�����޻�");
		r2.write();
	}

}