package day0405;

//interface �� ����� �߻�޼��常 �����̰���
interface InterA{
	int SPEED=100; //final��� �Ϲݺ����ü�����
	public void speedWrite(); //abstract �޼ҵ� �������̽��±����ؾ���
}
//�������̽��� �����ϴ� Ŭ����
class My implements InterA{//�������̵��ϱ� �����ϴ°ſ� 7-8�������������̵常�����ϴ°������ �ҽ������������̵崭�����ϱ�
	@Override
	public void speedWrite() {
		// TODO Auto-generated method stub
		//SPPED=120; ����̹Ƿ� �������Ҽ�����
		System.out.println("���� ���ǵ��"+SPEED+"�Դϴ�.");
	} 
}
public class Ex9Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		InterA a=new My();
		a.speedWrite();
	}

}
