package day0404;

public class Ex4Method {
	private String name;
	private int age; //�޼��常���� �������Ͷ�. ���͸޼���,��ȯ�� ���͸޼���
	
	//setter method:������� �ʿ��� �޼��� ���͹�ȯŸ�Ծ��� �ַ� ���̵���
	public void setName(String name)
	{
		this.name=name; //���ڰ������̸��ϰ�� ����������տ� �ݵ�� this ���̱�
		//name�� �³��ӿ��ִ� �ɷ��ν��ع���.. �� ��������Ʈ �������� �ν��ϰ�������
		//this
		
	}
	public void setAge(int age) { //�Ķ���ͷι��� �ܺο������� ������ �����������̸�
		this.age=age; //this���
	}
	//getter method:�������� ��� //����������� ��ȯ�ϱ����� �޼���
	public String getName() {
		return this.name;//this�� ��������
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Method ex1=new Ex4Method();
		ex1.setName("�̱���");
		ex1.setAge(25);
		
		Ex4Method ex2=new Ex4Method();
		ex2.setName("������");
		ex2.setAge(30);
		
		System.out.println("�̸�:"+ex1.getName());
		System.out.println("����:"+ex1.getAge());
		System.out.println();
		
		System.out.println("�̸�:"+ex2.getName());
		System.out.println("����:"+ex2.getAge());

	}

}