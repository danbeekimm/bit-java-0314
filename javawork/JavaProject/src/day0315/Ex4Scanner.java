package day0315;

import java.util.Scanner;

public class Ex4Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in��Ű���带����.
		String msg="";//���������� �����ϸ鿡����,�����Ⱚ�̻��������. �ʱ�ȭ���Ѿ���.
		//class�� �ʱ�ȭ�Ƚ��ѵ���. ""�� null��.
		System.out.println("����� �̸��� �Է��ϼ���");
		msg=sc.nextLine();//�Է��� ������ ��°�� �о�´�(���ڿ�Ÿ��
		//msg=sc.next(); //�Ѵܾ �о�´�.
		System.out.println("���̸��� "+msg+"�Դϴ�");
		
		int age;
		System.out.println("����� ���̴�?");
		age=sc.nextInt();//intŸ������ �о�´�.
		System.out.println(msg+"���� ���̴�"+age+"�� �Դϴ�.");
		

	}

}