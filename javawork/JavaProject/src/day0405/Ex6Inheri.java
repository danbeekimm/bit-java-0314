package day0405;

//������
class SuperObj //�θ�Ŭ����
{
	public void process()
	{
		
		System.out.println("super�θ� �������� ���� ó���Ѵ�");
	}
}
//////////////////////////////////
class Draw extends SuperObj
{
	@Override 
	public void process() {
		// TODO Auto-generated method stub
		super.process();
	System.out.println("���±׸����׷���");
}
}
/////////////////////////////////
class Game extends SuperObj
{
	@Override 
	public void process() {
		// TODO Auto-generated method stub
		
	System.out.println("���°������ؿ�");
}
}
public class Ex6Inheri {

	public static void process(SuperObj obj)
	{
		obj.process();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SuperObj obj=null;
//		obj=new Draw();
//		obj.process(); //Draw������ ���μ���ȣ��
//		
//		obj=new Game();
//		obj.process();//GAME������ ���μ���ȣ��
//		process(new SuperObj()); ���⼱�� �Ϻ��ؼ�
		process(new Draw()); //�׸��׸�����ó��
		process(new Draw()); //���ӿ� ������ó��
		
	}

}