package day0316;

public class Ex1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		while(++a<=5) {//�����ĺ�
			System.out.println(a);
		}
		System.out.println("������������ a ��"+a);
		
		
		a=0;
		while(a++<=5) {//��������
			System.out.println(a);
		}
		System.out.println("������������ a ��"+a);
		
		a=0;
		while(true) {// ������������ true
			System.out.println(++a);
			if(a==5)// a�� 5���Ǹ� ����������.
				break;
		}
		System.out.println("������������ a ��"+a);
	}
}