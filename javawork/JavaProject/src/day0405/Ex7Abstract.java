package day0405;
abstract class Parent
//�߻�޼��带 �Ѱ��̻� �����Ѱ�� �ݵ��Ŭ������ �߻�ȭ �ֱ�
//abstract�� �Ϲݰ� �߻�޼��� ��α�������
{
//	public void process()
//	{
//		System.out.println("�θ� ���� �ϴ����� ����");
//	}
	
	public void title() {
		System.out.println("�θ��� �ϴ���ó��" ); //�Ϲݸ޼���
	}
	//process�� �ϴ����� ������ �������̵带���� �޼��� ����� �Ƿ��Ѵ�
	abstract public void process(); //�̿ϼ��� �޼��� (abstract :�߻�ȭ)�α����Ѵ�
}
/////////////////////////////////
class ChildA extends Parent
{
	@Override 
	public void process() {
		
		
	System.out.println("����Ʈĥ�մϴ�");
}
}

class ChildB extends Parent
{
	@Override 
	public void process() {
		
		
	System.out.println("����û���մϴ�");
}
}
public class Ex7Abstract {
	public static void process(Parent p)
	{
		p.title(); //	�θ��̰����޼���ȣ�Ⱑ�� //�ڽĸ��� �������̵�
		// ������ó��
		p.process(); //�������̵�� �޼��常 ȣ���̰��� (����>�θ𸸰����� ȣ�Ⱑ��
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	process(new SuperObj()); �̰Ǿȵ� �߻�Ŭ������ ��ü�����Ҽ����� ��ӹ��� Ŭ�����θ������ؼ�
		process(new ChildA());
		process(new ChildB());
	}

}