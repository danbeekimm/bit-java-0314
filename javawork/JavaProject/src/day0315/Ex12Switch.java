package day0315;

import java.util.Scanner;

public class Ex12Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("n?");
		n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("One!!");
			
			break;
		case 2:
			System.out.println("Two!!");
			break;
		case 3:
			System.out.println("Three!!");
			break;
		default:
			System.out.println("1,2,3 ����");
		}
//		sc.nextLine();
	String s;
		System.out.println("���,����,�Ķ� �� �Է�");
		s=sc.nextLine();
		switch(s) {
		case "���" : 
			System.out.println("������� ����� ��");
			break;
		case "����" : 
			System.out.println("�������� ������ ��");
			break;
		case "�Ķ�" : 
			System.out.println("�Ķ����� ����� ��");
			break;
		default:
			System.out.println("������ �Ƹ��ٿ���!!!");
			
		}
	}

}
