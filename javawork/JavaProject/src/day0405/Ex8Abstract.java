package day0405;

import java.util.Scanner;
//��� Ŭ������ �߻��̸� ��Ŭ������ ���� �߻����ξ��ص����������̽��� ������
//�ٵ� �ϳ����Ϲ�Ŭ�������ԵǾ������餱�� �߻�����
//�������̽�:����������. 
abstract class Command{
	abstract public void process(); //���μ����߻�޼���
		
		
}
	
class List extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("���������");
	}	
}

class Add extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("�������߰�");
	}	
}

class Delete extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("�����ͻ���");
	}	
}

class Update extends Command
{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("�����ͼ���");
	}	
}

public class Ex8Abstract {
	public static void process(Command comm)
	{
		comm.process();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println("1.�߰� 2.���� 3.���� 4.��� 5.����");
			int n=sc.nextInt();
			if(n==5) {
				System.out.println("���α׷�����");
				break;
			}
			switch(n) {
			case 1:
			process(new Add());
			break;
			case 2:
			process(new Update());
			break;
			case 3:
			process(new Delete());
			break;
			case 4:
			process(new List());
			break;
			}
			

	}

}
}