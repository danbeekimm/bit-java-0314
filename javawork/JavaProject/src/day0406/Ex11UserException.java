package day0406;

import java.util.Scanner;

//����� ���� Ŭ��������
//throw throws���� 
class UserException extends Exception
{
	public UserException(String msg) {
		super (msg);//���� �޼����� ���
	}
}
public class Ex11UserException {

	public static void writeContent(String msg) throws UserException //�����ͼ����������� ȣ���ϴ°�����ó���Ϸ�
	{
		if(msg.contains("�ٺ�") || msg.contains("��û")) //�����ϳ����ԵǾ��ִٸ�
			throw new UserException("�������ô�!!"); //������ �����ͼ��ǽ���
		else
			System.out.println("�޼���:"+msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���⼭ȣ��
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("�ƹ������̳� �Է��Ͻÿ�");
			String msg=sc.nextLine();
			if(msg.equals("��"))
				break;
			try {
				writeContent(msg); //���� writecontent�� ������
			}catch (UserException e) {
				System.out.println("�����޼���:"+e.getMessage());
			}
		}
		System.out.println("**�������� **");
	}

}
