package day0406;
interface InterA
{
	public void draw(); //��ο츸 �������̵��ϸ��
}
//interface�� interface�� ��ӹ������ extends
interface InterB extends InterA
{
	public void play(); 
	//�÷��̶���ο찡 ����ִ°�, �������̵��ҰŸ�
	//�Ѵ��ؾ���
	
}
//class����InterB�� ������ ��� InterA�� �����͵� �������̵��ؾ��Ѵ�
class My1 implements InterB
{
	public void show()
	{
		System.out.println("My1�� �����޼���");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}
	
}


public class Ex1Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My1 a1=new My1();
		a1.draw();
		a1.play();
		a1.show();//My1���� �������ִ� �޼��� ������ ���̿��̿��߸�����
		
		InterB a2=new My1(); //���̿��� �̹� ���Ͱ����������������������
		//�������̵�� �޼��常ȣ�Ⱑ��
		a2.draw();
		a2.play();
	}

}
